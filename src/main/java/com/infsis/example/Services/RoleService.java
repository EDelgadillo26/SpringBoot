package com.infsis.example.Services;

import com.infsis.example.DTOs.RoleDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface RoleService {

    /*
    Lista de servicios que serán implementados es decir
    aqui van los métodos que proporcionaran la funcionalidad a nuestra aplicación
    */
    Optional<RoleDTO> getRoleById(Integer roleId);

    RoleDTO saveRole(RoleDTO roleDTO);

    RoleDTO updateRole(Integer roleId, RoleDTO roleDTO);
    void delete(Integer roleId);
}
