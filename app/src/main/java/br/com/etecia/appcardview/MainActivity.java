package br.com.etecia.appcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.idToolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");
        getSupportActionBar().setIcon(R.drawable.back);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();

        menuInflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mCompartilhar: startActivity(new Intent(MainActivity.this, CompartilharActivity.class));
                Toast.makeText(getApplicationContext(), "Você clicou na tela de COMPARTILHAR", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfiguracao:startActivity(new Intent(MainActivity.this, ConfiguracoesActivity.class));
                Toast.makeText(getApplicationContext(), "Você clicou na tela de CONFIGURAÇÕES", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mFavoritos:startActivity(new Intent(MainActivity.this, FavoritosActivity.class));
                Toast.makeText(getApplicationContext(), "Você clicou na tela de FAVORITOS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSobre:startActivity(new Intent(MainActivity.this, SobreActivity.class));
                Toast.makeText(getApplicationContext(), "Você clicou na tela de SOBRE", Toast.LENGTH_SHORT).show();
                break;
                case R.id.mTempo:startActivity(new Intent(MainActivity.this, TempoActivity.class));
                Toast.makeText(getApplicationContext(), "Você clicou na tela de SOBRE", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
