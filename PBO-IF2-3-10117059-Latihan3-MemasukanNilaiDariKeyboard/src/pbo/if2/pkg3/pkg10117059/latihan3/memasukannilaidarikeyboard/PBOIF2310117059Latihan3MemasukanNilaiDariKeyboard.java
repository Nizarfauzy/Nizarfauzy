/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan3.memasukannilaidarikeyboard;

import java.util.Scanner;

/**
 *
 * @author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 * Deskripsi Program    : Program yang berfungsi Untuk Memasukan atau Menginput
 *                        Nilai melalui keyboard
 */
public class PBOIF2310117059Latihan3MemasukanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    }
    
}
