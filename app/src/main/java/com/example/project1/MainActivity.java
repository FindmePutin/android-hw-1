      package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

      public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        EditText number1 = findViewById(R.id.editTextTextPersonName2);
        EditText number2 = findViewById(R.id.editTextTextPersonName3);
        EditText number3 = findViewById(R.id.editTextTextPersonName4);
        EditText number4 = findViewById(R.id.editTextTextPersonName5);


        Button button = findViewById(R.id.button);
        TextView TOTAL = findViewById(R.id.TOTAL);

        button.setOnClickListener(new View.OnClickListener(){

           @Override
            public void onClick(View view){
              int total1 = Integer.parseInt( number1.getText().toString());
              int total2 = Integer.parseInt( number2.getText().toString());
              int total3 = Integer.parseInt( number3.getText().toString());
              int total4 = Integer.parseInt( number4.getText().toString());

              int total = (total1 + total2 + total3+total4);
                      TOTAL.setText(total + "");
           }


        });

    }
}