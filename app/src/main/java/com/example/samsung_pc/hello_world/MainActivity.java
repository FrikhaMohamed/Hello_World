package com.example.samsung_pc.hello_world;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv = (TextView)findViewById(R.id.tv1);
        tv.setText("Tawfik Medthafar");
        // Commentaire
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
