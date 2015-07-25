package com.example.administrator.mono;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToMono = (Button)findViewById(R.id.btnToMono);
        btnToMono.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Click!", Toast.LENGTH_LONG).show();
                Intent intentToMonoActivity = new Intent(MainActivity.this, MonoStateActivity.class);
                startActivity(intentToMonoActivity);
            }
        });


    }

}
