package com.pool.streams.limit;

import com.pool.Role;
import com.pool.StreamUtil;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        var limit = roles.stream().limit(2).collect(Collectors.toList());
        System.out.println(limit);
    }
}
