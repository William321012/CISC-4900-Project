package com.example.store.service;

import com.example.store.mapper.CustomerMapper;
import com.example.store.pojo.Customer;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Resource
    private IUserService userService;

    @Test
    public void registration1(){
        Customer customer = new Customer();
        customer.setUsername("sb2");
        customer.setPassword("sb2");
        userService.registration(customer);
    }

    @Test
    public void login1(){
        Customer customer = new Customer();
        customer.setUsername("sb2");
        customer.setPassword("sb2");
        userService.login(customer);
    }

    @Test
    public void avatar(){
        userService.updateAvatar(4,"/sb.png","sb2");
    }
}
