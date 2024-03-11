package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Lion implements Animal {
	
	@Autowired
	private Animal animal;
	
	public void AnimalName() {
		System.out.println("It's a Lion");		
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
