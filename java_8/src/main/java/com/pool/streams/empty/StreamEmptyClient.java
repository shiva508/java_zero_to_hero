package com.pool.streams.empty;

import java.util.stream.Stream;

public class StreamEmptyClient {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        System.out.println(stream.toString());
    }
}
