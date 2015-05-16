package pe.edu.ulima.layoutsapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import pe.edu.ulima.layoutsapp.Persona;
import pe.edu.ulima.layoutsapp.R;

/**
 * Created by hquintana on 9/05/15.
 */
public class ListadoPersonasAdapter extends BaseAdapter{

    private List<Persona> mPersonas;
    private LayoutInflater inflater;

    public ListadoPersonasAdapter(List<Persona> personas,
                                  Context context){
        mPersonas = personas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mPersonas.size();
    }

    @Override
    public Object getItem(int i) {
        return mPersonas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null){
            view = inflater.inflate(R.layout.item_personas, null);
            viewHolder = new ViewHolder();
            viewHolder.tviNombre =
                    (TextView)view.findViewById(R.id.tviNombre);
            viewHolder.tviApellido =
                    (TextView)view.findViewById(R.id.tviApellido);

            view.setT
        }


        Persona persona = mPersonas.get(i);
        tviNombre.setText(persona.getNombre());
        tviApellido.setText(persona.getApellido());

        return view;
    }

    class ViewHolder{
        TextView tviNombre;
        TextView tviApellido;
    }
}







