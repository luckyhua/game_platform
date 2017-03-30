package com.liegou.platform.controller;

import com.liegou.platform.domain.UserInfo;
import com.liegou.platform.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(
            value="获取用户列表",
            notes="获取用户信息列表",
            responseContainer = "List",
            response = UserInfo.class
    )
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<UserInfo> getUserList() {
        return userInfoService.list();
    }

    @ApiOperation(value = "删除用户信息", notes = "根据id删除用户信息",  response = Boolean.class)
    @RequestMapping(value = "{ids}", method = RequestMethod.DELETE)
    public Boolean remove(@ApiParam(value = "用户信息ids,长度是", required = true) @PathVariable Long ids) {
        return userInfoService.remove(ids);
    }

}