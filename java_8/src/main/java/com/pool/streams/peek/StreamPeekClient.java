package com.pool.streams.peek;

import com.pool.Role;
import com.pool.StreamUtil;
import java.util.List;

public class StreamPeekClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        var roleStream = roles.stream().peek(System.out::println).peek(role -> role.setRoleName("ROLE_" + role.getRoleName())).peek(System.out::println);
    }
}
