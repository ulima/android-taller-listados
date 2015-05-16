package pe.edu.ulima.layoutsapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.List;

import pe.edu.ulima.layoutsapp.adapters.ListadoPersonasAdapter;


public class ListadoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

//        Spinner spiPersonas =
//                (Spinner)findViewById(R.id.spiPersonas);
        ListView lviPersonas =
                (ListView) findViewById(R.id.lviPersonas);
        List<Persona> personas =
                GestorPersonas.getInstance().obtenerPersonas();

        ListadoPersonasAdapter adapter =
                new ListadoPersonasAdapter(personas, this);

        //spiPersonas.setAdapter(adapter);
        lviPersonas.setAdapter(adapter);
    }
}
