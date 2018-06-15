package Structure;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import giftObject.Gift;

public class Window extends JFrame implements KeyListener {

	private Panel pan;
	public JPanel container;
	public JLabel label;
	public int windowSizeX;
	public int windowSizeY;
	boolean lose;
	int score;

	public Window() {
		
		pan = new Panel();
		lose = false;
		score = 0;
		
		windowSizeX = 400;
		windowSizeY = 400;
		
		// window layout
		label = new JLabel();
		container = new JPanel();
		container.setLayout(new BorderLayout());
		container.add(label, BorderLayout.SOUTH);
		container.add(pan, BorderLayout.CENTER);
		
		
		this.setTitle(" SNAKE 2.0 by PierreM");
		this.setSize(windowSizeX, windowSizeY);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(container);
		this.setVisible(true);
		
		

		// initialisation du listener keyboard
		addKeyListener(this);
		setFocusable(true);

		// Initialisation du snake
		pan.getSnake().addNewFirstNode(new Node(50, 50));
		pan.getSnake().addNewFirstNode(new Node(50, 60));
		pan.getSnake().addNewFirstNode(new Node(50, 70));

		
		// Initialisation des gifts
		pan.getGift().addNewGift(pan.getSnake(), windowSizeX, windowSizeY);
		label.setText(" Votre score est de : " + score);


		// Lancement du jeu
		Game();
	}

	public void Game() {
		
		while (!lose) {

			pan.getSnake().SnakeGoStraigth();
			if (pan.getGift().isGiftCaugthbySnake(pan.getSnake())) {
				pan.getSnake().gotGift=true;
				pan.getGift().addNewGift(pan.getSnake(), windowSizeX, windowSizeY);
				pan.getGift().removeFirstNode();
				score++;
				label.setText(" Votre score est de : " + score);

			}
			
			if (pan.getSnake().isAutoEaten()) {
				lose = true;
			}
		
			container.repaint();
			
			// windows check size
			windowSizeX = this.getSize().width;
			windowSizeX = this.getSize().height;

			try {
				Thread.sleep(100);
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
			pan.getSnake().SnakeGoHaut();
			break;
		case "Bas":
			pan.getSnake().SnakeGoBas();
			break;	
		case "Gauche":
			pan.getSnake().SnakeGoGauche();
			break;
		case "Droite":
			pan.getSnake().SnakeGoDroite();
			break;
		default :
			pan.getSnake().SnakeGoStraigth();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}

}
