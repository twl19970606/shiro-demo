package com.example.demo.bas.service.impl;

import com.example.demo.bas.entity.Permissions;
import com.example.demo.bas.mapper.PermissionsMapper;
import com.example.demo.bas.service.PermissionsService;
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
public class PermissionsServiceImpl extends ServiceImpl<PermissionsMapper, Permissions> implements PermissionsService {

    @Autowired
    private PermissionsMapper permissionsMapper;

}
