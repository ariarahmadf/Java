package com.learning;

// Continue Keyword 
/*
Continue keyword yang ada pada perulangan memiliki fungsi untuk melewati (menskip) satu kali iterasi jika sebuah kondisi bernilai 
benar dan melanjutkan kembali iterasi perulangan tanpa melompat keluar (mengakhiri) dari sebuah perulangan.
*/

public class ContinueKeyword {
    public static void main(String[] args) {
        int iteration = 11; 
        
        while(iteration > 1) {
            iteration--;
            if(iteration == 2) {
                continue; // Perulangan akan terhenti sekali jika var iteration bernilai dua dan setelah itu melanjutkan kembali iterasi perulangan tersebut.
            }

            System.out.println(iteration);
        }
    }
}
