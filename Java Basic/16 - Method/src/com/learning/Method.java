package com.learning;

// Methods 

/* 
Method merupakan blok kode yang akan dijalankan atau tereksekusi jika method ini di panggil. Di dalam method kita 
dapat memasukan data yang biasa disebut dengan parameter. Method umumnya digunakan untuk melakukan aksi spesifik, 
method sering juga disebut dengan function. Method dapat dipanggil berulang kali sehingga dapat meminimalkan penggunaan
kode program yang sama.
*/
public class Method {
    // Membuat method say Hello
    static void sayHello(){
        System.out.println("Hello guys!");
    }
    public static void main(String[] args) {
        // Memanggil method sayHello()
        sayHello();
    }
}
