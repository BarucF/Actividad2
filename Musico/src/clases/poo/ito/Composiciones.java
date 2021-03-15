/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.poo.ito;
import java.util.HashSet;
import java.time.LocalDate;

public class Composiciones {

	


	private String Titulo = "";
	private String Duracion = "";
	private HashSet<String> InterpretesSolicitados = new HashSet<String>();
	private String Genero = "";
	private LocalDate Fecharegistro = null;
	private LocalDate FechaEstreno = null;
	
	public Composiciones() {

		super();

	}
	public Composiciones(String titulo, String duracion,  String genero,
			LocalDate fecharegistro, LocalDate fechaEstreno) {
		super();
		Titulo = titulo;
		Duracion = duracion;
		Genero = genero;
		Fecharegistro = fecharegistro;
		FechaEstreno = fechaEstreno;
	}


	public void AgregarInterprete(String Intreprete) {
		this.InterpretesSolicitados.add(Intreprete);
		System.out.println("Interpretes:"+this.getInterpretesSolicitados());
	}



	public String getTitulo() {
		return this.Titulo;
	}


	public void setTitulo(String newTitulo) {
		this.Titulo = newTitulo;
	}


	public String getDuracion() {
		return this.Duracion;
	}

	public void setDuracion(String newDuracion) {
		this.Duracion = newDuracion;
	}


	public HashSet<String> getInterpretesSolicitados() {
		return this.InterpretesSolicitados;
	}


	public String getGenero() {
		return this.Genero;
	}


	public void setGenero(String newGenero) {
		this.Genero = newGenero;
	}


	public LocalDate getFecharegistro() {
		return this.Fecharegistro;
	}


	public void setFecharegistro(LocalDate newFecharegistro) {
		this.Fecharegistro = newFecharegistro;
	}


	public LocalDate getFechaEstreno() {
		return this.FechaEstreno;
	}


	public void setFechaEstreno(LocalDate newFechaEstreno) {
		this.FechaEstreno = newFechaEstreno;
	}


	@Override
	public String toString() {
		return "Composiciones [Titulo=" + Titulo + ", Duracion=" + Duracion + ", Genero=" + Genero + ""
				+ ", Fecharegistro=" + Fecharegistro + ", FechaEstreno="
				+ FechaEstreno + "]";
	}

}
