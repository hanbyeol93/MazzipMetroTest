package com.go.mazzipmetro.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BossDAO implements IDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
}
