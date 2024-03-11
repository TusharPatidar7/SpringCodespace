package sorting;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
public class OrderData {
	
	@Autowired
	OrderRepository repo;
	
	public void getData() {
		List<Order> list = repo.findAll(Sort.by(Direction.DESC,"city")); 
		for (Order obj : list) {
			System.out.println(obj.getOrder_id()+","+obj.getCity());
		}
	}
	
	public void getFirstPage() {
		Pageable page = Pageable.ofSize(3);
		List<Order> order = repo.findAll(page).getContent();
		order.stream().forEach(System.out::println);;
	}
	
	public void getSecondPage(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		List<Order> order = repo.findAll(pageable).getContent();
		order.stream().forEach(System.out::println);;
	}
	
}
