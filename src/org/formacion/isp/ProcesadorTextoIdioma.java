package org.formacion.isp;

import java.util.ArrayList;
import java.util.List;

public class ProcesadorTextoIdioma extends ProcesadorTexto implements VerificadorIdioma{
    
    private List<String> texto = new ArrayList<>();
    
    @Override
    public boolean Correcto (Idioma idioma) {
		/*
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		*/
		return texto.stream().noneMatch(n -> idioma.diccionario.contains(n.toLowerCase()));
		//return true;
	}
}
