package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import idu.cs.domain.User;

public interface UserRepository 
	extends JpaRepository<User, Long> {
	// User findById(Id); 만들어져 있음
	User findByUserId(String userId); // id: 자동 증가번호, userId: 회원가입 아이디 find:select, by:where
	List<User> findByName(String name);
	List<User> findByNameOrderByIdAsc(String name); //oderby: oder by
	List<User> findByCompany(String company);
}
