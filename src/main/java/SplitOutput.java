import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitOutput {

    static BufferedWriter bw;

    static {
        try {
//            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/globalDomain.ttl"));
            bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/sortDomain.ttl"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sortAndSplitOutput() throws IOException {
        String filePath = "C:/Users/Jakovcheski/Desktop/allDomains.ttl";
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(".,") || line.contains(").") || line.contains("),") || line.contains("\\\"") || line.contains(".\"")
                        || line.contains(": “") || line.contains("- –") || line.contains(". –") || line.contains("= −")
                        || line.contains("% –") || line.contains("] ‘") || line.contains(") —") || line.contains(": •")
                        || line.contains(") –") || line.contains(". •") || line.contains(") ≤") || line.contains("() →") || line.contains(", ‘")
                        ||line.contains("] –") || line.contains(", “") || line.contains(", −") || line.contains(", …") || line.contains("∇ ×")
                        ||line.contains("′ −") || line.contains("; −") || line.contains(". §") || line.contains(". √") || line.contains(") ±")
                        ||line.contains(". ‘") || line.contains("/ –") || line.contains(") ×") || line.contains("") || line.contains(": €")
                        ||line.contains(", ±") || line.contains("(+ – × ÷") || line.contains("″ –") || line.contains("– «") || line.contains("? –")
                        ||line.contains(", °") || line.contains(": ‘") || line.contains(") →") || line.contains("(+ − ×") || line.contains(". ●")
                        ||line.contains("! –") || line.contains(". “") || line.contains(", €") || line.contains("' —") || line.contains("; ’")
                        ||line.contains(", ℔") || line.contains(") ≈") || line.contains("= √") || line.contains(", √") || line.contains(") “")
                        ||line.contains("") || line.contains("") || line.contains("") || line.contains("") || line.contains("")
                        ){
                    String[] splitLine = line.split("\\s");
                    bw.write(splitLine[0].charAt(0) +"\tO\n");
                    bw.write(splitLine[0].charAt(1) +"\tO\n");
                    bw.flush();
                }else {
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
            sortAndSplitOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
