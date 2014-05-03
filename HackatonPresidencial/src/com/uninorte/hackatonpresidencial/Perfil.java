package com.uninorte.hackatonpresidencial;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
		TextView tv3 = (TextView)findViewById(R.id.textView3);
		TextView tv4 = (TextView)findViewById(R.id.textView4);
		TextView tv5 = (TextView)findViewById(R.id.textView5);
		ImageView imv = (ImageView)findViewById(R.id.imageView1);
		LinearLayout l1 = (LinearLayout)findViewById(R.id.l1);
		LinearLayout l2 = (LinearLayout)findViewById(R.id.l2);
		
		Bundle bundle = getIntent().getExtras();
		String candi = bundle.getString("id");
		
		if(candi.toString().equals("1"))
		{
			tv1.setText("Clara Eugenia López Obregón");
			tv1.setBackgroundColor(0xFFFFFF00);
			tv2.setText(" “Por un país del tamaño de nuestro sueños” ");
			tv3.setTextColor(0xFFFFFF00);
			tv4.setText("Polo Democrático");
			tv5.setText("FÓRMULA DE PRESIDENTE Y VICEPRESIDENTE");
			tv5.setTextColor(0xFFFFFF00);
			imv.setImageResource(R.drawable.votoclara1);
		}
		else
		{
			if(candi.toString().equals("2"))
			{
				tv1.setText("Enrique Peñalosa Londoño");
				tv1.setTextColor(Color.WHITE);
				tv1.setBackgroundColor(0xFF007700);
				tv2.setText(" “Con Peñalosa podemos” ");
				tv3.setTextColor(0xFF007700);
				tv4.setText("Partido Verde");
				tv5.setText("FÓRMULA DE PRESIDENTE Y VICEPRESIDENTE");
				tv5.setTextColor(0xFF007700);
				imv.setImageResource(R.drawable.votoenrique);
			}
			else
			{
				if(candi.toString().equals("3"))
				{
					tv1.setText("Óscar Iván Zuluaga Escobar");
					tv1.setTextColor(Color.WHITE);
					tv1.setBackgroundColor(0xFFFF0000);
					tv2.setText(" “Por una colombia distinta” ");
					tv3.setTextColor(0xFFFF0000);
					tv4.setText("Centro Democrático");
					tv5.setText("FÓRMULA DE PRESIDENTE Y VICEPRESIDENTE");
					tv5.setTextColor(0xFFFF0000);
					imv.setImageResource(R.drawable.votooscar);
				}
				else
				{
					if(candi.toString().equals("4"))
					{
						tv1.setText("Marta Lucía Ramírez de Rincón");
						tv1.setTextColor(Color.WHITE);
						tv1.setBackgroundColor(0xFF0000AA);
						tv2.setText(" “Llevemos a colombia al siguiente nivel” ");
						tv3.setTextColor(0xFF0000AA);
						tv4.setText("Conservador Colombiano");
						tv5.setText("FÓRMULA DE PRESIDENTE Y VICEPRESIDENTE");
						tv5.setTextColor(0xFF0000AA);
						imv.setImageResource(R.drawable.votomarta);
					}
					else
					{
						if(candi.toString().equals("5"))
						{
							tv1.setText("Juan Manuel Santos");
							tv1.setTextColor(Color.WHITE);
							tv1.setBackgroundColor(0xFFEE0000);
							tv2.setText(" “Hemos hecho mucho, falta mucho por hacer” ");
							tv3.setTextColor(0xFFEE0000);
							tv4.setText("Social de Unidad Nacional");
							tv5.setText("FÓRMULA DE PRESIDENTE Y VICEPRESIDENTE");
							tv5.setTextColor(0xFFEE0000);
							imv.setImageResource(R.drawable.votosanto);
						}
						else
						{
							if(candi.toString().equals("6"))
							{
								tv1.setText("Voto En Blanco");
								tv1.setTextColor(Color.BLACK);
								tv1.setBackgroundColor(0xFFFFFFFF);
								tv1.setTextSize(30);
								l1.setVisibility(LinearLayout.GONE);
								l2.setVisibility(LinearLayout.GONE);
								//tv2.setText(" “Hemos hecho mucho, falta mucho por hacer” ");
								//tv4.setText("Social de Unidad Nacional");
								tv5.setText("Es una de las opciones en unas elecciones que consiste en realizar el acto mismo del voto, o sea, votar, manifestando que ninguna de las opciones presentadas es adecuada. Para poder votar en blanco, el ciudadano debe ir a las urnas y realizar los actos formales que establece la legislación de cada país. El modo de concretar el voto en blanco varía: en Colombia, por ejemplo, se debe marcar la casilla indicada como voto en blanco; en otros países, se considera voto en blanco cuando el sobre de votación está vacío o contiene un trozo de papel en blanco.");
								tv5.setTextColor(Color.BLACK);
								tv5.setTextSize(20);
								//imv.setImageResource(R.drawable.votosanto);
							}
						}
					}
				}
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
