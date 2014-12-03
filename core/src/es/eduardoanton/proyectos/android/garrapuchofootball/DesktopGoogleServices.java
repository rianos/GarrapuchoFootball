package es.eduardoanton.proyectos.android.garrapuchofootball;

public class DesktopGoogleServices implements IGoogleServices {

	@Override
	public void SignIn() {
		System.out.println("signin GS");
	}

	@Override
	public void SignOut() {
		System.out.println("sigout GS");
	}

	@Override
	public boolean isSignedIn() {
		return false;
	}

	public void QuickGame() {
		System.out.println("quickGame");
	}
	
	public void initMatch(){
		System.out.println("initMatch");
	}
}
