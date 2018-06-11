package Structure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel { 

	private Snake snake = new Snake();
		
	public Panel (Snake snake){
		this.snake = snake;
	}
	
	public Panel() {
	}
	
	public void paintComponent(Graphics g){
		
	    g.setColor(Color.white);
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    
		for(int i=0;i<snake.L.size();i++) {
			g.setColor(snake.L.get(i).getColor());
			g.fillOval(snake.L.get(i).getCoordX(), snake.L.get(i).getCoordY(), snake.L.get(i).getNodeSize(), snake.L.get(i).getNodeSize());
		}               
	}

	public Snake getS() {
		return snake;
	}

	public void setS(Snake s) {
		snake = s;
	}
	
	
	
	
}