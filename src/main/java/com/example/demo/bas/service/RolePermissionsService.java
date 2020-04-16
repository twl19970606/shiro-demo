package com.example.demo.bas.service;

import com.example.demo.bas.entity.RolePermissions;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tang
 * @since 2020-04-10
 */
public interface RolePermissionsService extends IService<RolePermissions> {

    /**
     *  获取角色关联的权限
     */
    List<RolePermissions> list(Long roleId);

}
