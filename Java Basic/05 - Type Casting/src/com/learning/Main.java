package com.learning;

// Type Casting 
/*
    Casting merupakan sebuah cara untuk mentranslasikan tipe data primitive satu  
    ke tipe data primitive lainnya (Contoh dari int ke float)

    Type Casting dibagi menjadi dua, yaitu: 
        1. Widening Casting : Casting dari tipe data urutan paling rendah ke paling tinggi (byte -> double)
        2. Narrow Casting : Casting dari tipe data urutan paling tinggi ke paling rendah (double -> byte)
*/

public class Main {
    public static void main(String[] args) {
        // Inisialisasi variable 
        int a = 10;
        double b = 3.14;

        // Cek tipe data sebelum di casting 
        System.out.println("Sebelum di casting:");
        System.out.println("a = " + ((Object)a).getClass().getSimpleName());
        System.out.println("b = " + ((Object)b).getClass().getSimpleName() + "\n");
        
        // Contoh Widening Casting (rendah ke tinggi)
        float x = a;
        
        // Contoh Narrow Casting (Tinggi ke Rendah)
        int y = (int) b;

        System.out.println("Setelah di casting:");
        System.out.println("a = " + ((Object)x).getClass().getSimpleName());
        System.out.println("b = " + ((Object)y).getClass().getSimpleName() + "\n");
    }
}
