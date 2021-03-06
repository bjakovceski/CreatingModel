import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class CleanAndSortHDT {
    private static Long start = System.nanoTime();

//    static BufferedWriter bw;
//
//    static {
//        try {
////            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/globalDomain.ttl"));
//            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/AAAA.ttl"));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private static List<String> fileNames = new LinkedList<>();

    private static void listFilesForFolder(final File folder) {
        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                fileNames.add(fileEntry.getAbsolutePath());
            }
        }
    }

    private static List<String> instanceTypeFileNames = new LinkedList<>();

    private static void listInstanceTypesFilesForFolder(final File folder) {
        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                listInstanceTypesFilesForFolder(fileEntry);
            } else {
                instanceTypeFileNames.add(fileEntry.getAbsolutePath());
            }
        }
    }

    private static List<String> stopWords = new ArrayList<String>();

    static {
        try {
            stopWords = Files.readAllLines(Paths.get("C:\\Users\\Jakovcheski\\Desktop\\THESIS\\stopwords.list"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //

//    private static List<String> instanceTypesLines;
////    private static List<String> nifLinksLines;
//    private static Iterator<String> instanceTypesIterator;
////    private static Iterator<String> nifLinksIterator;
//    private static void readWholeInstanceTypes() throws IOException {
//        {
//            try {
//                instanceTypesLines = Files.readAllLines(Paths.get("C:\\\\Users\\\\Jakovcheski\\\\Desktop\\\\THESIS\\\\instance-types\\\\cleanInstanceTypes_en.ttl"), StandardCharsets.UTF_8);
//                instanceTypesIterator = instanceTypesLines.iterator();
////                nifLinksLines = Files.readAllLines(Paths.get("C:\\\\Users\\\\Jakovcheski\\\\Desktop\\\\THESIS\\\\nif-links\\\\cleanLinks_en.ttl"), StandardCharsets.UTF_8);
////                nifLinksIterator = nifLinksLines.iterator();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    //


    private static void readFromAbstract() throws IOException {
        //links
        final File folder = new File("C:\\Users\\Jakovcheski\\Desktop\\DataTree");
        listFilesForFolder(folder);
        //instance types
        final File instanceTypesFolder = new File("C:\\Users\\Jakovcheski\\Desktop\\InstanceTypes");
        listInstanceTypesFilesForFolder(instanceTypesFolder);

//        readWholeInstanceTypes();

//        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-abstract/clean-nif-abstract-context_en-LinksThatAreNotJetProccessed.ttl";
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/Politics.ttl"));
        String filePath = "C:/Users/Jakovcheski/Desktop/abstractForPolitics.ttl";
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Long startTime = System.nanoTime();
                Map<String, String> entityType = new LinkedHashMap<>();
                String[] links = line.split(">\\s+");
                String[] parsedLink = links[0].split("&nif=context");
                entityType = readFromNifLinks(parsedLink[0]);
                divideTextToWordAtLineWithType(bw, links[2], entityType);
                System.err.println("One link calculation time: " + (System.nanoTime() - startTime) + " ns \n");
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

    public static Map<String, String> readFromNifLinks(String link) throws IOException {
        //links
        final File folder = new File("C:\\Users\\Jakovcheski\\Desktop\\DataTree");
        listFilesForFolder(folder);
        //instance types
        final File instanceTypesFolder = new File("C:\\Users\\Jakovcheski\\Desktop\\InstanceTypes");
        listInstanceTypesFilesForFolder(instanceTypesFolder);

        Map<String, String> types = new LinkedHashMap<>();
        boolean foundLinkFile = false;
        System.err.println("Link " + link);
        String[] parsedLink = link.split("resource/");
        String firstTwoCharactersFromNameLink = parsedLink[1].substring(0, 2).toLowerCase();
        String file = "";

        if (firstTwoCharactersFromNameLink.startsWith("\'")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\'\\apostrophe.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("-")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\-\\hyphen.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("!")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\!\\exclamation.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("$")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\$\\dolar.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("0")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\0\\zero.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("1")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\1\\one.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("2")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\2\\two.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("3")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\3\\three.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("4")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\4\\four.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("5")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\5\\five.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("6")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\6\\six.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("7")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\7\\seven.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("8")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\8\\eight.ttl";
        } else if (firstTwoCharactersFromNameLink.startsWith("9")) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTreeSpecialCharacters\\9\\nine.ttl";
        } else {
            for (String fileName : fileNames) {
                String[] parsedFilePath = fileName.split("\\\\");
                if (parsedFilePath[parsedFilePath.length - 1].substring(0, 2).equals(firstTwoCharactersFromNameLink)) {
                    foundLinkFile = true;
                    file = fileName;
                }
            }
        }
        if (!foundLinkFile) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\DataTree\\other\\other.ttl";
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] lineLinks = line.split(">\\s+");
                //parsedLinks is not same as parsedLink!!!!
//                String[] parsedLinks = lineLinks[0].split("&nif");
                String[] parsedLinks = lineLinks[0].split("\\?dbpv");

                if (parsedLinks[0].equals(link)) {
                    if (lineLinks[1].contains("#taIdentRef")) {
                        String nextLine = br.readLine();
                        String[] nextLineLinks = nextLine.split(">\\s+");
                        String type = readInstanceTypes(lineLinks[2].substring(1, lineLinks[2].length()));
                        if (!type.equals("OTHER")) {
                            types.put(nextLineLinks[2].substring(1, nextLineLinks[2].length() - 3), type); //key: entity, value: type
                        }
                    }
                }

            }
        }
        return types;
    }

    private static String readInstanceTypes(String linkFromNifLinks) throws IOException {
        String file = "";
        boolean foundFile = false;
        String[] parsedLink = linkFromNifLinks.split("resource/");
        if (parsedLink.length == 1) {
            return "OTHER";
        }
        for (String filePath : instanceTypeFileNames) {
            String[] parsedFilePath = filePath.split("InstanceTypes\\\\");
            if (parsedFilePath[1].charAt(0) == parsedLink[1].toLowerCase().charAt(0)) { //error here java.lang.ArrayIndexOutOfBoundsException: 1
                file = filePath;
                foundFile = true;
                break;
            }
        }
        if (!foundFile) {
            file = "C:\\Users\\Jakovcheski\\Desktop\\InstanceTypes\\other.ttl";
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] linkType = line.split(">\\s+<");

                if (linkType[0].substring(1).equals(linkFromNifLinks)) {
                    linkType[2] = linkType[2].substring(0, (linkType[2].length() - 3));
                    String[] type = linkType[2].split("ontology/");
                    return type[1];
                }
            }
            return "OTHER";
        }
    }

    public static void divideTextToWordAtLineWithType(BufferedWriter bw, String text, Map<String, String> entityType) throws IOException {
        String[] words = text.substring(1, text.length() - 3).split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
        Map<String, String> splittedKeyMap = new HashMap<>();
        entityType.forEach((s, v) -> {
            String[] keyWords = s.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");//split keys from map to one word
            for (String key :
                    keyWords) {
                splittedKeyMap.put(key, v);
            }
        });

        String filePath = "C:\\Users\\Jakovcheski\\Desktop\\THESIS\\stopwords.list";
        FileInputStream stopWordsStream = null;
        Scanner stopWordsScanner = null;

        try {
            for (String word : words) {
                String value = splittedKeyMap.get(word);
                Boolean notWrittedToFile = true;
                for (String stopWord : stopWords) {
                    if (notWrittedToFile) {
                        if (word.equals(stopWord) || Pattern.matches("\\p{Punct}", word) || Character.isDigit(word.charAt(0))) {
                            bw.write(word + "\t" + "O\n");
                            notWrittedToFile = false;
                        }
                    }
                }
                if (notWrittedToFile) {
                    if (value != null) {
                        bw.write(word + "\t" + value + "\n");
                    } else {
                        bw.write(word + "\t" + "O\n");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.flush();
        }
    }

    public static void main(String[] args) {
//        try {
//            readFromAbstract();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
