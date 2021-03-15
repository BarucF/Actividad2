package myApp.poo.ito;

import java.time.LocalDate;
import clases.poo.ito.Composiciones;

public class MyApp {

	public static void run() {
		Composiciones c = new Composiciones("Tu de que vas", "3:45", "Pop", LocalDate.of(2003, 2, 18),LocalDate.of(2004, 3, 23));
		System.out.println(c);
		c.AgregarInterprete("Franco de vita");
		System.out.println(c);
		c.AgregarInterprete("Aleandro Sanz");
	}

	public static void main(String[] args) {

		run();
	}

}
