package com.learning;

// Method Parameters 

/* 
Method parameter digunakan untuk menyimpan data yang nanti dipakai untuk melakukan operasi khusus yang ada di dalam 
method tersebut. Didalam method kita dapat mengembalikan suatu nilai, nilai yang dikembalikan ini disebut dengan 
return. 
*/

public class MethodParameters {
    // Membuat method dengan menggunakan paramater 
    static void sayHello(String name){
        System.out.println("Hello " + name + ", anda berhasil memanggil method sayHello()");
    }

    // Membuat method dengan menggunakan beberapa parameter dan dengan menggunakan return
    static int operasiTambah(int x, int y){
        return x + y;
    }
    
    public static void main(String[] args) {
        // Memanggil method dengan menggunakan parameter 
        sayHello("tobe");
        // Memanggil method dengan menggunakan beberapa parameter
        System.out.println("12 + 10 = " + operasiTambah(12, 10));
    }
}
