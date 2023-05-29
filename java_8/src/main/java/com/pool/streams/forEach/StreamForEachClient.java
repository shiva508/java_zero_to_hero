package com.pool.streams.forEach;

import com.pool.version8.streams.util.Role;
import com.pool.version8.streams.util.StreamUtil;

import java.util.List;

public class StreamForEachClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        roles.stream().forEach(System.out::println);
    }
}
