package com.cursos.startcms.model;

import lombok.Data;

@Data
public class Usuario {
	private long idUsuario;
	private String nombre;
	private String apellido;
	private String contrasenia;
	private String correo;
	private long idGrupo;
	
}
