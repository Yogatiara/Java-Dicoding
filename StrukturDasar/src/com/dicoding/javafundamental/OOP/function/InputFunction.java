package com.dicoding.javafundamental.OOP.function;

public class InputFunction {
    public static void main(String[] args) {
        // memanggil fungsi
        hitungLuas(7, 6.5);
    }
    public static void hitungLuas(double panjang, double lebar) {
//        double luas;
        double luas = panjang * lebar;
        System.out.println(luas);
    }

}
