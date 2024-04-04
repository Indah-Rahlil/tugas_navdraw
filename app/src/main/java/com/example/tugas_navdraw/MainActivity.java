package com.example.tugas_navdraw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import fragments.Mkn_fav;
import fragments.Mkn_khas;
import fragments.Mnm_khas;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showHomePage();

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.menu_mknkhas) {
                    showHomePage();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new Mkn_khas())
                            .commit();
                    getSupportActionBar().setTitle("Makanan Khas");
                }
                else if (itemId == R.id.menu_mnmkhas){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new Mnm_khas())
                            .commit();
                    getSupportActionBar().setTitle("Minuman Khas");
                }
                else if (itemId == R.id.menu_mknfav){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new Mkn_fav())
                            .commit();
                    getSupportActionBar().setTitle("Makanan Favorit");
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showHomePage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new Mkn_khas())
                .commit();

        getSupportActionBar().setTitle("Makanan Khas");
    }
}