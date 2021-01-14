/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg2;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Inputan User
        Scanner masukan = new Scanner (System.in);
        
        // Deklarasi Variabel dan Menyimpan Nilai
        int pilihan = 9;
        
        // Perulangan Do
        do{
            // Menampilkan Judul
            System.out.println("\nMENU LUAS BANGUN\n");
            
        // Menampilkan Statement
            System.out.println("1. Menghitung Luas Persegi ");
            System.out.println("2. Menghitung Luas persegi Panjang ");
            System.out.println("3. Keluar ");
            
            // User Memasukkan Pilihan
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = masukan.nextInt();
            
        // Percabangan Switch Case
        switch(pilihan){
            case 1 : luasPersegi();break;
            case 2 : luasPersegiPanjang();break;
        }
        // Jika Percabangan Tidak Sama Dengan 3, Maka Akan Diulangi Lagi
        } while (pilihan != 3);
        }
    
    // Method Luas Persegi
    private static void luasPersegi(){
        // Inputan User
        Scanner masukan = new Scanner(System.in);
        
        // Deklarasi Variabel
        float sisi, luas;
        
        // User Memasukkan Niai Sisi
        System.out.print("Masukkan Nilai Sisi : ");
        sisi = masukan.nextFloat();
        
        // Menghitung Luas Persegi
        luas = sisi * sisi;
        
        // Menampilkan Hasil dari Luas Persegi
        System.out.println("Luas Persegi adalah : " + luas);
    }
    
    // Method Luas Persegi Panjang 
    private static void luasPersegiPanjang(){
        // Inputan User
        Scanner masukan = new Scanner(System.in);
        
        // Deklarasi Variabel
        float panjang, lebar, luas;
        
        // User Memasukkan Nilai Panjang
        System.out.print("Masukkan Nilai Panjang : ");
        panjang = masukan.nextFloat();
        
        // User Memasukkan Nilai Lebar
        System.out.print("Masukkan Nilai Lebar   : ");
        lebar = masukan.nextFloat();
        
        // Menghitung Luas Persegi Panjang
        luas = panjang * lebar;
        
        // Menampilkan Hasil dari Luas Persegi Panjang
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }
}
