import SPARQL.Politics;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindAbstractForDomains {
private static Long start = System.nanoTime();
    static BufferedWriter bw;

    static {
        try {
//            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/globalDomain.ttl"));
            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/abstractForPolitics.ttl"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findAllAbstracts() throws IOException {
        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-abstract/clean-nif-abstract-context_en.ttl";
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] links = line.split(">\\s+");
                String[] parsedLink = links[0].split("&nif=context");

                if(parsedLink[0].equals("<http://dbpedia.org/resource/Peer_review?dbpv=2016-04") ||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Airport?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Submarine?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Association_football?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Departments_of_France?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Central_European_Time?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Democratic_Party_(United_States)?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Republican_Party_(United_States)?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Conservative_Party_(UK)?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Labour_Party_(UK)?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Central_European_Summer_Time?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/American_football?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Rapid_transit?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/PH?dbpv=2016-04")||
                        parsedLink[0].equals("<http://dbpedia.org/resource/Barack_Obama?dbpv=2016-04")
                        ){
                    bw.write(line + "\n");
                    bw.flush();
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
