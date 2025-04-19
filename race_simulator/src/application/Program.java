package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Driver;
import model.entities.enums.Scuderia;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Driver> driver = new ArrayList<>();
		
		for(int i=1; i<=2; i++) {
			System.out.print("#" +i+ " Nome: ");
			
			String name = sc.nextLine();
			System.out.print("Scuderia: ");
			Scuderia scuderia = Scuderia.valueOf(sc.nextLine().toUpperCase());
			driver.add(new Driver(name, scuderia));
			
		}
		
		for(Driver d : driver) {
			System.out.println(d);
		}
		
		sc.close();
	}

}
