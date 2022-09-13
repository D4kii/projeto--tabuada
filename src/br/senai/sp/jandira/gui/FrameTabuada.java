package br.senai.sp.jandira.gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.RenderingHints.Key;
import java.awt.ScrollPane;
//import java.awt.Panel;
//import java.awt.event.PaintEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import br.senai.sp.jandira.*;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
	public Color preto = new Color(35, 40, 43); 
	
	
	
	public Font tituloFont = new Font("Arial", Font.BOLD, 30);
	public Font descriptionFont = new Font("Arial", Font.ITALIC, 11);
	public Font aFont = new Font("Arial", Font.ROMAN_BASELINE, 20);
	public Font bFont = new Font("Arial", Font.BOLD, 20);
	
	
	
	public  void criarTela() {
		
		
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
		tabuadaTitle.setForeground(preto);
		tabuadaTitle.setBounds(80, 20, 200, 30);
		
		//imagem
		JLabel imagemLabel = new JLabel();
		imagemLabel.setIcon(new ImageIcon("src/br/senai/sp/jandira/img/tabu.png"));
		imagemLabel.setBounds(20, 20, 80, 40);
		
		//Descrição
		JLabel tabuadaDescription = new JLabel();
		tabuadaDescription.setText("Calcule a tabuada que desejar em segundos com nosso Aplicativo!");
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
		maxMultiplyLabel.setText("Máximo Multiplicador:");
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
//		
//		JTextField resultField = new JTextField();
//		resultField.setBounds(30, 350, 360, 200);
//		resultField.setBackground(amarelo);
		
		
		ScrollPane scroll = new ScrollPane();
		scroll.setBounds(30, 350, 360, 200);
		JList<String> listagem = new JList<String>();
		listagem.setForeground(preto);
		
		
		
		

		//adicionando ao painel
		//painel.add(resultField);
		painel.add(scroll);
		painel.add(listagem);
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
		
		
		multiplyField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				multiplyField.setText(multiplyField.getText().replaceAll("[^0-9]", ""));

			}
			
			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		
		minMultiplyField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				minMultiplyField.setText(minMultiplyField.getText().replaceAll("[^0-9]", ""));
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		maxMultiplyField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				maxMultiplyField.setText(maxMultiplyField.getText().replaceAll("[^0-9]", ""));
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		calcButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(multiplyField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(tela, "Multiplicador é OBRIGATÓRIO!", "ERRO!", JOptionPane.OK_OPTION);
					multiplyField.requestFocus();
				}else if(minMultiplyField.getText().isEmpty()){
					JOptionPane.showMessageDialog(tela, "Mínimo é OBRIGATÓRIO!", "ERRO!" , JOptionPane.OK_OPTION);
					minMultiplyField.requestFocus();
				}else if(maxMultiplyField.getText().isEmpty()){
					JOptionPane.showMessageDialog(tela, "Mínimo é OBRIGATÓRIO!", "ERRO!" , JOptionPane.OK_OPTION);
					maxMultiplyField.requestFocus(); 
				} else {
					Tabuada tabuada = new Tabuada();
					tabuada.multiplicando = Integer.parseInt(multiplyField.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(maxMultiplyField.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(minMultiplyField.getText());
				    
				if (tabuada.maximoMultiplicador < tabuada.minimoMultiplicador) {
					JOptionPane.showMessageDialog(null, "O multiplicador mínimo deve ser menor que o máximo, digitar valor menor.", "ERRO!" , JOptionPane.OK_OPTION);
					minMultiplyField.setText("");
					maxMultiplyField.setText("");
				}else{
					
					listagem.setListData(tabuada.getTabuada());
					scroll.add(listagem);
					
				}
				} 

				
				
		};
		});
          cleanButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				multiplyField.setText("");
				maxMultiplyField.setText("");
				minMultiplyField.setText("");
				
				String[] limpar = {""};
				listagem.setListData(limpar);
				
				DefaultListModel<String> model = new DefaultListModel<>();
				listagem.setModel(model);
				
				
			}
		});
	}}

