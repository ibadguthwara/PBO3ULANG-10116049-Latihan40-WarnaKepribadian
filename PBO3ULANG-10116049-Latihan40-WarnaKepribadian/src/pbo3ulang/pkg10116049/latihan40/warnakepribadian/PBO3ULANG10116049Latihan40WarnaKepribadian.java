/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi untuk menampilkan Warna Kepribadian
 */
public class PBO3ULANG10116049Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static final int TRANSPARENT = 0;
    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int PURPLE = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;
    
    public static void main(String[] args) {
        // TODO code application logic here
            
        String name;
        printHeader();

        Scanner scanner = new Scanner(System.in);                        
        System.out.print("PILIH WARNA FAVORITMU\t: ");
        Color myColor = new Color(scanner.nextLine());
    
        System.out.print("NAMA KAMU\t\t: ");
        name = scanner.nextLine();

        System.out.println("\n=========== HASIL TEST KEPRIBADIAN ".concat(name.toUpperCase()).concat(" ==========="));        
        myColor.printPersonality();
    }

    public static void printHeader(){
        System.out.println("\n"+
            Color.colorBuilder(RED, TRANSPARENT, "YUK") + " " +
            Color.colorBuilder(GREEN, TRANSPARENT, "CEK")  + " " +
            Color.colorBuilder(YELLOW, TRANSPARENT, "KEPRIBADIANMU")  + " " +
            Color.colorBuilder(CYAN, TRANSPARENT, "DARI")  + " " +
            Color.colorBuilder(PURPLE, TRANSPARENT, "WARNA")  + " " +
            Color.colorBuilder(BLUE, TRANSPARENT, "FAVORITMU")  + " "
            );

        System.out.println();

        System.out.println(Color.colorBuilder(WHITE, RED,    "          MERAH          "));
        System.out.println(Color.colorBuilder(WHITE, GREEN,  "          HIJAU          "));
        System.out.println(Color.colorBuilder(WHITE, YELLOW, "          KUNING         "));
        System.out.println(Color.colorBuilder(WHITE, BLUE,   "          BIRU           "));
        System.out.println(Color.colorBuilder(WHITE, PURPLE, "          UNGU           "));

        System.out.println();
    }
    
}
