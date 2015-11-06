package com.prueba.jeisson.prueba;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fotos extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_fotos, container, false);


        ((UsuarioOk) getActivity()).getSupportActionBar().setTitle("Fotos");

        TextView Album = (TextView)view.findViewById(R.id.lblTituloAlbum);
        TextView Phothos = (TextView)view.findViewById(R.id.lblTituloFotos);

        MainActivity ma = new MainActivity();
        frag_usuario fu = new frag_usuario();
        int f = fu.a;



        String datosUsuario[][] = ma.ArrayUsuarios;
        Album.setText(""+datosUsuario[f][5]);
        Phothos.setText(""+datosUsuario[f][6]);


        return view;
    }

}