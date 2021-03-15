/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clases.poo.ito;

import java.time.LocalDate;

import Clases.poo.ito.ViajesRealizados;

public class vehiculo {
	
	


	private String Marca = "";
	
	private int Modelo = 0;
	
	private float CargaMax = 0F;


	private java.time.LocalDate FechaAdquisicion = null;


	private ViajesRealizados ViajesRealizados = null;


	public vehiculo() {
		
		super();
		
	}
	public vehiculo(String marca, int modelo, float cargaMax, LocalDate fechaAdquisicion,
			Clases.poo.ito.ViajesRealizados viajesRealizados) {
		super();
		Marca = marca;
		Modelo = modelo;
		CargaMax = cargaMax;
		FechaAdquisicion = fechaAdquisicion;
		ViajesRealizados = viajesRealizados;
	}


	public Boolean Contratacion(float Carga) {
		Boolean Contratacion = Boolean.FALSE;
		if(Carga<=this.getCargaMax()) {
			Contratacion=true;
			System.out.println("Tu pedido se ha realizado con éxito!");
		}
		else
			System.out.println("La carga sobrepasa la capacidad del vehiculo");
		
		return Contratacion;
		
	}


	public String getMarca() {
		return this.Marca;
	}


	public void setMarca(String newMarca) {
		this.Marca = newMarca;
	}


	public int getModelo() {
		return this.Modelo;
	}


	public void setModelo(int newModelo) {
		this.Modelo = newModelo;
	}


	public float getCargaMax() {
		return this.CargaMax;
	}


	public void setCargaMax(float newCargaMax) {
		this.CargaMax = newCargaMax;
	}


	public LocalDate getFechaAdquisicion() {
		return this.FechaAdquisicion;
	}


	public void setFechaAdquisicion(LocalDate newFechaAdquisicion) {
		this.FechaAdquisicion = newFechaAdquisicion;
	}


	public ViajesRealizados getViajesRealizados() {
		return this.ViajesRealizados;
	}


	public void setViajesRealizados(ViajesRealizados newViajesRealizados) {
		this.ViajesRealizados = newViajesRealizados;
	}
	@Override
	public String toString() {
		return "vehiculo [Marca=" + Marca + ", Modelo=" + Modelo + ", CargaMax=" + CargaMax + "Kg, FechaAdquisicion="
				+ FechaAdquisicion + ", ViajesRealizados=" + ViajesRealizados + "]";
	}

}
