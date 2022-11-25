package com.my.service.impl;

import com.my.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Gzy
 * @version 1.0
 * @Description
 */
@Service
public class UserServiceImpl  implements UserService{


    @Override
    public String hihi() {
        return "HIHI";
    }
}
