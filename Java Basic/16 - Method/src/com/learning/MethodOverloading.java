package com.learning;

// Method Overloading 

// Dengan konsep method overloading ini, kita dapat memiliki beberapa method dengan nama yang sama namun harus menggunakan
// parameter yang berbeda.

public class MethodOverloading {
    // Membuat method dengan parameter dan return bertipe int 
    static int operasiTambah(int x, int y){
        return x + y;
    }

    // Membuat method dengan parametr dan return bertipe double 
    static double operasiTambah(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        // Memanggil method operasiTambah() dengan tipe int
        System.out.println("30 + 22 = " + operasiTambah(30, 22));
        // Memanggil method operasiTambah() dengan tipe double
        System.out.println("1.22 + 10.31 = " + operasiTambah(1.22, 10.31));    
    }
}
