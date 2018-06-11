package Structure;
import java.util.*;


public class Snake {

	public LinkedList<Node> L = new LinkedList<Node>();


	public Snake() {
		this.L = new LinkedList<Node>();
	}
	
	public Snake(LinkedList<Node> L) {
		this.L = L;
	}

	
	public Snake SnakeGoStraigth() {
		Node N = new Node();
		N = N.NextNodeStraigth(this.L.get(1),this.L.get(0));
		this.addNewFirstNode(N);
		this.removeLastNode();
		return this;
	}
	
	public Snake SnakeGoHaut() {
		Node N = new Node();
		N = N.NextNodeHaut(this.L.getFirst());
		this.addNewFirstNode(N);
		this.removeLastNode();
		return this;
	}
	
	public Snake SnakeGoBas() {
		Node N = new Node();
		N = N.NextNodeBas(this.L.getFirst());
		this.addNewFirstNode(N);
		this.removeLastNode();
		return this;
	}
	
	public Snake SnakeGoGauche() {
		Node N = new Node();
		N = N.NextNodeGauche(this.L.getFirst());
		this.addNewFirstNode(N);
		this.removeLastNode();
		return this;
	}
	
	public Snake SnakeGoDroite() {
		Node N = new Node();
		N = N.NextNodeDroite(this.L.getFirst());
		this.addNewFirstNode(N);
		this.removeLastNode();
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


	public void AfficheSnake() {
		for (int i=0;i<this.L.size();i++) {
			System.out.println(L.get(i).getCoordX() + " "+ L.get(i).getCoordY());
		}
		System.out.println("----------------------");
	}


}




