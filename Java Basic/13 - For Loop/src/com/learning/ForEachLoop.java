package com.learning;

// For Each Loop 
/*
For Each Loop merupakan varian dari for loop, namun varian ini digunakan untuk melakukan perulangan terhadap sebuah array.

Syntax: 
    for(dataType variableName : arrayName) {
        // block of code
    }   
*/

public class ForEachLoop {
    public static void main(String[] args) {

        String[] jenisKendaraan = {
            "Motor", "Mobil", "Truk", 
            "Bus", "Pesawat", "Kapal", 
            "Kereta", "Sepeda"
        };

        for(String kendaraan : jenisKendaraan) {
            System.out.println(kendaraan);
        }
    }
}
