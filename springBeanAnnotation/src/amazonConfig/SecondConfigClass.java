package amazonConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import amazonProduct.Product;
import amazonUser.Users;

@Configuration
public class SecondConfigClass {

	@Bean(name="p3")
	public Product getProduct2() {
		Product product = new Product();
		product.setProductName("HardDisk");
		product.setQuantity(1);
		product.setPrice(5000);
		return product;
	}
	
	@Bean(name="u3")
	public Users amazonUser1() {
		Users user = new Users();
		user.setUserName("Tushar Patidar");
		user.setMobileNumber("9174600000");
		return user;
	}
}
