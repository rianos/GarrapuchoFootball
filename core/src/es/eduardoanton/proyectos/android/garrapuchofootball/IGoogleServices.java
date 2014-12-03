package es.eduardoanton.proyectos.android.garrapuchofootball;

public interface IGoogleServices{
	public void SignIn();
	public void SignOut();
	public boolean isSignedIn();
	public void QuickGame();
	public void initMatch();
}
