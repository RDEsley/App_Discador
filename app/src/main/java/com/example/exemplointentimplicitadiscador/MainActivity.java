package com.example.exemplointentimplicitadiscador;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtTelefone;

    Button btnEfetuarLigacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtTelefone = (EditText) findViewById(R.id.txtTelefone);
        btnEfetuarLigacao = (Button) findViewById(R.id.cmdEfetuarLigacao);
        btnEfetuarLigacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String telefone = edtTelefone.getText().toString();
                Intent intencao = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telefone, null));
                startActivity(intencao);
            }
        });


    }
}