package com.learning;

// If Condition 
/* 
If digunakan untuk menspesifikasikan sebuah blok kode yang nantinya akan dieksekusi, jika kondisi yang 
dispesifikasikannya bernilai benar.

Syntax: 
    if (condition) { 
        // Baris/Blok kode ini akan dieksekusi jika kondisi bernilai true
    }
*/

public class IfCondition {
    public static void main(String[] args) {
        System.out.println("Apakah 8 termasuk bilangan genap?");
        if (8 % 2 == 0) {
            System.out.println("Output: True"); // Akan menampilkan output ini jika kondisinya benar/terpenuhi
        }
    }
}

// Note: Syntax if harus ditulis dengan huruf kecil, jika ditulis dengan huruf besar maka akan error.