/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Expediente;

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Consulta.
 * 
 * @author CAROLINA
 */
public class Consulta {
	/**
	 * Description of the property sintomas.
	 */
	public HashSet<String> sintomas = new HashSet<String>();
	
	/**
	 * Description of the property temperatura.
	 */
	public float temperatura = 0F;
	
	/**
	 * Description of the property peso.
	 */
	public float peso = 0F;
	
	/**
	 * Description of the property estatura.
	 */
	public float estatura = 0F;
	
	// Start of user code (user defined attributes for Consulta)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Consulta() {
		// Start of user code constructor for Consulta)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Consulta)
	
	// End of user code
	/**
	 * Returns sintomas.
	 * @return sintomas 
	 */
	public HashSet<String> getSintomas() {
		return this.sintomas;
	}

	/**
	 * Returns temperatura.
	 * @return temperatura 
	 */
	public float getTemperatura() {
		return this.temperatura;
	}
	
	/**
	 * Sets a value to attribute temperatura. 
	 * @param newTemperatura 
	 */
	public void setTemperatura(float newTemperatura) {
	    this.temperatura = newTemperatura;
	}

	/**
	 * Returns peso.
	 * @return peso 
	 */
	public float getPeso() {
		return this.peso;
	}
	
	/**
	 * Sets a value to attribute peso. 
	 * @param newPeso 
	 */
	public void setPeso(float newPeso) {
	    this.peso = newPeso;
	}

	/**
	 * Returns estatura.
	 * @return estatura 
	 */
	public float getEstatura() {
		return this.estatura;
	}
	
	/**
	 * Sets a value to attribute estatura. 
	 * @param newEstatura 
	 */
	public void setEstatura(float newEstatura) {
	    this.estatura = newEstatura;
	}



}
