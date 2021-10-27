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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PostMetadata object) {
		// TODO Auto-generated method stub
		return false;
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
