package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class makev extends AppCompatActivity {
    //to make video all ,after setting time

   // TextView timerTextView ;
  //  Button acctionbutton;

    public static final long TIME_LIMIT = 10000;
    private Button acctionbutton;
    private TextView timerTextView;
    private TextView processingTextView;
    private CountDownTimer countDownTimer;

    public Button STARTT ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makev);

        int hourphone = Calendar.getInstance().get(Calendar.HOUR);
        int time;
        time = getIntent().getIntExtra("hourtime",1);

        if(time < hourphone){
             acctionbutton = findViewById(R.id.vd);
             timerTextView = findViewById(R.id.timechanger);
             STARTT = findViewById(R.id.button3);

            countDownTimer = new CountDownTimer(TIME_LIMIT, 100) {
                @Override
                public void onTick(long millisUntilFinished) {
                    // Update the timer display with the remaining time
                    // long secondsRemaining = millisUntilFinished / 1000;
                    // timerTextView.setText("Time remaining: " + secondsRemaining + " seconds");



                    STARTT.setOnClickListener(v -> {
                        String a = "please click on vd button to join the meet ";
                        timerTextView.setText(a);
                        Uri uri = Uri.parse("https://meet.google.com/boc-fvfn-shd"); // missing 'http://' will cause crashed
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                        // intent.putExtra("hourtimr",time);
                    });



                }
                @SuppressLint("SetTextI18n")
                @Override
                public void onFinish() {
                    // Disable the button after the time limit
                    // buttonEnabled = false;
                    // actionButton.setEnabled(false);
                   // acctionbutton.setText("Time limit reached!");
                    timerTextView.setText("the time limit reached hope you enjoyed your session ");
                }
            }.start();


                }

        }
    }
