package crapida.app.consultarapida.fragment;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import crapida.app.consultarapida.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Consultas extends Fragment {


    public Consultas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_consultas, container, false);
    }

}
