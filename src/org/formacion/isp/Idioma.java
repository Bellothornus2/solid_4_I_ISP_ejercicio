package org.formacion.isp;

import java.util.Arrays;
import java.util.List;

public enum Idioma {
	//deberia ser ("I", "am", "hungry");
	EN ("I","am","angry"), 
	ES ("tengo","hambre"), 
	CA ("tenc", "fam");
	
	List<String> diccionario;

	private Idioma(String ... palabras) {
		this.diccionario = Arrays.asList(palabras);
	}
	

}
