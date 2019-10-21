package com.yp.service;

import com.yp.entity.User;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author yangpeng
 */
public interface UserService {

    //校验用户名是否可用
    void checkUsername(String username);
    //注册接口
    void register(User user);

    //执行登录
    User login(String username,String password);

    //根据用户名查询用户信息
    User findByUsername(String username);

    //根据用户名查询角色信息
    Set<String> findRoleNamesByUsername(String username);

    //根据角色信息查询权限信息
    Set<String> findPermissionsByRoleNames(Set<String> roleNames);

    //    4. 查询过滤器链信息
    LinkedHashMap<String, String> findFilterChainsMap();

}
