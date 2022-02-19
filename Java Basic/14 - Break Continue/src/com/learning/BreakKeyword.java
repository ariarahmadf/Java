package com.learning;

// Break Keyword 

/*
Sebelumnya kita telah mengetahui fungsi dari break di dalam switch case. Selanjutnya kita akan coba break pada while loop
dimana memiliki fungsi yang sama ketika kita menggunakannya pada switch case, break keyword akan memperintahkan program 
untuk lompat keluar dari perulangan yang sedang berlangsung ketika arrow program berada tepat di break keyword. 
*/

public class BreakKeyword {
    public static void main(String[] args) {
        int iteration = 10; 
        
        while(iteration > 0) {
            if(iteration == 2) {
                break; // Perulangan akan terhenti karena variabel iteration bernilai 2
            }

            System.out.println(iteration);
            iteration--;
        }
    }
}
