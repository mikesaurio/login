package com.curso.registro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistroMainActivity extends Activity {

	private EditText etNombre,etContrasena;
	private Button btnAceptar;
	private TextView registro_main_tv_registrate;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registro_main);
		
		registro_main_tv_registrate=(TextView)findViewById(R.id.registro_main_tv_registrate);
		registro_main_tv_registrate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(RegistroMainActivity.this,RegistrarseActivity.class);

				startActivity(intent);
				finish();
				
			}
		});
		
		etNombre =(EditText)findViewById(R.id.registro_main_et_nombre);
		etContrasena=(EditText) findViewById(R.id.registro_main_et_contrasena);
		btnAceptar = (Button)findViewById(R.id.registro_main_btn_aceptar);
		btnAceptar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(getApplicationContext(), "hola: "+ etNombre.getText().toString() , Toast.LENGTH_LONG).show();
				
				Intent intent = new Intent(RegistroMainActivity.this,SaludoActivity.class);
				intent.putExtra("nombre_key", etNombre.getText().toString());
				startActivity(intent);
				finish();
				
			}
		});
		
		
	}


	@Override
	protected void onDestroy() {
		Toast.makeText(getApplicationContext(), "Bye" , Toast.LENGTH_LONG).show();
		super.onDestroy();
	}
	
	
	
}
