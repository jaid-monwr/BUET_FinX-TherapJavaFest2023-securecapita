package jaid.securecapita.service;

import jaid.securecapita.domain.Role;

import java.util.Collection;

public interface RoleService {
    Role getRoleByUserId(Long id);
    Collection<Role> getRoles();
}
