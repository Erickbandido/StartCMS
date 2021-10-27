package com.cursos.startcms.model;


import java.util.Date;

import lombok.Data;;

@Data
public class Categoria {
	private long idCategoria;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private long categoriaSuperior;
	
}
