package com.example.demo.bas.service.impl;

import com.example.demo.bas.entity.Role;
import com.example.demo.bas.mapper.RoleMapper;
import com.example.demo.bas.service.RoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

}
