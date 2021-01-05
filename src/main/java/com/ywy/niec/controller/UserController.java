package com.ywy.niec.controller;

import com.ywy.niec.entity.User;

import com.ywy.niec.service.UserService;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * (User)表控制层
 *
 * @author niechen
 * @date 2021-01-05 16:48:27
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "添加用户")
    @PostMapping(value = "/add")
    public User selectOne(Long id) {
        return this.userService.queryById(id);
    }

}