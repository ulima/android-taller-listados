package pe.edu.ulima.layoutsapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

import pe.edu.ulima.layoutsapp.adapters.ListadoPersonasAdapter;


public class ListadoActivity extends ActionBarActivity
    implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

//        Spinner spiPersonas =
//                (Spinner)findViewById(R.id.spiPersonas);
//        ListView lviPersonas =
//                (ListView) findViewById(R.id.lviPersonas);
        GridView gviPersonas =
                (GridView) findViewById(R.id.gviPersonas);

        List<Persona> personas =
                GestorPersonas.getInstance().obtenerPersonas();

        ListadoPersonasAdapter adapter =
                new ListadoPersonasAdapter(personas, this);

        //spiPersonas.setAdapter(adapter);
        //lviPersonas.setAdapter(adapter);
        gviPersonas.setAdapter(adapter);
        gviPersonas.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView,
                            View view,
                            int i,
                            long l) {
        Persona persona = (Persona)adapterView.getItemAtPosition(i);
        Toast.makeText(this,
                "Persona:" + persona.getNombre(),
                Toast.LENGTH_SHORT).show();
    }
}







