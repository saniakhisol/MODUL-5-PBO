package modul4;

import java.util.Scanner;

public class OperasiBilanganAbsCetak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai pertama : ");
        double nilai1 = input.nextDouble();
        System.out.print("masukkan nilai kedua : ");
        double nilai2 = input.nextDouble();
        AllHitung hitung = new AllHitung();
        hitung.set_A(nilai1);
        hitung.set_B(nilai2);
        System.out.println("hasil Penjumlahan : "+hitung.hitungJumlah());
        System.out.println("hasil Pengurangan : "+hitung.hitungKurang());
        System.out.println("hasil Perkalian : "+hitung.hitungKali());
        System.out.println("hasil Pembagian : "+hitung.hitungBagi());
        
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
//        jumlah.set_A(nilai1);
//        jumlah.set_B(nilai2);
//        System.out.println("hasil penjumlahan : "+jumlah.hitung());
//        
//        OperasiPengurangan kurang = new OperasiPengurangan() ;
//        kurang.set_A(nilai1);
//        kurang.set_B(nilai2);
//        System.out.println("hasil pengurangan : "+kurang.hitung());
//        
//        OperasiPerkalian kali = new OperasiPerkalian() ;
//        kali.set_A(nilai1);
//        kali.set_B(nilai2);
//        System.out.println("hasil perkalian : "+kali.hitung());
//        
//        OperasiPembagi bagi = new OperasiPembagi() ;
//        bagi.set_A(nilai1);
//        bagi.set_B(nilai2);
//        System.out.println("hasil pembagian : "+bagi.hitung());
    }
    
}
