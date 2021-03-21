/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Expediente;

import java.time.LocalDate;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Paciente.
 * 
 * @author CAROLINA
 */
public class Paciente {
	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";
	
	/**
	 * Description of the property rfc.
	 */
	public String rfc = "";
	
	/**
	 * Description of the property fechaNacimiento.
	 */
	public java.time.LocalDate fechaNacimiento = null;
	
	/**
	 * Description of the property consulta.
	 */
	public HashSet<String> consulta = new HashSet<String>();
	
	/**
	 * Description of the property diganosticoMed.
	 */
	protected HashSet<String> diganosticoMed = new HashSet<String>();
	
	/**
	 * Description of the property receta.
	 */
	public String receta = "";
	
	// Start of user code (user defined attributes for Paciente)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Paciente() {
		// Start of user code constructor for Paciente)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Paciente)
	
	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
	    this.nombre = newNombre;
	}

	/**
	 * Returns rfc.
	 * @return rfc 
	 */
	public String getRfc() {
		return this.rfc;
	}
	
	/**
	 * Sets a value to attribute rfc. 
	 * @param newRfc 
	 */
	public void setRfc(String newRfc) {
	    this.rfc = newRfc;
	}

	/**
	 * Returns fechaNacimiento.
	 * @return fechaNacimiento 
	 */
	public java.time.LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	/**
	 * Sets a value to attribute fechaNacimiento. 
	 * @param newFechaNacimiento 
	 */
	public void setFechaNacimiento(java.time.LocalDate newFechaNacimiento) {
	    this.fechaNacimiento = newFechaNacimiento;
	}

	/**
	 * Returns consulta.
	 * @return consulta 
	 */
	public HashSet<String> getConsulta() {
		return this.consulta;
	}

	/**
	 * Returns diganosticoMed.
	 * @return diganosticoMed 
	 */
	public HashSet<String> getDiganosticoMed() {
		return this.diganosticoMed;
	}

	/**
	 * Returns receta.
	 * @return receta 
	 */
	public String getReceta() {
		return this.receta;
	}
	
	/**
	 * Sets a value to attribute receta. 
	 * @param newReceta 
	 */
	public void setReceta(String newReceta) {
	    this.receta = newReceta;
	}



}
