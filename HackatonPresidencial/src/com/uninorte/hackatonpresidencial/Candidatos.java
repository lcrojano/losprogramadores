package com.uninorte.hackatonpresidencial;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class Candidatos extends ActionBarActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_candidatos);

		
	}
	
	public void claralopez(View view)
	{
		Intent intent = new Intent(this, Perfil.class);
		intent.putExtra("id", "1");
		startActivity(intent);
		
	}
	
	public void enriquepenalosa(View view)
	{
		Intent intent = new Intent(this, Perfil.class);
		intent.putExtra("id", "2");
		startActivity(intent);
	}
	
	public void oscarivan(View view)
	{
		Intent intent = new Intent(this, Perfil.class);
		intent.putExtra("id", "3");
		startActivity(intent);
	}
	
	public void martaluciaramirez(View view)
	{
		Intent intent = new Intent(this, Perfil.class);
		intent.putExtra("id", "4");
		startActivity(intent);
	}
	
	public void juansanto(View view)
	{
		Intent intent = new Intent(this, Perfil.class);
		intent.putExtra("id", "5");
		startActivity(intent);
	}
	
	public void blanco(View view)
	{
		Intent intent = new Intent(this, Perfil.class);
		intent.putExtra("id", "6");
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.candidatos, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
