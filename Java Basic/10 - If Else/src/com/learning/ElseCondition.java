package com.learning;

// Else Condition 
/*
Else condition digunakan untuk menspesifikasikan sebuah blok kode yang nantinya akan dieksekusi, jika kondisi yang 
dispesifikasikannya bernilai salah.

Syntax: 
    if(condition){
        // Baris/Blok kode ini akan dieksekusi jika kondisi bernilai true
    } else {
        // Baris/Blok kode ini akan dieksekusi jika kondisi bernilai false 
    }
*/

public class ElseCondition {
    public static void main(String[] args) {
        System.out.println("Apakah 'U' termasuk huruf vokal?");
        String huruf = "U";
        if(huruf.contains("A") || huruf.contains("I") || huruf.contains("U") || huruf.contains("E") || huruf.contains("O")) {
            System.out.println("Output: True");
        } else {
            System.out.println("Output: False");
        }
    }
}
