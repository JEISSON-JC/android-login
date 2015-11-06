package com.prueba.jeisson.prueba;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Post extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_post, container, false);

        ((UsuarioOk) getActivity()).getSupportActionBar().setTitle("Post");

        TextView Post = (TextView)view.findViewById(R.id.lblTituloPost);
        TextView BodyPost = (TextView)view.findViewById(R.id.lblBodyPost);
        TextView NombreComentario = (TextView)view.findViewById(R.id.lblNombreComentario);
        TextView EmailComentario = (TextView)view.findViewById(R.id.lblEmailPost);
        TextView BodyComentario = (TextView)view.findViewById(R.id.lblBodyComentario);



        MainActivity ma = new MainActivity();
        frag_usuario fu = new frag_usuario();
        int f = fu.a;



        String datosUsuario[][] = ma.ArrayUsuarios;
        Post.setText("Titulo:" + datosUsuario[f][7]);
        BodyPost.setText("Descripción: " + datosUsuario[f][8]);
        NombreComentario.setText("Titulo:"+datosUsuario[f][9]);
        EmailComentario.setText("Email:" + datosUsuario[f][10]);
        BodyComentario.setText("Descripción"+datosUsuario[f][11]);


        return view;
    }
}


