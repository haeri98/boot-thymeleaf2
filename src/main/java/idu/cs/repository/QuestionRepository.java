package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import idu.cs.entity.QuestionEntity;

public interface QuestionRepository 
	extends JpaRepository<QuestionEntity, Long> {
	/*
	QuestionEntity findByUserId(String userId); // id: 자동 증가번호, userId: 회원가입 아이디 find:select, by:where
		//select where Entity의 필드 이름
	List<QuestionEntity> findByName(String name);
	List<QuestionEntity> findByNameOrderByIdAsc(String name); //oderby: oder by
	List<QuestionEntity> findByCompany(String company);
	*/
}
