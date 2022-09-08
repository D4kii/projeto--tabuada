package br.senai.sp.jandira.model;

import br.senai.sp.jandira.Tabuada;
import br.senai.sp.jandira.gui.*;

public class Usuario{
	public static void main(String[] args) {
		
		
//		Tabuada tabuada = new Tabuada();
//		tabuada.multiplicando = 2;
//		tabuada.minimoMultiplicador = 4;

//import br.senai.sp.jandira.gui.*;

		
		Tabuada tabuada = new Tabuada();
		System.out.println("multiplicando: ");
		tabuada.multiplicando = 4;
		System.out.println("Mínimo multiplicador: ");
		tabuada.minimoMultiplicador = 6;
		System.out.println("Máximo multiplicador: ");
		tabuada.maximoMultiplicador = 7;

		String [] resultado = tabuada.getTabuada();
		int i = 0;
		
		while (i < resultado.length) {
			System.out.println(resultado[i]);
			i++;
		}
	}

}
