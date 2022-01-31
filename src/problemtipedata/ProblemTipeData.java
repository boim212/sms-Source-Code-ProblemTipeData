/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problemtipedata;

/**
 *
 * @author Personal
 */
public class ProblemTipeData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        int d, e;
        double z, f;
        
        
        //variabel
        a = 2;
        b = 3;
        c = a + b;
        z = 3.14;
        d = a + b * c;
        e = d / 2;
        f = d / 2;
        
        //print
        System.out.println("================== Output Program ===================");
        System.out.println("Nilai variabel a = " + a);
        System.out.println("Nilai variabel b = " + b);
        System.out.println("Nilai variabel c = a + b = " + c);
        System.out.println("Nilai Variabel Pecahan z = " + z);
        System.out.println("");
        System.out.println("=== MODIFIKASI TAMBAHAN OUTPUT ===");
        System.out.println("Nilai variabel d = a + b * c = " + d);
        System.out.println("Nilai variabel BULAT e = d / 2 = " + e);
        System.out.println("Nilai PECAH f = d / 2 = " + f);
        System.out.println("");
        
    }
}
