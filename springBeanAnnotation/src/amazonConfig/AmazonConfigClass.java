package amazonConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import amazonProduct.Product;
import amazonUser.Users;

@Configuration
public class AmazonConfigClass {

	@Bean(name = "p1")
	public Product getProduct() {
		Product product = new Product();
		product.setProductName("Boat Airdopes170");
		product.setQuantity(2);
		product.setPrice(1000);
		return product;
	}
	
	@Bean
	public Product getProduct2() {
		Product product = new Product();
		product.setProductName("Samsung TV");
		product.setQuantity(2);
		product.setPrice(55000);
		return product;
	}
	
	@Bean(name="u1")
	public Users amazonUser1() {
		Users user = new Users();
		user.setUserName("Raja Singh Goud");
		user.setMobileNumber("9007254343");
		return user;
	}
	
	@Bean
	public Users amazonUser2() {
		Users user = new Users();
		user.setUserName("Yashraj Patel");
		user.setMobileNumber("8807254343");
		return user;
	}
}
