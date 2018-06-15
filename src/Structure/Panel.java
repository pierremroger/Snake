package Structure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import giftObject.Gift;

public class Panel extends JPanel { 

	private Snake snake;
	private Gift gift;
		
	public Panel (Snake snake, Gift gift){
		this.snake = snake;
		this.gift = gift;
	}
	
	public Panel() {
		this.snake = new Snake();
		this.gift = new Gift();
	}
	
	public void paintComponent(Graphics g){
		
	    g.setColor(Color.white);
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    
		// Paint snake
	    for(int i=0;i<snake.L.size();i++) {
			g.setColor(snake.L.get(i).getColor());
			g.fillOval(snake.L.get(i).getCoordX(), snake.L.get(i).getCoordY(), snake.L.get(i).getNodeSize(), snake.L.get(i).getNodeSize());
		}
		
		// Paint gifts
	    for (int i = 0; i < gift.L.size(); i++) {
			g.setColor(gift.L.get(i).getColor());
			g.fillOval(gift.L.get(i).getCoordX(), gift.L.get(i).getCoordY(), gift.L.get(i).getNodeSize(), gift.L.get(i).getNodeSize());

			
		}
	}


	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public Gift getGift() {
		return gift;
	}

	public void setGift(Gift gift) {
		this.gift = gift;
	}
	
	
	
	
}