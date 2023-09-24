package com.dubuyin.qyoj.service;

import javax.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 用户服务测试
 *
 * @author <a href="https://github.com/lidubuyin">程序员鱼皮</a>
 * @from <a href="https://dubuyin.icu">编程导航知识星球</a>
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void userRegister() {
        String userAccount = "dubuyin";
        String userPassword = "";
        String checkPassword = "123456";
        String userName = "dubuyin";
        try {
            long result = userService.userRegister(userAccount, userPassword, checkPassword, userName);
            Assertions.assertEquals(-1, result);
            userAccount = "yu";
            result = userService.userRegister(userAccount, userPassword, checkPassword, userName);
            Assertions.assertEquals(-1, result);
        } catch (Exception e) {

        }
    }
}
