package com.example.power.hmicolors;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class ActivityImages extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.power.MESSAGE";

    private ImageView iv = null;
    private RadioGroup radioGroup = null;
    private RadioButton radioButton1 = null;
    private RadioButton radioButton2 = null;
    private RadioButton radioButton3 = null;
    private Button button = null;
    private ImplResult implResult = null;
    private ImplTest testsequenz = null;
    private Integer countUsers = 0;
    private Integer countTests = 0;
    private Integer pic_count = 0;
    private Integer countView = 0;

    /**
     * Place your UI with setContentView(View) in onCreate()
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images); // Set layout

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(ActivityTutorial.EXTRA_MESSAGE);

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();


        /**
         * Create instances
         */
        testsequenz = new ImplTest();
        implResult = new ImplResult();


        /**
         * Create UI Elements
         */
        iv = (ImageView) findViewById(R.id.imageView);
        radioGroup = (RadioGroup) findViewById(R.id.radioGrp);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        button = (Button) findViewById(R.id.button_true);

        testsequenz.set_Test();
        implResult.set_answers();


        final Button button = (Button) findViewById(R.id.button_true);

        int resID = getResources().getIdentifier(testsequenz.get_test_pic_path(0),"drawable", getPackageName());
        iv.setImageResource(resID);
        radioButton1.setText( getString(R.string.sehtest_01_01) );
        radioButton2.setText( getString(R.string.sehtest_01_02) );
        radioButton3.setText( getString(R.string.sehtest_01_03) );


        /**
         * On click listener for button
         */
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(pic_count < 9){
                    ++pic_count;
                    int resID = getResources().getIdentifier(testsequenz.get_test_pic_path(pic_count),"drawable", getPackageName());
                    iv.setImageResource(resID);
                }else{
                    launchActivity();
                }

                switch(pic_count){
                    case 1:
                        radioButton1.setText( getString(R.string.sehtest_02_01) );
                        radioButton2.setText( getString(R.string.sehtest_02_02) );
                        radioButton3.setText( getString(R.string.sehtest_02_03) );
                        break;
                    case 2:
                        radioButton1.setText( getString(R.string.sehtest_03_01) );
                        radioButton2.setText( getString(R.string.sehtest_03_02) );
                        radioButton3.setText( getString(R.string.sehtest_03_03) );
                        break;
                    case 3:
                        radioButton1.setText( getString(R.string.sehtest_04_01) );
                        radioButton2.setText( getString(R.string.sehtest_04_02) );
                        radioButton3.setText( getString(R.string.sehtest_04_03) );
                        break;
                    case 4:
                        radioButton1.setText( getString(R.string.sehtest_05_01) );
                        radioButton2.setText( getString(R.string.sehtest_05_02) );
                        radioButton3.setText( getString(R.string.sehtest_05_03) );
                        break;
                    case 5:
                        radioButton1.setText( getString(R.string.sehtest_06_01) );
                        radioButton2.setText( getString(R.string.sehtest_06_02) );
                        radioButton3.setText( getString(R.string.sehtest_06_03) );
                        break;
                    case 6:
                        radioButton1.setText( getString(R.string.sehtest_07_01) );
                        radioButton2.setText( getString(R.string.sehtest_07_02) );
                        radioButton3.setText( getString(R.string.sehtest_07_03) );
                        break;
                    case 7:
                        radioButton1.setText( getString(R.string.sehtest_08_01) );
                        radioButton2.setText( getString(R.string.sehtest_08_02) );
                        radioButton3.setText( getString(R.string.sehtest_08_03) );
                        break;
                    case 8:
                        radioButton1.setText( getString(R.string.sehtest_09_001) );
                        radioButton2.setText( getString(R.string.sehtest_09_002) );
                        radioButton3.setText( getString(R.string.sehtest_09_003) );
                        break;
                    case 9:
                        radioButton1.setText( getString(R.string.sehtest_10_01) );
                        radioButton2.setText( getString(R.string.sehtest_10_02) );
                        radioButton3.setText( getString(R.string.sehtest_10_03) );
                        break;
                }

            }
        });

        /**
         * On click listener for radio group
         */
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                // checkedId is the RadioButton selected

                if(getResources().getResourceEntryName(checkedId).equals(implResult.get_answer(pic_count))){
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    public void launchActivity(){
        Controller.countView++;
        Intent intentActivity = new Intent(this, Controller.class);
        intentActivity.putExtra(EXTRA_MESSAGE, "ViewActivityResult");
        startActivity(intentActivity);
    }
}


