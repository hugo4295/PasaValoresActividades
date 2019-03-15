package mx.edu.tesoem.hugo4295.itics.pasavaloresactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = (EditText) findViewById(R.id.txtnombre);
    }

    public void llamarpantalla(View v){
        Intent llamar = new Intent(this, SegundaPantallaActivity.class);
        llamar.putExtra("Nombre", txtnombre.getText().toString());
        startActivity(llamar);
    }
}
