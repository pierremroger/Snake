package giftObject;

import Structure.*;

public abstract class Gift {

	protected Node node;
	protected Snake snake;
	protected int windowSizeX;
	protected int windowSizeY;






	abstract void Trick();

	public Node newGiftLocation() {
		int uX = (int) Math.floor(Math.random()*windowSizeX/10)*10;
		int uY = (int) Math.floor(Math.random()*windowSizeY/10)*10;

		while(this.isGiftInSnake(uX, uY)) {
			uX = (int) Math.floor(Math.random()*windowSizeX/10)*10;
			uY = (int) Math.floor(Math.random()*windowSizeY/10)*10;
		}

		return this.node;
	}

	public boolean isGiftCaugth() {
		return (this.snake.L.getFirst().getCoordX()==this.node.getCoordX()) && 
				(this.snake.L.getFirst().getCoordY()==this.node.getCoordY());
	}

	public boolean isGiftInSnake(int x, int y) {
		for(int i=0; i<this.snake.L.size(); i++) {
			if (x==this.snake.L.get(i).getCoordX() && y==this.snake.L.get(i).getCoordY()) {
				return true;
			}
		}
		return false;
	}

}
