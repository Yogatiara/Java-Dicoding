package com.dicoding.javafundamental.OOP1.accesmodifier.package2;

import com.dicoding.javafundamental.OOP1.accesmodifier.package1.KelasA;
public class KelasB extends KelasA{
    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }

}
