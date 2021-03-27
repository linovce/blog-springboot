package com.linovce.blog.controller;

import com.linovce.blog.entity.RolePermission;
import com.linovce.blog.mapper.RolePermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: com.linovce.blog.controller.RolePermissionController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: linry_t
 * @date: 2021/3/26 15:34
 */
@Controller
public class RolePermissionController {
    @Autowired
    RolePermissionMapper rolePermissionMapper;

    @RequestMapping("/tt")
    @ResponseBody
    public String updateCategory(RolePermission c) throws Exception {
        List<RolePermission> rolePermission = rolePermissionMapper.selectAll();
        String r = rolePermission.toString();
        return r;
    }
}
