package com.polovyi.ivan.tutorials;

import java.util.Arrays;

public class EnumPolymorphismPattern {

    public static void main(String[] args) {

        System.out.println("===VISA===");
        Arrays.stream(VisaCardType.values()).forEach(System.out::println);

        System.out.println("===MASTERCARD===");
        Arrays.stream(MasterCardType.values()).forEach(System.out::println);
    }
}
