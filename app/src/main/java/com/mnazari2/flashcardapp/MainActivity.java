package com.mnazari2.flashcardapp;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isShowingAnswers = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                MainActivity.this.startActivity(intent);
            }
        });

    }
}