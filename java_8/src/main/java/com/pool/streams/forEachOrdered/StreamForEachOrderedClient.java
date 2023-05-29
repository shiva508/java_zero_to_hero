package com.pool.streams.forEachOrdered;

import com.pool.version8.streams.util.Role;
import com.pool.version8.streams.util.StreamUtil;
import java.util.List;

public class StreamForEachOrderedClient {
    public static void main(String[] args) {
            List<Role> roles= StreamUtil.rolesBuilder();
            roles.stream().forEachOrdered(System.out::println);
    }
}
