import org.apache.jena.rdf.model.*;
import org.rdfhdt.hdt.hdt.HDT;
import org.rdfhdt.hdt.hdt.HDTManager;
import org.rdfhdt.hdtjena.HDTGraph;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindEntityType {
    private static Long start = System.nanoTime();
    //
    public static Map<String, String> types = new LinkedHashMap<>(); //key: entity, value: type
    public static boolean foundLink = false;
    //        Resource subject = null;     // get the subject
    public static Property predicate = null;   // get the predicate
    public static RDFNode object = null;      // get the object
    public static String[] subject = null;     // get the subject

    //
    static BufferedWriter bw;

    static {
        try {
            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/AllDomainsWithRecursion.ttl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //
    private static String fileHDTTypesPath = "C:/Users/Jakovcheski/Desktop/THESIS/cleanInstanceTypes_en.hdt";

    // Load HDT file using the hdt-java library
    private static HDT hdtTypes;

    static {
        try {
            hdtTypes = HDTManager.mapIndexedHDT(fileHDTTypesPath, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Create Jena Model on top of HDT.
    //TODO check null pointer
    private static HDTGraph graphTypes = new HDTGraph(hdtTypes);
    private static Model model = ModelFactory.createModelForGraph(graphTypes);
    //

//    private static String fileTypesPath = "C:/Users/Jakovcheski/Desktop/THESIS/instance_types_en.ttl";
////    private static String fileTypesPath = "C:/Users/Jakovcheski/Desktop/AgassiInstanceTypes.ttl";
//    private static Model model = ModelFactory.createDefaultModel();
//
//    static {
//        model.read(fileTypesPath);
//    }

        private static String fileHDTPath = "C:/Users/Jakovcheski/Desktop/THESIS/cleanLinks_en.hdt";
//    private static String fileHDTPath = "C:/Users/Jakovcheski/Desktop/agassiTestLinks.hdt";

    // Load HDT file using the hdt-java library
    private static HDT hdt;

    static {
        try {
            hdt = HDTManager.mapIndexedHDT(fileHDTPath, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Create Jena Model on top of HDT.
    private static HDTGraph graph = new HDTGraph(hdt);
    private static Model modelLinks = ModelFactory.createModelForGraph(graph);
    //
//    private static String fileHDTPath = "C:/Users/Jakovcheski/Desktop/testDataCleanAgassiLinks.ttl";
//    private static Model modelLinks = ModelFactory.createDefaultModel();
//
//    static {
//        modelLinks.read(fileHDTPath);
//    }
    // Use Jena Model as Read-Only data storage, e.g. Using Jena ARQ for SPARQL.
    public static StmtIterator iterLinks = modelLinks.listStatements();

//    public static String ontologyType = "OTHER";
    // list the statements in the Model
    public static StmtIterator iterTypes = null;

    //
    private static void readFromAbstract() throws IOException {
        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-abstract/nif-abstract-context_en.ttl";
//        String filePath = "C:/Users/Jakovcheski/Desktop/AggasiTextFrom-nif-abstract_en.ttl";
        FileInputStream inputStream = null;
        Scanner sc = null;
        Map<String, String> entityType = new LinkedHashMap<>();
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.indexOf("#isString") > 0) {
                    String[] links = line.split(">\\s+");
                    String[] parsedLink = links[0].split("&nif=context");
                    entityType = readFromNifLinks(parsedLink[0].substring(1, parsedLink[0].length()));
                    divideTextToWordAtLineWithType(links[2], entityType);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
            if (bw != null) {
                bw.close();
            }
        }
        System.err.println("TOTAL TIME: " + ((System.nanoTime() - start) / 1_000_000_000) + " s");
    }

    public static Map<String, String> findNifLinks(StmtIterator iterLinks, Statement stmt, String link) throws IOException {
        System.err.println(stmt);
        if (!iterLinks.hasNext()) {
            return types;
        } else {
//            if(!foundLink) {
            // Statement stmt = iter.nextStatement();  // get next statement
            subject = String.valueOf(stmt.getSubject()).split("&nif");     // get the subject
            predicate = stmt.getPredicate();   // get the predicate
            object = stmt.getObject();      // get the object
            System.err.println("is equal " + subject[0].equals(link));
            if (subject[0].equals(link)) {
                if (String.valueOf(predicate).contains("#anchorOf")) {
//                if (String.valueOf(predicate).contains("#taIdentRef")) {
                    foundLink = true;
                    System.err.println("\nObject " + object);
                    if (iterLinks.hasNext()) {
//                        System.err.println("iter " + stmt);
                        Statement nextStmt = iterLinks.nextStatement();
                        //System.err.println("iter next: " + iter.nextStatement());
                        String[] newSubject = String.valueOf(nextStmt.getSubject()).split("&nif");
//                        System.err.println("old subject " + subject[0]);
//                        System.err.println("new subject " + newSubject[0]);
                        RDFNode newObject = nextStmt.getObject();
                        System.err.println("object " + newObject);
//                        System.err.println("object2 " + iter.nextStatement());
//                        System.err.println("object3 " + iter.nextStatement());
//                        System.err.println("object4 " + iter.nextStatement());
                        String type = readFromInstanceTypesAndReturnTypeWithJena(String.valueOf(newObject)); //da se vrati nazad na newObject
                        System.err.println("Type " + type);
                        if (!type.equals("OTHER")) {
                            types.put(String.valueOf(object), type); //key: entity, value: type //String.valueOf(newObject) da se vrati nazad na object
                        }
//                        if(iter.hasNext()){
//                            Statement newNextStatement = iter.nextStatement();
//                            String[] newNextSubject = String.valueOf(newNextStatement.getSubject()).split("&nif");
//                            System.err.println("next subject " + newNextSubject[0]);
//                            System.err.println("parsed subject " + newSubject[0]);
//                            //break while loop if you reach end of the subjects in links
//                            if(!(newNextSubject[0].equals(newSubject[0]))){
//                                System.err.println("readFromNifLinks total time: " + (System.nanoTime() - start) / 1_000_000 + " ms");
//                                return types;
//                            }else {
//                                subject[0] = newNextSubject[0];
//                                predicate = newNextStatement.getPredicate();
//                                object = newNextStatement.getObject();
//                            }
//                            System.err.println("subject{0} " + subject[0]);
//                            System.err.println("subject{0} " + predicate);
//                            System.err.println("subject{0} " + object);
//                        }
                    }
                }
            }
            subject = null;
            predicate = null;
            object = null;
        }
        if(iterLinks.hasNext()) {
            return findNifLinks(iterLinks, iterLinks.nextStatement(), link);
        }else {
            return types;
        }
    }

    //TODO USE .HDT formatf
    private static Map<String, String> readFromNifLinks(String link) throws IOException {
        Long start = System.nanoTime();
        System.err.println("\nLink from abstract " + link + "\n");
        Map<String, String> newTypes = new LinkedHashMap<>();
        if (iterLinks.hasNext()) {
            newTypes = findNifLinks(iterLinks, iterLinks.nextStatement(), link);
        }

        //64916210


////                Statement stmt = iter.nextStatement();  // get next statement
//                subject = String.valueOf(stmt.getSubject()).split("&nif");     // get the subject
//                predicate = stmt.getPredicate();   // get the predicate
//                object = stmt.getObject();      // get the object
//            }
//            System.err.println(stmt.getSubject());
//            if (subject[0].equals(link)) {
//                if (String.valueOf(predicate).contains("#anchorOf")) {
//                    foundLink = true;
//                    System.err.println("\nObject " + object);
//                    if (iter.hasNext()) {
//                        Statement nextStmt = iter.nextStatement();
//                        String[] newSubject = String.valueOf(nextStmt.getSubject()).split("&nif");
//                        System.err.println("old subject " + subject[0]);
//                        System.err.println("new subject " + newSubject[0]);
//                        RDFNode newObject = nextStmt.getObject();
//                        System.err.println("new object " + newObject);
//                        String type = readFromInstanceTypesAndReturnTypeWithJena(String.valueOf(newObject));
//                        System.err.println("Type " + type);
//                        if (!type.equals("OTHER")) {
//                            types.put(String.valueOf(object), type); //key: entity, value: type
//                        }
//                        if(iter.hasNext()){
//                            Statement newNextStatement = iter.nextStatement();
//                            String[] newNextSubject = String.valueOf(newNextStatement.getSubject()).split("&nif");
//                            System.err.println("next subject " + newNextSubject[0]);
//                            System.err.println("parsed subject " + newSubject[0]);
//                            //break while loop if you reach end of the subjects in links
//                            if(!(newNextSubject[0].equals(newSubject[0]))){
//                                System.err.println("readFromNifLinks total time: " + (System.nanoTime() - start) / 1_000_000 + " ms");
//                                return types;
//                            }else {
//                                subject[0] = newNextSubject[0];
//                                predicate = newNextStatement.getPredicate();
//                                object = newNextStatement.getObject();
//                            }
//                        }
//                    }
//                }
//            }
//        }//wend while


        System.err.println("readFromNifLinks total time: " + (System.nanoTime() - start) / 1_000_000 + " ms");
        return newTypes;
    }

    private static String readFromInstanceTypesAndReturnTypeWithJena(String linkFromNifLinks) throws IOException {
        String ontologyType = "OTHER";
        // list the statements in the Model
        StmtIterator iter = model.listStatements();
//        iterTypes = model.listStatements();
        System.err.println("\n *****Link from nif links: " + linkFromNifLinks +"\n");
//        System.err.println("has next " + iterTypes.hasNext());
//        if(iterTypes.hasNext()) {
//            ontologyType = returnTypes(iterTypes, iterTypes.nextStatement(), linkFromNifLinks);
//        }
        while (iter.hasNext()) {
            Statement stmt = iter.nextStatement();  // get next statement
            Resource subject = stmt.getSubject();     // get the subject
//            Property predicate = stmt.getPredicate();   // get the predicate
            RDFNode object = stmt.getObject();      // get the object
            if (String.valueOf(subject).equals(linkFromNifLinks)) {
                System.err.println("subject from return type " + subject);
                System.err.println("Object from return type " + object);
                String[] type = String.valueOf(object).split("ontology/");
                if (type.length > 1) {
                    ontologyType = type[1];
                }
            }
        }
        return ontologyType;
    }

    public static String returnTypes(StmtIterator iterTypes ,Statement stmt, String linkFromNifLinks){
//        System.err.println("stmt " + stmt);
        String ontologyType = "OTHER";
        if (!iterTypes.hasNext()) {
            return ontologyType;
        } else {
            Resource subject = stmt.getSubject();     // get the subject
//            Property predicate = stmt.getPredicate();   // get the predicate
            RDFNode object = stmt.getObject();      // get the object
            if (String.valueOf(subject).equals(linkFromNifLinks)) {
                System.err.println("subject from return type " + subject);
                System.err.println("Object from return type " + object);
                String[] type = String.valueOf(object).split("ontology/");
                if (type.length > 1) {
                    ontologyType = type[1];
                }
                return ontologyType;
            }
        }
        if(iterTypes.hasNext()) {
            return returnTypes(iterTypes, iterTypes.nextStatement(),linkFromNifLinks);
        } else {
            return ontologyType;
        }
    }

    private static void divideTextToWordAtLineWithType(String text, Map<String, String> entityType) throws IOException {
        Long start = System.nanoTime();
        String[] words = text.substring(1, text.length() - 3).split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
        System.err.println("entites " + entityType);
        Map<String, String> splittedKeyMap = new HashMap<>();
        entityType.forEach((s, v) -> {
            String[] keyWords = s.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");//split keys from map to one word
            for (String key :
                    keyWords) {
                splittedKeyMap.put(key, v);
            }
        });

        try {
            for (String word : words) {
                String value = splittedKeyMap.get(word);
                if (value != null) {
                    bw.write(word + "\t" + value + "\n");
                } else {
                    bw.write(word + "\t" + "O\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.flush();
        }
        System.err.println("divideTextToWordAtLineWithType total time " + (System.nanoTime() - start) / 1_000_000 + " ms");
    }

    public static void main(String[] args) {
        try {
            readFromAbstract();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
