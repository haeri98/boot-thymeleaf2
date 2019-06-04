package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import idu.cs.entity.UserEntity;

public interface UserRepository 
	extends JpaRepository<UserEntity, Long> {
	// User findById(Id); 만들어져 있음
	UserEntity findByUserId(String userId); // id: 자동 증가번호, userId: 회원가입 아이디 find:select, by:where
		//select where Entity의 필드 이름
	List<UserEntity> findByName(String name);
	List<UserEntity> findByNameOrderByIdAsc(String name); //oderby: oder by
	List<UserEntity> findByCompany(String company);
}
