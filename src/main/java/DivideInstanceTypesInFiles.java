import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DivideInstanceTypesInFiles {

    private static void divideInstanceTypes() throws IOException {
        BufferedWriter other = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/other.ttl"));
        BufferedWriter zero = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/zero.ttl"));
        BufferedWriter one = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/one.ttl"));
        BufferedWriter two = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/two.ttl"));
        BufferedWriter three = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/three.ttl"));
        BufferedWriter four = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/four.ttl"));
        BufferedWriter five = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/five.ttl"));
        BufferedWriter six = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/six.ttl"));
        BufferedWriter seven = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/seven.ttl"));
        BufferedWriter eight = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/eight.ttl"));
        BufferedWriter nine = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/nine.ttl"));

        BufferedWriter a = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/a.ttl"));
        BufferedWriter b = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/b.ttl"));
        BufferedWriter c = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/c.ttl"));
        BufferedWriter d = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/d.ttl"));
        BufferedWriter e = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/e.ttl"));
        BufferedWriter f = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/f.ttl"));
        BufferedWriter g = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/g.ttl"));
        BufferedWriter h = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/h.ttl"));
        BufferedWriter i = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/i.ttl"));
        BufferedWriter j = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/j.ttl"));
        BufferedWriter k = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/k.ttl"));
        BufferedWriter l = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/l.ttl"));
        BufferedWriter m = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/m.ttl"));
        BufferedWriter n = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/n.ttl"));
        BufferedWriter o = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/o.ttl"));
        BufferedWriter p = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/p.ttl"));
        BufferedWriter q = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/q.ttl"));
        BufferedWriter r = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/r.ttl"));
        BufferedWriter s = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/s.ttl"));
        BufferedWriter t = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/t.ttl"));
        BufferedWriter u = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/u.ttl"));
        BufferedWriter v = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/v.ttl"));
        BufferedWriter w = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/w.ttl"));
        BufferedWriter x = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/x.ttl"));
        BufferedWriter y = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/y.ttl"));
        BufferedWriter z = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/InstanceTypes/z.ttl"));

//        final File folder = new File("C:/Users/Jakovcheski/Desktop/InstanceTypes");
//        listFilesForFolder(folder);

        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/instance-types/cleanInstanceTypes_en.ttl";
        FileInputStream inputStream = null;
        Scanner scanner = null;
        try {
            inputStream = new FileInputStream(filePath);
            scanner = new Scanner(inputStream, "UTF-8");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] links = line.split(">\\s+");
                String[] subject = links[0].split("resource/");
                String firstLetter = subject[1].substring(0,1).toLowerCase();

                switch (firstLetter) {
                    case "0":
                        zero.write(line + "\n");
                        zero.flush();
                        break;
                    case "1":
                        one.write(line + "\n");
                        one.flush();
                        break;
                    case "2":
                        two.write(line + "\n");
                        two.flush();
                        break;
                    case "3":
                        three.write(line + "\n");
                        three.flush();
                        break;
                    case "4":
                        four.write(line + "\n");
                        four.flush();
                        break;
                    case "5":
                        five.write(line + "\n");
                        five.flush();
                        break;
                    case "6":
                        six.write(line + "\n");
                        six.flush();
                        break;
                    case "7":
                        seven.write(line + "\n");
                        seven.flush();
                        break;
                    case "8":
                        eight.write(line + "\n");
                        eight.flush();
                        break;
                    case "9":
                        nine.write(line + "\n");
                        nine.flush();
                        break;
                    case "a":
                        a.write(line + "\n");
                        a.flush();
                        break;
                    case "b":
                        b.write(line + "\n");
                        b.flush();
                        break;
                    case "c":
                        c.write(line + "\n");
                        c.flush();
                        break;
                    case "d":
                        d.write(line + "\n");
                        d.flush();
                        break;
                    case "e":
                        e.write(line + "\n");
                        e.flush();
                        break;
                    case "f":
                        f.write(line + "\n");
                        f.flush();
                        break;
                    case "g":
                        g.write(line + "\n");
                        g.flush();
                        break;
                    case "h":
                        h.write(line + "\n");
                        h.flush();
                        break;
                    case "i":
                        i.write(line + "\n");
                        i.flush();
                        break;
                    case "j":
                        j.write(line + "\n");
                        j.flush();
                        break;
                    case "k":
                        k.write(line + "\n");
                        k.flush();
                        break;
                    case "l":
                        l.write(line + "\n");
                        l.flush();
                        break;
                    case "m":
                        m.write(line + "\n");
                        m.flush();
                        break;
                    case "n":
                        n.write(line + "\n");
                        n.flush();
                        break;
                    case "o":
                        o.write(line + "\n");
                        o.flush();
                        break;
                    case "p":
                        p.write(line + "\n");
                        p.flush();
                        break;
                    case "q":
                        q.write(line + "\n");
                        q.flush();
                        break;
                    case "r":
                        r.write(line + "\n");
                        r.flush();
                        break;
                    case "s":
                        s.write(line + "\n");
                        s.flush();
                        break;
                    case "t":
                        t.write(line + "\n");
                        t.flush();
                        break;
                    case "u":
                        u.write(line + "\n");
                        u.flush();
                        break;
                    case "v":
                        v.write(line + "\n");
                        v.flush();
                        break;
                    case "w":
                        w.write(line + "\n");
                        w.flush();
                        break;
                    case "x":
                        x.write(line + "\n");
                        x.flush();
                        break;
                    case "y":
                        y.write(line + "\n");
                        y.flush();
                        break;
                    case "z":
                        z.write(line + "\n");
                        z.flush();
                        break;
                    default:
                        other.write(line + "\n");
                        other.flush();
                }
            }
        } catch (Exception e3) {
            System.err.println(e3);
            e3.printStackTrace();
        } finally {
            zero.close();
            one.close();
            two.close();
            three.close();
            four.close();
            five.close();
            six.close();
            seven.close();
            eight.close();
            nine.close();
            a.close();
            b.close();
            c.close();
            d.close();
            e.close();
            f.close();
            g.close();
            h.close();
            i.close();
            j.close();
            k.close();
            l.close();
            m.close();
            n.close();
            o.close();
            p.close();
            q.close();
            r.close();
            s.close();
            t.close();
            u.close();
            v.close();
            w.close();
            x.close();
            y.close();
            z.close();
            other.close();
        }
    }

    public static void main(String[] args) {
        Long start = System.nanoTime();
        try {
            divideInstanceTypes();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        System.err.println("Total time: " + (System.nanoTime()-start) + " ns");
    }
}
