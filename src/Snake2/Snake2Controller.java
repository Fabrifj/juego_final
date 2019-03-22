package Snake2;



import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;



public class Snake2Controller {
	@FXML
	private Pane paneCancha;
	private serpiente snake;
	private SerpienteAnimationTimer miTimer;
	private Comida comida;

	@FXML
	public void initialize() {
		//es una especia,constructor se ejecuta con el programa
		System.out.println("inicando programa");
		snake = new serpiente();
		comida = new Comida();

		snake.addserpiente(paneCancha);
		paneCancha.getChildren().add(comida);
		// obtiene lsita de hijos(elementos) y los agrega un objeto

		Rectangle clip = new Rectangle(0, 0, 0, 0);
		clip.widthProperty().bind(paneCancha.widthProperty());
		clip.heightProperty().bind(paneCancha.heightProperty());
		paneCancha.setClip(clip);

		miTimer = new SerpienteAnimationTimer(snake, paneCancha,comida);
	}
	@FXML
	public void botonSalir() {
		System.out.println("Presiono boton para salir");
		System.exit(0);

	}

	@FXML
	public void botonIniciar() {
		System.out.println("iniciaste la pelota ");
		miTimer.start();
		comida.aparecer(paneCancha.getWidth(), paneCancha.getHeight());

	}
	@FXML
	public void keyMoveHnd(KeyEvent ke)
	{
		int dir=0;

		switch(ke.getCode())
		{
		case UP:
		case KP_UP:
		case I:
			dir=2;
			break;
		case DOWN:
		case KP_DOWN:
		case K:
			dir=1;
			break;
		case LEFT:
		case KP_LEFT:
		case J:
			dir=3;
			break;
		case RIGHT:
		case KP_RIGHT:
		case L:
			dir=0;
			break;
		default:
			System.out.println("KeyMoveHnd:" + ke.getCode() );
			break;
		}
		ke.consume();
		if(  dir !=  snake.getRetro()) {

			snake.setDir(dir);
			snake.setRetro(dir);
		}
	}


}

