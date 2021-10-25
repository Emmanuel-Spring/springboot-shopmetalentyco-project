package com.talentyco.springboot.backend.admin.user.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopme.common.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}