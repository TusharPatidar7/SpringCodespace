package com.jpa.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface OrderRepository extends JpaRepository<Orders, Long>{

	//Custom Method
	
	public List<Orders> findByCity(String city);

	@Query(value="select * from orders where city=?", nativeQuery = true)
	List<Orders> getDataWithCity( String city);
	
	@Modifying
	@Transactional
	@Query(value="insert into orders values(:orderId,:city,:name,:count,:price,:state)", nativeQuery=true)
	void addData(@Param("name")String name, @Param("orderId")int id, @Param("city")String city, @Param("count")int count, @Param("price")int price,@Param("state")String state);
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM ORDERS WHERE state=:state", nativeQuery=true)
	void removeDataByState(@Param("state")String state);
}
