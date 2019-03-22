package Snake2;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;

public class SerpienteAnimationTimer extends AnimationTimer {
	private	 int c=1;

	private serpiente snake;
	private Comida comida;
	private Pane paneCancha;
	public SerpienteAnimationTimer(serpiente snake, Pane paneCancha, Comida comida) {
		this.snake = snake;
		this.comida = comida;
		this.paneCancha = paneCancha;
	}

	@Override
	public void handle(long now) {
		if(c>=1) {
			c--;
		}
		else {
			snake.moverse();
			c=1;
		}
	}

	
	private void reaparecer(){
		if(comida.intersects(snake.getcuerpo)) {
			comida.aparecer(paneCancha.getWidth(), paneCancha.getHeight());
		}
	}
}
