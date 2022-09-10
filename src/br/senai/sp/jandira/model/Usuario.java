package br.senai.sp.jandira.model;

import br.senai.sp.jandira.Tabuada;
import br.senai.sp.jandira.gui.FrameTabuada;

public class Usuario{
	public static void main(String[] args) {
		
		FrameTabuada telaFrame = new FrameTabuada();
		telaFrame.titulo = "Tabuada";
		telaFrame.largura = 450;
		telaFrame.altura = 600;
		telaFrame.criarTela();

		
		Tabuada tabuada = new Tabuada();
		tabuada.multiplicando = 4;
		tabuada.minimoMultiplicador = 6;
		tabuada.maximoMultiplicador = 20;

		String [] resultado = tabuada.getTabuada();
		int i = 0;
		
		while (i < resultado.length) {
			System.out.println(resultado[i]);
			i++;
			
		}
	}

}
