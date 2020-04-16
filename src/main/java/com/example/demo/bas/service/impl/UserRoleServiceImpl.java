package com.example.demo.bas.service.impl;

import com.example.demo.bas.entity.UserRole;
import com.example.demo.bas.mapper.UserRoleMapper;
import com.example.demo.bas.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tang
 * @since 2020-04-10
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserRole getByUserId(Long userId){
        return super.query().eq("userId",userId).one();
    }

}
