package com.sistemas.examenes.servicios;

import com.sistemas.examenes.entidades.Usuario;
import com.sistemas.examenes.entidades.UsuarioRol;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String userName);

    public void eliminarUsuario(Long usuarioId);

    public List<Usuario> obtenerUsuarios();
}
