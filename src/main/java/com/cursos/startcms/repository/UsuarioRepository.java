package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Usuario;

@Repository
public class UsuarioRepository implements UsuarioRepInterface{

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Usuario object) {
		try {
			String sql = String.format("insert into usuario "
					+ "(nombre,apellido,contrasenia,correo,idGrupo) "
					+ "values('%s','%s','%s','%s','%d')",
					object.getNombre(),
					object.getApellido(),
					object.getContrasenia(),
					object.getCorreo(),
					object.getIdGrupo());
			jdbcTemplate.execute(sql);
			return true;}
			catch (Exception e){
				
				return false;
			}
	}

	@Override
	public boolean update(Usuario object) {
		if (object.getIdUsuario()!=0) {
			return false;
		}
		try {
		String sql = String.format("update usuario_metadata "
				+ "set nombre='%s', "
				+ "apellido='%s', "
				+ "contrasenia='%s', "
				+ "correo='%s', "
				+ "idGrupo='%d'"
				+ "where idUsuario='%d'", 
				object.getNombre(),
				object.getApellido(),
				object.getContrasenia(),
				object.getCorreo(),
				object.getIdGrupo(),
				object.getIdUsuario());
		jdbcTemplate.execute(sql);
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
