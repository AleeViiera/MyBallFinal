package com.example.myballfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView illuminaty;
    private TextView respuesta;

    private String[] respuestaArray = {"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso",
            "Será mejor que no te lo diga ahora", "No cuentes con ello", "Veo que caeras en oscuro momento", "estas apunto de terner un gran noticia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        illuminaty = findViewById(R.id.boton);

        respuesta = findViewById(R.id.respuesta);

        illuminaty.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Desifrando tu Respuesta",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.boton:
                int random = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[random]);

                break;
        }
    }
}
