package com.tutorial;


class Mahasiswa {
    String Nama;
    String Nim;
    String Prodi;
}

public class Main {

    public static void main(String[] args){
        // instansiasi pembuatan objek
        Mahasiswa mhs1 = new Mahasiswa();

        // objek mhs1 diberi atribut
        mhs1.Nama = "Iqbal Huda";
        mhs1.Nim = "22241042";
        mhs1.Prodi = "Pendidikan Teknologi Informasi";

        System.out.println("Nama Mahasiswa:" + mhs1.Nama);
        System.out.println("Nim Mahasiswa:" + mhs1.Nim);
        System.out.println("Prodi Mahasiswa:" + mhs1.Prodi);
    }
    
    
}
