package Structure;
import java.util.*;



public class Snake  {

	public LinkedList<Node> L; 
	public boolean gotGift;

	public Snake() {
		this.L = new LinkedList<Node>();
		this.gotGift = false;
				
	}
	
	public Snake(LinkedList<Node> L, boolean gotGift) {
		this.L = L;
		this.gotGift=gotGift;
	}

	
	public Snake SnakeGoStraigth() {
		Node N = new Node();
		N = N.NextNodeStraigth(this.L.get(1),this.L.get(0));
		this.addNewFirstNode(N);
		if (!this.gotGift) {
			this.removeLastNode();
		}
		this.gotGift = false;
		return this;
	}
	
	public Snake SnakeGoHaut() {
		Node N = new Node();
		N = N.NextNodeHaut(this.L.getFirst());
		this.addNewFirstNode(N);
		if (!this.gotGift) {
			this.removeLastNode();
		}
		this.gotGift = false;
		return this;
	}
	
	public Snake SnakeGoBas() {
		Node N = new Node();
		N = N.NextNodeBas(this.L.getFirst());
		this.addNewFirstNode(N);
		if (!this.gotGift) {
			this.removeLastNode();
		}
		this.gotGift = false;
		return this;
	}
	
	public Snake SnakeGoGauche() {
		Node N = new Node();
		N = N.NextNodeGauche(this.L.getFirst());
		this.addNewFirstNode(N);
		if (!this.gotGift) {
			this.removeLastNode();
		}
		this.gotGift = false;
		return this;
	}
	
	public Snake SnakeGoDroite() {
		Node N = new Node();
		N = N.NextNodeDroite(this.L.getFirst());
		this.addNewFirstNode(N);
		if (!this.gotGift) {
			this.removeLastNode();
		}
		this.gotGift = false;
		return this;
	}
	
	public Snake addNewFirstNode(Node N) {
		this.L.addFirst(N);
		return this; 
	}
	

	public Snake removeLastNode() {
		L.removeLast();
		return this;
	}
	
	public boolean isAutoEaten() {
		for (int i=1;i<this.L.size();i++) {
			if((this.L.getFirst().getCoordX()==this.L.get(i).getCoordX()) && (this.L.getFirst().getCoordY()==this.L.get(i).getCoordY())) {
				return true;
			}
		}
		return false;
	}


	public void AfficheSnake() {
		for (int i=0;i<this.L.size();i++) {
			System.out.println(L.get(i).getCoordX() + " "+ L.get(i).getCoordY());
		}
		System.out.println("----------------------");
	}




}




