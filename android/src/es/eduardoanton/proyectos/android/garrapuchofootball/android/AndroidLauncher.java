package es.eduardoanton.proyectos.android.garrapuchofootball.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import es.eduardoanton.proyectos.android.garrapuchofootball.GarrapuchoFootball;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new GarrapuchoFootball(), config);
	}
}
