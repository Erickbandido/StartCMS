package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.PostMetadata;

@Repository
public class PostMetadataRepository implements PostMetadataRepInterface{

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(PostMetadata object) {
		try {
			String sql = String.format("insert into post_metadata "
					+ "(clave,valor,tipo, idPost) "
					+ "values('%s','%s','%s','%d')",
					object.getClave(),
					object.getValor(),
					object.getTipo(),
					object.getIdPost());
			jdbcTemplate.execute(sql);
			return true;}
			catch (Exception e){
				
				return false;
			}
	}

	@Override
	public boolean update(PostMetadata object) {
		if (object.getIdPostMetadata()!=0) {
			return false;
		}
		try {
		String sql = String.format("update post_metadata "
				+ "set clave='%s', "
				+ "valor='%s', "
				+ "tipo='%s', "
				+ "idPost='%d'"
				+ "where idPostMetadata='%d'", 
				object.getClave(),
				object.getValor(),
				object.getTipo(),
				object.getIdPost(),
				object.getIdPostMetadata());
		jdbcTemplate.execute(sql);
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<PostMetadata> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostMetadata findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
