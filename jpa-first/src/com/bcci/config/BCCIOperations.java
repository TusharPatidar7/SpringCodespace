package com.bcci.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BCCIOperations {

	@Autowired
	BCCIRepository repo;
	
	public void setData(Team team) {
		repo.save(team);
		System.out.println("****one record added*****");
	}
	
	public void printData(Integer id) {
		Optional<Team> team = repo.findById(id);
		System.out.println(team.get().getCaptain());
//		System.out.println("Team Captain : "+team.getCaptain());
//		System.out.println("Team wins : "+team.getTrophies());
//		System.out.println("Year : "+team.getYears());
	}
	
	public void removeData(int id) {
//		repo.deleteById(id);
		List ids = new ArrayList();
		ids.add(1);
		ids.add(2);
		
		repo.deleteAllById(ids);
		System.out.println("**** record deleted*****");
	}
	
	public void displayAll() {
		
//		List<Team> list = repo.findAll();
//		
//		List evenList = list.stream().filter(o -> o.getId()%2==0).toList();
//		
//		evenList.forEach(o->{
//			System.out.println(((Team) o).getId()+" "+((Team) o).getCaptain());
//			});
		
		repo.findAll().forEach(o->{
			System.out.println(o.getId()+" "+o.getCaptain()+" "+o.getTrophies()+" "+o.getYears());
		});
	}
}
