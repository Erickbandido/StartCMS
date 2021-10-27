package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Post;

@Repository
public class PostRepository implements PostRepInterface{

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Post object) {
		try {
			String sql = String.format("insert into post "
					+ "(titulo,slug,extracto,imagenDestacada,tipo,idCategoria,idUsuario) "
					+ "values('%s','%s','%s','%s','%s','%d','%d')",
					object.getTitulo(),
					object.getSlug(),
					object.getExtracto(),
					object.getImagenDestacada(),
					object.getTipo(),
					object.getIdCategoria(),
					object.getIdUsuario());
			jdbcTemplate.execute(sql);
			return true;}
			catch (Exception e){
				
				return false;
			}
	}

	@Override
	public boolean update(Post object) {
		if (object.getIdPost()!=0) {
			return false;
		}
		try {
		String sql = String.format("update post "
				+ "set titulo='%s', "
				+ "slug='%s', "
				+ "extracto='%s', "
				+ "imagenDestacada='%s', "
				+ "tipo='%s',"
				+ "idCategoria ='%d', "
				+ "idUsuario = '%d' "
				+ "where idPost='%d'", 
				object.getTitulo(),
				object.getSlug(),
				object.getExtracto(),
				object.getImagenDestacada(),
				object.getTipo(),
				object.getIdCategoria(),
				object.getIdUsuario(),
				object.getIdPost());
		jdbcTemplate.execute(sql);
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Post> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
