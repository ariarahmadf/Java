package com.learning;

// Arrays 

/*
Array digunakan untuk menampung beberapa nilai ke dalam sebuah variable dengan tipe data yang sama.

Syntax: 
    dataType[] variableName;
    or 
    dataType[] variableName = new dataType[x];
    or
    dataType[] variableName = {
        value1, value2, value3,
        value4, value5, value6
    };
    or 
    datatype[][] variableName;
*/

public class Main {
    public static void main(String[] args) {
        // Pendeklarasian array dan memasukkan nilai ke dalam array
        String[] mobil = {
            "Volvo", "BMW",
            "Ford", "Mazda"
        };

        // Merubah value ke dalam array 
        mobil[0] = "Mitsubishi";

        // Mengakses value di dalam array
        System.out.println(mobil[0]);

        // Perulangan dengan array 
        for(String namaMobil : mobil){
            System.out.println(namaMobil);
        }

        // int[][] tanggalLahir;  Mendeklarasikan multidimensional array 
        
    } 
}
