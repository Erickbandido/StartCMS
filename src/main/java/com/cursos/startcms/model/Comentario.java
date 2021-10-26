package com.cursos.startcms.model;

import java.util.Date;

import lombok.Data;

@Data
public class Comentario {
	private long idComentario;
	private String comentario;
	private long idPost;
	private long idUsuario;
	private Date fecha;
	private String Respuesta;
}
