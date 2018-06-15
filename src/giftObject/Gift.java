package giftObject;

import java.awt.Color;
import java.util.LinkedList;

import Structure.*;

public class Gift {

	public LinkedList<Node> L = new LinkedList<Node>();

	public Gift() {
		L = new LinkedList<Node>();
	}


	public Gift addNewGift(Snake S, int windowSizeX, int windowSizeY) {

		int uX = (int) Math.floor(Math.random()*(windowSizeX-2*S.L.getLast().getNodeSize())/10)*10;
		int uY = (int) Math.floor(Math.random()*(windowSizeY-2*S.L.getLast().getNodeSize())/10)*10;

		while(isGiftInSnake(uX, uY, S)) {
			uX = (int) Math.floor(Math.random()*(windowSizeX-2*S.L.getLast().getNodeSize())/10)*10;
			uY = (int) Math.floor(Math.random()*(windowSizeY-2*S.L.getLast().getNodeSize())/10)*10;
		}

		this.L.add(new Node(uX, uY, S.L.getLast().getNodeSize(), Color.GREEN));

		return this;
	}



	public boolean isGiftCaugthbySnake (Snake snake) {
		for (int i=0; i<this.L.size();i++) {
			if ((snake.L.getFirst().getCoordX()==this.L.get(i).getCoordX()) && (snake.L.getFirst().getCoordY()==this.L.get(i).getCoordY())) {
				return true;
			}
		}
		return false;
	}

	public boolean isGiftInSnake(int x, int y, Snake snake) {
		for(int i=0; i<snake.L.size(); i++) {
			if (x==snake.L.get(i).getCoordX() && y==snake.L.get(i).getCoordY()) {
				return true;
			}
		}
		return false;
	}

	public Gift removeFirstNode() {
		L.removeFirst();
		return this;
	}
	
}




