package com.curso.registro;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends Activity {

TextView tv_saludo;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_saludo);
		
		tv_saludo =(TextView)findViewById(R.id.saludo_tv_nombre);
		
		
		Bundle miBundleExtras = getIntent().getExtras();
		  if (miBundleExtras != null) {
		   String nombre= miBundleExtras.getString("nombre_key");
		   	tv_saludo.append(nombre);
		  }
	}
}
