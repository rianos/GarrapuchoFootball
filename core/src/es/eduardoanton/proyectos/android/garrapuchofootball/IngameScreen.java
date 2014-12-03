package es.eduardoanton.proyectos.android.garrapuchofootball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class IngameScreen implements Screen {
	private GarrapuchoFootball game;
	private SpriteBatch batch;
	private OrthographicCamera cam;
	private InputProcessor iproc;
	private BitmapFont font;
	private Texture fondo;
	
	
	public IngameScreen(GarrapuchoFootball game){
		this.game = game;
		font = new BitmapFont();
		 font.setColor(Color.WHITE);
		 font.setScale(2f);
		cam = new OrthographicCamera();
		cam.setToOrtho(false, GarrapuchoFootball.screenwidth,GarrapuchoFootball.screenheight);
		cam.update();	
		batch = new SpriteBatch();
		batch.setProjectionMatrix(cam.combined);	
		//fondo = GarrapuchoFootball.asset.get("fondo.png", Texture.class );
		iproc = new InputProcesadorIngame(cam,game.gamew);
	}
	@Override
	public void render(float delta) {
		game.gamew.update(delta);
		if ( game.GS.isSignedIn()){
			Gdx.gl.glClearColor(0.0f,0.0f ,0.0f, 1);	
		}else{
			Gdx.gl.glClearColor(1.0f,1.0f ,1.0f, 1);
		}
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);	
		cam.update();
		batch.begin();
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(iproc);	
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
