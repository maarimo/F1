package model.entities;

import java.util.List;

public class Bet {
	private String win;
	
	public Bet(String win) {
		this.win = win;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}



	public void result(List<Driver> driver) {
		if (driver.get(0).getName().equals(win)) {
		    System.out.println("Você acertou!!");
		} else {
		    System.out.println("Você errou :(");
		}
	}
}
