/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolio.lgc.Security.Repository;

import com.miportfolio.lgc.Security.Entity.Rol;
import com.miportfolio.lgc.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Object>{
    Optional <Rol> findByRolNombre(RolNombre rolNombre);
    
}
