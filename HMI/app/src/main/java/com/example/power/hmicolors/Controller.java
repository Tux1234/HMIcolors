package com.example.power.hmicolors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by power on 27.12.2017.
 */

public class Controller extends Activity {
    public static final String EXTRA_MESSAGE = "com.example.power.MESSAGE";
    public static Integer countView = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        Intent intent = getIntent();
        String intentMessageView ="ViewAcvtivityTutorial";
        intentMessageView = intent.getStringExtra(ActivityTutorial.EXTRA_MESSAGE);
        */


        switch(countView){
            case 0:
                launchActivityTutorial();
                break;
            case 1:

                launchActivityUsers();
                break;
            case 2:
                launchActivityGridColors();
                break;
            case 3:
                launchActivityImages();
                break;
            case 4:
                launchActivityDynamicColors();
                break;
            case 5:
                launchActivityResult();
                break;
        }
    }

    private void launchActivityTutorial() {

        Intent intent = new Intent(this, ActivityTutorial.class);
        String message = "Hello From ActivityController";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    private void launchActivityUsers() {

        Intent intent = new Intent(this, ActivityUsers.class);
        String message = "Hello From ActivityController";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    private void launchActivityImages() {

        Intent intent = new Intent(this, ActivityImages.class);
        String message = "Hello From ActivityController";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    private void launchActivityGridColors() {

        Intent intent = new Intent(this, ActivityGridColors.class);
        String message = "Hello From ActivityController";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    private void launchActivityDynamicColors() {

        Intent intent = new Intent(this, ActivityDynamicColors.class);
        String message = "Hello From ActivityController";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    private void launchActivityResult() {

        Intent intent = new Intent(this, ActivityResult.class);
        String message = "Hello From ActivityController";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
