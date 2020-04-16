package com.example.demo.config;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.demo.bas.entity.User;
import com.example.demo.bas.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName CustomRealm
 * @Author tang
 * @Date 2020/4/10 0010 上午 10:00
 * @Version 1.0
 */
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> stringSet = new HashSet<>();
        stringSet.add("user:show");
        stringSet.add("user:admin");
        info.setStringPermissions(stringSet);
        return info;
    }

    /**
     * 身份认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("-------身份认证方法--------");
        String userName = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());

        if (StringUtils.isNotBlank(userName)) {
            throw new AccountException("用户名不可为空");
        }

        User user = userService.getByName(userName);
        if (user == null) {
            return null;
        }
//        if (user.getState() == 1) { //账户冻结
//            throw new LockedAccountException();
//        }

        return new SimpleAuthenticationInfo(userName,user.getPassword(),getName());
    }
}
