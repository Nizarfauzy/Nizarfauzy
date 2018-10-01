/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg10117059.latihan11.formating;

/**
 *
 * @author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 * Deskripsi Program    : Program yang berfungsi Untuk Program data dengan 
 *                        penggunaan formating
 */
public class PBOIF210117059Latihan11Formating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i\t\t : " + i);
        System.out.printf("%%d\t\t : %d%n", i);
        System.out.printf("%%10d\t\t : %10d%n", i);
        System.out.printf("%%+10d\t\t : %+10d%n", i);
        System.out.printf("%%+10d\t\t : %+10d%n", iMinus);
        System.out.printf("%%,10d\t\t : %,10d%n", i);
        System.out.printf("%%-10d\t\t : %-10d%n", i);
        double f = 5675482.982;
        System.out.println("f\t\t : " + f);
        System.out.printf("%%f\t\t : %f%n", f);
        System.out.printf("$$.2f\t\t : %.2f%n", f);
        System.out.printf("$$12.2f\t\t : %12.2f%n", f);
        System.out.printf("$$,12.2f\t : %,12.2f%n", f);
    }
    
}
