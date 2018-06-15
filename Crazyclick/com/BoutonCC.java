package com;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class BoutonCC extends JButton implements MouseListener{

	private Color color;

	public BoutonCC(){
		setContentAreaFilled(false);
		this.addMouseListener(this);
		this.color = Color.BLUE;
	}
	
	public BoutonCC(Color color){
		setContentAreaFilled(false);
		this.addMouseListener(this);
		this.color = color;
	}

	public void paintComponent(Graphics g){

		Graphics2D g2d = (Graphics2D)g;
		GradientPaint gp = new GradientPaint(0, 0, color, 0, 20, color, true);
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.color = Color.RED;			
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.color = Color.BLUE;	
	}

}
