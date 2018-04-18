import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CleanNifLinks {

    private static void createFolders() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            //create folder
            String x = String.valueOf(alphabet[i]);
            File dir1 = new File("C:/Users/Jakovcheski/Desktop/DataTree/" + x);

            // attempt to create the directory here
            boolean successful = dir1.mkdir();
            if (successful) {
                // creating the directory succeeded
                System.out.println("directory was created successfully");
            } else {
                // creating the directory failed
                System.out.println("failed trying to create the directory");
            }
            for (int j = 0; j < alphabet.length; j++) {
                // create  aub - folder
                String k = String.valueOf(alphabet[j]);
                File dir = new File(dir1 + "/" + k);

                // attempt to create the directory here
                boolean successful1 = dir.mkdir();
                if (successful1) {
                    // creating the directory succeeded
                    System.out.println("directory was created successfully");
                } else {
                    // creating the directory failed
                    System.out.println("failed trying to create the directory");
                }
            }
        }
    }

    private static void sortNifLinksToFile() throws IOException {
        Long start = System.nanoTime();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String filePath = "C:/Users/Jakovcheski/Desktop/THESIS/nif-links/cleanLinks_en.ttl";
        BufferedWriter other = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/other/other.ttl"));
        BufferedWriter apostrophe = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/'/apostrophe.ttl"));
        BufferedWriter hyphen = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/-/hyphen.ttl"));
        BufferedWriter exclamation = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/!/exclamation.ttl"));
        BufferedWriter dolar = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/$/dolar.ttl"));
        BufferedWriter zero = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/0/zero.ttl"));
        BufferedWriter one = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/1/one.ttl"));
        BufferedWriter two = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/2/two.ttl"));
        BufferedWriter three = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/3/three.ttl"));
        BufferedWriter four = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/4/four.ttl"));
        BufferedWriter five = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/5/five.ttl"));
        BufferedWriter six = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/6/six.ttl"));
        BufferedWriter seven = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/7/seven.ttl"));
        BufferedWriter eight = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/8/eight.ttl"));
        BufferedWriter nine = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/9/nine.ttl"));
        //a
        BufferedWriter aa = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/a/aa.ttl"));
        BufferedWriter ab = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/b/ab.ttl"));
        BufferedWriter ac = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/c/ac.ttl"));
        BufferedWriter ad = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/d/ad.ttl"));
        BufferedWriter ae = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/e/ae.ttl"));
        BufferedWriter af = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/f/af.ttl"));
        BufferedWriter ag = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/g/ag.ttl"));
        BufferedWriter ah = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/h/ah.ttl"));
        BufferedWriter ai = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/i/ai.ttl"));
        BufferedWriter aj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/j/aj.ttl"));
        BufferedWriter ak = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/k/ak.ttl"));
        BufferedWriter al = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/l/al.ttl"));
        BufferedWriter am = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/m/am.ttl"));
        BufferedWriter an = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/n/an.ttl"));
        BufferedWriter ao = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/o/ao.ttl"));
        BufferedWriter ap = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/p/ap.ttl"));
        BufferedWriter aq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/q/aq.ttl"));
        BufferedWriter ar = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/r/ar.ttl"));
        BufferedWriter as = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/s/as.ttl"));
        BufferedWriter at = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/t/at.ttl"));
        BufferedWriter au = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/u/au.ttl"));
        BufferedWriter av = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/v/av.ttl"));
        BufferedWriter aw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/w/aw.ttl"));
        BufferedWriter ax = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/x/ax.ttl"));
        BufferedWriter ay = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/y/ay.ttl"));
        BufferedWriter az = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/a/z/az.ttl"));
        //b
        BufferedWriter ba = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/a/ba.ttl"));
        BufferedWriter bb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/b/bb.ttl"));
        BufferedWriter bc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/c/bc.ttl"));
        BufferedWriter bd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/d/bd.ttl"));
        BufferedWriter be = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/e/be.ttl"));
        BufferedWriter bf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/f/bf.ttl"));
        BufferedWriter bg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/g/bg.ttl"));
        BufferedWriter bh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/h/bh.ttl"));
        BufferedWriter bi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/i/bi.ttl"));
        BufferedWriter bj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/j/bj.ttl"));
        BufferedWriter bk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/k/bk.ttl"));
        BufferedWriter bl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/l/bl.ttl"));
        BufferedWriter bm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/m/bm.ttl"));
        BufferedWriter bn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/n/bn.ttl"));
        BufferedWriter bo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/o/bo.ttl"));
        BufferedWriter bp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/p/bp.ttl"));
        BufferedWriter bq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/q/bq.ttl"));
        BufferedWriter br = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/r/br.ttl"));
        BufferedWriter bs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/s/bs.ttl"));
        BufferedWriter bt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/t/bt.ttl"));
        BufferedWriter bu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/u/bu.ttl"));
        BufferedWriter bv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/v/bv.ttl"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/w/bw.ttl"));
        BufferedWriter bx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/x/bx.ttl"));
        BufferedWriter by = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/y/by.ttl"));
        BufferedWriter bz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/b/z/bz.ttl"));
        //c
        BufferedWriter ca = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/a/ca.ttl"));
        BufferedWriter cb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/b/cb.ttl"));
        BufferedWriter cc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/c/cc.ttl"));
        BufferedWriter cd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/d/cd.ttl"));
        BufferedWriter ce = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/e/ce.ttl"));
        BufferedWriter cf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/f/cf.ttl"));
        BufferedWriter cg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/g/cg.ttl"));
        BufferedWriter ch = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/h/ch.ttl"));
        BufferedWriter ci = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/i/ci.ttl"));
        BufferedWriter cj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/j/cj.ttl"));
        BufferedWriter ck = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/k/ck.ttl"));
        BufferedWriter cl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/l/cl.ttl"));
        BufferedWriter cm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/m/cm.ttl"));
        BufferedWriter cn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/n/cn.ttl"));
        BufferedWriter co = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/o/co.ttl"));
        BufferedWriter cp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/p/cp.ttl"));
        BufferedWriter cq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/q/cq.ttl"));
        BufferedWriter cr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/r/cr.ttl"));
        BufferedWriter cs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/s/cs.ttl"));
        BufferedWriter ct = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/t/ct.ttl"));
        BufferedWriter cu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/u/cu.ttl"));
        BufferedWriter cv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/v/cv.ttl"));
        BufferedWriter cw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/w/cw.ttl"));
        BufferedWriter cx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/x/cx.ttl"));
        BufferedWriter cy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/y/cy.ttl"));
        BufferedWriter cz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/c/z/cz.ttl"));
        //d
        BufferedWriter da = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/a/da.ttl"));
        BufferedWriter db = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/b/db.ttl"));
        BufferedWriter dc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/c/dc.ttl"));
        BufferedWriter dd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/d/dd.ttl"));
        BufferedWriter de = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/e/de.ttl"));
        BufferedWriter df = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/f/df.ttl"));
        BufferedWriter dg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/g/dg.ttl"));
        BufferedWriter dh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/h/dh.ttl"));
        BufferedWriter di = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/i/di.ttl"));
        BufferedWriter dj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/j/dj.ttl"));
        BufferedWriter dk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/k/dk.ttl"));
        BufferedWriter dl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/l/dl.ttl"));
        BufferedWriter dm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/m/dm.ttl"));
        BufferedWriter dn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/n/dn.ttl"));
        BufferedWriter doo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/o/do.ttl"));
        BufferedWriter dp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/p/dp.ttl"));
        BufferedWriter dq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/q/dq.ttl"));
        BufferedWriter dr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/r/dr.ttl"));
        BufferedWriter ds = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/s/ds.ttl"));
        BufferedWriter dt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/t/dt.ttl"));
        BufferedWriter du = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/u/du.ttl"));
        BufferedWriter dv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/v/dv.ttl"));
        BufferedWriter dw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/w/dw.ttl"));
        BufferedWriter dx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/x/dx.ttl"));
        BufferedWriter dy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/y/dy.ttl"));
        BufferedWriter dz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/d/z/dz.ttl"));
        //e
        BufferedWriter ea = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/a/ea.ttl"));
        BufferedWriter eb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/b/eb.ttl"));
        BufferedWriter ec = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/c/ec.ttl"));
        BufferedWriter ed = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/d/ed.ttl"));
        BufferedWriter ee = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/e/ee.ttl"));
        BufferedWriter ef = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/f/ef.ttl"));
        BufferedWriter eg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/g/eg.ttl"));
        BufferedWriter eh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/h/eh.ttl"));
        BufferedWriter ei = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/i/ei.ttl"));
        BufferedWriter ej = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/j/ej.ttl"));
        BufferedWriter ek = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/k/ek.ttl"));
        BufferedWriter el = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/l/el.ttl"));
        BufferedWriter em = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/m/em.ttl"));
        BufferedWriter en = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/n/en.ttl"));
        BufferedWriter eo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/o/eo.ttl"));
        BufferedWriter ep = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/p/ep.ttl"));
        BufferedWriter eq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/q/eq.ttl"));
        BufferedWriter er = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/r/er.ttl"));
        BufferedWriter es = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/s/es.ttl"));
        BufferedWriter et = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/t/et.ttl"));
        BufferedWriter eu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/u/eu.ttl"));
        BufferedWriter ev = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/v/ev.ttl"));
        BufferedWriter ew = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/w/ew.ttl"));
        BufferedWriter ex = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/x/ex.ttl"));
        BufferedWriter ey = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/y/ey.ttl"));
        BufferedWriter ez = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/e/z/ez.ttl"));
        //f
        BufferedWriter fa = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/a/fa.ttl"));
        BufferedWriter fb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/b/fb.ttl"));
        BufferedWriter fc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/c/fc.ttl"));
        BufferedWriter fd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/d/fd.ttl"));
        BufferedWriter fe = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/e/fe.ttl"));
        BufferedWriter ff = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/f/ff.ttl"));
        BufferedWriter fg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/g/fg.ttl"));
        BufferedWriter fh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/h/fh.ttl"));
        BufferedWriter fi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/i/fi.ttl"));
        BufferedWriter fj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/j/fj.ttl"));
        BufferedWriter fk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/k/fk.ttl"));
        BufferedWriter fl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/l/fl.ttl"));
        BufferedWriter fm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/m/fm.ttl"));
        BufferedWriter fn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/n/fn.ttl"));
        BufferedWriter fo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/o/fo.ttl"));
        BufferedWriter fp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/p/fp.ttl"));
        BufferedWriter fq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/q/fq.ttl"));
        BufferedWriter fr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/r/fr.ttl"));
        BufferedWriter fs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/s/fs.ttl"));
        BufferedWriter ft = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/t/ft.ttl"));
        BufferedWriter fu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/u/fu.ttl"));
        BufferedWriter fv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/v/fv.ttl"));
        BufferedWriter fw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/w/fw.ttl"));
        BufferedWriter fx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/x/fx.ttl"));
        BufferedWriter fy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/y/fy.ttl"));
        BufferedWriter fz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/f/z/fz.ttl"));
        //g
        BufferedWriter ga = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/a/ga.ttl"));
        BufferedWriter gb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/b/gb.ttl"));
        BufferedWriter gc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/c/gc.ttl"));
        BufferedWriter gd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/d/gd.ttl"));
        BufferedWriter ge = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/e/ge.ttl"));
        BufferedWriter gf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/f/gf.ttl"));
        BufferedWriter gg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/g/gg.ttl"));
        BufferedWriter gh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/h/gh.ttl"));
        BufferedWriter gi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/i/gi.ttl"));
        BufferedWriter gj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/j/gj.ttl"));
        BufferedWriter gk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/k/gk.ttl"));
        BufferedWriter gl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/l/gl.ttl"));
        BufferedWriter gm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/m/gm.ttl"));
        BufferedWriter gn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/n/gn.ttl"));
        BufferedWriter go = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/o/go.ttl"));
        BufferedWriter gp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/p/gp.ttl"));
        BufferedWriter gq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/q/gq.ttl"));
        BufferedWriter gr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/r/gr.ttl"));
        BufferedWriter gs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/s/gs.ttl"));
        BufferedWriter gt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/t/gt.ttl"));
        BufferedWriter gu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/u/gu.ttl"));
        BufferedWriter gv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/v/gv.ttl"));
        BufferedWriter gw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/w/gw.ttl"));
        BufferedWriter gx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/x/gx.ttl"));
        BufferedWriter gy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/y/gy.ttl"));
        BufferedWriter gz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/g/z/gz.ttl"));
        //h
        BufferedWriter ha = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/a/ha.ttl"));
        BufferedWriter hb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/b/hb.ttl"));
        BufferedWriter hc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/c/hc.ttl"));
        BufferedWriter hd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/d/hd.ttl"));
        BufferedWriter he = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/e/he.ttl"));
        BufferedWriter hf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/f/hf.ttl"));
        BufferedWriter hg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/g/hg.ttl"));
        BufferedWriter hh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/h/hh.ttl"));
        BufferedWriter hi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/i/hi.ttl"));
        BufferedWriter hj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/j/hj.ttl"));
        BufferedWriter hk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/k/hk.ttl"));
        BufferedWriter hl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/l/hl.ttl"));
        BufferedWriter hm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/m/hm.ttl"));
        BufferedWriter hn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/n/hn.ttl"));
        BufferedWriter ho = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/o/ho.ttl"));
        BufferedWriter hp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/p/hp.ttl"));
        BufferedWriter hq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/q/hq.ttl"));
        BufferedWriter hr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/r/hr.ttl"));
        BufferedWriter hs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/s/hs.ttl"));
        BufferedWriter ht = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/t/ht.ttl"));
        BufferedWriter hu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/u/hu.ttl"));
        BufferedWriter hv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/v/hv.ttl"));
        BufferedWriter hw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/w/hw.ttl"));
        BufferedWriter hx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/x/hx.ttl"));
        BufferedWriter hy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/y/hy.ttl"));
        BufferedWriter hz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/h/z/hz.ttl"));
        //i
        BufferedWriter ia = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/a/ia.ttl"));
        BufferedWriter ib = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/b/ib.ttl"));
        BufferedWriter ic = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/c/ic.ttl"));
        BufferedWriter id = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/d/id.ttl"));
        BufferedWriter ie = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/e/ie.ttl"));
        BufferedWriter iff = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/f/if.ttl"));
        BufferedWriter ig = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/g/ig.ttl"));
        BufferedWriter ih = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/h/ih.ttl"));
        BufferedWriter ii = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/i/ii.ttl"));
        BufferedWriter ij = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/j/ij.ttl"));
        BufferedWriter ik = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/k/ik.ttl"));
        BufferedWriter il = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/l/il.ttl"));
        BufferedWriter im = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/m/im.ttl"));
        BufferedWriter in = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/n/in.ttl"));
        BufferedWriter io = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/o/io.ttl"));
        BufferedWriter ip = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/p/ip.ttl"));
        BufferedWriter iq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/q/iq.ttl"));
        BufferedWriter ir = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/r/ir.ttl"));
        BufferedWriter is = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/s/is.ttl"));
        BufferedWriter it = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/t/it.ttl"));
        BufferedWriter iu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/u/iu.ttl"));
        BufferedWriter iv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/v/iv.ttl"));
        BufferedWriter iw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/w/iw.ttl"));
        BufferedWriter ix = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/x/ix.ttl"));
        BufferedWriter iy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/y/iy.ttl"));
        BufferedWriter iz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/i/z/iz.ttl"));
        //j
        BufferedWriter ja = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/a/ja.ttl"));
        BufferedWriter jb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/b/jb.ttl"));
        BufferedWriter jc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/c/jc.ttl"));
        BufferedWriter jd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/d/jd.ttl"));
        BufferedWriter je = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/e/je.ttl"));
        BufferedWriter jf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/f/jf.ttl"));
        BufferedWriter jg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/g/jg.ttl"));
        BufferedWriter jh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/h/jh.ttl"));
        BufferedWriter ji = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/i/ji.ttl"));
        BufferedWriter jj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/j/jj.ttl"));
        BufferedWriter jk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/k/jk.ttl"));
        BufferedWriter jl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/l/jl.ttl"));
        BufferedWriter jm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/m/jm.ttl"));
        BufferedWriter jn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/n/jn.ttl"));
        BufferedWriter jo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/o/jo.ttl"));
        BufferedWriter jp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/p/jp.ttl"));
        BufferedWriter jq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/q/jq.ttl"));
        BufferedWriter jr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/r/jr.ttl"));
        BufferedWriter js = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/s/js.ttl"));
        BufferedWriter jt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/t/jt.ttl"));
        BufferedWriter ju = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/u/ju.ttl"));
        BufferedWriter jv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/v/jv.ttl"));
        BufferedWriter jw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/w/jw.ttl"));
        BufferedWriter jx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/x/jx.ttl"));
        BufferedWriter jy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/y/jy.ttl"));
        BufferedWriter jz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/j/z/jz.ttl"));
        //k
        BufferedWriter ka = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/a/ka.ttl"));
        BufferedWriter kb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/b/kb.ttl"));
        BufferedWriter kc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/c/kc.ttl"));
        BufferedWriter kd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/d/kd.ttl"));
        BufferedWriter ke = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/e/ke.ttl"));
        BufferedWriter kf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/f/kf.ttl"));
        BufferedWriter kg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/g/kg.ttl"));
        BufferedWriter kh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/h/kh.ttl"));
        BufferedWriter ki = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/i/ki.ttl"));
        BufferedWriter kj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/j/kj.ttl"));
        BufferedWriter kk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/k/kk.ttl"));
        BufferedWriter kl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/l/kl.ttl"));
        BufferedWriter km = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/m/km.ttl"));
        BufferedWriter kn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/n/kn.ttl"));
        BufferedWriter ko = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/o/ko.ttl"));
        BufferedWriter kp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/p/kp.ttl"));
        BufferedWriter kq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/q/kq.ttl"));
        BufferedWriter kr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/r/kr.ttl"));
        BufferedWriter ks = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/s/ks.ttl"));
        BufferedWriter kt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/t/kt.ttl"));
        BufferedWriter ku = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/u/ku.ttl"));
        BufferedWriter kv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/v/kv.ttl"));
        BufferedWriter kw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/w/kw.ttl"));
        BufferedWriter kx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/x/kx.ttl"));
        BufferedWriter ky = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/y/ky.ttl"));
        BufferedWriter kz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/k/z/kz.ttl"));
        //l
        BufferedWriter la = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/a/la.ttl"));
        BufferedWriter lb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/b/lb.ttl"));
        BufferedWriter lc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/c/lc.ttl"));
        BufferedWriter ld = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/d/ld.ttl"));
        BufferedWriter le = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/e/le.ttl"));
        BufferedWriter lf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/f/lf.ttl"));
        BufferedWriter lg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/g/lg.ttl"));
        BufferedWriter lh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/h/lh.ttl"));
        BufferedWriter li = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/i/li.ttl"));
        BufferedWriter lj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/j/lj.ttl"));
        BufferedWriter lk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/k/lk.ttl"));
        BufferedWriter ll = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/l/ll.ttl"));
        BufferedWriter lm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/m/lm.ttl"));
        BufferedWriter ln = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/n/ln.ttl"));
        BufferedWriter lo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/o/lo.ttl"));
        BufferedWriter lp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/p/lp.ttl"));
        BufferedWriter lq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/q/lq.ttl"));
        BufferedWriter lr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/r/lr.ttl"));
        BufferedWriter ls = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/s/ls.ttl"));
        BufferedWriter lt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/t/lt.ttl"));
        BufferedWriter lu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/u/lu.ttl"));
        BufferedWriter lv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/v/lv.ttl"));
        BufferedWriter lw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/w/lw.ttl"));
        BufferedWriter lx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/x/lx.ttl"));
        BufferedWriter ly = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/y/ly.ttl"));
        BufferedWriter lz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/l/z/lz.ttl"));
        //m
        BufferedWriter ma = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/a/ma.ttl"));
        BufferedWriter mb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/b/mb.ttl"));
        BufferedWriter mc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/c/mc.ttl"));
        BufferedWriter md = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/d/md.ttl"));
        BufferedWriter me = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/e/me.ttl"));
        BufferedWriter mf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/f/mf.ttl"));
        BufferedWriter mg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/g/mg.ttl"));
        BufferedWriter mh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/h/mh.ttl"));
        BufferedWriter mi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/i/mi.ttl"));
        BufferedWriter mj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/j/mj.ttl"));
        BufferedWriter mk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/k/mk.ttl"));
        BufferedWriter ml = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/l/ml.ttl"));
        BufferedWriter mm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/m/mm.ttl"));
        BufferedWriter mn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/n/mn.ttl"));
        BufferedWriter mo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/o/mo.ttl"));
        BufferedWriter mp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/p/mp.ttl"));
        BufferedWriter mq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/q/mq.ttl"));
        BufferedWriter mr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/r/mr.ttl"));
        BufferedWriter ms = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/s/ms.ttl"));
        BufferedWriter mt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/t/mt.ttl"));
        BufferedWriter mu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/u/mu.ttl"));
        BufferedWriter mv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/v/mv.ttl"));
        BufferedWriter mw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/w/mw.ttl"));
        BufferedWriter mx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/x/mx.ttl"));
        BufferedWriter my = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/y/my.ttl"));
        BufferedWriter mz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/m/z/mz.ttl"));
        //n
        BufferedWriter na = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/a/na.ttl"));
        BufferedWriter nb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/b/nb.ttl"));
        BufferedWriter nc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/c/nc.ttl"));
        BufferedWriter nd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/d/nd.ttl"));
        BufferedWriter ne = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/e/ne.ttl"));
        BufferedWriter nf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/f/nf.ttl"));
        BufferedWriter ng = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/g/ng.ttl"));
        BufferedWriter nh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/h/nh.ttl"));
        BufferedWriter ni = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/i/ni.ttl"));
        BufferedWriter nj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/j/nj.ttl"));
        BufferedWriter nk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/k/nk.ttl"));
        BufferedWriter nl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/l/nl.ttl"));
        BufferedWriter nm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/m/nm.ttl"));
        BufferedWriter nn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/n/nn.ttl"));
        BufferedWriter no = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/o/no.ttl"));
        BufferedWriter np = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/p/np.ttl"));
        BufferedWriter nq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/q/nq.ttl"));
        BufferedWriter nr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/r/nr.ttl"));
        BufferedWriter ns = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/s/ns.ttl"));
        BufferedWriter nt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/t/nt.ttl"));
        BufferedWriter nu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/u/nu.ttl"));
        BufferedWriter nv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/v/nv.ttl"));
        BufferedWriter nw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/w/nw.ttl"));
        BufferedWriter nx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/x/nx.ttl"));
        BufferedWriter ny = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/y/ny.ttl"));
        BufferedWriter nz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/n/z/nz.ttl"));
        //o
        BufferedWriter oa = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/a/oa.ttl"));
        BufferedWriter ob = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/b/ob.ttl"));
        BufferedWriter oc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/c/oc.ttl"));
        BufferedWriter od = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/d/od.ttl"));
        BufferedWriter oe = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/e/oe.ttl"));
        BufferedWriter of = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/f/of.ttl"));
        BufferedWriter og = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/g/og.ttl"));
        BufferedWriter oh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/h/oh.ttl"));
        BufferedWriter oi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/i/oi.ttl"));
        BufferedWriter oj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/j/oj.ttl"));
        BufferedWriter ok = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/k/ok.ttl"));
        BufferedWriter ol = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/l/ol.ttl"));
        BufferedWriter om = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/m/om.ttl"));
        BufferedWriter on = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/n/on.ttl"));
        BufferedWriter oo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/o/oo.ttl"));
        BufferedWriter op = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/p/op.ttl"));
        BufferedWriter oq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/q/oq.ttl"));
        BufferedWriter or = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/r/or.ttl"));
        BufferedWriter os = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/s/os.ttl"));
        BufferedWriter ot = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/t/ot.ttl"));
        BufferedWriter ou = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/u/ou.ttl"));
        BufferedWriter ov = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/v/ov.ttl"));
        BufferedWriter ow = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/w/ow.ttl"));
        BufferedWriter ox = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/x/ox.ttl"));
        BufferedWriter oy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/y/oy.ttl"));
        BufferedWriter oz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/o/z/oz.ttl"));
        //p
        BufferedWriter pa = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/a/pa.ttl"));
        BufferedWriter pb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/b/pb.ttl"));
        BufferedWriter pc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/c/pc.ttl"));
        BufferedWriter pd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/d/pd.ttl"));
        BufferedWriter pe = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/e/pe.ttl"));
        BufferedWriter pf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/f/pf.ttl"));
        BufferedWriter pg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/g/pg.ttl"));
        BufferedWriter ph = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/h/ph.ttl"));
        BufferedWriter pi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/i/pi.ttl"));
        BufferedWriter pj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/j/pj.ttl"));
        BufferedWriter pk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/k/pk.ttl"));
        BufferedWriter pl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/l/pl.ttl"));
        BufferedWriter pm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/m/pm.ttl"));
        BufferedWriter pn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/n/pn.ttl"));
        BufferedWriter po = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/o/po.ttl"));
        BufferedWriter pp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/p/pp.ttl"));
        BufferedWriter pq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/q/pq.ttl"));
        BufferedWriter pr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/r/pr.ttl"));
        BufferedWriter ps = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/s/ps.ttl"));
        BufferedWriter pt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/t/pt.ttl"));
        BufferedWriter pu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/u/pu.ttl"));
        BufferedWriter pv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/v/pv.ttl"));
        BufferedWriter pw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/w/pw.ttl"));
        BufferedWriter px = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/x/px.ttl"));
        BufferedWriter py = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/y/py.ttl"));
        BufferedWriter pz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/p/z/pz.ttl"));
        //q
        BufferedWriter qa = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/a/qa.ttl"));
        BufferedWriter qb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/b/qb.ttl"));
        BufferedWriter qc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/c/qc.ttl"));
        BufferedWriter qd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/d/qd.ttl"));
        BufferedWriter qe = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/e/qe.ttl"));
        BufferedWriter qf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/f/qf.ttl"));
        BufferedWriter qg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/g/qg.ttl"));
        BufferedWriter qh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/h/qh.ttl"));
        BufferedWriter qi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/i/qi.ttl"));
        BufferedWriter qj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/j/qj.ttl"));
        BufferedWriter qk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/k/qk.ttl"));
        BufferedWriter ql = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/l/ql.ttl"));
        BufferedWriter qm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/m/qm.ttl"));
        BufferedWriter qn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/n/qn.ttl"));
        BufferedWriter qo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/o/qo.ttl"));
        BufferedWriter qp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/p/qp.ttl"));
        BufferedWriter qq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/q/qq.ttl"));
        BufferedWriter qr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/r/qr.ttl"));
        BufferedWriter qs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/s/qs.ttl"));
        BufferedWriter qt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/t/qt.ttl"));
        BufferedWriter qu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/u/qu.ttl"));
        BufferedWriter qv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/v/qv.ttl"));
        BufferedWriter qw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/w/qw.ttl"));
        BufferedWriter qx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/x/qx.ttl"));
        BufferedWriter qy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/y/qy.ttl"));
        BufferedWriter qz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/q/z/qz.ttl"));
        //r
        BufferedWriter ra = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/a/ra.ttl"));
        BufferedWriter rb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/b/rb.ttl"));
        BufferedWriter rc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/c/rc.ttl"));
        BufferedWriter rd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/d/rd.ttl"));
        BufferedWriter re = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/e/re.ttl"));
        BufferedWriter rf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/f/rf.ttl"));
        BufferedWriter rg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/g/rg.ttl"));
        BufferedWriter rh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/h/rh.ttl"));
        BufferedWriter ri = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/i/ri.ttl"));
        BufferedWriter rj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/j/rj.ttl"));
        BufferedWriter rk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/k/rk.ttl"));
        BufferedWriter rl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/l/rl.ttl"));
        BufferedWriter rm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/m/rm.ttl"));
        BufferedWriter rn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/n/rn.ttl"));
        BufferedWriter ro = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/o/ro.ttl"));
        BufferedWriter rp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/p/rp.ttl"));
        BufferedWriter rq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/q/rq.ttl"));
        BufferedWriter rr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/r/rr.ttl"));
        BufferedWriter rs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/s/rs.ttl"));
        BufferedWriter rt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/t/rt.ttl"));
        BufferedWriter ru = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/u/ru.ttl"));
        BufferedWriter rv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/v/rv.ttl"));
        BufferedWriter rw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/w/rw.ttl"));
        BufferedWriter rx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/x/rx.ttl"));
        BufferedWriter ry = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/y/ry.ttl"));
        BufferedWriter rz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/r/z/rz.ttl"));
        //s
        BufferedWriter sa = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/a/sa.ttl"));
        BufferedWriter sb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/b/sb.ttl"));
        BufferedWriter sc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/c/sc.ttl"));
        BufferedWriter sd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/d/sd.ttl"));
        BufferedWriter se = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/e/se.ttl"));
        BufferedWriter sf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/f/sf.ttl"));
        BufferedWriter sg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/g/sg.ttl"));
        BufferedWriter sh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/h/sh.ttl"));
        BufferedWriter si = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/i/si.ttl"));
        BufferedWriter sj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/j/sj.ttl"));
        BufferedWriter sk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/k/sk.ttl"));
        BufferedWriter sl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/l/sl.ttl"));
        BufferedWriter sm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/m/sm.ttl"));
        BufferedWriter sn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/n/sn.ttl"));
        BufferedWriter so = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/o/so.ttl"));
        BufferedWriter sp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/p/sp.ttl"));
        BufferedWriter sq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/q/sq.ttl"));
        BufferedWriter sr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/r/sr.ttl"));
        BufferedWriter ss = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/s/ss.ttl"));
        BufferedWriter st = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/t/st.ttl"));
        BufferedWriter su = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/u/su.ttl"));
        BufferedWriter sv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/v/sv.ttl"));
        BufferedWriter sw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/w/sw.ttl"));
        BufferedWriter sx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/x/sx.ttl"));
        BufferedWriter sy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/y/sy.ttl"));
        BufferedWriter sz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/s/z/sz.ttl"));
        //t
        BufferedWriter ta = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/a/ta.ttl"));
        BufferedWriter tb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/b/tb.ttl"));
        BufferedWriter tc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/c/tc.ttl"));
        BufferedWriter td = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/d/td.ttl"));
        BufferedWriter te = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/e/te.ttl"));
        BufferedWriter tf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/f/tf.ttl"));
        BufferedWriter tg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/g/tg.ttl"));
        BufferedWriter th = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/h/th.ttl"));
        BufferedWriter ti = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/i/ti.ttl"));
        BufferedWriter tj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/j/tj.ttl"));
        BufferedWriter tk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/k/tk.ttl"));
        BufferedWriter tl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/l/tl.ttl"));
        BufferedWriter tm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/m/tm.ttl"));
        BufferedWriter tn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/n/tn.ttl"));
        BufferedWriter to = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/o/to.ttl"));
        BufferedWriter tp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/p/tp.ttl"));
        BufferedWriter tq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/q/tq.ttl"));
        BufferedWriter tr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/r/tr.ttl"));
        BufferedWriter ts = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/s/ts.ttl"));
        BufferedWriter tt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/t/tt.ttl"));
        BufferedWriter tu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/u/tu.ttl"));
        BufferedWriter tv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/v/tv.ttl"));
        BufferedWriter tw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/w/tw.ttl"));
        BufferedWriter tx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/x/tx.ttl"));
        BufferedWriter ty = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/y/ty.ttl"));
        BufferedWriter tz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/t/z/tz.ttl"));
        //u
        BufferedWriter ua = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/a/ua.ttl"));
        BufferedWriter ub = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/b/ub.ttl"));
        BufferedWriter uc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/c/uc.ttl"));
        BufferedWriter ud = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/d/ud.ttl"));
        BufferedWriter ue = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/e/ue.ttl"));
        BufferedWriter uf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/f/uf.ttl"));
        BufferedWriter ug = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/g/ug.ttl"));
        BufferedWriter uh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/h/uh.ttl"));
        BufferedWriter ui = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/i/ui.ttl"));
        BufferedWriter uj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/j/uj.ttl"));
        BufferedWriter uk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/k/uk.ttl"));
        BufferedWriter ul = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/l/ul.ttl"));
        BufferedWriter um = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/m/um.ttl"));
        BufferedWriter un = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/n/un.ttl"));
        BufferedWriter uo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/o/uo.ttl"));
        BufferedWriter up = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/p/up.ttl"));
        BufferedWriter uq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/q/uq.ttl"));
        BufferedWriter ur = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/r/ur.ttl"));
        BufferedWriter us = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/s/us.ttl"));
        BufferedWriter ut = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/t/ut.ttl"));
        BufferedWriter uu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/u/uu.ttl"));
        BufferedWriter uv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/v/uv.ttl"));
        BufferedWriter uw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/w/uw.ttl"));
        BufferedWriter ux = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/x/ux.ttl"));
        BufferedWriter uy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/y/uy.ttl"));
        BufferedWriter uz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/u/z/uz.ttl"));
        //v
        BufferedWriter va = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/a/va.ttl"));
        BufferedWriter vb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/b/vb.ttl"));
        BufferedWriter vc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/c/vc.ttl"));
        BufferedWriter vd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/d/vd.ttl"));
        BufferedWriter ve = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/e/ve.ttl"));
        BufferedWriter vf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/f/vf.ttl"));
        BufferedWriter vg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/g/vg.ttl"));
        BufferedWriter vh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/h/vh.ttl"));
        BufferedWriter vi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/i/vi.ttl"));
        BufferedWriter vj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/j/vj.ttl"));
        BufferedWriter vk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/k/vk.ttl"));
        BufferedWriter vl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/l/vl.ttl"));
        BufferedWriter vm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/m/vm.ttl"));
        BufferedWriter vn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/n/vn.ttl"));
        BufferedWriter vo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/o/vo.ttl"));
        BufferedWriter vp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/p/vp.ttl"));
        BufferedWriter vq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/q/vq.ttl"));
        BufferedWriter vr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/r/vr.ttl"));
        BufferedWriter vs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/s/vs.ttl"));
        BufferedWriter vt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/t/vt.ttl"));
        BufferedWriter vu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/u/vu.ttl"));
        BufferedWriter vv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/v/vv.ttl"));
        BufferedWriter vw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/w/vw.ttl"));
        BufferedWriter vx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/x/vx.ttl"));
        BufferedWriter vy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/y/vy.ttl"));
        BufferedWriter vz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/v/z/vz.ttl"));
        //w
        BufferedWriter wa = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/a/wa.ttl"));
        BufferedWriter wb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/b/wb.ttl"));
        BufferedWriter wc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/c/wc.ttl"));
        BufferedWriter wd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/d/wd.ttl"));
        BufferedWriter we = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/e/we.ttl"));
        BufferedWriter wf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/f/wf.ttl"));
        BufferedWriter wg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/g/wg.ttl"));
        BufferedWriter wh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/h/wh.ttl"));
        BufferedWriter wi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/i/wi.ttl"));
        BufferedWriter wj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/j/wj.ttl"));
        BufferedWriter wk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/k/wk.ttl"));
        BufferedWriter wl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/l/wl.ttl"));
        BufferedWriter wm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/m/wm.ttl"));
        BufferedWriter wn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/n/wn.ttl"));
        BufferedWriter wo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/o/wo.ttl"));
        BufferedWriter wp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/p/wp.ttl"));
        BufferedWriter wq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/q/wq.ttl"));
        BufferedWriter wr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/r/wr.ttl"));
        BufferedWriter ws = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/s/ws.ttl"));
        BufferedWriter wt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/t/wt.ttl"));
        BufferedWriter wu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/u/wu.ttl"));
        BufferedWriter wv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/v/wv.ttl"));
        BufferedWriter ww = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/w/ww.ttl"));
        BufferedWriter wx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/x/wx.ttl"));
        BufferedWriter wy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/y/wy.ttl"));
        BufferedWriter wz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/w/z/wz.ttl"));
        //x
        BufferedWriter xa = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/a/xa.ttl"));
        BufferedWriter xb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/b/xb.ttl"));
        BufferedWriter xc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/c/xc.ttl"));
        BufferedWriter xd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/d/xd.ttl"));
        BufferedWriter xe = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/e/xe.ttl"));
        BufferedWriter xf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/f/xf.ttl"));
        BufferedWriter xg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/g/xg.ttl"));
        BufferedWriter xh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/h/xh.ttl"));
        BufferedWriter xi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/i/xi.ttl"));
        BufferedWriter xj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/j/xj.ttl"));
        BufferedWriter xk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/k/xk.ttl"));
        BufferedWriter xl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/l/xl.ttl"));
        BufferedWriter xm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/m/xm.ttl"));
        BufferedWriter xn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/n/xn.ttl"));
        BufferedWriter xo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/o/xo.ttl"));
        BufferedWriter xp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/p/xp.ttl"));
        BufferedWriter xq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/q/xq.ttl"));
        BufferedWriter xr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/r/xr.ttl"));
        BufferedWriter xs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/s/xs.ttl"));
        BufferedWriter xt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/t/xt.ttl"));
        BufferedWriter xu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/u/xu.ttl"));
        BufferedWriter xv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/v/xv.ttl"));
        BufferedWriter xw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/w/xw.ttl"));
        BufferedWriter xx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/x/xx.ttl"));
        BufferedWriter xy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/y/xy.ttl"));
        BufferedWriter xz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/x/z/xz.ttl"));
        //y
        BufferedWriter ya = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/a/ya.ttl"));
        BufferedWriter yb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/b/yb.ttl"));
        BufferedWriter yc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/c/yc.ttl"));
        BufferedWriter yd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/d/yd.ttl"));
        BufferedWriter ye = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/e/ye.ttl"));
        BufferedWriter yf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/f/yf.ttl"));
        BufferedWriter yg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/g/yg.ttl"));
        BufferedWriter yh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/h/yh.ttl"));
        BufferedWriter yi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/i/yi.ttl"));
        BufferedWriter yj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/j/yj.ttl"));
        BufferedWriter yk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/k/yk.ttl"));
        BufferedWriter yl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/l/yl.ttl"));
        BufferedWriter ym = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/m/ym.ttl"));
        BufferedWriter yn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/n/yn.ttl"));
        BufferedWriter yo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/o/yo.ttl"));
        BufferedWriter yp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/p/yp.ttl"));
        BufferedWriter yq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/q/yq.ttl"));
        BufferedWriter yr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/r/yr.ttl"));
        BufferedWriter ys = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/s/ys.ttl"));
        BufferedWriter yt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/t/yt.ttl"));
        BufferedWriter yu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/u/yu.ttl"));
        BufferedWriter yv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/v/yv.ttl"));
        BufferedWriter yw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/w/yw.ttl"));
        BufferedWriter yx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/x/yx.ttl"));
        BufferedWriter yy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/y/yy.ttl"));
        BufferedWriter yz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/y/z/yz.ttl"));
        //z
        BufferedWriter za = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/a/za.ttl"));
        BufferedWriter zb = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/b/zb.ttl"));
        BufferedWriter zc = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/c/zc.ttl"));
        BufferedWriter zd = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/d/zd.ttl"));
        BufferedWriter ze = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/e/ze.ttl"));
        BufferedWriter zf = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/f/zf.ttl"));
        BufferedWriter zg = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/g/zg.ttl"));
        BufferedWriter zh = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/h/zh.ttl"));
        BufferedWriter zi = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/i/zi.ttl"));
        BufferedWriter zj = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/j/zj.ttl"));
        BufferedWriter zk = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/k/zk.ttl"));
        BufferedWriter zl = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/l/zl.ttl"));
        BufferedWriter zm = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/m/zm.ttl"));
        BufferedWriter zn = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/n/zn.ttl"));
        BufferedWriter zo = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/o/zo.ttl"));
        BufferedWriter zp = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/p/zp.ttl"));
        BufferedWriter zq = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/q/zq.ttl"));
        BufferedWriter zr = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/r/zr.ttl"));
        BufferedWriter zs = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/s/zs.ttl"));
        BufferedWriter zt = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/t/zt.ttl"));
        BufferedWriter zu = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/u/zu.ttl"));
        BufferedWriter zv = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/v/zv.ttl"));
        BufferedWriter zw = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/w/zw.ttl"));
        BufferedWriter zx = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/x/zx.ttl"));
        BufferedWriter zy = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/y/zy.ttl"));
        BufferedWriter zz = new BufferedWriter(new FileWriter("C:/Users/Jakovcheski/Desktop/DataTree/z/z/zz.ttl"));


        FileInputStream inputStream = null;
        Scanner scanner = null;
        try {
            inputStream = new FileInputStream(filePath);
            scanner = new Scanner(inputStream, "UTF-8");

            File curDir = new File("C:/Users/Jakovcheski/Desktop/DataTree/");
            File[] filesList = curDir.listFiles();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] links = line.split(">\\s+");
                String[] subject = links[0].split("resource/");
                String firstLetters = subject[1].substring(0, (subject[1].length() + 2) - subject[1].length()).toLowerCase();
                Boolean flag = false;
                System.err.println("readed link " + links[0]);
                for (int i = 0; i < 41; i++) {
                    assert filesList != null;
                    String temp = filesList[i].toString();
                    char pochetnaBukvaFile = temp.substring(temp.length() - 1, temp.length()).charAt(0);
//                    System.err.println("\npochetnaBukvaFile: " + pochetnaBukvaFile);
//                    System.err.println("firstLetters: " + firstLetters.charAt(0) + "\n");
//                    System.err.println((pochetnaBukvaFile == firstLetters.charAt(0)));
                    if (pochetnaBukvaFile == firstLetters.charAt(0)) {
//                        System.err.println("firstLetters: " + firstLetters.charAt(0));
                        switch (firstLetters.charAt(0)) {
                            case '\'':
                                apostrophe.write(line + "\n");
                                apostrophe.flush();
                                break;
                            case '-':
                                hyphen.write(line + "\n");
                                hyphen.flush();
                                break;
                            case '!':
                                exclamation.write(line + "\n");
                                exclamation.flush();
                                break;
                            case '$':
                                dolar.write(line + "\n");
                                dolar.flush();
                                break;
                            case '0':
                                zero.write(line + "\n");
                                zero.flush();
                                break;
                            case '1':
                                one.write(line + "\n");
                                one.flush();
                                break;
                            case '2':
                                two.write(line + "\n");
                                two.flush();
                                break;
                            case '3':
                                three.write(line + "\n");
                                three.flush();
                                break;
                            case '4':
                                four.write(line + "\n");
                                four.flush();
                                break;
                            case '5':
                                five.write(line + "\n");
                                five.flush();
                                break;
                            case '6':
                                six.write(line + "\n");
                                six.flush();
                                break;
                            case '7':
                                seven.write(line + "\n");
                                seven.flush();
                                break;
                            case '8':
                                eight.write(line + "\n");
                                eight.flush();
                                break;
                            case '9':
                                nine.write(line + "\n");
                                nine.flush();
                                break;
                            case 'a':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        aa.write(line + "\n");
                                        aa.flush();
                                        break;
                                    case 'b':
                                        ab.write(line + "\n");
                                        ab.flush();
                                        break;
                                    case 'c':
                                        ac.write(line + "\n");
                                        ac.flush();
                                        break;
                                    case 'd':
                                        ad.write(line + "\n");
                                        ad.flush();
                                        break;
                                    case 'e':
                                        ae.write(line + "\n");
                                        ae.flush();
                                        break;
                                    case 'f':
                                        af.write(line + "\n");
                                        af.flush();
                                        break;
                                    case 'g':
                                        ag.write(line + "\n");
                                        ag.flush();
                                        break;
                                    case 'h':
                                        ah.write(line + "\n");
                                        ah.flush();
                                        break;
                                    case 'i':
                                        ai.write(line + "\n");
                                        ai.flush();
                                        break;
                                    case 'j':
                                        aj.write(line + "\n");
                                        aj.flush();
                                        break;
                                    case 'k':
                                        ak.write(line + "\n");
                                        ak.flush();
                                        break;
                                    case 'l':
                                        al.write(line + "\n");
                                        al.flush();
                                        break;
                                    case 'm':
                                        am.write(line + "\n");
                                        am.flush();
                                        break;
                                    case 'n':
                                        an.write(line + "\n");
                                        an.flush();
                                        break;
                                    case 'o':
                                        ao.write(line + "\n");
                                        ao.flush();
                                        break;
                                    case 'p':
                                        ap.write(line + "\n");
                                        ap.flush();
                                        break;
                                    case 'q':
                                        aq.write(line + "\n");
                                        aq.flush();
                                        break;
                                    case 'r':
                                        ar.write(line + "\n");
                                        ar.flush();
                                        break;
                                    case 's':
                                        as.write(line + "\n");
                                        as.flush();
                                        break;
                                    case 't':
                                        at.write(line + "\n");
                                        at.flush();
                                        break;
                                    case 'u':
                                        au.write(line + "\n");
                                        au.flush();
                                        break;
                                    case 'v':
                                        av.write(line + "\n");
                                        av.flush();
                                        break;
                                    case 'w':
                                        aw.write(line + "\n");
                                        aw.flush();
                                        break;
                                    case 'x':
                                        ax.write(line + "\n");
                                        ax.flush();
                                        break;
                                    case 'y':
                                        ay.write(line + "\n");
                                        ay.flush();
                                        break;
                                    case 'z':
                                        az.write(line + "\n");
                                        az.flush();
                                        break;
                                }
                                break;
                            case 'b':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ba.write(line + "\n");
                                        ba.flush();
                                        break;
                                    case 'b':
                                        bb.write(line + "\n");
                                        bb.flush();
                                        break;
                                    case 'c':
                                        bc.write(line + "\n");
                                        bc.flush();
                                        break;
                                    case 'd':
                                        bd.write(line + "\n");
                                        bd.flush();
                                        break;
                                    case 'e':
                                        be.write(line + "\n");
                                        be.flush();
                                        break;
                                    case 'f':
                                        bf.write(line + "\n");
                                        bf.flush();
                                        break;
                                    case 'g':
                                        bg.write(line + "\n");
                                        bg.flush();
                                        break;
                                    case 'h':
                                        bh.write(line + "\n");
                                        bh.flush();
                                        break;
                                    case 'i':
                                        bi.write(line + "\n");
                                        bi.flush();
                                        break;
                                    case 'j':
                                        bj.write(line + "\n");
                                        bj.flush();
                                        break;
                                    case 'k':
                                        bk.write(line + "\n");
                                        bk.flush();
                                        break;
                                    case 'l':
                                        bl.write(line + "\n");
                                        bl.flush();
                                        break;
                                    case 'm':
                                        bm.write(line + "\n");
                                        bm.flush();
                                        break;
                                    case 'n':
                                        bn.write(line + "\n");
                                        bn.flush();
                                        break;
                                    case 'o':
                                        bo.write(line + "\n");
                                        bo.flush();
                                        break;
                                    case 'p':
                                        bp.write(line + "\n");
                                        bp.flush();
                                        break;
                                    case 'q':
                                        bq.write(line + "\n");
                                        bq.flush();
                                        break;
                                    case 'r':
                                        br.write(line + "\n");
                                        br.flush();
                                        break;
                                    case 's':
                                        bs.write(line + "\n");
                                        bs.flush();
                                        break;
                                    case 't':
                                        bt.write(line + "\n");
                                        bt.flush();
                                        break;
                                    case 'u':
                                        bu.write(line + "\n");
                                        bu.flush();
                                        break;
                                    case 'v':
                                        bv.write(line + "\n");
                                        bv.flush();
                                        break;
                                    case 'w':
                                        bw.write(line + "\n");
                                        bw.flush();
                                        break;
                                    case 'x':
                                        bx.write(line + "\n");
                                        bx.flush();
                                        break;
                                    case 'y':
                                        by.write(line + "\n");
                                        by.flush();
                                        break;
                                    case 'z':
                                        bz.write(line + "\n");
                                        bz.flush();
                                        break;
                                }

                                break;
                            case 'c':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ca.write(line + "\n");
                                        ca.flush();
                                        break;
                                    case 'b':
                                        cb.write(line + "\n");
                                        cb.flush();
                                        break;
                                    case 'c':
                                        cc.write(line + "\n");
                                        cc.flush();
                                        break;
                                    case 'd':
                                        cd.write(line + "\n");
                                        cd.flush();
                                        break;
                                    case 'e':
                                        ce.write(line + "\n");
                                        ce.flush();
                                        break;
                                    case 'f':
                                        cf.write(line + "\n");
                                        cf.flush();
                                        break;
                                    case 'g':
                                        cg.write(line + "\n");
                                        cg.flush();
                                        break;
                                    case 'h':
                                        ch.write(line + "\n");
                                        ch.flush();
                                        break;
                                    case 'i':
                                        ci.write(line + "\n");
                                        ci.flush();
                                        break;
                                    case 'j':
                                        cj.write(line + "\n");
                                        cj.flush();
                                        break;
                                    case 'k':
                                        ck.write(line + "\n");
                                        ck.flush();
                                        break;
                                    case 'l':
                                        cl.write(line + "\n");
                                        cl.flush();
                                        break;
                                    case 'm':
                                        cm.write(line + "\n");
                                        cm.flush();
                                        break;
                                    case 'n':
                                        cn.write(line + "\n");
                                        cn.flush();
                                        break;
                                    case 'o':
                                        co.write(line + "\n");
                                        co.flush();
                                        break;
                                    case 'p':
                                        cp.write(line + "\n");
                                        cp.flush();
                                        break;
                                    case 'q':
                                        cq.write(line + "\n");
                                        cq.flush();
                                        break;
                                    case 'r':
                                        cr.write(line + "\n");
                                        cr.flush();
                                        break;
                                    case 's':
                                        cs.write(line + "\n");
                                        cs.flush();
                                        break;
                                    case 't':
                                        ct.write(line + "\n");
                                        ct.flush();
                                        break;
                                    case 'u':
                                        cu.write(line + "\n");
                                        cu.flush();
                                        break;
                                    case 'v':
                                        cv.write(line + "\n");
                                        cv.flush();
                                        break;
                                    case 'w':
                                        cw.write(line + "\n");
                                        cw.flush();
                                        break;
                                    case 'x':
                                        cx.write(line + "\n");
                                        cx.flush();
                                        break;
                                    case 'y':
                                        cy.write(line + "\n");
                                        cy.flush();
                                        break;
                                    case 'z':
                                        cz.write(line + "\n");
                                        cz.flush();
                                        break;
                                }
                                break;
                            case 'd':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        da.write(line + "\n");
                                        da.flush();
                                        break;
                                    case 'b':
                                        db.write(line + "\n");
                                        db.flush();
                                        break;
                                    case 'c':
                                        dc.write(line + "\n");
                                        dc.flush();
                                        break;
                                    case 'd':
                                        dd.write(line + "\n");
                                        dd.flush();
                                        break;
                                    case 'e':
                                        de.write(line + "\n");
                                        de.flush();
                                        break;
                                    case 'f':
                                        df.write(line + "\n");
                                        df.flush();
                                        break;
                                    case 'g':
                                        dg.write(line + "\n");
                                        dg.flush();
                                        break;
                                    case 'h':
                                        dh.write(line + "\n");
                                        dh.flush();
                                        break;
                                    case 'i':
                                        di.write(line + "\n");
                                        di.flush();
                                        break;
                                    case 'j':
                                        dj.write(line + "\n");
                                        dj.flush();
                                        break;
                                    case 'k':
                                        dk.write(line + "\n");
                                        dk.flush();
                                        break;
                                    case 'l':
                                        dl.write(line + "\n");
                                        dl.flush();
                                        break;
                                    case 'm':
                                        dm.write(line + "\n");
                                        dm.flush();
                                        break;
                                    case 'n':
                                        dn.write(line + "\n");
                                        dn.flush();
                                        break;
                                    case 'o':
                                        doo.write(line + "\n");
                                        doo.flush();
                                        break;
                                    case 'p':
                                        dp.write(line + "\n");
                                        dp.flush();
                                        break;
                                    case 'q':
                                        dq.write(line + "\n");
                                        dq.flush();
                                        break;
                                    case 'r':
                                        dr.write(line + "\n");
                                        dr.flush();
                                        break;
                                    case 's':
                                        ds.write(line + "\n");
                                        ds.flush();
                                        break;
                                    case 't':
                                        dt.write(line + "\n");
                                        dt.flush();
                                        break;
                                    case 'u':
                                        du.write(line + "\n");
                                        du.flush();
                                        break;
                                    case 'v':
                                        dv.write(line + "\n");
                                        dv.flush();
                                        break;
                                    case 'w':
                                        dw.write(line + "\n");
                                        dw.flush();
                                        break;
                                    case 'x':
                                        dx.write(line + "\n");
                                        dx.flush();
                                        break;
                                    case 'y':
                                        dy.write(line + "\n");
                                        dy.flush();
                                        break;
                                    case 'z':
                                        dz.write(line + "\n");
                                        dz.flush();
                                        break;
                                }
                                break;
                            case 'e':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ea.write(line + "\n");
                                        ea.flush();
                                        break;
                                    case 'b':
                                        eb.write(line + "\n");
                                        eb.flush();
                                        break;
                                    case 'c':
                                        ec.write(line + "\n");
                                        ec.flush();
                                        break;
                                    case 'd':
                                        ed.write(line + "\n");
                                        ed.flush();
                                        break;
                                    case 'e':
                                        ee.write(line + "\n");
                                        ee.flush();
                                        break;
                                    case 'f':
                                        ef.write(line + "\n");
                                        ef.flush();
                                        break;
                                    case 'g':
                                        eg.write(line + "\n");
                                        eg.flush();
                                        break;
                                    case 'h':
                                        eh.write(line + "\n");
                                        eh.flush();
                                        break;
                                    case 'i':
                                        ei.write(line + "\n");
                                        ei.flush();
                                        break;
                                    case 'j':
                                        ej.write(line + "\n");
                                        ej.flush();
                                        break;
                                    case 'k':
                                        ek.write(line + "\n");
                                        ek.flush();
                                        break;
                                    case 'l':
                                        el.write(line + "\n");
                                        el.flush();
                                        break;
                                    case 'm':
                                        em.write(line + "\n");
                                        em.flush();
                                        break;
                                    case 'n':
                                        en.write(line + "\n");
                                        en.flush();
                                        break;
                                    case 'o':
                                        eo.write(line + "\n");
                                        eo.flush();
                                        break;
                                    case 'p':
                                        ep.write(line + "\n");
                                        ep.flush();
                                        break;
                                    case 'q':
                                        eq.write(line + "\n");
                                        eq.flush();
                                        break;
                                    case 'r':
                                        er.write(line + "\n");
                                        er.flush();
                                        break;
                                    case 's':
                                        es.write(line + "\n");
                                        es.flush();
                                        break;
                                    case 't':
                                        et.write(line + "\n");
                                        et.flush();
                                        break;
                                    case 'u':
                                        eu.write(line + "\n");
                                        eu.flush();
                                        break;
                                    case 'v':
                                        ev.write(line + "\n");
                                        ev.flush();
                                        break;
                                    case 'w':
                                        ew.write(line + "\n");
                                        ew.flush();
                                        break;
                                    case 'x':
                                        ex.write(line + "\n");
                                        ex.flush();
                                        break;
                                    case 'y':
                                        ey.write(line + "\n");
                                        ey.flush();
                                        break;
                                    case 'z':
                                        ez.write(line + "\n");
                                        ez.flush();
                                        break;
                                }
                                break;
                            case 'f':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        fa.write(line + "\n");
                                        fa.flush();
                                        break;
                                    case 'b':
                                        fb.write(line + "\n");
                                        fb.flush();
                                        break;
                                    case 'c':
                                        fc.write(line + "\n");
                                        fc.flush();
                                        break;
                                    case 'd':
                                        fd.write(line + "\n");
                                        fd.flush();
                                        break;
                                    case 'e':
                                        fe.write(line + "\n");
                                        fe.flush();
                                        break;
                                    case 'f':
                                        ff.write(line + "\n");
                                        ff.flush();
                                        break;
                                    case 'g':
                                        fg.write(line + "\n");
                                        fg.flush();
                                        break;
                                    case 'h':
                                        fh.write(line + "\n");
                                        fh.flush();
                                        break;
                                    case 'i':
                                        fi.write(line + "\n");
                                        fi.flush();
                                        break;
                                    case 'j':
                                        fj.write(line + "\n");
                                        fj.flush();
                                        break;
                                    case 'k':
                                        fk.write(line + "\n");
                                        fk.flush();
                                        break;
                                    case 'l':
                                        fl.write(line + "\n");
                                        fl.flush();
                                        break;
                                    case 'm':
                                        fm.write(line + "\n");
                                        fm.flush();
                                        break;
                                    case 'n':
                                        fn.write(line + "\n");
                                        fn.flush();
                                        break;
                                    case 'o':
                                        fo.write(line + "\n");
                                        fo.flush();
                                        break;
                                    case 'p':
                                        fp.write(line + "\n");
                                        fp.flush();
                                        break;
                                    case 'q':
                                        fq.write(line + "\n");
                                        fq.flush();
                                        break;
                                    case 'r':
                                        fr.write(line + "\n");
                                        fr.flush();
                                        break;
                                    case 's':
                                        fs.write(line + "\n");
                                        fs.flush();
                                        break;
                                    case 't':
                                        ft.write(line + "\n");
                                        ft.flush();
                                        break;
                                    case 'u':
                                        fu.write(line + "\n");
                                        fu.flush();
                                        break;
                                    case 'v':
                                        fv.write(line + "\n");
                                        fv.flush();
                                        break;
                                    case 'w':
                                        fw.write(line + "\n");
                                        fw.flush();
                                        break;
                                    case 'x':
                                        fx.write(line + "\n");
                                        fx.flush();
                                        break;
                                    case 'y':
                                        fy.write(line + "\n");
                                        fy.flush();
                                        break;
                                    case 'z':
                                        fz.write(line + "\n");
                                        fz.flush();
                                        break;
                                }
                                break;
                            case 'g':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ga.write(line + "\n");
                                        ga.flush();
                                        break;
                                    case 'b':
                                        gb.write(line + "\n");
                                        gb.flush();
                                        break;
                                    case 'c':
                                        gc.write(line + "\n");
                                        gc.flush();
                                        break;
                                    case 'd':
                                        gd.write(line + "\n");
                                        gd.flush();
                                        break;
                                    case 'e':
                                        ge.write(line + "\n");
                                        ge.flush();
                                        break;
                                    case 'f':
                                        gf.write(line + "\n");
                                        gf.flush();
                                        break;
                                    case 'g':
                                        gg.write(line + "\n");
                                        gg.flush();
                                        break;
                                    case 'h':
                                        gh.write(line + "\n");
                                        gh.flush();
                                        break;
                                    case 'i':
                                        gi.write(line + "\n");
                                        gi.flush();
                                        break;
                                    case 'j':
                                        gj.write(line + "\n");
                                        gj.flush();
                                        break;
                                    case 'k':
                                        gk.write(line + "\n");
                                        gk.flush();
                                        break;
                                    case 'l':
                                        gl.write(line + "\n");
                                        gl.flush();
                                        break;
                                    case 'm':
                                        gm.write(line + "\n");
                                        gm.flush();
                                        break;
                                    case 'n':
                                        gn.write(line + "\n");
                                        gn.flush();
                                        break;
                                    case 'o':
                                        go.write(line + "\n");
                                        go.flush();
                                        break;
                                    case 'p':
                                        gp.write(line + "\n");
                                        gp.flush();
                                        break;
                                    case 'q':
                                        gq.write(line + "\n");
                                        gq.flush();
                                        break;
                                    case 'r':
                                        gr.write(line + "\n");
                                        gr.flush();
                                        break;
                                    case 's':
                                        gs.write(line + "\n");
                                        gs.flush();
                                        break;
                                    case 't':
                                        gt.write(line + "\n");
                                        gt.flush();
                                        break;
                                    case 'u':
                                        gu.write(line + "\n");
                                        gu.flush();
                                        break;
                                    case 'v':
                                        gv.write(line + "\n");
                                        gv.flush();
                                        break;
                                    case 'w':
                                        gw.write(line + "\n");
                                        gw.flush();
                                        break;
                                    case 'x':
                                        gx.write(line + "\n");
                                        gx.flush();
                                        break;
                                    case 'y':
                                        gy.write(line + "\n");
                                        gy.flush();
                                        break;
                                    case 'z':
                                        gz.write(line + "\n");
                                        gz.flush();
                                        break;
                                }
                                break;
                            case 'h':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ha.write(line + "\n");
                                        ha.flush();
                                        break;
                                    case 'b':
                                        hb.write(line + "\n");
                                        hb.flush();
                                        break;
                                    case 'c':
                                        hc.write(line + "\n");
                                        hc.flush();
                                        break;
                                    case 'd':
                                        hd.write(line + "\n");
                                        hd.flush();
                                        break;
                                    case 'e':
                                        he.write(line + "\n");
                                        he.flush();
                                        break;
                                    case 'f':
                                        hf.write(line + "\n");
                                        hf.flush();
                                        break;
                                    case 'g':
                                        hg.write(line + "\n");
                                        hg.flush();
                                        break;
                                    case 'h':
                                        hh.write(line + "\n");
                                        hh.flush();
                                        break;
                                    case 'i':
                                        hi.write(line + "\n");
                                        hi.flush();
                                        break;
                                    case 'j':
                                        hj.write(line + "\n");
                                        hj.flush();
                                        break;
                                    case 'k':
                                        hk.write(line + "\n");
                                        hk.flush();
                                        break;
                                    case 'l':
                                        hl.write(line + "\n");
                                        hl.flush();
                                        break;
                                    case 'm':
                                        hm.write(line + "\n");
                                        hm.flush();
                                        break;
                                    case 'n':
                                        hn.write(line + "\n");
                                        hn.flush();
                                        break;
                                    case 'o':
                                        ho.write(line + "\n");
                                        ho.flush();
                                        break;
                                    case 'p':
                                        hp.write(line + "\n");
                                        hp.flush();
                                        break;
                                    case 'q':
                                        hq.write(line + "\n");
                                        hq.flush();
                                        break;
                                    case 'r':
                                        hr.write(line + "\n");
                                        hr.flush();
                                        break;
                                    case 's':
                                        hs.write(line + "\n");
                                        hs.flush();
                                        break;
                                    case 't':
                                        ht.write(line + "\n");
                                        ht.flush();
                                        break;
                                    case 'u':
                                        hu.write(line + "\n");
                                        hu.flush();
                                        break;
                                    case 'v':
                                        hv.write(line + "\n");
                                        hv.flush();
                                        break;
                                    case 'w':
                                        hw.write(line + "\n");
                                        hw.flush();
                                        break;
                                    case 'x':
                                        hx.write(line + "\n");
                                        hx.flush();
                                        break;
                                    case 'y':
                                        hy.write(line + "\n");
                                        hy.flush();
                                        break;
                                    case 'z':
                                        hz.write(line + "\n");
                                        hz.flush();
                                        break;
                                }
                                break;
                            case 'i':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ia.write(line + "\n");
                                        ia.flush();
                                        break;
                                    case 'b':
                                        ib.write(line + "\n");
                                        ib.flush();
                                        break;
                                    case 'c':
                                        ic.write(line + "\n");
                                        ic.flush();
                                        break;
                                    case 'd':
                                        id.write(line + "\n");
                                        id.flush();
                                        break;
                                    case 'e':
                                        ie.write(line + "\n");
                                        ie.flush();
                                        break;
                                    case 'f':
                                        iff.write(line + "\n");
                                        iff.flush();
                                        break;
                                    case 'g':
                                        ig.write(line + "\n");
                                        ig.flush();
                                        break;
                                    case 'h':
                                        ih.write(line + "\n");
                                        ih.flush();
                                        break;
                                    case 'i':
                                        ii.write(line + "\n");
                                        ii.flush();
                                        break;
                                    case 'j':
                                        ij.write(line + "\n");
                                        ij.flush();
                                        break;
                                    case 'k':
                                        ik.write(line + "\n");
                                        ik.flush();
                                        break;
                                    case 'l':
                                        il.write(line + "\n");
                                        il.flush();
                                        break;
                                    case 'm':
                                        im.write(line + "\n");
                                        im.flush();
                                        break;
                                    case 'n':
                                        in.write(line + "\n");
                                        in.flush();
                                        break;
                                    case 'o':
                                        io.write(line + "\n");
                                        io.flush();
                                        break;
                                    case 'p':
                                        ip.write(line + "\n");
                                        ip.flush();
                                        break;
                                    case 'q':
                                        iq.write(line + "\n");
                                        iq.flush();
                                        break;
                                    case 'r':
                                        ir.write(line + "\n");
                                        ir.flush();
                                        break;
                                    case 's':
                                        is.write(line + "\n");
                                        is.flush();
                                        break;
                                    case 't':
                                        it.write(line + "\n");
                                        it.flush();
                                        break;
                                    case 'u':
                                        iu.write(line + "\n");
                                        iu.flush();
                                        break;
                                    case 'v':
                                        iv.write(line + "\n");
                                        iv.flush();
                                        break;
                                    case 'w':
                                        iw.write(line + "\n");
                                        iw.flush();
                                        break;
                                    case 'x':
                                        ix.write(line + "\n");
                                        ix.flush();
                                        break;
                                    case 'y':
                                        iy.write(line + "\n");
                                        iy.flush();
                                        break;
                                    case 'z':
                                        iz.write(line + "\n");
                                        iz.flush();
                                        break;
                                }
                                break;
                            case 'j':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ja.write(line + "\n");
                                        ja.flush();
                                        break;
                                    case 'b':
                                        jb.write(line + "\n");
                                        jb.flush();
                                        break;
                                    case 'c':
                                        jc.write(line + "\n");
                                        jc.flush();
                                        break;
                                    case 'd':
                                        jd.write(line + "\n");
                                        jd.flush();
                                        break;
                                    case 'e':
                                        je.write(line + "\n");
                                        je.flush();
                                        break;
                                    case 'f':
                                        jf.write(line + "\n");
                                        jf.flush();
                                        break;
                                    case 'g':
                                        jg.write(line + "\n");
                                        jg.flush();
                                        break;
                                    case 'h':
                                        jh.write(line + "\n");
                                        jh.flush();
                                        break;
                                    case 'i':
                                        ji.write(line + "\n");
                                        ji.flush();
                                        break;
                                    case 'j':
                                        jj.write(line + "\n");
                                        jj.flush();
                                        break;
                                    case 'k':
                                        jk.write(line + "\n");
                                        jk.flush();
                                        break;
                                    case 'l':
                                        jl.write(line + "\n");
                                        jl.flush();
                                        break;
                                    case 'm':
                                        jm.write(line + "\n");
                                        jm.flush();
                                        break;
                                    case 'n':
                                        jn.write(line + "\n");
                                        jn.flush();
                                        break;
                                    case 'o':
                                        jo.write(line + "\n");
                                        jo.flush();
                                        break;
                                    case 'p':
                                        jp.write(line + "\n");
                                        jp.flush();
                                        break;
                                    case 'q':
                                        jq.write(line + "\n");
                                        jq.flush();
                                        break;
                                    case 'r':
                                        jr.write(line + "\n");
                                        jr.flush();
                                        break;
                                    case 's':
                                        js.write(line + "\n");
                                        js.flush();
                                        break;
                                    case 't':
                                        jt.write(line + "\n");
                                        jt.flush();
                                        break;
                                    case 'u':
                                        ju.write(line + "\n");
                                        ju.flush();
                                        break;
                                    case 'v':
                                        jv.write(line + "\n");
                                        jv.flush();
                                        break;
                                    case 'w':
                                        jw.write(line + "\n");
                                        jw.flush();
                                        break;
                                    case 'x':
                                        jx.write(line + "\n");
                                        jx.flush();
                                        break;
                                    case 'y':
                                        jy.write(line + "\n");
                                        jy.flush();
                                        break;
                                    case 'z':
                                        jz.write(line + "\n");
                                        jz.flush();
                                        break;
                                }
                                break;
                            case 'k':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ka.write(line + "\n");
                                        ka.flush();
                                        break;
                                    case 'b':
                                        kb.write(line + "\n");
                                        kb.flush();
                                        break;
                                    case 'c':
                                        kc.write(line + "\n");
                                        kc.flush();
                                        break;
                                    case 'd':
                                        kd.write(line + "\n");
                                        kd.flush();
                                        break;
                                    case 'e':
                                        ke.write(line + "\n");
                                        ke.flush();
                                        break;
                                    case 'f':
                                        kf.write(line + "\n");
                                        kf.flush();
                                        break;
                                    case 'g':
                                        kg.write(line + "\n");
                                        kg.flush();
                                        break;
                                    case 'h':
                                        kh.write(line + "\n");
                                        kh.flush();
                                        break;
                                    case 'i':
                                        ki.write(line + "\n");
                                        ki.flush();
                                        break;
                                    case 'j':
                                        kj.write(line + "\n");
                                        kj.flush();
                                        break;
                                    case 'k':
                                        kk.write(line + "\n");
                                        kk.flush();
                                        break;
                                    case 'l':
                                        kl.write(line + "\n");
                                        kl.flush();
                                        break;
                                    case 'm':
                                        km.write(line + "\n");
                                        km.flush();
                                        break;
                                    case 'n':
                                        kn.write(line + "\n");
                                        kn.flush();
                                        break;
                                    case 'o':
                                        ko.write(line + "\n");
                                        ko.flush();
                                        break;
                                    case 'p':
                                        kp.write(line + "\n");
                                        kp.flush();
                                        break;
                                    case 'q':
                                        kq.write(line + "\n");
                                        kq.flush();
                                        break;
                                    case 'r':
                                        kr.write(line + "\n");
                                        kr.flush();
                                        break;
                                    case 's':
                                        ks.write(line + "\n");
                                        ks.flush();
                                        break;
                                    case 't':
                                        kt.write(line + "\n");
                                        kt.flush();
                                        break;
                                    case 'u':
                                        ku.write(line + "\n");
                                        ku.flush();
                                        break;
                                    case 'v':
                                        kv.write(line + "\n");
                                        kv.flush();
                                        break;
                                    case 'w':
                                        kw.write(line + "\n");
                                        kw.flush();
                                        break;
                                    case 'x':
                                        kx.write(line + "\n");
                                        kx.flush();
                                        break;
                                    case 'y':
                                        ky.write(line + "\n");
                                        ky.flush();
                                        break;
                                    case 'z':
                                        kz.write(line + "\n");
                                        kz.flush();
                                        break;
                                }
                                break;
                            case 'l':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        la.write(line + "\n");
                                        la.flush();
                                        break;
                                    case 'b':
                                        lb.write(line + "\n");
                                        lb.flush();
                                        break;
                                    case 'c':
                                        lc.write(line + "\n");
                                        lc.flush();
                                        break;
                                    case 'd':
                                        ld.write(line + "\n");
                                        ld.flush();
                                        break;
                                    case 'e':
                                        le.write(line + "\n");
                                        le.flush();
                                        break;
                                    case 'f':
                                        lf.write(line + "\n");
                                        lf.flush();
                                        break;
                                    case 'g':
                                        lg.write(line + "\n");
                                        lg.flush();
                                        break;
                                    case 'h':
                                        lh.write(line + "\n");
                                        lh.flush();
                                        break;
                                    case 'i':
                                        li.write(line + "\n");
                                        li.flush();
                                        break;
                                    case 'j':
                                        lj.write(line + "\n");
                                        lj.flush();
                                        break;
                                    case 'k':
                                        lk.write(line + "\n");
                                        lk.flush();
                                        break;
                                    case 'l':
                                        ll.write(line + "\n");
                                        ll.flush();
                                        break;
                                    case 'm':
                                        lm.write(line + "\n");
                                        lm.flush();
                                        break;
                                    case 'n':
                                        ln.write(line + "\n");
                                        ln.flush();
                                        break;
                                    case 'o':
                                        lo.write(line + "\n");
                                        lo.flush();
                                        break;
                                    case 'p':
                                        lp.write(line + "\n");
                                        lp.flush();
                                        break;
                                    case 'q':
                                        lq.write(line + "\n");
                                        lq.flush();
                                        break;
                                    case 'r':
                                        lr.write(line + "\n");
                                        lr.flush();
                                        break;
                                    case 's':
                                        ls.write(line + "\n");
                                        ls.flush();
                                        break;
                                    case 't':
                                        lt.write(line + "\n");
                                        lt.flush();
                                        break;
                                    case 'u':
                                        lu.write(line + "\n");
                                        lu.flush();
                                        break;
                                    case 'v':
                                        lv.write(line + "\n");
                                        lv.flush();
                                        break;
                                    case 'w':
                                        lw.write(line + "\n");
                                        lw.flush();
                                        break;
                                    case 'x':
                                        lx.write(line + "\n");
                                        lx.flush();
                                        break;
                                    case 'y':
                                        ly.write(line + "\n");
                                        ly.flush();
                                        break;
                                    case 'z':
                                        lz.write(line + "\n");
                                        lz.flush();
                                        break;
                                }
                                break;
                            case 'm':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ma.write(line + "\n");
                                        ma.flush();
                                        break;
                                    case 'b':
                                        mb.write(line + "\n");
                                        mb.flush();
                                        break;
                                    case 'c':
                                        mc.write(line + "\n");
                                        mc.flush();
                                        break;
                                    case 'd':
                                        md.write(line + "\n");
                                        md.flush();
                                        break;
                                    case 'e':
                                        me.write(line + "\n");
                                        me.flush();
                                        break;
                                    case 'f':
                                        mf.write(line + "\n");
                                        mf.flush();
                                        break;
                                    case 'g':
                                        mg.write(line + "\n");
                                        mg.flush();
                                        break;
                                    case 'h':
                                        mh.write(line + "\n");
                                        mh.flush();
                                        break;
                                    case 'i':
                                        mi.write(line + "\n");
                                        mi.flush();
                                        break;
                                    case 'j':
                                        mj.write(line + "\n");
                                        mj.flush();
                                        break;
                                    case 'k':
                                        mk.write(line + "\n");
                                        mk.flush();
                                        break;
                                    case 'l':
                                        ml.write(line + "\n");
                                        ml.flush();
                                        break;
                                    case 'm':
                                        mm.write(line + "\n");
                                        mm.flush();
                                        break;
                                    case 'n':
                                        mn.write(line + "\n");
                                        mn.flush();
                                        break;
                                    case 'o':
                                        mo.write(line + "\n");
                                        mo.flush();
                                        break;
                                    case 'p':
                                        mp.write(line + "\n");
                                        mp.flush();
                                        break;
                                    case 'q':
                                        mq.write(line + "\n");
                                        mq.flush();
                                        break;
                                    case 'r':
                                        mr.write(line + "\n");
                                        mr.flush();
                                        break;
                                    case 's':
                                        ms.write(line + "\n");
                                        ms.flush();
                                        break;
                                    case 't':
                                        mt.write(line + "\n");
                                        mt.flush();
                                        break;
                                    case 'u':
                                        mu.write(line + "\n");
                                        mu.flush();
                                        break;
                                    case 'v':
                                        mv.write(line + "\n");
                                        mv.flush();
                                        break;
                                    case 'w':
                                        mw.write(line + "\n");
                                        mw.flush();
                                        break;
                                    case 'x':
                                        mx.write(line + "\n");
                                        mx.flush();
                                        break;
                                    case 'y':
                                        my.write(line + "\n");
                                        my.flush();
                                        break;
                                    case 'z':
                                        mz.write(line + "\n");
                                        mz.flush();
                                        break;
                                }
                                break;
                            case 'n':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        na.write(line + "\n");
                                        na.flush();
                                        break;
                                    case 'b':
                                        nb.write(line + "\n");
                                        nb.flush();
                                        break;
                                    case 'c':
                                        nc.write(line + "\n");
                                        nc.flush();
                                        break;
                                    case 'd':
                                        nd.write(line + "\n");
                                        nd.flush();
                                        break;
                                    case 'e':
                                        ne.write(line + "\n");
                                        ne.flush();
                                        break;
                                    case 'f':
                                        nf.write(line + "\n");
                                        nf.flush();
                                        break;
                                    case 'g':
                                        ng.write(line + "\n");
                                        ng.flush();
                                        break;
                                    case 'h':
                                        nh.write(line + "\n");
                                        nh.flush();
                                        break;
                                    case 'i':
                                        ni.write(line + "\n");
                                        ni.flush();
                                        break;
                                    case 'j':
                                        nj.write(line + "\n");
                                        nj.flush();
                                        break;
                                    case 'k':
                                        nk.write(line + "\n");
                                        nk.flush();
                                        break;
                                    case 'l':
                                        nl.write(line + "\n");
                                        nl.flush();
                                        break;
                                    case 'm':
                                        nm.write(line + "\n");
                                        nm.flush();
                                        break;
                                    case 'n':
                                        nn.write(line + "\n");
                                        nn.flush();
                                        break;
                                    case 'o':
                                        no.write(line + "\n");
                                        no.flush();
                                        break;
                                    case 'p':
                                        np.write(line + "\n");
                                        np.flush();
                                        break;
                                    case 'q':
                                        nq.write(line + "\n");
                                        nq.flush();
                                        break;
                                    case 'r':
                                        nr.write(line + "\n");
                                        nr.flush();
                                        break;
                                    case 's':
                                        ns.write(line + "\n");
                                        ns.flush();
                                        break;
                                    case 't':
                                        nt.write(line + "\n");
                                        nt.flush();
                                        break;
                                    case 'u':
                                        nu.write(line + "\n");
                                        nu.flush();
                                        break;
                                    case 'v':
                                        nv.write(line + "\n");
                                        nv.flush();
                                        break;
                                    case 'w':
                                        nw.write(line + "\n");
                                        nw.flush();
                                        break;
                                    case 'x':
                                        nx.write(line + "\n");
                                        nx.flush();
                                        break;
                                    case 'y':
                                        ny.write(line + "\n");
                                        ny.flush();
                                        break;
                                    case 'z':
                                        nz.write(line + "\n");
                                        nz.flush();
                                        break;
                                }
                                break;
                            case 'o':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        oa.write(line + "\n");
                                        oa.flush();
                                        break;
                                    case 'b':
                                        ob.write(line + "\n");
                                        ob.flush();
                                        break;
                                    case 'c':
                                        oc.write(line + "\n");
                                        oc.flush();
                                        break;
                                    case 'd':
                                        od.write(line + "\n");
                                        od.flush();
                                        break;
                                    case 'e':
                                        oe.write(line + "\n");
                                        oe.flush();
                                        break;
                                    case 'f':
                                        of.write(line + "\n");
                                        of.flush();
                                        break;
                                    case 'g':
                                        og.write(line + "\n");
                                        og.flush();
                                        break;
                                    case 'h':
                                        oh.write(line + "\n");
                                        oh.flush();
                                        break;
                                    case 'i':
                                        oi.write(line + "\n");
                                        oi.flush();
                                        break;
                                    case 'j':
                                        oj.write(line + "\n");
                                        oj.flush();
                                        break;
                                    case 'k':
                                        ok.write(line + "\n");
                                        ok.flush();
                                        break;
                                    case 'l':
                                        ol.write(line + "\n");
                                        ol.flush();
                                        break;
                                    case 'm':
                                        om.write(line + "\n");
                                        om.flush();
                                        break;
                                    case 'n':
                                        on.write(line + "\n");
                                        on.flush();
                                        break;
                                    case 'o':
                                        oo.write(line + "\n");
                                        oo.flush();
                                        break;
                                    case 'p':
                                        op.write(line + "\n");
                                        op.flush();
                                        break;
                                    case 'q':
                                        oq.write(line + "\n");
                                        oq.flush();
                                        break;
                                    case 'r':
                                        or.write(line + "\n");
                                        or.flush();
                                        break;
                                    case 's':
                                        os.write(line + "\n");
                                        os.flush();
                                        break;
                                    case 't':
                                        ot.write(line + "\n");
                                        ot.flush();
                                        break;
                                    case 'u':
                                        ou.write(line + "\n");
                                        ou.flush();
                                        break;
                                    case 'v':
                                        ov.write(line + "\n");
                                        ov.flush();
                                        break;
                                    case 'w':
                                        ow.write(line + "\n");
                                        ow.flush();
                                        break;
                                    case 'x':
                                        ox.write(line + "\n");
                                        ox.flush();
                                        break;
                                    case 'y':
                                        oy.write(line + "\n");
                                        oy.flush();
                                        break;
                                    case 'z':
                                        oz.write(line + "\n");
                                        oz.flush();
                                        break;
                                }
                                break;
                            case 'p':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        pa.write(line + "\n");
                                        pa.flush();
                                        break;
                                    case 'b':
                                        pb.write(line + "\n");
                                        pb.flush();
                                        break;
                                    case 'c':
                                        pc.write(line + "\n");
                                        pc.flush();
                                        break;
                                    case 'd':
                                        pd.write(line + "\n");
                                        pd.flush();
                                        break;
                                    case 'e':
                                        pe.write(line + "\n");
                                        pe.flush();
                                        break;
                                    case 'f':
                                        pf.write(line + "\n");
                                        pf.flush();
                                        break;
                                    case 'g':
                                        pg.write(line + "\n");
                                        pg.flush();
                                        break;
                                    case 'h':
                                        ph.write(line + "\n");
                                        ph.flush();
                                        break;
                                    case 'i':
                                        pi.write(line + "\n");
                                        pi.flush();
                                        break;
                                    case 'j':
                                        pj.write(line + "\n");
                                        pj.flush();
                                        break;
                                    case 'k':
                                        pk.write(line + "\n");
                                        pk.flush();
                                        break;
                                    case 'l':
                                        pl.write(line + "\n");
                                        pl.flush();
                                        break;
                                    case 'm':
                                        pm.write(line + "\n");
                                        pm.flush();
                                        break;
                                    case 'n':
                                        pn.write(line + "\n");
                                        pn.flush();
                                        break;
                                    case 'o':
                                        po.write(line + "\n");
                                        po.flush();
                                        break;
                                    case 'p':
                                        pp.write(line + "\n");
                                        pp.flush();
                                        break;
                                    case 'q':
                                        pq.write(line + "\n");
                                        pq.flush();
                                        break;
                                    case 'r':
                                        pr.write(line + "\n");
                                        pr.flush();
                                        break;
                                    case 's':
                                        ps.write(line + "\n");
                                        ps.flush();
                                        break;
                                    case 't':
                                        pt.write(line + "\n");
                                        pt.flush();
                                        break;
                                    case 'u':
                                        pu.write(line + "\n");
                                        pu.flush();
                                        break;
                                    case 'v':
                                        pv.write(line + "\n");
                                        pv.flush();
                                        break;
                                    case 'w':
                                        pw.write(line + "\n");
                                        pw.flush();
                                        break;
                                    case 'x':
                                        px.write(line + "\n");
                                        px.flush();
                                        break;
                                    case 'y':
                                        py.write(line + "\n");
                                        py.flush();
                                        break;
                                    case 'z':
                                        pz.write(line + "\n");
                                        pz.flush();
                                        break;
                                }
                                break;
                            case 'q':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        qa.write(line + "\n");
                                        qa.flush();
                                        break;
                                    case 'b':
                                        qb.write(line + "\n");
                                        qb.flush();
                                        break;
                                    case 'c':
                                        qc.write(line + "\n");
                                        qc.flush();
                                        break;
                                    case 'd':
                                        qd.write(line + "\n");
                                        qd.flush();
                                        break;
                                    case 'e':
                                        qe.write(line + "\n");
                                        qe.flush();
                                        break;
                                    case 'f':
                                        qf.write(line + "\n");
                                        qf.flush();
                                        break;
                                    case 'g':
                                        qg.write(line + "\n");
                                        qg.flush();
                                        break;
                                    case 'h':
                                        qh.write(line + "\n");
                                        qh.flush();
                                        break;
                                    case 'i':
                                        qi.write(line + "\n");
                                        qi.flush();
                                        break;
                                    case 'j':
                                        qj.write(line + "\n");
                                        qj.flush();
                                        break;
                                    case 'k':
                                        qk.write(line + "\n");
                                        qk.flush();
                                        break;
                                    case 'l':
                                        ql.write(line + "\n");
                                        ql.flush();
                                        break;
                                    case 'm':
                                        qm.write(line + "\n");
                                        qm.flush();
                                        break;
                                    case 'n':
                                        qn.write(line + "\n");
                                        qn.flush();
                                        break;
                                    case 'o':
                                        qo.write(line + "\n");
                                        qo.flush();
                                        break;
                                    case 'p':
                                        qp.write(line + "\n");
                                        qp.flush();
                                        break;
                                    case 'q':
                                        qq.write(line + "\n");
                                        qq.flush();
                                        break;
                                    case 'r':
                                        qr.write(line + "\n");
                                        qr.flush();
                                        break;
                                    case 's':
                                        qs.write(line + "\n");
                                        qs.flush();
                                        break;
                                    case 't':
                                        qt.write(line + "\n");
                                        qt.flush();
                                        break;
                                    case 'u':
                                        qu.write(line + "\n");
                                        qu.flush();
                                        break;
                                    case 'v':
                                        qv.write(line + "\n");
                                        qv.flush();
                                        break;
                                    case 'w':
                                        qw.write(line + "\n");
                                        qw.flush();
                                        break;
                                    case 'x':
                                        qx.write(line + "\n");
                                        qx.flush();
                                        break;
                                    case 'y':
                                        qy.write(line + "\n");
                                        qy.flush();
                                        break;
                                    case 'z':
                                        qz.write(line + "\n");
                                        qz.flush();
                                        break;
                                }
                                break;
                            case 'r':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ra.write(line + "\n");
                                        ra.flush();
                                        break;
                                    case 'b':
                                        rb.write(line + "\n");
                                        rb.flush();
                                        break;
                                    case 'c':
                                        rc.write(line + "\n");
                                        rc.flush();
                                        break;
                                    case 'd':
                                        rd.write(line + "\n");
                                        rd.flush();
                                        break;
                                    case 'e':
                                        re.write(line + "\n");
                                        re.flush();
                                        break;
                                    case 'f':
                                        rf.write(line + "\n");
                                        rf.flush();
                                        break;
                                    case 'g':
                                        rg.write(line + "\n");
                                        rg.flush();
                                        break;
                                    case 'h':
                                        rh.write(line + "\n");
                                        rh.flush();
                                        break;
                                    case 'i':
                                        ri.write(line + "\n");
                                        ri.flush();
                                        break;
                                    case 'j':
                                        rj.write(line + "\n");
                                        rj.flush();
                                        break;
                                    case 'k':
                                        rk.write(line + "\n");
                                        rk.flush();
                                        break;
                                    case 'l':
                                        rl.write(line + "\n");
                                        rl.flush();
                                        break;
                                    case 'm':
                                        rm.write(line + "\n");
                                        rm.flush();
                                        break;
                                    case 'n':
                                        rn.write(line + "\n");
                                        rn.flush();
                                        break;
                                    case 'o':
                                        ro.write(line + "\n");
                                        ro.flush();
                                        break;
                                    case 'p':
                                        rp.write(line + "\n");
                                        rp.flush();
                                        break;
                                    case 'q':
                                        rq.write(line + "\n");
                                        rq.flush();
                                        break;
                                    case 'r':
                                        rr.write(line + "\n");
                                        rr.flush();
                                        break;
                                    case 's':
                                        rs.write(line + "\n");
                                        rs.flush();
                                        break;
                                    case 't':
                                        rt.write(line + "\n");
                                        rt.flush();
                                        break;
                                    case 'u':
                                        ru.write(line + "\n");
                                        ru.flush();
                                        break;
                                    case 'v':
                                        rv.write(line + "\n");
                                        rv.flush();
                                        break;
                                    case 'w':
                                        rw.write(line + "\n");
                                        rw.flush();
                                        break;
                                    case 'x':
                                        rx.write(line + "\n");
                                        rx.flush();
                                        break;
                                    case 'y':
                                        ry.write(line + "\n");
                                        ry.flush();
                                        break;
                                    case 'z':
                                        rz.write(line + "\n");
                                        rz.flush();
                                        break;
                                }
                                break;
                            case 's':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        sa.write(line + "\n");
                                        sa.flush();
                                        break;
                                    case 'b':
                                        sb.write(line + "\n");
                                        sb.flush();
                                        break;
                                    case 'c':
                                        sc.write(line + "\n");
                                        sc.flush();
                                        break;
                                    case 'd':
                                        sd.write(line + "\n");
                                        sd.flush();
                                        break;
                                    case 'e':
                                        se.write(line + "\n");
                                        se.flush();
                                        break;
                                    case 'f':
                                        sf.write(line + "\n");
                                        sf.flush();
                                        break;
                                    case 'g':
                                        sg.write(line + "\n");
                                        sg.flush();
                                        break;
                                    case 'h':
                                        sh.write(line + "\n");
                                        sh.flush();
                                        break;
                                    case 'i':
                                        si.write(line + "\n");
                                        si.flush();
                                        break;
                                    case 'j':
                                        sj.write(line + "\n");
                                        sj.flush();
                                        break;
                                    case 'k':
                                        sk.write(line + "\n");
                                        sk.flush();
                                        break;
                                    case 'l':
                                        sl.write(line + "\n");
                                        sl.flush();
                                        break;
                                    case 'm':
                                        sm.write(line + "\n");
                                        sm.flush();
                                        break;
                                    case 'n':
                                        sn.write(line + "\n");
                                        sn.flush();
                                        break;
                                    case 'o':
                                        so.write(line + "\n");
                                        so.flush();
                                        break;
                                    case 'p':
                                        sp.write(line + "\n");
                                        sp.flush();
                                        break;
                                    case 'q':
                                        sq.write(line + "\n");
                                        sq.flush();
                                        break;
                                    case 'r':
                                        sr.write(line + "\n");
                                        sr.flush();
                                        break;
                                    case 's':
                                        ss.write(line + "\n");
                                        ss.flush();
                                        break;
                                    case 't':
                                        st.write(line + "\n");
                                        st.flush();
                                        break;
                                    case 'u':
                                        su.write(line + "\n");
                                        su.flush();
                                        break;
                                    case 'v':
                                        sv.write(line + "\n");
                                        sv.flush();
                                        break;
                                    case 'w':
                                        sw.write(line + "\n");
                                        sw.flush();
                                        break;
                                    case 'x':
                                        sx.write(line + "\n");
                                        sx.flush();
                                        break;
                                    case 'y':
                                        sy.write(line + "\n");
                                        sy.flush();
                                        break;
                                    case 'z':
                                        sz.write(line + "\n");
                                        sz.flush();
                                        break;
                                }
                                break;
                            case 't':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ta.write(line + "\n");
                                        ta.flush();
                                        break;
                                    case 'b':
                                        tb.write(line + "\n");
                                        tb.flush();
                                        break;
                                    case 'c':
                                        tc.write(line + "\n");
                                        tc.flush();
                                        break;
                                    case 'd':
                                        td.write(line + "\n");
                                        td.flush();
                                        break;
                                    case 'e':
                                        te.write(line + "\n");
                                        te.flush();
                                        break;
                                    case 'f':
                                        tf.write(line + "\n");
                                        tf.flush();
                                        break;
                                    case 'g':
                                        tg.write(line + "\n");
                                        tg.flush();
                                        break;
                                    case 'h':
                                        th.write(line + "\n");
                                        th.flush();
                                        break;
                                    case 'i':
                                        ti.write(line + "\n");
                                        ti.flush();
                                        break;
                                    case 'j':
                                        tj.write(line + "\n");
                                        tj.flush();
                                        break;
                                    case 'k':
                                        tk.write(line + "\n");
                                        tk.flush();
                                        break;
                                    case 'l':
                                        tl.write(line + "\n");
                                        tl.flush();
                                        break;
                                    case 'm':
                                        tm.write(line + "\n");
                                        tm.flush();
                                        break;
                                    case 'n':
                                        tn.write(line + "\n");
                                        tn.flush();
                                        break;
                                    case 'o':
                                        to.write(line + "\n");
                                        to.flush();
                                        break;
                                    case 'p':
                                        tp.write(line + "\n");
                                        tp.flush();
                                        break;
                                    case 'q':
                                        tq.write(line + "\n");
                                        tq.flush();
                                        break;
                                    case 'r':
                                        tr.write(line + "\n");
                                        tr.flush();
                                        break;
                                    case 's':
                                        ts.write(line + "\n");
                                        ts.flush();
                                        break;
                                    case 't':
                                        tt.write(line + "\n");
                                        tt.flush();
                                        break;
                                    case 'u':
                                        tu.write(line + "\n");
                                        tu.flush();
                                        break;
                                    case 'v':
                                        tv.write(line + "\n");
                                        tv.flush();
                                        break;
                                    case 'w':
                                        tw.write(line + "\n");
                                        tw.flush();
                                        break;
                                    case 'x':
                                        tx.write(line + "\n");
                                        tx.flush();
                                        break;
                                    case 'y':
                                        ty.write(line + "\n");
                                        ty.flush();
                                        break;
                                    case 'z':
                                        tz.write(line + "\n");
                                        tz.flush();
                                        break;
                                }
                                break;
                            case 'u':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ua.write(line + "\n");
                                        ua.flush();
                                        break;
                                    case 'b':
                                        ub.write(line + "\n");
                                        ub.flush();
                                        break;
                                    case 'c':
                                        uc.write(line + "\n");
                                        uc.flush();
                                        break;
                                    case 'd':
                                        ud.write(line + "\n");
                                        ud.flush();
                                        break;
                                    case 'e':
                                        ue.write(line + "\n");
                                        ue.flush();
                                        break;
                                    case 'f':
                                        uf.write(line + "\n");
                                        uf.flush();
                                        break;
                                    case 'g':
                                        ug.write(line + "\n");
                                        ug.flush();
                                        break;
                                    case 'h':
                                        uh.write(line + "\n");
                                        uh.flush();
                                        break;
                                    case 'i':
                                        ui.write(line + "\n");
                                        ui.flush();
                                        break;
                                    case 'j':
                                        uj.write(line + "\n");
                                        uj.flush();
                                        break;
                                    case 'k':
                                        uk.write(line + "\n");
                                        uk.flush();
                                        break;
                                    case 'l':
                                        ul.write(line + "\n");
                                        ul.flush();
                                        break;
                                    case 'm':
                                        um.write(line + "\n");
                                        um.flush();
                                        break;
                                    case 'n':
                                        un.write(line + "\n");
                                        un.flush();
                                        break;
                                    case 'o':
                                        uo.write(line + "\n");
                                        uo.flush();
                                        break;
                                    case 'p':
                                        up.write(line + "\n");
                                        up.flush();
                                        break;
                                    case 'q':
                                        uq.write(line + "\n");
                                        uq.flush();
                                        break;
                                    case 'r':
                                        ur.write(line + "\n");
                                        ur.flush();
                                        break;
                                    case 's':
                                        us.write(line + "\n");
                                        us.flush();
                                        break;
                                    case 't':
                                        ut.write(line + "\n");
                                        ut.flush();
                                        break;
                                    case 'u':
                                        uu.write(line + "\n");
                                        uu.flush();
                                        break;
                                    case 'v':
                                        uv.write(line + "\n");
                                        uv.flush();
                                        break;
                                    case 'w':
                                        uw.write(line + "\n");
                                        uw.flush();
                                        break;
                                    case 'x':
                                        ux.write(line + "\n");
                                        ux.flush();
                                        break;
                                    case 'y':
                                        uy.write(line + "\n");
                                        uy.flush();
                                        break;
                                    case 'z':
                                        uz.write(line + "\n");
                                        uz.flush();
                                        break;
                                }
                                break;
                            case 'v':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        va.write(line + "\n");
                                        va.flush();
                                        break;
                                    case 'b':
                                        vb.write(line + "\n");
                                        vb.flush();
                                        break;
                                    case 'c':
                                        vc.write(line + "\n");
                                        vc.flush();
                                        break;
                                    case 'd':
                                        vd.write(line + "\n");
                                        vd.flush();
                                        break;
                                    case 'e':
                                        ve.write(line + "\n");
                                        ve.flush();
                                        break;
                                    case 'f':
                                        vf.write(line + "\n");
                                        vf.flush();
                                        break;
                                    case 'g':
                                        vg.write(line + "\n");
                                        vg.flush();
                                        break;
                                    case 'h':
                                        vh.write(line + "\n");
                                        vh.flush();
                                        break;
                                    case 'i':
                                        vi.write(line + "\n");
                                        vi.flush();
                                        break;
                                    case 'j':
                                        vj.write(line + "\n");
                                        vj.flush();
                                        break;
                                    case 'k':
                                        vk.write(line + "\n");
                                        vk.flush();
                                        break;
                                    case 'l':
                                        vl.write(line + "\n");
                                        vl.flush();
                                        break;
                                    case 'm':
                                        vm.write(line + "\n");
                                        vm.flush();
                                        break;
                                    case 'n':
                                        vn.write(line + "\n");
                                        vn.flush();
                                        break;
                                    case 'o':
                                        vo.write(line + "\n");
                                        vo.flush();
                                        break;
                                    case 'p':
                                        vp.write(line + "\n");
                                        vp.flush();
                                        break;
                                    case 'q':
                                        vq.write(line + "\n");
                                        vq.flush();
                                        break;
                                    case 'r':
                                        vr.write(line + "\n");
                                        vr.flush();
                                        break;
                                    case 's':
                                        vs.write(line + "\n");
                                        vs.flush();
                                        break;
                                    case 't':
                                        vt.write(line + "\n");
                                        vt.flush();
                                        break;
                                    case 'u':
                                        vu.write(line + "\n");
                                        vu.flush();
                                        break;
                                    case 'v':
                                        vv.write(line + "\n");
                                        vv.flush();
                                        break;
                                    case 'w':
                                        vw.write(line + "\n");
                                        vw.flush();
                                        break;
                                    case 'x':
                                        vx.write(line + "\n");
                                        vx.flush();
                                        break;
                                    case 'y':
                                        vy.write(line + "\n");
                                        vy.flush();
                                        break;
                                    case 'z':
                                        vz.write(line + "\n");
                                        vz.flush();
                                        break;
                                }
                                break;
                            case 'w':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        wa.write(line + "\n");
                                        wa.flush();
                                        break;
                                    case 'b':
                                        wb.write(line + "\n");
                                        wb.flush();
                                        break;
                                    case 'c':
                                        wc.write(line + "\n");
                                        wc.flush();
                                        break;
                                    case 'd':
                                        wd.write(line + "\n");
                                        wd.flush();
                                        break;
                                    case 'e':
                                        we.write(line + "\n");
                                        we.flush();
                                        break;
                                    case 'f':
                                        wf.write(line + "\n");
                                        wf.flush();
                                        break;
                                    case 'g':
                                        wg.write(line + "\n");
                                        wg.flush();
                                        break;
                                    case 'h':
                                        wh.write(line + "\n");
                                        wh.flush();
                                        break;
                                    case 'i':
                                        wi.write(line + "\n");
                                        wi.flush();
                                        break;
                                    case 'j':
                                        wj.write(line + "\n");
                                        wj.flush();
                                        break;
                                    case 'k':
                                        wk.write(line + "\n");
                                        wk.flush();
                                        break;
                                    case 'l':
                                        wl.write(line + "\n");
                                        wl.flush();
                                        break;
                                    case 'm':
                                        wm.write(line + "\n");
                                        wm.flush();
                                        break;
                                    case 'n':
                                        wn.write(line + "\n");
                                        wn.flush();
                                        break;
                                    case 'o':
                                        wo.write(line + "\n");
                                        wo.flush();
                                        break;
                                    case 'p':
                                        wp.write(line + "\n");
                                        wp.flush();
                                        break;
                                    case 'q':
                                        wq.write(line + "\n");
                                        wq.flush();
                                        break;
                                    case 'r':
                                        wr.write(line + "\n");
                                        wr.flush();
                                        break;
                                    case 's':
                                        ws.write(line + "\n");
                                        ws.flush();
                                        break;
                                    case 't':
                                        wt.write(line + "\n");
                                        wt.flush();
                                        break;
                                    case 'u':
                                        wu.write(line + "\n");
                                        wu.flush();
                                        break;
                                    case 'v':
                                        wv.write(line + "\n");
                                        wv.flush();
                                        break;
                                    case 'w':
                                        ww.write(line + "\n");
                                        ww.flush();
                                        break;
                                    case 'x':
                                        wx.write(line + "\n");
                                        wx.flush();
                                        break;
                                    case 'y':
                                        wy.write(line + "\n");
                                        wy.flush();
                                        break;
                                    case 'z':
                                        wz.write(line + "\n");
                                        wz.flush();
                                        break;
                                }
                                break;
                            case 'x':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        xa.write(line + "\n");
                                        xa.flush();
                                        break;
                                    case 'b':
                                        xb.write(line + "\n");
                                        xb.flush();
                                        break;
                                    case 'c':
                                        xc.write(line + "\n");
                                        xc.flush();
                                        break;
                                    case 'd':
                                        xd.write(line + "\n");
                                        xd.flush();
                                        break;
                                    case 'e':
                                        xe.write(line + "\n");
                                        xe.flush();
                                        break;
                                    case 'f':
                                        xf.write(line + "\n");
                                        xf.flush();
                                        break;
                                    case 'g':
                                        xg.write(line + "\n");
                                        xg.flush();
                                        break;
                                    case 'h':
                                        xh.write(line + "\n");
                                        xh.flush();
                                        break;
                                    case 'i':
                                        xi.write(line + "\n");
                                        xi.flush();
                                        break;
                                    case 'j':
                                        xj.write(line + "\n");
                                        xj.flush();
                                        break;
                                    case 'k':
                                        xk.write(line + "\n");
                                        xk.flush();
                                        break;
                                    case 'l':
                                        xl.write(line + "\n");
                                        xl.flush();
                                        break;
                                    case 'm':
                                        xm.write(line + "\n");
                                        xm.flush();
                                        break;
                                    case 'n':
                                        xn.write(line + "\n");
                                        xn.flush();
                                        break;
                                    case 'o':
                                        xo.write(line + "\n");
                                        xo.flush();
                                        break;
                                    case 'p':
                                        xp.write(line + "\n");
                                        xp.flush();
                                        break;
                                    case 'q':
                                        xq.write(line + "\n");
                                        xq.flush();
                                        break;
                                    case 'r':
                                        xr.write(line + "\n");
                                        xr.flush();
                                        break;
                                    case 's':
                                        xs.write(line + "\n");
                                        xs.flush();
                                        break;
                                    case 't':
                                        xt.write(line + "\n");
                                        xt.flush();
                                        break;
                                    case 'u':
                                        xu.write(line + "\n");
                                        xu.flush();
                                        break;
                                    case 'v':
                                        xv.write(line + "\n");
                                        xv.flush();
                                        break;
                                    case 'w':
                                        xw.write(line + "\n");
                                        xw.flush();
                                        break;
                                    case 'x':
                                        xx.write(line + "\n");
                                        xx.flush();
                                        break;
                                    case 'y':
                                        xy.write(line + "\n");
                                        xy.flush();
                                        break;
                                    case 'z':
                                        xz.write(line + "\n");
                                        xz.flush();
                                        break;
                                }
                                break;
                            case 'y':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        ya.write(line + "\n");
                                        ya.flush();
                                        break;
                                    case 'b':
                                        yb.write(line + "\n");
                                        yb.flush();
                                        break;
                                    case 'c':
                                        yc.write(line + "\n");
                                        yc.flush();
                                        break;
                                    case 'd':
                                        yd.write(line + "\n");
                                        yd.flush();
                                        break;
                                    case 'e':
                                        ye.write(line + "\n");
                                        ye.flush();
                                        break;
                                    case 'f':
                                        yf.write(line + "\n");
                                        yf.flush();
                                        break;
                                    case 'g':
                                        yg.write(line + "\n");
                                        yg.flush();
                                        break;
                                    case 'h':
                                        yh.write(line + "\n");
                                        yh.flush();
                                        break;
                                    case 'i':
                                        yi.write(line + "\n");
                                        yi.flush();
                                        break;
                                    case 'j':
                                        yj.write(line + "\n");
                                        yj.flush();
                                        break;
                                    case 'k':
                                        yk.write(line + "\n");
                                        yk.flush();
                                        break;
                                    case 'l':
                                        yl.write(line + "\n");
                                        yl.flush();
                                        break;
                                    case 'm':
                                        ym.write(line + "\n");
                                        ym.flush();
                                        break;
                                    case 'n':
                                        yn.write(line + "\n");
                                        yn.flush();
                                        break;
                                    case 'o':
                                        yo.write(line + "\n");
                                        yo.flush();
                                        break;
                                    case 'p':
                                        yp.write(line + "\n");
                                        yp.flush();
                                        break;
                                    case 'q':
                                        yq.write(line + "\n");
                                        yq.flush();
                                        break;
                                    case 'r':
                                        yr.write(line + "\n");
                                        yr.flush();
                                        break;
                                    case 's':
                                        ys.write(line + "\n");
                                        ys.flush();
                                        break;
                                    case 't':
                                        yt.write(line + "\n");
                                        yt.flush();
                                        break;
                                    case 'u':
                                        yu.write(line + "\n");
                                        yu.flush();
                                        break;
                                    case 'v':
                                        yv.write(line + "\n");
                                        yv.flush();
                                        break;
                                    case 'w':
                                        yw.write(line + "\n");
                                        yw.flush();
                                        break;
                                    case 'x':
                                        yx.write(line + "\n");
                                        yx.flush();
                                        break;
                                    case 'y':
                                        yy.write(line + "\n");
                                        yy.flush();
                                        break;
                                    case 'z':
                                        yz.write(line + "\n");
                                        yz.flush();
                                        break;
                                }
                                break;
                            case 'z':
                                switch (firstLetters.charAt(1)) {
                                    case 'a':
                                        za.write(line + "\n");
                                        za.flush();
                                        break;
                                    case 'b':
                                        zb.write(line + "\n");
                                        zb.flush();
                                        break;
                                    case 'c':
                                        zc.write(line + "\n");
                                        zc.flush();
                                        break;
                                    case 'd':
                                        zd.write(line + "\n");
                                        zd.flush();
                                        break;
                                    case 'e':
                                        ze.write(line + "\n");
                                        ze.flush();
                                        break;
                                    case 'f':
                                        zf.write(line + "\n");
                                        zf.flush();
                                        break;
                                    case 'g':
                                        zg.write(line + "\n");
                                        zg.flush();
                                        break;
                                    case 'h':
                                        zh.write(line + "\n");
                                        zh.flush();
                                        break;
                                    case 'i':
                                        zi.write(line + "\n");
                                        zi.flush();
                                        break;
                                    case 'j':
                                        zj.write(line + "\n");
                                        zj.flush();
                                        break;
                                    case 'k':
                                        zk.write(line + "\n");
                                        zk.flush();
                                        break;
                                    case 'l':
                                        zl.write(line + "\n");
                                        zl.flush();
                                        break;
                                    case 'm':
                                        zm.write(line + "\n");
                                        zm.flush();
                                        break;
                                    case 'n':
                                        zn.write(line + "\n");
                                        zn.flush();
                                        break;
                                    case 'o':
                                        zo.write(line + "\n");
                                        zo.flush();
                                        break;
                                    case 'p':
                                        zp.write(line + "\n");
                                        zp.flush();
                                        break;
                                    case 'q':
                                        zq.write(line + "\n");
                                        zq.flush();
                                        break;
                                    case 'r':
                                        zr.write(line + "\n");
                                        zr.flush();
                                        break;
                                    case 's':
                                        zs.write(line + "\n");
                                        zs.flush();
                                        break;
                                    case 't':
                                        zt.write(line + "\n");
                                        zt.flush();
                                        break;
                                    case 'u':
                                        zu.write(line + "\n");
                                        zu.flush();
                                        break;
                                    case 'v':
                                        zv.write(line + "\n");
                                        zv.flush();
                                        break;
                                    case 'w':
                                        zw.write(line + "\n");
                                        zw.flush();
                                        break;
                                    case 'x':
                                        zx.write(line + "\n");
                                        zx.flush();
                                        break;
                                    case 'y':
                                        zy.write(line + "\n");
                                        zy.flush();
                                        break;
                                    case 'z':
                                        zz.write(line + "\n");
                                        zz.flush();
                                        break;
                                }
                                break;
                        }

//                        System.err.println("this is the same: " + firstLetters + " link:" + links[0]);
                        flag = true;
                    }

                }
                if (!flag) {
                    // this is for other
                    other.write(line + "\n");
                    other.flush();
//                  System.err.println("pochetnaBukvaLink: "+pochetnaBukvaLink);
//                  System.err.println("firstLetters: "+firstLetters.charAt(0));
//                  System.err.println();

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
            if (other != null) {
                other.close();
            }
            apostrophe.close();
            hyphen.close();
            exclamation.close();
            dolar.close();
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
            aa.close();
            ab.close();
            ac.close();
            ad.close();
            ae.close();
            af.close();
            ag.close();
            ah.close();
            ai.close();
            aj.close();
            ak.close();
            al.close();
            am.close();
            an.close();
            ao.close();
            ap.close();
            aq.close();
            ar.close();
            as.close();
            at.close();
            au.close();
            av.close();
            aw.close();
            ax.close();
            ay.close();
            az.close();
            ba.close();
            bb.close();
            bc.close();
            bd.close();
            be.close();
            bf.close();
            bg.close();
            bh.close();
            bi.close();
            bj.close();
            bk.close();
            bl.close();
            bm.close();
            bn.close();
            bo.close();
            bp.close();
            bq.close();
            br.close();
            bs.close();
            bt.close();
            bu.close();
            bv.close();
            bw.close();
            bx.close();
            by.close();
            bz.close();
            ca.close();
            cb.close();
            cc.close();
            cd.close();
            ce.close();
            cf.close();
            cg.close();
            ch.close();
            ci.close();
            cj.close();
            ck.close();
            cl.close();
            cm.close();
            cn.close();
            co.close();
            cp.close();
            cq.close();
            cr.close();
            cs.close();
            ct.close();
            cu.close();
            cv.close();
            cw.close();
            cx.close();
            cy.close();
            cz.close();
            da.close();
            db.close();
            dc.close();
            dd.close();
            de.close();
            df.close();
            dg.close();
            dh.close();
            di.close();
            dj.close();
            dk.close();
            dl.close();
            dm.close();
            dn.close();
            doo.close();
            dp.close();
            dq.close();
            dr.close();
            ds.close();
            dt.close();
            du.close();
            dv.close();
            dw.close();
            dx.close();
            dy.close();
            dz.close();
            ea.close();
            eb.close();
            ec.close();
            ed.close();
            ee.close();
            ef.close();
            eg.close();
            eh.close();
            ei.close();
            ej.close();
            ek.close();
            el.close();
            em.close();
            en.close();
            eo.close();
            ep.close();
            eq.close();
            er.close();
            es.close();
            et.close();
            eu.close();
            ev.close();
            ew.close();
            ex.close();
            ey.close();
            ez.close();
            fa.close();
            fb.close();
            fc.close();
            fd.close();
            fe.close();
            ff.close();
            fg.close();
            fh.close();
            fi.close();
            fj.close();
            fk.close();
            fl.close();
            fm.close();
            fn.close();
            fo.close();
            fp.close();
            fq.close();
            fr.close();
            fs.close();
            ft.close();
            fu.close();
            fv.close();
            fw.close();
            fx.close();
            fy.close();
            fz.close();
            ga.close();
            gb.close();
            gc.close();
            gd.close();
            ge.close();
            gf.close();
            gg.close();
            gh.close();
            gi.close();
            gj.close();
            gk.close();
            gl.close();
            gm.close();
            gn.close();
            go.close();
            gp.close();
            gq.close();
            gr.close();
            gs.close();
            gt.close();
            gu.close();
            gv.close();
            gw.close();
            gx.close();
            gy.close();
            gz.close();
            ha.close();
            hb.close();
            hc.close();
            hd.close();
            he.close();
            hf.close();
            hg.close();
            hh.close();
            hi.close();
            hj.close();
            hk.close();
            hl.close();
            hm.close();
            hn.close();
            ho.close();
            hp.close();
            hq.close();
            hr.close();
            hs.close();
            ht.close();
            hu.close();
            hv.close();
            hw.close();
            hx.close();
            hy.close();
            hz.close();
            ia.close();
            ib.close();
            ic.close();
            id.close();
            ie.close();
            iff.close();
            ig.close();
            ih.close();
            ii.close();
            ij.close();
            ik.close();
            il.close();
            im.close();
            in.close();
            io.close();
            ip.close();
            iq.close();
            ir.close();
            is.close();
            it.close();
            iu.close();
            iv.close();
            iw.close();
            ix.close();
            iy.close();
            iz.close();
            ja.close();
            jb.close();
            jc.close();
            jd.close();
            je.close();
            jf.close();
            jg.close();
            jh.close();
            ji.close();
            jj.close();
            jk.close();
            jl.close();
            jm.close();
            jn.close();
            jo.close();
            jp.close();
            jq.close();
            jr.close();
            js.close();
            jt.close();
            ju.close();
            jv.close();
            jw.close();
            jx.close();
            jy.close();
            jz.close();
            ka.close();
            kb.close();
            kc.close();
            kd.close();
            ke.close();
            kf.close();
            kg.close();
            kh.close();
            ki.close();
            kj.close();
            kk.close();
            kl.close();
            km.close();
            kn.close();
            ko.close();
            kp.close();
            kq.close();
            kr.close();
            ks.close();
            kt.close();
            ku.close();
            kv.close();
            kw.close();
            kx.close();
            ky.close();
            kz.close();
            la.close();
            lb.close();
            lc.close();
            ld.close();
            le.close();
            lf.close();
            lg.close();
            lh.close();
            li.close();
            lj.close();
            lk.close();
            ll.close();
            lm.close();
            ln.close();
            lo.close();
            lp.close();
            lq.close();
            lr.close();
            ls.close();
            lt.close();
            lu.close();
            lv.close();
            lw.close();
            lx.close();
            ly.close();
            lz.close();
            ma.close();
            mb.close();
            mc.close();
            md.close();
            me.close();
            mf.close();
            mg.close();
            mh.close();
            mi.close();
            mj.close();
            mk.close();
            ml.close();
            mm.close();
            mn.close();
            mo.close();
            mp.close();
            mq.close();
            mr.close();
            ms.close();
            mt.close();
            mu.close();
            mv.close();
            mw.close();
            mx.close();
            my.close();
            mz.close();
            na.close();
            nb.close();
            nc.close();
            nd.close();
            ne.close();
            nf.close();
            ng.close();
            nh.close();
            ni.close();
            nj.close();
            nk.close();
            nl.close();
            nm.close();
            nn.close();
            no.close();
            np.close();
            nq.close();
            nr.close();
            ns.close();
            nt.close();
            nu.close();
            nv.close();
            nw.close();
            nx.close();
            ny.close();
            nz.close();
            oa.close();
            ob.close();
            oc.close();
            od.close();
            oe.close();
            of.close();
            og.close();
            oh.close();
            oi.close();
            oj.close();
            ok.close();
            ol.close();
            om.close();
            on.close();
            oo.close();
            op.close();
            oq.close();
            or.close();
            os.close();
            ot.close();
            ou.close();
            ov.close();
            ow.close();
            ox.close();
            oy.close();
            oz.close();
            pa.close();
            pb.close();
            pc.close();
            pd.close();
            pe.close();
            pf.close();
            pg.close();
            ph.close();
            pi.close();
            pj.close();
            pk.close();
            pl.close();
            pm.close();
            pn.close();
            po.close();
            pp.close();
            pq.close();
            pr.close();
            ps.close();
            pt.close();
            pu.close();
            pv.close();
            pw.close();
            px.close();
            py.close();
            pz.close();
            qa.close();
            qb.close();
            qc.close();
            qd.close();
            qe.close();
            qf.close();
            qg.close();
            qh.close();
            qi.close();
            qj.close();
            qk.close();
            ql.close();
            qm.close();
            qn.close();
            qo.close();
            qp.close();
            qq.close();
            qr.close();
            qs.close();
            qt.close();
            qu.close();
            qv.close();
            qw.close();
            qx.close();
            qy.close();
            qz.close();
            ra.close();
            rb.close();
            rc.close();
            rd.close();
            re.close();
            rf.close();
            rg.close();
            rh.close();
            ri.close();
            rj.close();
            rk.close();
            rl.close();
            rm.close();
            rn.close();
            ro.close();
            rp.close();
            rq.close();
            rr.close();
            rs.close();
            rt.close();
            ru.close();
            rv.close();
            rw.close();
            rx.close();
            ry.close();
            rz.close();
            sa.close();
            sb.close();
            sc.close();
            sd.close();
            se.close();
            sf.close();
            sg.close();
            sh.close();
            si.close();
            sj.close();
            sk.close();
            sl.close();
            sm.close();
            sn.close();
            so.close();
            sp.close();
            sq.close();
            sr.close();
            ss.close();
            st.close();
            su.close();
            sv.close();
            sw.close();
            sx.close();
            sy.close();
            sz.close();
            ta.close();
            tb.close();
            tc.close();
            td.close();
            te.close();
            tf.close();
            tg.close();
            th.close();
            ti.close();
            tj.close();
            tk.close();
            tl.close();
            tm.close();
            tn.close();
            to.close();
            tp.close();
            tq.close();
            tr.close();
            ts.close();
            tt.close();
            tu.close();
            tv.close();
            tw.close();
            tx.close();
            ty.close();
            tz.close();
            ua.close();
            ub.close();
            uc.close();
            ud.close();
            ue.close();
            uf.close();
            ug.close();
            uh.close();
            ui.close();
            uj.close();
            uk.close();
            ul.close();
            um.close();
            un.close();
            uo.close();
            up.close();
            uq.close();
            ur.close();
            us.close();
            ut.close();
            uu.close();
            uv.close();
            uw.close();
            ux.close();
            uy.close();
            uz.close();
            va.close();
            vb.close();
            vc.close();
            vd.close();
            ve.close();
            vf.close();
            vg.close();
            vh.close();
            vi.close();
            vj.close();
            vk.close();
            vl.close();
            vm.close();
            vn.close();
            vo.close();
            vp.close();
            vq.close();
            vr.close();
            vs.close();
            vt.close();
            vu.close();
            vv.close();
            vw.close();
            vx.close();
            vy.close();
            vz.close();
            wa.close();
            wb.close();
            wc.close();
            wd.close();
            we.close();
            wf.close();
            wg.close();
            wh.close();
            wi.close();
            wj.close();
            wk.close();
            wl.close();
            wm.close();
            wn.close();
            wo.close();
            wp.close();
            wq.close();
            wr.close();
            ws.close();
            wt.close();
            wu.close();
            wv.close();
            ww.close();
            wx.close();
            wy.close();
            wz.close();
            xa.close();
            xb.close();
            xc.close();
            xd.close();
            xe.close();
            xf.close();
            xg.close();
            xh.close();
            xi.close();
            xj.close();
            xk.close();
            xl.close();
            xm.close();
            xn.close();
            xo.close();
            xp.close();
            xq.close();
            xr.close();
            xs.close();
            xt.close();
            xu.close();
            xv.close();
            xw.close();
            xx.close();
            xy.close();
            xz.close();
            ya.close();
            yb.close();
            yc.close();
            yd.close();
            ye.close();
            yf.close();
            yg.close();
            yh.close();
            yi.close();
            yj.close();
            yk.close();
            yl.close();
            ym.close();
            yn.close();
            yo.close();
            yp.close();
            yq.close();
            yr.close();
            ys.close();
            yt.close();
            yu.close();
            yv.close();
            yw.close();
            yx.close();
            yy.close();
            yz.close();
            za.close();
            zb.close();
            zc.close();
            zd.close();
            ze.close();
            zf.close();
            zg.close();
            zh.close();
            zi.close();
            zj.close();
            zk.close();
            zl.close();
            zm.close();
            zn.close();
            zo.close();
            zp.close();
            zq.close();
            zr.close();
            zs.close();
            zt.close();
            zu.close();
            zv.close();
            zw.close();
            zx.close();
            zy.close();
            zz.close();
        }
        System.err.println("TOTAL TIME OF SORTING: " + (System.nanoTime()-start) + " ns");
    }

    public static void main(String[] args) {
        try {
            sortNifLinksToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        createFolders();
    }

}
