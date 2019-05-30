package idu.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 다양한 어노테이션을 합쳐놓은 기능을 갖고 있다.
// @EnableAutoConfiguration(execlude = {DataSourceAutoConfiguration.class})
// h2는 오토로 가능, jpa 오토 불가능
public class BootThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootThymeleafApplication.class, args);
	}

}
