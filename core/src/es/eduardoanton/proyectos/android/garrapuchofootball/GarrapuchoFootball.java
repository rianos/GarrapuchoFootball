package es.eduardoanton.proyectos.android.garrapuchofootball;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;



public class GarrapuchoFootball extends Game {
	public static AssetManager asset;
	public static Preferences prefs;
	public final static float screenwidth = 1280f;
	public final static float screenheight = 720f;
	public static Screen loadingscreen,ingamescreen;
	public static GameWorld gamew;
	public static IGoogleServices GS;
	
	public GarrapuchoFootball(IGoogleServices igs){
		super();
		GarrapuchoFootball.GS = igs;
	}
	
	public void create() {
		loadassets();
		prefs = Gdx.app.getPreferences(this.getClass().getSimpleName());
		loadingscreen = new LoadingScreen(this);
		this.setScreen(loadingscreen);
	}
	
	public void dispose(){
		super.dispose();
		asset.dispose();
	}
	
	public void loadassets(){
		asset = new AssetManager();
		asset.load("loading.gif", Texture.class);
		asset.load("empty.png", Texture.class);
		asset.load("full.png", Texture.class);
	}
	
	public void mainscreen(){
		gamew = new GameWorld(this);
		//mainscreen = new MainScreen(this);
		ingamescreen = new IngameScreen( this );
		//gameoverscreen = new GameOverScreen(this);
		//creditsscreen = new CreditsScreen(this);
		//instructionscreen = new InstructionsScreen(this);
		this.setScreen(ingamescreen);
	}
}
