package Structure;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Window extends JFrame implements KeyListener {

	private Panel pan = new Panel();

	public Window() {
		this.setTitle(" SNAKE 2.0 by PierreM");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pan);
		this.setVisible(true);

		// initialisation du listener keyboard
		addKeyListener(this);
		setFocusable(true);

		// Initialisation du snake
		Snake S = new Snake();
		S.addNewFirstNode(new Node(50, 50));
		S.addNewFirstNode(new Node(50, 60));
		S.addNewFirstNode(new Node(50, 70));
		S.addNewFirstNode(new Node(50, 80));
		S.addNewFirstNode(new Node(50, 90));

		pan.setS(S);

		// Lancement du jeu
		Game();
	}

	public void Game() {
		while (true) {

			pan.getS().SnakeGoStraigth();
			pan.repaint();

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (KeyEvent.getKeyText(e.getKeyCode())) {
		case "Haut":
			pan.getS().SnakeGoHaut();
			break;
		case "Bas":
			pan.getS().SnakeGoBas();
			break;	
		case "Gauche":
			pan.getS().SnakeGoGauche();
			break;
		case "Droite":
			pan.getS().SnakeGoDroite();
			break;
		default :
			pan.getS().SnakeGoStraigth();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}

}
