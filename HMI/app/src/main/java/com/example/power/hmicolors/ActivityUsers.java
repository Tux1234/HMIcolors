package com.example.power.hmicolors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityUsers extends AppCompatActivity {
    public static String EXTRA_MESSAGE = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });

    }
    public void launchActivity(){
        Controller.countView++;
        Intent intent = new Intent(this, Controller.class);
        String message = "Hello from ActivityUsers to Controller";
        intent.putExtra(EXTRA_MESSAGE, "ViewActivityGridColors");
        startActivity(intent);
    }
}


