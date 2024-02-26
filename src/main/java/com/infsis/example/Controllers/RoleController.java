package com.infsis.example.Controllers;

import com.infsis.example.DTOs.RoleDTO;
import com.infsis.example.Models.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    /*
    ResponseEntity<T>
    Extiende de HttpEntity y agrega un HttpStatus (código de estado)

    HttpEntity<T>
    Representa una entidad de solicitud o respuesta HTTP, que consta de encabezados y cuerpo.
    */

    @GetMapping()
    public ResponseEntity<RoleDTO> getRoles(){
        RoleDTO roleDTO=new RoleDTO(1,"roles");
        return ResponseEntity.ok().body(roleDTO);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<RoleDTO> getRole(@PathVariable Integer id){
        RoleDTO roleDTO=new RoleDTO(1,"role");
        return ResponseEntity.ok().body(roleDTO);
    }

    @PostMapping()
    public ResponseEntity<RoleDTO> saveRole(@RequestBody RoleDTO roleDTO){

        return ResponseEntity.ok().body(roleDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoleDTO> updateRole(@PathVariable Integer id,@RequestBody RoleDTO roleDTO){
        return ResponseEntity.ok().body(roleDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id){

    }

}
