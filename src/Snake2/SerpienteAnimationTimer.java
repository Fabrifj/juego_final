package Snake2;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;

public class SerpienteAnimationTimer extends AnimationTimer {

	private serpiente snake;
	
	public SerpienteAnimationTimer(serpiente snake, Pane paneCancha) {
		this.snake = snake;
	
	}

	@Override
	public void handle(long now) {

		snake.moverse();
	}
}
