package pe.edu.ulima.tastyfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ReservarActivity extends AppCompatActivity implements View.OnClickListener{


    private Button but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservar);


        but=(Button) findViewById(R.id.butReservar);
        but.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(ReservarActivity.this, "Pedido Reservado", Toast.LENGTH_SHORT).show();
    }

}
