package com.example.demo.bas.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bas.entity.Permissions;
import com.example.demo.bas.entity.RolePermissions;
import com.example.demo.bas.entity.User;
import com.example.demo.bas.entity.UserRole;
import com.example.demo.bas.mapper.UserMapper;
import com.example.demo.bas.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tang
 * @since 2020-04-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionsService permissionsService;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private RolePermissionsService rolePermissionsService;

    @Override
    public User getByName(String name){
        User user = super.query().eq("name", name).one();
        return user;
    }

    @Override
    public Set<String> getPermissions(Long userId){
        UserRole userRole = userRoleService.getByUserId(userId);
        Long roleId = userRole.getRoleId();
        List<RolePermissions> rolePermissionsList = rolePermissionsService.list(roleId);

        Set<String> set = new HashSet<>();
        if(rolePermissionsList.size()>0){
            for (RolePermissions rolePermissions:rolePermissionsList) {
                Long permissionsId = rolePermissions.getPermissionsId();
                Permissions permissions = permissionsService.getById(permissionsId);
                set.add(permissions.getName());
            }
        }
        return set;
    }

}
