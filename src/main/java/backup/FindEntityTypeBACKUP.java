//package backup;
//
//import org.apache.jena.rdf.model.*;
//import org.rdfhdt.hdt.hdt.HDT;
//import org.rdfhdt.hdt.hdt.HDTManager;
//import org.rdfhdt.hdtjena.HDTGraph;
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class FindEntityTypeBACKUP {
//    private static Long start = System.nanoTime();
//    private static String outputPath = "C:/Users/Jakovcheski/Desktop/allDomains.ttl";
//    private static PrintWriter p;
//
//    static {
//        try {
//            p = new PrintWriter(new FileOutputStream(outputPath));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static String fileTypesPath = "C:/Users/Jakovcheski/Desktop/THESIS/instance_types_en.ttl";
//    private static Model model = ModelFactory.createDefaultModel();
//
//    static {
//        model.read(fileTypesPath);
//    }
//
////    private static String fileLinksPath = "C:/Users/Jakovcheski/Desktop/cleanLinks_en.ttl";
////    private static Model modelLinks = ModelFactory.createDefaultModel();
////
////    static {
////        modelLinks.read(fileLinksPath);
////    }
//
//    private static void readFromAbstract() throws IOException {
//        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-abstract/nif-abstract-context_en.ttl";
////        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/testNIF/Test-Data-From-nif-abstract_en.ttl";
//        FileInputStream inputStream = null;
//        Scanner sc = null;
//        Map<String, String> entityType = new LinkedHashMap<>();
//        try {
//            inputStream = new FileInputStream(filePath);
//            sc = new Scanner(inputStream, "UTF-8");
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                if (line.indexOf("#isString") > 0) {
//                    String[] links = line.split(">\\s+");
//                    String[] parsedLink = links[0].split("&nif=context");
//                    entityType = readFromNifLinksOld(parsedLink[0]);
//                    divideTextToWordAtLineWithType(links[2], entityType);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (inputStream != null) {
//                inputStream.close();
//            }
//            if (sc != null) {
//                sc.close();
//            }
//        }
//        System.err.println("TOTAL TIME: " + ((System.nanoTime() - start) / 1_000_000_000) + " s");
//    }
//
//    //TODO USE .HDT formatf
//    private static Map<String, String> readFromNifLinks(String link) throws IOException {
//        Long start = System.nanoTime();
//        Map<String, String> types = new LinkedHashMap<>(); //key: entity, value: type
////        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/testNIF/Test-Data-From-nif-text-links.ttl";
////        String fileHDTPath = "C:/Users/Jakovcheski/Desktop/AggasiLinks.hdt";
////
////        // Load HDT file using the hdt-java library
////        HDT hdt = HDTManager.mapIndexedHDT(fileHDTPath, null);
////        // Create Jena Model on top of HDT.
////        HDTGraph graph = new HDTGraph(hdt);
////        Model model = ModelFactory.createModelForGraph(graph);
//        // Use Jena Model as Read-Only data storage, e.g. Using Jena ARQ for SPARQL.
////        StmtIterator iter = modelLinks.listStatements();
////        while (iter.hasNext()) {
////            Statement stmt = iter.nextStatement();  // get next statement
////            Resource subject = stmt.getSubject();     // get the subject
////            Property predicate = stmt.getPredicate();   // get the predicate
////            RDFNode object = stmt.getObject();      // get the object
//////            System.err.println("\nSubject " + subject);
//////            System.err.println("Predicate " + predicate);
//////            System.err.println("Object " + object + "\n");
////            if (String.valueOf(subject).contains(link.substring(1, link.length()))) {
////                if (String.valueOf(predicate).contains("#taIdentRef")) {
////                    System.err.println("Predicate " + predicate);
////                    if (iter.hasNext()) {
////                        Statement nextStmt = iter.nextStatement();
////                        System.err.println("Statement before " + stmt);
////                        System.err.println("Statement new " + nextStmt);
////                        RDFNode newObject = nextStmt.getObject();
////                        System.err.println("Object " + object);
//////                        System.err.println("new object " + newObject);
////                        String type = readFromInstanceTypesAndReturnTypeWithJena(String.valueOf(object));
////                        System.err.println("Type " + type);
////                        if (!type.equals("OTHER")) {
////                            types.put(String.valueOf(object), type); //key: entity, value: type
////                        }
////                    }
////                }
////            }
////        }
//
////        FileInputStream inputStream = null;
////        Scanner sc = null;
////        inputStream = new FileInputStream(filePath);
////        sc = new Scanner(inputStream, "UTF-8");
////        String word;
////        while (sc.hasNextLine()) {
////            String line = sc.nextLine();
////            String[] subjectLink = line.split("\\s+");
////            System.err.println("before if " + subjectLink[0]);
////            if (subjectLink[0].contains(link)) {
////                System.err.println("before secound if " + subjectLink[1]);
////                if (subjectLink[1].contains("#taIdentRef")) {
////                    String parseEntity = sc.nextLine();
////                    String[] entity = parseEntity.split(">\\s+");
//////                    System.err.println("Entity " + entity[2].substring(1, entity[2].length()-3));
////                    System.err.println("before calling return types " + subjectLink[2]);
////                    String type = readFromInstanceTypesAndReturnTypeWithJena(subjectLink[2]);
//////                    System.err.println("Type " + type);
////                    if (!type.equals("OTHER")) {
////                        System.err.println("fillin map " + entity[2].substring(1, entity[2].length() - 3));
////                        types.put(entity[2].substring(1, entity[2].length() - 3), type); //key: entity, value: type
////                    }
////                }
////
////            }
////        }
////        sc.close();
////        inputStream.close();
//        System.err.println("readFromNifLinks total time: " + (System.nanoTime() - start) / 1_000_000 + " ms");
//        return types;
//    }
//
//    public static Map<String, String> readFromNifLinksOld(String link) throws IOException {
//        Long start = System.nanoTime();
//        Map<String, String> types = new LinkedHashMap<>(); //key: entity, value: type
//        String filePath = "C:/Users/Jakovcheski/Desktop/cleanLinks_en.ttl";
//        FileInputStream inputStream = null;
//        Scanner sc = null;
//        inputStream = new FileInputStream(filePath);
//        sc = new Scanner(inputStream, "UTF-8");
//        String word;
//        System.err.println("Link to check " + link);
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine();
//            String[] subjectLink = line.split("\\s+");
////            System.err.println("before if " + subjectLink[0]);
//            if (subjectLink[0].contains(link)) {
//                System.err.println("before secound if " + subjectLink[1]);
//                if (subjectLink[1].contains("#taIdentRef")) {
//                    String parseEntity = sc.nextLine();
//                    String[] entity = parseEntity.split(">\\s+");
////                    System.err.println("Entity " + entity[2].substring(1, entity[2].length()-3));
//                    System.err.println("before calling return types " + subjectLink[2]);
//                    String type = readFromInstanceTypesAndReturnTypeWithJena(subjectLink[2]);
////                    System.err.println("Type " + type);
//                    if (!type.equals("OTHER")) {
//                        System.err.println("fillin map " + entity[2].substring(1, entity[2].length() - 3));
//                        types.put(entity[2].substring(1, entity[2].length() - 3), type); //key: entity, value: type
//                    }
//                }
//
//            }
//        }
//        sc.close();
//        inputStream.close();
//        System.err.println("readFromNifLinks total time: " + (System.nanoTime() - start) / 1_000_000 + " ms");
//        return types;
//    }
//
////    private static String readFromInstanceTypesAndReturnType(String linkFromNifLinks) throws IOException {
////        Long start = System.nanoTime();
////        System.err.println("recieved link from nif links " + linkFromNifLinks);
////        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/instance_types_en.ttl";
////        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
////            String line;
////            String ontologyType = "OTHER";
////            while ((line = br.readLine()) != null) {
////                if (line.contains(linkFromNifLinks)) {
////                    String[] linkType = line.split(">\\s+<");
////                    linkType[2] = linkType[2].substring(0, (linkType[2].length() - 3));
////                    String[] type = linkType[2].split("ontology/");
////                    if (type.length > 1) {
////                        ontologyType = type[1];
////                    }
////                }
////            }
////            System.err.println("Ontology type " + ontologyType);
////            Long end = (System.nanoTime() - start) / 1_000_000;
////            System.err.println("readFromInstanceTypesAndReturnType total time " + end + " ms");
////            return ontologyType;
////        }
////    }
//
//    private static String readFromInstanceTypesAndReturnTypeWithJena(String linkFromNifLinks) throws IOException {
//        String ontologyType = "OTHER";
//        // list the statements in the Model
//        StmtIterator iter = model.listStatements();
//        System.err.println("Link from nif links " + linkFromNifLinks);
//        // print out the predicate, subject and object of each statement
//        while (iter.hasNext()) {
//            Statement stmt = iter.nextStatement();  // get next statement
//            Resource subject = stmt.getSubject();     // get the subject
////            Property predicate = stmt.getPredicate();   // get the predicate
//            RDFNode object = stmt.getObject();      // get the object
//            if (String.valueOf(subject).equals(linkFromNifLinks)) {
//                System.err.println("subject from return type " + subject);
//                String[] type = String.valueOf(object).split("ontology/");
//                if (type.length > 1) {
//                    ontologyType = type[1];
//                }
//            }
//        }
//        return ontologyType;
//    }
//
//    private static void divideTextToWordAtLineWithType(String text, Map<String, String> entityType) throws IOException {
//        Long start = System.nanoTime();
//        String[] words = text.substring(1, text.length() - 3).split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
//
//        Map<String, String> splittedKeyMap = new HashMap<>();
//        entityType.forEach((s, v) -> {
//            String[] keyWords = s.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");//split keys from map to one word
//            for (String key :
//                    keyWords) {
//                splittedKeyMap.put(key, v);
//            }
//        });
//
//        try {
//            for (String word : words) {
//                String value = splittedKeyMap.get(word);
//                if (value != null) {
//                    p.println(word + "\t" + value);
//                    System.err.println("word " + word + " type " + value);
//                } else {
//                    p.println(word + "\t" + "O");
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.err.println("divideTextToWordAtLineWithType total time " + (System.nanoTime() - start) / 1_000_000 + " ms");
//    }
//
//    public static void main(String[] args) {
//        try {
//            readFromAbstract();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

