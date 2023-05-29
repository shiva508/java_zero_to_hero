package com.pool.arrays;

import java.util.Arrays;

public class fill {
    public static void main(String[] args) {
        String[] array = new String[10];
        Arrays.fill(array,"Batman");
        String joinData=String.join("\n", array);
        System.out.println(joinData);
    }
}
