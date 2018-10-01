/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan4.kambing;

/**
 *
 * @author kitttyyyy
 * 
 * NAMA: Nizar Fauzi Ryamizard
 * Kelas: IF-2
 * Nim : 10117059
 * Deskripsi Program: Program ini berisi program penambahan/tambah kambing
 */
public class PBOIF2310117059Latihan4Kambing{
    
    public void tambahKambing(){
        //deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambahkan: " + 
                            jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PBOIF2310117059Latihan4Kambing kambingJantan = new 
        PBOIF2310117059Latihan4Kambing();
        kambingJantan.tambahKambing();
        
    }
}