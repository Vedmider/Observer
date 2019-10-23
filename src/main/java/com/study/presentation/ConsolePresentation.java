package com.study.presentation;

import com.study.domain.Magazine;
import com.study.domain.PostOffice;
import com.study.domain.listeners.PostListener;

public class ConsolePresentation {
    public static void main(String[] args) {
        System.out.println("Program to represent Observer pattern");

        Magazine forbes = new Magazine();
        forbes.getPostOffice().subscribe("newArrival", new PostListener("Kyiv 03148"));
        forbes.getPostOffice().subscribe("newArrival", new PostListener("Kyiv 02045"));
        forbes.getPostOffice().subscribe("newArrival", new PostListener("Kyiv 02308"));
        forbes.getPostOffice().subscribe("newArrival", new PostListener("Kyiv 01138"));
        forbes.produceNewMagazine("/path/to/new/magazine.doc");
    }
}
