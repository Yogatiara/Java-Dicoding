package com.dicoding.javafundamental.OOP1.object;

public class Main {
    public static void main(String[] args) {
        // menciptakan object dengan nama 'objekHewan'
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();

        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();

    }
}
