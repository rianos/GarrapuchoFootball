package es.eduardoanton.proyectos.android.garrapuchofootball;

public class GameWorld {
	public GarrapuchoFootball game;
	public boolean multiplayer;
	public float x,y,px,py;
	
	public GameWorld(GarrapuchoFootball game){
		this.game = game;
		multiplayer = false;
		x = 200;
		y = 200;
		px = 200;
		py = 200;
	}

	public void update(float delta){
		
	}
}
