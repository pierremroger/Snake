package com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;

public class FenetreCC extends JFrame{

	private BoutonCC bouton = new BoutonCC();
	private JPanel container = new JPanel();
	private JPanel tabBoutons = new JPanel();

	private int tabSideLength;
	private int score;


	private JLabel label = new JLabel("Score : ");



	public FenetreCC() throws InterruptedException{
		this.setTitle("CrazyClick by Pierrem");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());

		this.tabSideLength = 15;
		tabBoutons.setLayout(new GridLayout(this.tabSideLength,this.tabSideLength));
		for (int i=0; i<this.tabSideLength*this.tabSideLength;i++) {
			tabBoutons.add(new BoutonCC());
		}


		container.add(label, BorderLayout.SOUTH);
		container.add(tabBoutons, BorderLayout.CENTER);

		this.setContentPane(container);
		this.setVisible(true);
		game();
	}

	public void game() throws InterruptedException {
		
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				int nextInt = ThreadLocalRandom.current().nextInt(254);
				BoutonCC button = new BoutonCC(Color.GREEN);
				tabBoutons.add(button, nextInt);
				tabBoutons.repaint();
			}
			
		};
		Timer timer = new Timer(1000, listener);		
	    
	    timer.setRepeats(true);
	    timer.start();
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				int u = 0;
//				double U;
//				int i=0;
//				while(i<100) {
//					U =  Math.random()*Math.pow(tabSideLength,2);
//					u = (int) U;
//					
//					System.out.println(u);
//					BoutonCC button = new BoutonCC(Color.GREEN);
//					tabBoutons.add(button, u);
//					tabBoutons.repaint();
//					
//					i++;
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//				
//			}
//		});
//		
//		thread.start();

	}
}
