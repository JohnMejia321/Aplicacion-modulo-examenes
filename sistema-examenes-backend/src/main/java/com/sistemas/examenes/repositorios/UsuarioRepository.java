package com.sistemas.examenes.repositorios;

import com.sistemas.examenes.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUserName(String userName);
}
