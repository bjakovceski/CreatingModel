import org.apache.jena.base.Sys;
import org.apache.jena.rdf.model.*;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CleanAbstract {
    private static String fileTypesPath = "C:/Users/Jakovcheski/Desktop/testNIF/AggasiLinksFrom-nif-text-links.ttl";
    private static Model model = ModelFactory.createDefaultModel();

    static {
        model.read(fileTypesPath);
    }

    public static void cleanData() throws IOException {
        String filePath = "C:/Users/Jakovcheski/Desktop/testNIF/AggasiLinksFrom-nif-text-links.ttl";
//        String filePath = "C:/Users/Jakovcheski/Desktop/AggasiTextFrom-nif-abstract_en.ttl";
        FileInputStream inputStream = null;
        Scanner sc = null;
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/testDataCleanAgassiLinks.ttl"));
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if(line.contains("taIdentRef") || line.contains("anchorOf") ){
                    bw.write(line + "\n");
                    bw.flush();
                }
            }
        } catch (Exception e){
            return;
        }

        bw.close();
    }

    public static void cleanInstanceTypes() throws IOException {
        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/instance_types_en.ttl";
//        String filePath = "C:/Users/Jakovcheski/Desktop/AggasiTextFrom-nif-abstract_en.ttl";
        FileInputStream inputStream = null;
        Scanner sc = null;
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/cleanInstanceTypes_en.ttl"));
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if(!line.contains("owl#Thing")){
                    bw.write(line + "\n");
                    bw.flush();
                }
            }
        } catch (Exception e){
            return;
        }

        bw.close();
    }

    public static void cleanAbstract() throws IOException {
        Long start = System.nanoTime();
        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-abstract/nif-abstract-context_en.ttl";
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/clean-nif-abstract-context_en.ttl"));
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.indexOf("#isString") > 0) {
//                    String[] links = line.split(">\\s+");
                    bw.write(line + "\n");
                    bw.flush();
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
            if(bw != null){
                bw.close();
            }
        }
        System.err.println("End time cleaning " + (System.nanoTime()-start) + " ns");
    }

    public static void main(String[] args) {
        try {
            cleanInstanceTypes();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
