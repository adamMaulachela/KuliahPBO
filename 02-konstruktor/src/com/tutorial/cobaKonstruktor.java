package com.tutorial;

class Mahasiswa {
    // Data Member/ciri/atribut
    String nama;
    String nim;
    String prodi;

    // Membuat Konstruktor tanpa parameter
    // Mahasiswa(){
    //     System.out.println("Ini adalah konstruktor");
    // }

    // membuat konstruktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputProdi){
        nama = inputNama;
        nim = inputNIM;
        prodi = inputProdi;

        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
    }
}


public class cobaKonstruktor {
    public static void main(String[] args) {
        // instansiasi objek / penciptaan objek
        Mahasiswa mhs1 = new Mahasiswa("Ucup", "0708078505", "PTI");

        Mahasiswa mhs2 = new Mahasiswa("Fahmi", "20222002", "PTI");
    }
}
