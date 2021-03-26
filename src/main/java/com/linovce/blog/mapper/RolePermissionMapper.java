package com.linovce.blog.mapper;

import com.linovce.blog.entity.RolePermission;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: com.linovce.blog.mapper.RolePermission
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: linry_t
 * @date: 2021/3/26 15:28
 */

@Repository
public interface RolePermissionMapper {
    List<RolePermission> selectAll();
    RolePermission selectById(int id);
}
