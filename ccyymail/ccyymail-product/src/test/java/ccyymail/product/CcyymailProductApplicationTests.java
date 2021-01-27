package ccyymail.product;

import ccyymail.product.entity.BrandEntity;
import ccyymail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CcyymailProductApplicationTests {
	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();

		brandEntity.setName("huawei");
		brandService.save(brandEntity);
		System.out.println("success");
	}

}
