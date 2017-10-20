package com.example.alumnomy.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle; import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText n1; private EditText n2; private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.n1); n2=(EditText)findViewById(R.id.n2);
        res=(TextView)findViewById(R.id.res);
        res.setText("");
    }
    //Cuando se pulsa el botón:
    public void sumar(View view) {
        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();
        if (valor1.equals("")  || valor2.equals("")) {
            Toast.makeText(MainActivity.this, "Ingrese un numero", Toast.LENGTH_SHORT).show();
            res.setText("");
            return;
        }
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);

        double suma = nro1 + nro2;
        String resu = String.valueOf(suma);
        res.setText(resu);

    }

    public void multiplicar(View view) {
        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();
        if (valor1.equals("")  || valor2.equals("")) {
            Toast.makeText(MainActivity.this, "Ingrese un numero", Toast.LENGTH_SHORT).show();
            res.setText("");
            return;
        }
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);

        double multiplicar = nro1 * nro2;
        String resu = String.valueOf(multiplicar);
        res.setText(resu);
    }
    public void mayor(View view) {

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

        if (valor1.equals("")  || valor2.equals("")) {
            Toast.makeText(MainActivity.this, "Ingrese un numero", Toast.LENGTH_SHORT).show();
            res.setText("");
            return;
        }

        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);

        double mayor=0;
        if(nro1>nro2) {
            mayor = nro1;
        } else if (nro2>nro1) {
            mayor = nro2;
        }
        String resu = String.valueOf(mayor);
        res.setText(resu);
    }
    public void menor(View view) {
        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();
        if (valor1.equals("")  || valor2.equals("")) {
            Toast.makeText(MainActivity.this, "Ingrese un numero", Toast.LENGTH_SHORT).show();
            res.setText("");
            return;
        }
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);

        double menor=0;
        if(nro1>nro2) {
            menor = nro2;
        } else if (nro2>nro1) {
            menor = nro1;
        }
        String resu = String.valueOf(menor);
        res.setText(resu);
    }
    public void restar(View view) {
        String valor1=n1.getText().toString();
        String valor2=n2.getText().toString();
        if (valor1.equals("")  || valor2.equals("")) {
            Toast.makeText(MainActivity.this, "Ingrese un numero", Toast.LENGTH_SHORT).show();
            res.setText("");
            return;
        }
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);

        double resta=nro2-nro1;
        String resu=String.valueOf(resta);
        res.setText(resu);
    }
}
