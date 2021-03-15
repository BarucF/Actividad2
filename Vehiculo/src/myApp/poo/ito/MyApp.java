package myApp.poo.ito;
import java.time.LocalDate;
import Clases.poo.ito.vehiculo;
import Clases.poo.ito.ViajesRealizados;
public class MyApp {

	public static void run() {
		vehiculo v=new vehiculo("Ford",2001,950F,LocalDate.of(2007, 4, 15),
				new ViajesRealizados("Orizaba\n","Norte 8 #12",LocalDate.of(2018, 6, 25),LocalDate.of(2018, 7, 13),"Cemento",1550.13F));
		System.out.println(v);
		System.out.println(v.Contratacion(1000F));
		System.out.println(v.Contratacion(800F));
	}
	public static void main(String[] args) {
		run();
	}

}
