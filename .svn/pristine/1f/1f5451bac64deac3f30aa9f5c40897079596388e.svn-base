package com.qst.service;

import com.qst.entity.User;
import com.qst.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 凯
 * @date 2022/9/5 - 19:33
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String getNameByNameAndPwd(User user) {
        return userMapper.getNameByNameAndPwd(user);
    }
}
