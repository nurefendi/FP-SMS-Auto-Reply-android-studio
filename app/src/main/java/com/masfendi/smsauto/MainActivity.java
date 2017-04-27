package com.masfendi.smsauto;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
     //   mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

     //   mDrawerLayout.addDrawerListener(mToggle);
      //  mToggle.syncState();

      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_atas, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       // if (mToggle.onOptionsItemSelected(item)){
        //    return true;
       // }
        if (item.getItemId() == R.id.tambah_atas ){
            startActivity(new Intent(MainActivity.this, BuatPesan.class));
        }
        if (item.getItemId() == R.id.buat_Pesan){
            startActivity(new Intent(MainActivity.this, BuatPesan.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
