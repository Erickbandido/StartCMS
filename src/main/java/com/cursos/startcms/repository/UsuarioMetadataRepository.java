package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.UsuarioMetadata;

@Repository
public class UsuarioMetadataRepository implements UsuarioMetadataRepInterface{

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(UsuarioMetadata object) {
		try {
			String sql = String.format("insert into usuario_metadata "
					+ "(clave,valor,tipo,idUsuario) "
					+ "values('%s','%s','%s','%d')",
					object.getClave(),
					object.getValor(),
					object.getTipo(),
					object.getIdUsuario());
			jdbcTemplate.execute(sql);
			return true;}
			catch (Exception e){
				
				return false;
			}
	}

	@Override
	public boolean update(UsuarioMetadata object) {
		if (object.getIdUsuarioMetadata()!=0) {
			return false;
		}
		try {
		String sql = String.format("update usuario_metadata "
				+ "set clave='%s', "
				+ "valor='%s', "
				+ "tipo='%s', "
				+ "idUsuario='%d' "
				+ "where idUsuarioMetadata='%d'", 
				object.getClave(),
				object.getValor(),
				object.getTipo(),
				object.getIdUsuario(),
				object.getIdUsuarioMetadata());
		jdbcTemplate.execute(sql);
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<UsuarioMetadata> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioMetadata findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
