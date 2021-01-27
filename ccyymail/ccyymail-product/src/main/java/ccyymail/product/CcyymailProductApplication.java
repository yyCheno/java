package ccyymail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("ccyymail.product.dao")
@SpringBootApplication
public class CcyymailProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcyymailProductApplication.class, args);
	}

}
