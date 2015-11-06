package com.prueba.jeisson.prueba;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class frag_usuario extends Fragment {

    Random r = new Random();
    int a;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.info_usuario, container, false);

        ((UsuarioOk) getActivity()).getSupportActionBar().setTitle("Usuario");
        UsuarioOk p = new UsuarioOk();
       // p.setFragment(0);
        a=r.nextInt(11);

        TextView Nombre = (TextView)view.findViewById(R.id.lblNombreUsuario);
        TextView Usuario = (TextView)view.findViewById(R.id.lblNumeroUsuario);
        TextView Correo = (TextView)view.findViewById(R.id.lblCorreoUsuario);
        TextView Telefono = (TextView)view.findViewById(R.id.lblTelefonoUsuario);
        TextView Compañia = (TextView)view.findViewById(R.id.lblCompaniaUsuario);

        MainActivity ma = new MainActivity();


        String datosUsuario[][] = ma.ArrayUsuarios;
        String nUsuario[][] = ma.ArrayUsuarios;

        Nombre.setText("Nombre : "+datosUsuario[a][0]);
        Usuario.setText("Usuario : "+nUsuario[a][1]);
        Correo.setText("Correo : "+datosUsuario[a][2]);
        Telefono.setText("Telefono : "+datosUsuario[a][3]);
        Compañia.setText("Compañia : "+datosUsuario[a][4]);

        return view;
    }

}
