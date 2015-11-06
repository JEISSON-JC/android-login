package com.prueba.jeisson.prueba;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText password;
    private Button ingreso;
    private TextView error;
    public int numero;
    Random r = new Random();

    String ArrayUsuarios[][] = {
            {"Leanne Graham 1","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 2","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 3","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 4","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 5","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 6","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 7","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 8","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 9","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"},
            {"Leanne Graham 10","Bret","Sincere@april.biz","1-770-736-8031 x56442","Romaguera-Crona","quidem molestiae enim","accusamus beatae ad facilis cum similique qui sunt","sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto","id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // Inflate the layout for this fragment

        usuario = (EditText) findViewById(R.id.txtUsuario);
        password = (EditText) findViewById(R.id.txtPassword);
        error = (TextView) findViewById(R.id.lblError);
        ingreso = (Button) findViewById(R.id.btnIngresar);

        ingreso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (usuario.getText().toString().equals("usuario") && password.getText().toString().equals("usuario")) {

                    Correcto(v);
                } else {
                    error.setText("Datos de acceso invalidos ");
                }
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void Correcto (View v) {
        try {
            frag_usuario fr = new frag_usuario();

            numero=r.nextInt(11);
           // int ra =fr.a;
            Intent ingresar = new Intent(this, UsuarioOk.class);
            startActivity(ingresar);
           // fr.ran=numero;
        }catch(Exception View) {

            }

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
}
