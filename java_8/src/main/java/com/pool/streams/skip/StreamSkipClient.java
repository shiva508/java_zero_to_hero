package com.pool.streams.skip;

import com.pool.Role;
import com.pool.StreamUtil;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSkipClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        var skip = roles.stream().sorted(Comparator.naturalOrder()).skip(2).collect(Collectors.toList());
        System.out.println(skip);
    }
}
