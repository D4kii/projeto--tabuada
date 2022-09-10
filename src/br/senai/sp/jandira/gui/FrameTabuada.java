package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
//import java.awt.Panel;
//import java.awt.event.PaintEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.Tabuada;

public class FrameTabuada {
	public String titulo;
	public int largura;
	public int altura;
	
	public Color lilas = new Color(204, 169, 221); 
	public Color verde = new Color (8, 101, 34);
	public Color branco = new Color (255, 255, 255);
	public Color amarelo = new Color (249, 234, 195);
	public Color mostarda = new Color(238, 173, 45); 
	public Color corFundo = new Color(243, 237, 231); 
	public Color corTopo = new Color(222, 165, 164); 
	
	
	
	public Font tituloFont = new Font("Arial", Font.BOLD, 30);
	public Font descriptionFont = new Font("Arial", Font.ITALIC, 11);
	public Font aFont = new Font("Arial", Font.ROMAN_BASELINE, 20);
	public Font bFont = new Font("Arial", Font.BOLD, 20);
	
	
	
	public void criarTela() {
	JFrame tela = new JFrame();
		tela.setTitle(titulo);
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
		tabuadaDescription.setText("Calcule a tabuada que desejar em segundos como nosso Aplicativo!");
		tabuadaDescription.setFont(descriptionFont);
		tabuadaDescription.setBackground(corTopo);
		tabuadaDescription.setBounds(80, 23, 400, 80);
		
		//caixas de informações JLabel e JTextField respectivamente
		JLabel multiplyLabel = new JLabel();
		multiplyLabel.setText("Multiplicando:");
		multiplyLabel.setFont(aFont);
		multiplyLabel.setBounds(100, 105, 200, 30);
		
		
		JTextField multiplyField = new JTextField();
		multiplyField.setBackground(amarelo);
		multiplyField.setBounds(240, 100, 150, 35);
		
		JLabel minMultiplyLabel = new JLabel();
		minMultiplyLabel.setText("Mínimo Multiplicador:");
		minMultiplyLabel.setFont(aFont);
		minMultiplyLabel.setBounds(30, 165, 200, 30);

		JTextField minMultiplyField = new JTextField();
		minMultiplyField.setBackground(amarelo);
		minMultiplyField.setBounds(240, 160, 150, 35);
		
		JLabel maxMultiplyLabel = new JLabel();
		maxMultiplyLabel.setText("Mínimo Multiplicador:");
		maxMultiplyLabel.setFont(aFont);
		maxMultiplyLabel.setBounds(30, 225, 200, 30);

		JTextField maxMultiplyField = new JTextField();
		maxMultiplyField.setBackground(amarelo);
		maxMultiplyField.setBounds(240, 220, 150, 35);
		
		//Button
		JButton calcButton = new JButton();
		calcButton.setText("Calcular");
		calcButton.setBackground(verde);
		calcButton.setFont(bFont);
		calcButton.setForeground(branco);
		calcButton.setBounds(30, 290, 210, 40);
		
		JButton cleanButton = new JButton();
		cleanButton.setText("Limpar");
		cleanButton.setFont(bFont);
		cleanButton.setBackground(mostarda);
		cleanButton.setForeground(branco);
		cleanButton.setBounds(245, 290, 145, 40);
		
		
		

		//adicionando ao painel
		painel.add(calcButton);
		painel.add(cleanButton);
		painel.add(maxMultiplyField);
		painel.add(maxMultiplyLabel);
		painel.add(minMultiplyLabel);
		painel.add(minMultiplyField);
		painel.add(multiplyField);
		painel.add(tabuadaTitle);
		painel.add(multiplyLabel);
		painel.add(imagemLabel);
		painel.add(tabuadaDescription);
		tela.setVisible(true);
		
		calcButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(multiplyField.getText());
				tabuada.maximoMultiplicador = Integer.parseInt(maxMultiplyField.getText());
				tabuada.minimoMultiplicador = Integer.parseInt(minMultiplyField.getText());
				
				
			}
		});
		
		
		
	}
	}

