package jpql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductOperations {

	@Autowired
	ProductRepository repo;
	
	public void getData() {
		for ( Product i : repo.findAll()) {
			System.out.println(i.getProductName());
		}
		
	}
}
