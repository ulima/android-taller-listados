package pe.edu.ulima.layoutsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity
        implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butLogin = (Button) findViewById(R.id.butLogin);
        Button butSalir = (Button) findViewById(R.id.butSalir);
        butLogin.setOnClickListener(this);
        butSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Codigo butSalir
//                Intent intent =
//                        new Intent(MainActivity.this,
//                                LoginResultadoActivity.class);
//                startActivity(intent);
                finish();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        // Codigo a ejecutar cuando se haga click en el boton Login
        if (view.getId() == R.id.butLogin){
            Intent intent =
                    new Intent(this,
                            LoginResultadoActivity.class);
            intent.putExtra("nombre", "juan");
            Persona persona = new Persona();
            persona.setApellido("Ap1");
            persona.setNombre("Nom1");
            intent.putExtra("persona", persona);
            startActivity(intent);


        }else if (view.getId() == R.id.butSalir){
            // Hace algo con el salir
        }
    }
}
