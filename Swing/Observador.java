package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Observador {
	
	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		// aqui serve para fechar a janela e não ficar rodandno a aplciação
		
		janela.setSize(600,200);// definir o tamanho da janela
		janela.setLayout(new FlowLayout()); //aqui nós vvemos o botao de uma forma mais interresante
		janela.setLocationRelativeTo(null); //quando abrir a janela ela abrira no meio
		
		
		JButton botao = new JButton("CLicar"); // criando um botao
		janela.add(botao); // adicionando o botao a janela
		
		
		botao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu");				
			}
			
		}); // vai registarr o evento e dentro do void vai fazer o que voce mandar
		
		janela.setVisible(true); // aqui mostra a janela
		
	}
}
