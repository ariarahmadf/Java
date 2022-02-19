package com.learning;

// Strings 
/*
    String merupakan salah satu tipe Non-Primitive Data Type, sehingga tipe data ini memiliki beberapa method 
    agar dapat melakukan operasi yang lebih spesifik.

    Beberapa method string yang umum digunakan: 
    1. .length()
    2. .toUpperCase() atau .toLowerCase()
    3. .indexOf()
    4. .concat()
*/

// Esc Character 
/*
    Esc Character digunakan untuk menghindari error ketika kita ingin menggunakan special karakter tertentu.
    Misalnya kita ingin menggunakan karakter ("") sehingga karakter tersebut dapat ditampilkan di terminal.

    Berikut beberapa Esc Character: 
    1. /'
    2. /"
    3. //
    4. \n
    5. \t
    6. etc
*/

public class Main {
    public static void main(String[] args) {
        String nama = "aria rahmad";
        System.out.println("Nama\t= " + nama + "\n");

        // method length()
        System.out.println("length\t: " + nama.length()); // Output 11 

        // method toUpperCase()
        System.out.println("toUpper\t: " + nama.toUpperCase()); // Output ARIA RAHMAD

        // method toLowerCase()
        System.out.println("toLower\t: " + nama.toLowerCase()); // Output aria rahmad

        // method indexOf()
        System.out.println("indexOf\t: " + nama.indexOf("rahmad")); // Output 5

        // method concat()
        System.out.println("concat\t: " + nama.concat(" fadillah")); // Output aria rahmad fadillah
    }
}
