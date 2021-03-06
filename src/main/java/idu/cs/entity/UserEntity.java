package idu.cs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import idu.cs.domain.User;

@Entity
@Table(name = "user") // 테이블 이름 지정 안쓰면 클래스 이름으로 설정 
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	// database에서 sequence number, primary key 역할
	@Column(nullable=false, length=20, unique=true)
	private String userId;
	@Column(nullable=false) //비밀번호 필수
	private String userPw;
	private String name;
	private String company;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId)                                                                        {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userId=" + userId + ", userPw=" + userPw + ", name=" + name + ", company="
				+ company + "]";
	}
	
	public User buildDomain() { // Entity -> Domain 데이터 가져올때
		User user = new User();
		user.setId(id);
		user.setUserId(userId);
		user.setUserPw(userPw);
		user.setName(name);
		user.setCompany(company);
		return user;
	}
	
	public void buildEntity(User user) { // Domain -> Entity 데이터를 넣을때: 추가/수정
		id = user.getId();
		userId = user.getUserId();
		userPw = user.getUserPw();
		name = user.getName();
		company = user.getCompany();
	}
}
