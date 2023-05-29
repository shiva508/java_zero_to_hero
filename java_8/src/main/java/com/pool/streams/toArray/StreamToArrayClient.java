package com.pool.streams.toArray;

import com.pool.Role;
import com.pool.StreamUtil;
import java.util.Arrays;
import java.util.List;

public class StreamToArrayClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        var toArray = roles.stream().map(Role::getRoleName).toArray();
        System.out.println(Arrays.toString(toArray));

        var toArrayStr = roles.stream().map(Role::getRoleName).toArray(String[]::new);
        System.out.println(Arrays.toString(toArrayStr));
    }
}
