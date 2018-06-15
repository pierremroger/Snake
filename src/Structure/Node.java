package Structure;

import java.awt.Color;

public class Node {

	private int coordX;
	private int coordY;
	private int nodeSize;
	private Color color;

	Node() {
	};

	Node(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.nodeSize = 10;
		this.color = Color.blue;
	}

	public Node(int coordX, int coordY, int nodeSize, Color color) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.nodeSize = nodeSize;
		this.color = color;
	}

	public Node NextNodeHaut(Node A) {
		Node B = new Node();
		B.setNodeSize(A.getNodeSize());
		B.setColor(A.getColor());
		B.setCoordX(A.getCoordX());
		B.setCoordY(A.getCoordY() - A.getNodeSize());
		return B;
	}

	public Node NextNodeBas(Node A) {
		Node B = new Node();
		B.setNodeSize(A.getNodeSize());
		B.setColor(A.getColor());
		B.setCoordX(A.getCoordX());
		B.setCoordY(A.getCoordY() + A.getNodeSize());
		return B;
	}

	public Node NextNodeDroite(Node A) {
		Node B = new Node();
		B.setNodeSize(A.getNodeSize());
		B.setColor(A.getColor());
		B.setCoordX(A.getCoordX() + A.getNodeSize());
		B.setCoordY(A.getCoordY());
		return B;
	}

	public Node NextNodeGauche(Node A) {
		Node B = new Node();
		B.setNodeSize(A.getNodeSize());
		B.setColor(A.getColor());
		B.setCoordX(A.getCoordX() - A.getNodeSize());
		B.setCoordY(A.getCoordY());
		return B;
	}

	public Node NextNodeStraigth(Node n1, Node n0) {

		Node C = new Node();
		C.setNodeSize(n1.getNodeSize());
		C.setColor(n1.getColor());

		if (n0.getCoordX() == n1.getCoordX() && n0.getCoordY() == n1.getCoordY() + n1.getNodeSize()) {
			C.setCoordX(n0.getCoordX());
			C.setCoordY(n0.getCoordY() + n1.getNodeSize());
		}

		else if (n0.getCoordX() == n1.getCoordX() && n0.getCoordY() == n1.getCoordY() - n1.getNodeSize()) {
			C.setCoordX(n0.getCoordX());
			C.setCoordY(n0.getCoordY() - n1.getNodeSize());
		}

		else if (n0.getCoordY() == n1.getCoordY() && n0.getCoordX() == n1.getCoordX() + n1.getNodeSize()) {
			C.setCoordY(n0.getCoordY());
			C.setCoordX(n0.getCoordX() + n1.getNodeSize());
		} else if (n0.getCoordY() == n1.getCoordY() && n0.getCoordX() == n1.getCoordX() - n1.getNodeSize()) {
			C.setCoordY(n0.getCoordY());
			C.setCoordX(n0.getCoordX() - n1.getNodeSize());
		}

		else {
			C.setCoordX(0);
			C.setCoordY(0);
		}

		return C;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public int getNodeSize() {
		return nodeSize;
	}

	public void setNodeSize(int nodeSize) {
		this.nodeSize = nodeSize;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
