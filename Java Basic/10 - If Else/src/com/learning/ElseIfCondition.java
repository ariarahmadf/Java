package com.learning;

// Else If Condition 

/*
Else if digunakan untuk menspesifikasikan kondisi baru jika kondisi pertama salah 

Syntax: 
    if(condition){
        // Baris/Blok kode akan dieksekusi jika kondisi bernilai true
    } else if (condition){
        // Baris/Blok kode ini akan dieksekusi jika kondisi pertama bernilai false
    } else {
        // Baris/Blok kode ini akan dieksekusi jika semua kondisi bernilai false
    }
*/

public class ElseIfCondition {
    public static void main(String[] args) {
        System.out.println("Lampu kuning menyala, maka kita harus: ");
        
        String warna = "Kuning";
        if(warna == "Hijau") {
            System.out.println("Output: Jalan");
        } else if(warna == "Kuning") {
            System.out.println("Output: Jalan dan kurangi kecepatan");
        } else {
            System.out.println("Output: Berhenti");
        }
    }
}
