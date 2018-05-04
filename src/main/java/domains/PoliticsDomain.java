package domains;

import SPARQL.Politics;
import entityTypes.FindEntityTypes;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PoliticsDomain {
    private static Long start = System.nanoTime();
    static BufferedWriter bw;

    static {
        try {
            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/PoliticsDomain.ttl"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findAllAbstracts() throws IOException {
        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-abstract/clean-nif-abstract-context_en.ttl";
        FileInputStream inputStream = null;
        Scanner sc = null;
        List<String> politicsLinksSparql = Politics.PoliticsLinks();
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] links = line.split(">\\s+");
                String[] parsedLink = links[0].split("\\?dbpv");
                String linkToCompare = parsedLink[0].substring(1);
                for (String link : politicsLinksSparql){
                    if(linkToCompare.equals(link)){
                        Map<String, String> entityType = new LinkedHashMap<>();
                        entityType = FindEntityTypes.readFromNifLinks(parsedLink[0]);
                        System.err.println("entity types " + entityType);
                        FindEntityTypes.divideTextToWordAtLineWithType(bw,links[2],entityType);
                    }
                }
            }
        }catch (IOException e) {
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
    }

    public static void main(String[] args) {
        try {
            findAllAbstracts();
            System.err.println("TOTAL TIME " + (System.nanoTime()-start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
