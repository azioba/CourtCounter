package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int threePointA = 0;
    int twoPointA = 0;
    int onePointA = 0;
    int threePointB = 0;
    int twoPointB = 0;
    int onePointB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ///////////////////////////////////////////////////////

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        threePointA = 0;
        twoPointA = 0;
        onePointA = 0;
        threePointB = 0;
        twoPointB = 0;
        onePointB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        display3TeamA(threePointA);
        display2TeamA(twoPointA);
        display1TeamA(onePointA);
        display3TeamB(threePointA);
        display2TeamB(twoPointA);
        display1TeamB(onePointA);
    }
    ///////////////////////////////////////////////////////

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        threePointA = threePointA + 1;
        displayForTeamA(scoreTeamA);
        display3TeamA(threePointA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        twoPointA =twoPointA + 1;
        displayForTeamA(scoreTeamA);
        display2TeamA(twoPointA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        onePointA = onePointA + 1;
        displayForTeamA(scoreTeamA);
        display1TeamA(onePointA);
    }

    ///////////////////////////////////////////////////////

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        threePointB = threePointB + 1;
        displayForTeamB(scoreTeamB);
        display3TeamB(threePointB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        twoPointB = twoPointB + 1;
        displayForTeamB(scoreTeamB);
        display2TeamB(twoPointB);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        onePointB = onePointB + 1;
        displayForTeamB(scoreTeamB);
        display1TeamB(onePointB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the 3 points for Team A.
     */
    public void display3TeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.increment_three_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the 2 points for Team A.
     */
    public void display2TeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.increment_two_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Free Throws for Team A.
     */
    public void display1TeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.increment_one_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the 3 points for Team B.
     */
    public void display3TeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.increment_three_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the 2 points for Team B.
     */
    public void display2TeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.increment_two_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Free Throws for Team B.
     */
    public void display1TeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.increment_one_b);
        scoreView.setText(String.valueOf(score));
    }
}
