import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*
         *          DIKETAHUI
         * input :
         *    panjang
         *    lebar
         *  fungsi :
         *    FungsiTampilanKelilingDanLuas
         *    Fungsi keliling
         *    Fungsi luas
         *    Fungsi tampilGambar
         * 
         */

        Scanner Panjang = new Scanner(System.in);
        System.out.print("Panjang  = ");
        int panjang = Panjang.nextInt();

        Scanner Lebar = new Scanner(System.in);
        System.out.print("Lebar  = ");
        int lebar = Lebar.nextInt();

        System.out.println("Luas    = "+ (luas(panjang, lebar)));
        System.out.println("Keliling    = "+ (keliling(panjang, lebar)));
    }
    
    private static void Tampil(){
        System.out.println();
    }

    private static int luas( int panjang, int lebar ){
        int luas = panjang * lebar;
        return luas;
   }

   private static int keliling( int panjang, int lebar ){
        int keliling = 2 * (panjang + lebar);
        return keliling;
   }
}
