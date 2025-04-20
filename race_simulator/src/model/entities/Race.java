package model.entities;

import java.util.Collections;
import java.util.List;

public class Race{
	
	public void correr(List<Driver> driver) {
		Collections.shuffle((List<?>) driver);
	}

	public void result(List<Driver> driver) {
		
		System.out.println("Resultado da Corrida: ");
		
		for (int i = 0; i < driver.size(); i++) {
            System.out.println((i + 1) + "º lugar: " + driver.get(i));
        }
	}
	
	
	
	
	
	
}
