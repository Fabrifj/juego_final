package Snake2;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;

public class SerpienteAnimationTimer extends AnimationTimer {
	private	 int c=1;

	private serpiente snake;
	
	public SerpienteAnimationTimer(serpiente snake, Pane paneCancha) {
		this.snake = snake;
	
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

}
