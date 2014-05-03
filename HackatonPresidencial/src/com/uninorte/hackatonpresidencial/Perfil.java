package com.uninorte.hackatonpresidencial;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

public class Perfil extends ActionBarActivity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perfil);
		
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		TextView tv2 = (TextView)findViewById(R.id.textView2);
		TextView tv4 = (TextView)findViewById(R.id.textView4);
		TextView tv5 = (TextView)findViewById(R.id.textView5);
		ImageView imv = (ImageView)findViewById(R.id.imageView1);
		
		Bundle bundle = getIntent().getExtras();
		String candi = bundle.getString("id");
		
		if(candi.toString().equals("1"))
		{
			tv1.setText("Clara Eugenia López Obregón");
			tv2.setText(" “Por un país del tamaño de nuestro sueños” ");
			tv4.setText("Polo Democrático");
			tv5.setText("FÓRMULA DE PRESIDENTE Y VICEPRESIDENTE");
			imv.setImageResource(R.drawable.votoclara1);
		}
		else
		{
			if(candi.toString().equals("2"))
			{
				tv1.setText("Enrique Peñalosa Londoño");
				tv2.setText(" “Con Peñalosa podemos” ");
				tv4.setText("Partido Verde");
				tv5.setText("FÓRMULA DE PRESIDENTE Y VICEPRESIDENTE");
				imv.setImageResource(R.drawable.votoenrique);
			}
			else
			{
				
			}
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.perfil, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
