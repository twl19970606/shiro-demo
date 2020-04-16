package com.example.demo.bas.service.impl;

import com.example.demo.bas.entity.RolePermissions;
import com.example.demo.bas.mapper.RolePermissionsMapper;
import com.example.demo.bas.service.RolePermissionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tang
 * @since 2020-04-10
 */
@Service
public class RolePermissionsServiceImpl extends ServiceImpl<RolePermissionsMapper, RolePermissions> implements RolePermissionsService {

    @Autowired
    private RolePermissionsMapper rolePermissionsMapper;

    @Override
    public List<RolePermissions> list(Long roleId){
        return super.query().eq("roleId",roleId).list();
    }
}
