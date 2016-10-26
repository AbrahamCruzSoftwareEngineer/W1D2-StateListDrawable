package com.evolutiondso.www.w1d2_statelistdrawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void domagic(View view) {
        Toast.makeText(this, "Hola Toast!", Toast.LENGTH_SHORT).show();
    }
}
