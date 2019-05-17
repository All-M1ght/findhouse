package com.findhouse.repository;

import com.findhouse.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 角色数据DAO
 */
public interface RoleRepository extends CrudRepository<Role,Long> {
    List<Role> findRolesByUserId(Long userId);
}
