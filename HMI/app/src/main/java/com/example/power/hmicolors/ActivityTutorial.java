package com.example.power.hmicolors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTutorial extends AppCompatActivity {
    public static String EXTRA_MESSAGE = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        TextView textViewTutorial = (TextView) findViewById(R.id.textViewTutorial);
        textViewTutorial.setText(getString(R.string.turorial));

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(ActivityTutorial.EXTRA_MESSAGE);

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

        Button buttonUser = (Button) findViewById(R.id.buttonBenutzer);
        buttonUser.setOnClickListener(new View.OnClickListener() {
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
        intent.putExtra(EXTRA_MESSAGE, "ViewActivityUsers");
        startActivity(intent);
    }
}
