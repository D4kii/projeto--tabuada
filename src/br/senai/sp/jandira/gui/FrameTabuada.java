package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
//import java.awt.Panel;
import java.awt.event.PaintEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTabuada {
	public String titulo;
	public int largura;
	public int altura;
	
	public Color lilas = new Color(204, 169, 221); 
	public Color corFundo = new Color(243, 237, 231); 
	public Color corTopo = new Color(222, 165, 164); 
	
	
	public Font tituloFont = new Font("Arial", Font.BOLD, 20);
	public Font descriptionFont = new Font("Arial", Font.ITALIC, 10);
	
	
	public void criarTela() {
	JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setFont(tituloFont);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//Componentes painel
		Container painel = tela.getContentPane();
		painel.setBackground(corFundo);
		
		//Componentes tela
		
		//titulo
		JLabel tabuadaTitle = new JLabel();
		tabuadaTitle.setText("Tabuada 1.0");
		tabuadaTitle.setFont(tituloFont);
		tabuadaTitle.setBackground(lilas);
		tabuadaTitle.setBounds(80, 20, 200, 30);
		
		//imagem
		JLabel imagemLabel = new JLabel();
		imagemLabel.setIcon(new ImageIcon("src/br/senai/sp/jandira/img/tabu.png"));
		imagemLabel.setBounds(20, 20, 80, 40);
		
		//Descrição
		JLabel tabuadaDescription = new JLabel();
		tabuadaDescription.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!");
		tabuadaDescription.setFont(descriptionFont);
		tabuadaDescription.setBackground(corTopo);
		tabuadaDescription.setBounds(80, 40, 400, 80);
		
		//caixas de informações
		JLabel multiplyLabel = new JLabel();
		multiplyLabel.setText("Multiplicando ");
		multiplyLabel.setBounds(20, 80, 100, 30);
		
		
		
		
		
		painel.add(tabuadaTitle);
		painel.add(multiplyLabel);
		painel.add(imagemLabel);
		painel.add(tabuadaDescription);
		tela.setVisible(true);
	}
	}

