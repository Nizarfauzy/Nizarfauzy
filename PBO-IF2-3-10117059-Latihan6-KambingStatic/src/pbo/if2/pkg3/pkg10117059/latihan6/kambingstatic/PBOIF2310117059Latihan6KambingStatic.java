/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan6.kambingstatic;

/**
 *
 * @author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 * Deskripsi Program    : Program yang berfungsi Untuk Menampilkan satu kelas
 *                        dengan kelaslainya yang saling berhubungan.
 */
public class PBOIF2310117059Latihan6KambingStatic {
     // NAMA_KAMBING sebagai konstanta
       public static final String NAMA_KAMBING = "MIDUN";
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambinng sebanyak " + 
         Mamalia.jumlahKambing);  
    }
    
}
