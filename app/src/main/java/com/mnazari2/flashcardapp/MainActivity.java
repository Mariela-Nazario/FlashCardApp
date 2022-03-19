package com.mnazari2.flashcardapp;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isShowingAnswers = true;
    TextView question;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question = findViewById(R.id.flashcard_question);
        answer = findViewById(R.id.flashcard_answer2);
        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.my_green, null));

            }
        });
        findViewById(R.id.answer1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer1).setBackgroundColor(getResources().getColor(R.color.my_red, null));

            }
        });


        findViewById(R.id.answer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer2).setBackgroundColor(getResources().getColor(R.color.my_red, null));

            }
        });
        findViewById(R.id.eye_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isShowingAnswers == true){
                    ((ImageView) findViewById(R.id.eye_notSeen)).setVisibility(View.VISIBLE);
                    ((ImageView) findViewById(R.id.eye_visibility)).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                    isShowingAnswers = false;
                }


            }
        });
        findViewById(R.id.eye_notSeen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isShowingAnswers == false){
                    ((ImageView) findViewById(R.id.eye_notSeen)).setVisibility(View.INVISIBLE);
                    ((ImageView) findViewById(R.id.eye_visibility)).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer1).setVisibility(View.VISIBLE);
                    findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                    isShowingAnswers = true;
                }


            }
        });
        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer2).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
                findViewById(R.id.answer2).setVisibility(View.INVISIBLE);
                findViewById(R.id.answer1).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                if(isShowingAnswers =  true){
                    ((ImageView) findViewById(R.id.eye_visibility)).setVisibility(View.INVISIBLE);
                }
                else{
                    ((ImageView) findViewById(R.id.eye_notSeen)).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                }
            }
        });
        findViewById(R.id.flashcard_answer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer2).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
                if(isShowingAnswers = true) {
                    findViewById(R.id.answer2).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer1).setVisibility(View.VISIBLE);
                    findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                    ((ImageView) findViewById(R.id.eye_visibility)).setVisibility(View.VISIBLE);
                    ((ImageView) findViewById(R.id.eye_notSeen)).setVisibility(View.INVISIBLE);
                }else{
                    ((ImageView) findViewById(R.id.eye_notSeen)).setVisibility(View.VISIBLE);
                    ((ImageView) findViewById(R.id.eye_visibility)).setVisibility(View.INVISIBLE);


                }
            }
        });

        findViewById(R.id.plus_sign).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddCardActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 ) { // this 100 needs to match the 100 we used when we called startActivityForResult!
           if(data != null) {
               String string1 = data.getExtras().getString("string1"); // 'string1' needs to match the key we used when we put the string in the Intent
               String string2 = data.getExtras().getString("string2");
               question.setText(string1);
               answer.setText(string2);


           }
        }

    }
}