/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Expediente;

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of receta.
 * 
 * @author CAROLINA
 */
public class receta {
	/**
	 * Description of the property medicamentos.
	 */
	public HashSet<String> medicamentos = new HashSet<String>();
	
	/**
	 * Description of the property recomendaciones.
	 */
	public HashSet<String> recomendaciones = new HashSet<String>();
	
	// Start of user code (user defined attributes for receta)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public receta() {
		// Start of user code constructor for receta)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for receta)
	
	// End of user code
	/**
	 * Returns medicamentos.
	 * @return medicamentos 
	 */
	public HashSet<String> getMedicamentos() {
		return this.medicamentos;
	}

	/**
	 * Returns recomendaciones.
	 * @return recomendaciones 
	 */
	public HashSet<String> getRecomendaciones() {
		return this.recomendaciones;
	}



}
