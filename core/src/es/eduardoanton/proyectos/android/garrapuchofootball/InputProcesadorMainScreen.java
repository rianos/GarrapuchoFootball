package es.eduardoanton.proyectos.android.garrapuchofootball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;

public class InputProcesadorMainScreen implements InputProcessor {
	private OrthographicCamera cam;
	private GameWorld gamew;
	
	
	InputProcesadorMainScreen(OrthographicCamera cam, GameWorld gamew){
		this.cam = cam;
		this.gamew = gamew;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		Vector3 touchpos = new Vector3(screenX,screenY,0);
		cam.unproject(touchpos);
		Gdx.app.log("LOSNUMEROS", "X: " + touchpos.x + " Y: " + touchpos.y);
		if (touchpos.x > 100 && touchpos.x < 350 && touchpos.y > 100 && touchpos.y < 350 ){
			if (gamew.game.GS.isSignedIn()){
				gamew.game.GS.SignOut();
			}else{
				gamew.game.GS.SignIn();
			}
		}
		if (touchpos.x > 400 && touchpos.x < 750 && touchpos.y > 100 && touchpos.y < 350 ){
			if ( gamew.game.GS.isSignedIn()){
				gamew.game.GS.initMatch();
			}
		}
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
