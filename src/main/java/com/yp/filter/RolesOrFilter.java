package com.yp.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RolesOrFilter extends AuthorizationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
//        1. 获取主体.
        Subject subject = super.getSubject(request, response);
//        2. 获取配置文件内的信息.
        String[] roles = (String[]) mappedValue;
//        3. 非空检验.
        if(roles == null || roles.length == 0) {
            // 直接放行
            return true;
        }
//        4. 循环遍历的方式,满足就返回true.
        for (String role : roles) {
            if(subject.hasRole(role)){
                // 拥有当前角色
                return true;
            }
        }
//        5. return false.
        return false;
    }
}
