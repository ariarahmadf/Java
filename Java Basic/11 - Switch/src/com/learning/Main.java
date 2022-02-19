package com.learning;

// Switch 

/*
Switch digunakan untuk memilih satu dari beberapa kasus yang masing-masing didalamnya terdapat blok kode.

Syntax: 
    case(expression){
        case: x: 
            // block of code 
            break;
        case: y:
            // block of code 
            break;
        case: z: 
            // block of code 
            break;
        default: 
            // block of code
    }
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Sekarang bulan ke-2, maka sekarang bulan: ");

        int nomorBulan = 2;

        switch(nomorBulan){
            case 1: 
                System.out.println("Output: Januari");
                break;
            case 2: 
                System.out.println("Output: Februari");
                break;
            case 3: 
                System.out.println("Output: Maret");
                break;
            case 4: 
                System.out.println("Output: April");
                break;
            case 5: 
                System.out.println("Output: Mei");
                break;
            case 6: 
                System.out.println("Output: Juni");
                break;
            case 7: 
                System.out.println("Output: Juli");
                break;
            case 8: 
                System.out.println("Output: Agustus");
                break;
            case 9: 
                System.out.println("Output: September");
                break;
            case 10: 
                System.out.println("Output: Oktober");
                break;
            case 11: 
                System.out.println("Output: November");
                break;
            case 12: 
                System.out.println("Output: Desember");
                break;
            default:
                System.out.println("Output: Nomor bulan salah");
        }
    }
}

/*
Note: 
    - Break digunakan untuk menghentikan proses kode program setelah ditemukannya break keyword dan memberhentikan uji kasus
    yang ada didalam blok kode.
    - Default keyword digunakn untuk menjalankan blok kode dibawahnya ketika semua kasus yang telah lewati tidak ada yang
    cocok. Default keyword biasa digunakan di akhir switch dan ia tidak perlu menggunakan break untuk mengakhiri proses 
    eksekusi program.
*/
