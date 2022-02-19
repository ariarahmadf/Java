package com.learning;

// Variables 
/*
    Variable umumnya digunakan untuk menyimpan data. Banyak jenis data yang kita dapat simpan di dalam variable 
    misalnya angka, kata atau kalimat, karakter, dll. Berikut syntax dasar untuk mendeklarasikan sebuah variable: 
    
    dataType namaVariable = nilaiVariable; 
*/

// Final Variable 
/*
    Final digunakan untuk menyimpan data yang tidak dapat di ubah (nilai tetap/constata) oleh siapapun 
*/

// Java Identifiers (penamaan variable pada java)
/*
    Penamaan variable pada bahasa java sangatlah beragam. Bisa menggunakan penamaan yang simple seperti (x,y) atau menggunakan
    penamaan yang deskriptif seperti luasSegitiga, panjang, dll. 

    Syarat penamaan variable adalah :
    1. Nama variable harus diawali oleh huruf 
    2. Nama variable bersifat case sensitif
    3. Nama variable bisa menggunakan angka, huruf, dollar sign, atau underscore 
    4. Tidak boleh menggunakan reserve word sebagai nama variable
    5. Nama variable tidak boleh mengandung whitespace (spasi)
*/

public class Main {
    public static void main(String[] args) {
        // Mendeklarasikan Variable 
        int a = 10; // Mendeklarasikan variable sekaligus memberikan nilai ke dalam variable
        int b; // Hanya mendeklarasikan variable
        int x = 1,y = 2; // Mendeklarasikan beberapa variable dengan type data yang sama sekaligus
        String panggilan = "Tobe";
        String realName = "Aria";
        boolean status = true;
        char pilihan = 'a';

        var j = 25; // Pembuatan variable otomatis tanpa perlu mengetikan tipe datanya 

        // Mendeklarasikan Final Variable 
        final int s = 10;

        // Memasukan nilai ke dalam variable yang telah dibuat
        b = 10;

        // Mengoveride (menimpa) nilai yang telah disimpan di dalam sebuah variable
        a = 5;
        //s = 3; akan error karena s merupakan final

        // Mencetak nilai yang ada di dalam variable
        System.out.println(a);
        System.out.println(j);
        System.out.println("Ini adalah nilai final " + s);
        System.out.println("nilai a + b = " + (a+b)); // dapat mencetak langsung operasi matematika
        System.out.println(panggilan + " merupakan nama panggilan, sedangkan nama aslinya adalah " + realName); // dapat menggabungkan nilai variable String dengan sebuah teks
    }
}
