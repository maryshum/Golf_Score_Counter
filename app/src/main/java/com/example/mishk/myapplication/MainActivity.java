package com.example.mishk.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public TextView scoreView1;
public TextView scoreView2;
public TextView scoreView3;
public TextView scoreView4;
public TextView scoreView5;
public TextView scoreView6;
    int totalScoreForPlayer1 = 0;
    int totalScoreForPlayer2 = 0;
    int scoreForH1ForPlayer1 = 0;
    int scoreForH1ForPlayer2 = 0;
    int scoreForH2ForPlayer1 = 0;
    int scoreForH2ForPlayer2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreView1 = findViewById(R.id.totalScoreForPlayer1);
        scoreView2 = findViewById(R.id.totalScoreForPlayer2);
        scoreView3 = findViewById(R.id.scoreForH1Golfer1);
        scoreView4 = findViewById(R.id.scoreForH1Golfer2);
        scoreView5 = findViewById(R.id.scoreForH2Golfer1);
        scoreView6 = findViewById(R.id.scoreForH2Golfer2);
    }

    public void displayTotalScoreForPlayer1(int score) {
        scoreView1.setText(String.valueOf(score));
    }
    public void displayTotalScoreForPlayer2(int score) {
        scoreView2.setText(String.valueOf(score));
    }
    public void displayScoreForH1ForPlayer1(int score) {
        scoreView3.setText(String.valueOf(score));
    }
    public void displayScoreForH1ForPlayer2(int score) {
        scoreView4.setText(String.valueOf(score));
    }
    public void displayScoreForH2ForPlayer1 (int score){
        scoreView5.setText(String.valueOf(score));
    }
    public void displayScoreForH2ForPlayer2 (int score){
        scoreView6.setText(String.valueOf(score));
    }

    public void setScoreForH1ForGolfer1 (View v){
            switch (v.getId()){
                case R.id.minus_button1:
                    scoreForH1ForPlayer1=scoreForH1ForPlayer1-1;
                    displayScoreForH1ForPlayer1(scoreForH1ForPlayer1);
                    break;
                    case R.id.plus_button1:
                        scoreForH1ForPlayer1=scoreForH1ForPlayer1+1;
                        displayScoreForH1ForPlayer1(scoreForH1ForPlayer1);
                        break;
        }
    }

    public void setScoreForH1ForGolfer2 (View v){
            switch (v.getId()){
                case R.id.minus1H1P2:
                    scoreForH1ForPlayer2=scoreForH1ForPlayer2-1;
                    displayScoreForH1ForPlayer2(scoreForH1ForPlayer2);
                    break;
                case R.id.plusH1P2:
                    scoreForH1ForPlayer2=scoreForH1ForPlayer2+1;
                    displayScoreForH1ForPlayer2(scoreForH1ForPlayer2);
                    break;
            }
    }
    public void setScoreForH2ForGolfer1 (View v){
        switch (v.getId()){
            case R.id.minus1H2P1:
                scoreForH2ForPlayer1=scoreForH2ForPlayer1-1;
                displayScoreForH2ForPlayer1(scoreForH2ForPlayer1);
                break;
            case R.id.plus1H2P1:
                scoreForH2ForPlayer1=scoreForH2ForPlayer1+1;
                displayScoreForH2ForPlayer1(scoreForH2ForPlayer1);
                break;

        }
    }

       public void setScoreForH2ForGolfer2 (View v){
    switch (v.getId()){
        case R.id.minus1H2P2:
            scoreForH2ForPlayer2=scoreForH2ForPlayer2-1;
            displayScoreForH2ForPlayer2(scoreForH2ForPlayer2);
            break;
        case R.id.plus1H2P2:
        scoreForH2ForPlayer2=scoreForH2ForPlayer2+2;
        displayScoreForH2ForPlayer2(scoreForH2ForPlayer2);
        break;
    }
    }

    public void setTotalScoreForPlayers (View v) {
        totalScoreForPlayer1=scoreForH1ForPlayer1+scoreForH2ForPlayer1;
        displayTotalScoreForPlayer1(totalScoreForPlayer1);
        totalScoreForPlayer2=scoreForH1ForPlayer2+scoreForH2ForPlayer2;
        displayTotalScoreForPlayer2(totalScoreForPlayer2);
    }

    public void resetScore (View v){
        totalScoreForPlayer1=0;
        totalScoreForPlayer2=0;
        scoreForH1ForPlayer1=0;
        scoreForH1ForPlayer2=0;
        scoreForH2ForPlayer1=0;
        scoreForH2ForPlayer2=0;
        displayTotalScoreForPlayer1(totalScoreForPlayer1);
        displayTotalScoreForPlayer2(totalScoreForPlayer2);
        displayScoreForH1ForPlayer1(scoreForH1ForPlayer1);
        displayScoreForH1ForPlayer2(scoreForH1ForPlayer2);
        displayScoreForH2ForPlayer1(scoreForH2ForPlayer1);
        displayScoreForH2ForPlayer2(scoreForH2ForPlayer2);
    }
}