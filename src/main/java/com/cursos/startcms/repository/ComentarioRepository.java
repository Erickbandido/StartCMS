package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Comentario;

@Repository
public class ComentarioRepository implements ComentarioRepInterface{
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Comentario object) {
		try {
			String sql = String.format("insert into comentario "
					+ "(comentario, idPost, idUsuario,respuesta) "
					+ "values('%s','%d','%d','%s')",
					object.getComentario(),
					object.getIdPost(),
					object.getIdUsuario(),
					object.getRespuesta());
			jdbcTemplate.execute(sql);
			return true;}
			catch (Exception e){
				
				return false;
			}
	}

	@Override
	public boolean update(Comentario object) {
		if (object.getIdComentario()!=0) {
			return false;
		}
		try {
		String sql = String.format("update comentario "
				+ "set comentario='%s', "
				+ "idPost='%d', "
				+ "idUsuario='%d', "
				+ "respuesta='%s'"
				+ "where idComentario='%d'", 
				object.getComentario(),
				object.getIdPost(),
				object.getIdUsuario(),
				object.getRespuesta(),
				object.getIdComentario());
		jdbcTemplate.execute(sql);
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Comentario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comentario findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
