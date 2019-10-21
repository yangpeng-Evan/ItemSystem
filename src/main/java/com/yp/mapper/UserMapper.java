package com.yp.mapper;

import com.yp.entity.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yangpeng
 */
public interface UserMapper extends Mapper<User> {

    //  根据用户名查询角色信息
    Set<String> findRoleNamesByUsername(@Param("username") String username);

    //根据角色信息查询权限信息
    Set<String> findPermissionsByRoleNames(@Param("map") Map<String, Object> map);

    // 3. 查询过滤器链信息.
    LinkedHashMap<String, String> findFilterChainsMap();
}
