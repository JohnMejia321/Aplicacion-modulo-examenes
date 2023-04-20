package com.sistemas.examenes;

import com.sistemas.examenes.entidades.Rol;
import com.sistemas.examenes.entidades.Usuario;
import com.sistemas.examenes.entidades.UsuarioRol;
import com.sistemas.examenes.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



			Usuario usuario = new Usuario();
			usuario.setNombre("Alex");
			usuario.setApellido("Soto");
			usuario.setUserName("alex");
			usuario.setPassword("12345");
			usuario.setEmail("alex@gmail.com");
			usuario.setTelefono("988212020");
			usuario.setPerfil("foto.png");
			Rol rol = new Rol();
			rol.setRolId(2L);
			rol.setRolNombre("NORMAL");
			Set<UsuarioRol> usuariosRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuariosRoles.add(usuarioRol);
			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuariosRoles);



	}
}
