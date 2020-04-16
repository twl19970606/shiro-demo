package com.example.demo.bas.service;

import com.example.demo.bas.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.bas.entity.UserRole;
import com.example.demo.bas.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tang
 * @since 2020-04-10
 */
public interface UserService extends IService<User> {

    /**
     * 根据账号查询用户
     * @param name
     * @return
     */
    User getByName(String name);

    /**
     * 获取用户权限
     * @param userId
     * @return
     */
    Set<String> getPermissions(Long userId);

}
