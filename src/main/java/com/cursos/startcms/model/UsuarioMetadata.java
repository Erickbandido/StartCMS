package com.cursos.startcms.model;

import lombok.Data;

@Data
public class UsuarioMetadata {
	private long idUsuarioMetadata;
	private String clave;
	private String valor;
	private String tipo;
	private long iUsuario;
}
