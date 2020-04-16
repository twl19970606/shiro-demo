package com.example.demo.bas.service;

import com.example.demo.bas.entity.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tang
 * @since 2020-04-10
 */
public interface UserRoleService extends IService<UserRole> {

    /**
     * 查询用户关联权限
     * @param userId
     * @return
     */
    UserRole getByUserId(Long userId);

}
