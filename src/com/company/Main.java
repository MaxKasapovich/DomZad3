package com.company;

public class Main {

    public static void main(String[] args) {
        Primitives part1 = new Primitives();
        part1.b = 120;
        part1.s = 31767;
        part1.i1 = 1234567890;
        part1.l = 999999999999L;
        part1.f = 15.666f;
        part1.d1 = 2535868.6764453;
        part1.c0 = 928;
        part1.bool = false;

        part1.printP1Info();

        Dividers part2 = new Dividers();

        part2.i2 = 10_000_000;
        part2.d2 = 100.066_123_455;
        part2.d3 = 15_500_088.443_311_220_1;

        part2.printP2Info();

        Chars part3 = new Chars();
        part3.c1 = 169;
        part3.c2 = 181;
        part3.c3 = 174;

        part3.printP3Info();

     }
    }

