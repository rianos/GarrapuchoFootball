package es.eduardoanton.proyectos.android.garrapuchofootball.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import es.eduardoanton.proyectos.android.garrapuchofootball.GarrapuchoFootball;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new GarrapuchoFootball(), config);
	}
}
