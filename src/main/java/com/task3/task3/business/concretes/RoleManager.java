package com.task3.task3.business.concretes;

import com.task3.task3.business.abstracts.RoleService;
import com.task3.task3.dataAccess.abstracts.RoleDao;
import com.task3.task3.entities.concretes.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleManager implements RoleService {

    private final RoleDao roleDao;

    public RoleManager(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> getAll() {
        return roleDao.findAll();
    }
}