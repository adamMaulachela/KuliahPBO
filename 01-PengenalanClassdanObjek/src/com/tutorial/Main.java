package com.tutorial;

class Mahasiswa {
    String nama;
    String NIM;
    String prodi;
}


public class Main {
    public static void main(String args[]) {
        // instansiasi pembuatan objek
        Mahasiswa mhs1 = new Mahasiswa();

        // objek mhs1 diberi atribut
        mhs1.nama = "Ucup";
        mhs1.NIM = "2020202020";
        mhs1.prodi = "Matematika";

        System.out.println("Nama Mahasiswa : " + mhs1.nama);
        System.out.println("NIM : " + mhs1.NIM);
        System.out.println("Program Studi : " + mhs1.prodi);

        

    }
}
