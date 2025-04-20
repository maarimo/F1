package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Bet;
import model.entities.Driver;
import model.entities.Race;
import model.entities.enums.Scuderia;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Driver> driver = new ArrayList<>();
		System.out.println("Seja bem vindo ao simulador de corrida!!");
		System.out.print("Quantas pessoas vão correr: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Nome do #" + i + " piloto: ");
			
			String name = sc.nextLine();
			System.out.println("Qual a Scuderia? ");
			System.out.println("(MERCEDES - REDBULL- FERRARI - MCLAREN)");
			Scuderia scuderia = Scuderia.valueOf(sc.nextLine().toUpperCase());
			driver.add(new Driver(name, scuderia));
		}
		
		System.out.println();
		System.out.println("Quem vai vencer? ");
		String win = sc.nextLine();
		Bet bet = new Bet(win);
		
		
		Race init = new Race();
		init.correr(driver);
		
		
		init.result(driver);
		
		System.out.println("Primeira posição: " + driver.get(0));
		System.out.println();
		
		bet.result(driver);

		
		
		sc.close();
	}

}
