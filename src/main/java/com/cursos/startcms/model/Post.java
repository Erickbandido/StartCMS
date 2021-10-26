package com.cursos.startcms.model;

import lombok.Data;

@Data
public class Post {
	
	private long idPost;
	private String titulo;
	private String slug;
	private String extracto;
	private String imagenDestacada;
	private String tipo;
	private long idCategoria;
	private long idUsuario;
	
}
