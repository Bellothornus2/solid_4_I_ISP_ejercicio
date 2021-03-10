package org.formacion.isp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTexto implements GeneradorTexto{

	private List<String> texto = new ArrayList<>();

	@Override
	public void Nueva(String palabra) {
		texto.add(palabra);
	}
	@Override
	public String Texto() {
		return texto.stream().collect(Collectors.joining(" "));
	}
}
