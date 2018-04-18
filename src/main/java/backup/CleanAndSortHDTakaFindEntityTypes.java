//package backup;
//
//import javax.script.ScriptException;
//import java.io.*;
//import java.util.*;
//import org.apache.jena.base.Sys;
//import org.apache.jena.rdf.model.*;
//import org.rdfhdt.hdt.exceptions.NotFoundException;
//import org.rdfhdt.hdt.hdt.HDT;
//import org.rdfhdt.hdt.hdt.HDTManager;
//import org.rdfhdt.hdt.triples.IteratorTripleString;
//import org.rdfhdt.hdt.triples.TripleString;
//import org.rdfhdt.hdtjena.HDTGraph;
//
//import javax.script.*;
//import java.io.*;
//import java.util.*;
//import java.util.concurrent.TimeUnit;
//public class CleanAndSortHDTakaFindEntityTypes {
//    private static Long start = System.nanoTime();
//    //    private static String fileHDTTypesPath = "C:/Users/Jakovcheski/Desktop/THESIS/instance-types/cleanInstanceTypes_en.hdt";
////    private static String fileInstanceTypesPath = "C:/Users/Jakovcheski/Desktop/THESIS/instance-types/cleanInstanceTypes_en.ttl";
//
//    //    // Load HDT file using the hdt-java library
////    private static HDT hdtTypes;
////
////    static {
////        try {
////            hdtTypes = HDTManager.mapIndexedHDT(fileHDTTypesPath, null);
//////            hdtTypes = HDTManager.loadIndexedHDT(fileHDTTypesPath, null);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////
////    // Create Jena Model on top of HDT.
////    //TODO check null pointer
////    private static HDTGraph graphTypes = new HDTGraph(hdtTypes);
////    private static Model model = ModelFactory.createModelForGraph(graphTypes);
////    private static Model model = ModelFactory.createDefaultModel();
////
////    static {
//////        model.read(fileInstanceTypesPath);
////    }
////
////
////    private static String fileHDTPath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-links/cleanLinks_en.hdt";
////    // Load HDT file using the hdt-java library
////    private static HDT hdt;
////
////    static {
////        try {
////            hdt = HDTManager.mapIndexedHDT(fileHDTPath, null);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////
////    // Create Jena Model on top of HDT.
////    private static HDTGraph graph = new HDTGraph(hdt);
////    private static Model modelLinks = ModelFactory.createModelForGraph(graph);
//
//    static BufferedWriter bw;
//
//    static {
//        try {
//            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/globalDomain.ttl"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static List<String> fileNames = new LinkedList<>();
//
//    private static void listFilesForFolder(final File folder) {
//        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
//            if (fileEntry.isDirectory()) {
//                listFilesForFolder(fileEntry);
//            } else {
//                fileNames.add(fileEntry.getAbsolutePath());
//            }
//        }
//    }
//
//    private static List<String> instanceTypeFileNames = new LinkedList<>();
//
//    private static void listInstanceTypesFilesForFolder(final File folder) {
//        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
//            if (fileEntry.isDirectory()) {
//                listInstanceTypesFilesForFolder(fileEntry);
//            } else {
//                instanceTypeFileNames.add(fileEntry.getAbsolutePath());
//            }
//        }
//    }
//
//    private static void readFromAbstract() throws IOException {
//        //links
//        final File folder = new File("C:\\Users\\Jakovcheski\\Desktop\\DataTree");
//        listFilesForFolder(folder);
//        //instance types
//        final File instanceTypesFolder = new File("C:\\Users\\Jakovcheski\\Desktop\\InstanceTypes");
//        listInstanceTypesFilesForFolder(instanceTypesFolder);
//
//        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-abstract/clean-nif-abstract-context_en-LinksThatAreNotJetProccessed.ttl";
////        String filePath = "C:/Users/Jakovcheski/Desktop/AggasiTextFrom-nif-abstract_en.ttl";
//        FileInputStream inputStream = null;
//        Scanner sc = null;
////        Map<String, String> entityType = new LinkedHashMap<>();
//        try {
//            inputStream = new FileInputStream(filePath);
//            sc = new Scanner(inputStream, "UTF-8");
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
////                if (line.indexOf("#isString") > 0) {
//                Long startTime = System.nanoTime();
//                Map<String, String> entityType = new LinkedHashMap<>();
//                String[] links = line.split(">\\s+");
//                String[] parsedLink = links[0].split("&nif=context");
////                    entityType = readFromNifLinks(parsedLink[0].substring(1, parsedLink[0].length()));
//                entityType = readFromNifLinks(parsedLink[0]);
//                divideTextToWordAtLineWithType(links[2], entityType);
//                System.err.println("One link calculation time: " + (System.nanoTime() - startTime) + " ns \n");
////                }
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
//            if (bw != null) {
//                bw.close();
//            }
//        }
//        System.err.println("TOTAL TIME: " + ((System.nanoTime() - start) / 1_000_000_000) + " s");
//    }
//
//    private static Map<String, String> readFromNifLinks(String link) throws IOException {
////        Long start = System.nanoTime();
//        Map<String, String> types = new LinkedHashMap<>();
//        boolean foundLinkFile = false;
//        System.err.println("Link " + link);
//        String[] parsedLink = link.split("resource/");
//        String firstTwoCharactersFromNameLink = parsedLink[1].substring(0, 2).toLowerCase();
//        String file = "";
//
//        if (firstTwoCharactersFromNameLink.startsWith("\'")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\'\\apostrophe.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("-")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\-\\hyphen.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("!")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\!\\exclamation.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("$")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\$\\dolar.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("0")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\0\\zero.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("1")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\1\\one.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("2")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\2\\two.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("3")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\3\\three.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("4")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\4\\four.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("5")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\5\\five.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("6")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\6\\six.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("7")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\7\\seven.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("8")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\8\\eight.ttl";
//        } else if (firstTwoCharactersFromNameLink.startsWith("9")) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\9\\nine.ttl";
//        } else {
//            for (String fileName : fileNames) {
//                String[] parsedFilePath = fileName.split("\\\\");
////                if (fileName.contains(firstTwoCharactersFromNameLink)) {
//                if (parsedFilePath[parsedFilePath.length-1].substring(0,2).equals(firstTwoCharactersFromNameLink)) {
//                    foundLinkFile = true;
//                    file = fileName;
//                }
//            }
//        }
//        if (!foundLinkFile) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTree\\other\\other.ttl";
//        }
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line = "";
////            boolean foundLink = false;
////            String[] lineLinks = null;
////            String[] parsedLinks = null;
//            while ((line = br.readLine()) != null) {
////                if (!foundLink) {
////                    line = br.readLine();
//                String[] lineLinks = line.split(">\\s+");
//                //parsedLinks is not same as parsedLink!!!!
//                String[] parsedLinks = lineLinks[0].split("&nif");
////                }
//
//                if (parsedLinks[0].equals(link)) {
//                    if (lineLinks[1].contains("#taIdentRef")) {
//                        String nextLine = br.readLine();
//                        String[] nextLineLinks = nextLine.split(">\\s+");
//                        String type = readInstanceTypes(lineLinks[2].substring(1, lineLinks[2].length()));
//                        if (!type.equals("OTHER")) {
//                            types.put(nextLineLinks[2].substring(1, nextLineLinks[2].length() - 3), type); //key: entity, value: type
//                        }
////                        line = br.readLine();
////                        System.err.println("next line " + line);
////                        System.err.println("foundlink " + foundLink);
////                        if (line != null) {
////                            lineLinks = line.split(">\\s+");
////                            System.err.println("line links " + lineLinks[0]);
////                            //parsedLinks is not same as parsedLink!!!!
////                            parsedLinks = lineLinks[0].split("&nif");
////                            System.err.println("parsedlinks " + parsedLinks[0]);
////                            if (!(parsedLinks[0].equals(link))) {
//////                                System.err.println("inside while total time: " + (System.nanoTime() - start));
////                                return types;
////                            } else {
////                                foundLink = true;
////                                System.err.println("foundlink2 " + foundLink);
////                            }
////                        }else {
////                            return types;
////                        }
//                    }
//                }
//
//            }
//        }
//
//
////input stream
////        FileInputStream inputStream = null;
////        Scanner sc = null;
////        try {
////            inputStream = new FileInputStream(file);
////            sc = new Scanner(inputStream, "UTF-8");
////            String line = "";
////            boolean foundLink = false;
////            String[] lineLinks = null;
////            String[] parsedLinks = null;
////            while (sc.hasNextLine()) {
////                if (!foundLink) {
////                    line = sc.nextLine();
////                    lineLinks = line.split(">\\s+");
////                    //parsedLinks is not same as parsedLink!!!!
////                    parsedLinks = lineLinks[0].split("&nif");
////                }
////                if (parsedLinks[0].equals(link)) {
////                    if (lineLinks[1].contains("#taIdentRef")) {
////                        String nextLine = sc.nextLine();
////                        String[] nextLineLinks = nextLine.split(">\\s+");
//////                        String type = readFromInstanceTypesAndReturnTypeWithJena(lineLinks[2].substring(1, lineLinks[2].length()));
////                        String type = readInstanceTypes(lineLinks[2].substring(1, lineLinks[2].length()));
////                        if (!type.equals("OTHER")) {
////                            types.put(nextLineLinks[2].substring(1, nextLineLinks[2].length() - 3), type); //key: entity, value: type
////                        }
////                        if (sc.hasNextLine()) {
////                            line = sc.nextLine();
////                            lineLinks = line.split(">\\s+");
////                            //parsedLinks is not same as parsedLink!!!!
////                            parsedLinks = lineLinks[0].split("&nif");
////                            if (!(parsedLinks[0].equals(link))) {
//////                                System.err.println("inside while total time: " + (System.nanoTime() - start));
////                                return types;
////                            } else {
////                                foundLink = true;
////                            }
////                        }
////                    }
////                }
////
////
////            }
////        } catch (Exception e) {
////            e.printStackTrace();
////            System.err.println(e);
////        }finally {
////            if (inputStream != null) {
////                inputStream.close();
////            }
////            if (sc != null) {
////                sc.close();
////            }
////
////        }
////        System.err.println("time in nif links " + (System.nanoTime() - start));
//        //with .HDT
////        StmtIterator iter = modelLinks.listStatements();
////        boolean foundLink = false;
////        String[] subject = null;
////        Property predicate = null;
////        RDFNode object = null;
//
////        while (iter.hasNext()) {
////            if (!foundLink) {
////                Statement stmt = iter.nextStatement();  // get next statement
////                subject = String.valueOf(stmt.getSubject()).split("&nif");     // get the subject     // get the subject
////                predicate = stmt.getPredicate();   // get the predicate
////                object = stmt.getObject();      // get the object
////            }
////            if (subject[0].equals(link)) {
//////                System.err.println(subject[0]);
////                if (String.valueOf(predicate).contains("#anchorOf")) {
////                    foundLink = true;
////                    //System.err.println("\nObject " + object);
////                    if (iter.hasNext()) {
////                        Statement nextStmt = iter.nextStatement();
////                        String[] newSubject = String.valueOf(nextStmt.getSubject()).split("&nif");
//////                        System.err.println("old subject " + subject[0]);
//////                        System.err.println("new subject " + newSubject[0]);
////                        RDFNode newObject = nextStmt.getObject();
////                        //System.err.println("new object " + newObject);
////                        String type = readFromInstanceTypesAndReturnTypeWithJena(String.valueOf(newObject));
////                        //System.err.println("Type " + type);
////                        if (!type.equals("OTHER")) {
////                            types.put(String.valueOf(object), type); //key: entity, value: type
////                        }
////                        if (iter.hasNext()) {
////                            Statement newNextStatement = iter.nextStatement();
////                            String[] newNextSubject = String.valueOf(newNextStatement.getSubject()).split("&nif");
//////                              System.err.println("next subject " + newNextSubject[0]);
//////                            System.err.println("parsed subject " + newSubject[0]);
////                            //break while loop if you reach end of the subjects in links
////                            if (!(newNextSubject[0].equals(newSubject[0]))) {
////                                System.err.println("readFromNifLinks total time: " + (System.nanoTime() - start) / 1_000_000 + " ms");
////                                System.err.println(types);
////                                return types;
////                            } else {
////                                subject[0] = newNextSubject[0];
////                                predicate = newNextStatement.getPredicate();
////                                object = newNextStatement.getObject();
////                            }
////                        }
////                    }
////                }
////            }
//////
//
////        System.err.println("total time: " + (System.nanoTime() - start));
////        System.err.println(types);
//        return types;
//    }
//
//    private static String readInstanceTypes(String linkFromNifLinks) throws IOException {
////        String ontologyType = "OTHER";
//        String file = "";
//        boolean foundFile = false;
//        String[] parsedLink = linkFromNifLinks.split("resource/");
//        if(parsedLink.length == 1){
//            return "OTHER";
//        }
//
//        for (String filePath : instanceTypeFileNames) {
//            String[] parsedFilePath = filePath.split("InstanceTypes\\\\");
//            if(parsedFilePath[1].charAt(0) == parsedLink[1].toLowerCase().charAt(0)){ //error here java.lang.ArrayIndexOutOfBoundsException: 1
//                file = filePath;
//                foundFile = true;
//                break;
//            }
//        }
//        if (!foundFile) {
//            file = "C:\\Users\\Jakovcheski\\Desktop\\InstanceTypes\\other.ttl";
//        }
////        System.err.println("instance types file " + file);
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] linkType = line.split(">\\s+<");
//
//                if (linkType[0].substring(1).equals(linkFromNifLinks)) {
//                    linkType[2] = linkType[2].substring(0, (linkType[2].length() - 3));
//                    String[] type = linkType[2].split("ontology/");
////                    if (type.length > 1) {
////                        br.close();
//                    return type[1];
////                        ontologyType = type[1];
////                    }
//                }
//            }
////            br.close();
//            return "OTHER";
//        }
//    }
//
////    private static String readFromInstanceTypesAndReturnTypeWithJena(String linkFromNifLinks) throws IOException, NotFoundException {
////        String ontologyType = "OTHER";
////        // Search pattern: Empty string means "any"
//////        IteratorTripleString it = hdtTypes.search("", "", "");
//////        while(it.hasNext()) {
//////            TripleString ts = it.next();
//////            CharSequence subject = ts.getSubject();     // get the subject
//////            if (String.valueOf(subject).equals(linkFromNifLinks)) {
//////                CharSequence object = ts.getObject();      // get the object
//////                String[] type = String.valueOf(object).split("ontology/");
//////                if (type.length > 1) {
//////                    ontologyType = type[1];
//////                    return ontologyType;
//////                }
//////            }
//////        }
////
////
////        // list the statements in the Model
////        StmtIterator iter = model.listStatements();
////        while (iter.hasNext()) {
////            Statement stmt = iter.nextStatement();  // get next statement
////            Resource subject = stmt.getSubject();     // get the subject
////            if (String.valueOf(subject).equals(linkFromNifLinks)) {
////                RDFNode object = stmt.getObject();      // get the object
////                String[] type = String.valueOf(object).split("ontology/");
////                if (type.length > 1) {
////                    ontologyType = type[1];
////                    return ontologyType;
////                }
////            }
////        }
////        return ontologyType;
////    }
//
//    private static void divideTextToWordAtLineWithType(String text, Map<String, String> entityType) throws IOException {
////        Long start = System.nanoTime();
//        String[] words = text.substring(1, text.length() - 3).split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
////        System.err.println("entites " + entityType);
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
//                    bw.write(word + "\t" + value + "\n");
//                } else {
//                    bw.write(word + "\t" + "O\n");
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            bw.flush();
//        }
////        System.err.println("divideTextToWordAtLineWithType total time " + (System.nanoTime() - start) / 1_000_000 + " ms");
//    }
//
//    private static void callPython(String link) throws IOException, ScriptException {
//        System.out.println("I will run a Python script!");
//
//
//        ProcessBuilder pb = new ProcessBuilder("python", "C:\\Dev\\CreatingModel\\src\\main\\java\\ProcessLinks.py", "" + link);
//        Process p2 = pb.start();
//
//        BufferedReader in2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
//        String line2 = null;
//        while ((line2 = in2.readLine()) != null) {
//            System.out.println("line " + line2);
//        }
////        int ret = new Integer(in.readLine()).intValue();
////        System.out.println("value is : "+ret);
//
//
////        Runtime r = Runtime.getRuntime();
////        String pyScript = "C:\\Dev\\CreatingModel\\src\\main\\java\\ProcessLinks.py";
////
////        File f = new File(pyScript);
////        if (f.exists() && !f.isDirectory()) {
////            try {
////                Process p = r.exec("python " + pyScript + link);
////                BufferedReader in = new BufferedReader(
////                        new InputStreamReader(p.getInputStream()));
////                String line = null;
////                while ((line = in.readLine()) != null) {
////                    System.out.println(line);
////                }
////                System.out.println("Python script ran!!");
////            } catch (Exception ex) {
////                System.out.println("Something bad happened!!");
////                ex.printStackTrace();
////            }
////        } else {
////            System.out.println("Unexistent file!" + pyScript);
////        }
//    }
//
////    public static void cleanNifFile(){
//
//    //THIS IS THE PART OF THE CODE OF CLEANING THE NIFLINKS
//    ////            if(String.valueOf(predicate).contains("#taIdentRef")){
//////                taIdentRef = "<" + subject + "> <" + predicate + "> <" + object + "> .";
////////                identObjectToWrite = object;
//////                canWriteIdent = true;
//////            }
//////            if(String.valueOf(predicate).contains("#anchorOf")){
//////                anchorOf = "<" +subject + "> <" + predicate + "> \"" + object + "\" .";
////////                anchorObjectToWrite = object;
//////                canWriteAnchor = true;
//////            }
//////            if(canWriteAnchor && canWriteIdent){
//////                System.err.println("taIdentRef " + taIdentRef);
////////                System.err.println("anchorOf " + anchorOf + "\n");
//////                bw.write(taIdentRef + "\n");
//////                bw.write(anchorOf + "\n");
////////                dataBW.write(String.valueOf(identObjectToWrite));
////////                dataBW.write(String.valueOf(anchorObjectToWrite));
//////                canWriteAnchor = false;
//////                canWriteIdent = false;
//////            }
////        }
////        bw.close();
////        dataBW.close();
////    }
//
//
//    public static void main(String[] args) {
//        try {
//            readFromAbstract();
////            readFromNifLinks();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
