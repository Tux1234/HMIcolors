package com.example.power.hmicolors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityDynamicColors extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.power.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_colors);

        Button buttonNext = (Button) findViewById(R.id.buttonDynamicNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
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
        intent.putExtra(EXTRA_MESSAGE, "ViewActivityResult");
        startActivity(intent);
    }
}
