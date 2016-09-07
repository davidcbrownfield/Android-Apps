package com.example.x75572.touchdown;

import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    Stack<Pair<Character, Integer>> stack = new Stack();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 6 point.
     */
    public void plusSixTeamA(View v) {
        scoreTeamA += 6;
        displayScoreA(scoreTeamA);
        stack.push(Pair.create('A', 6));
    }

    /**
     * Increase the score for Team A by 3 point.
     */
    public void plusThreeTeamA(View v) {
        scoreTeamA += 3;
        displayScoreA(scoreTeamA);
        stack.push(Pair.create('A', 3));
    }

    /**
     * Increase the score for Team A by 2 point.
     */
    public void plusTwoTeamA(View v) {
        scoreTeamA += 2;
        displayScoreA(scoreTeamA);
        stack.push(Pair.create('A', 2));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void plusOneTeamA(View v) {
        scoreTeamA += 2;
        displayScoreA(scoreTeamA);
        stack.push(Pair.create('A', 1));
    }

    /**
     * Increase the score for Team B by 6 point.
     */
    public void plusSixTeamB(View v) {
        scoreTeamB += 6;
        displayScoreB(scoreTeamB);
        stack.push(Pair.create('B', 6));
    }

    /**
     * Increase the score for Team B by 3 point.
     */
    public void plusThreeTeamB(View v) {
        scoreTeamB += 3;
        displayScoreB(scoreTeamB);
        stack.push(Pair.create('B', 3));
    }

    /**
     * Increase the score for Team B by 2 point.
     */
    public void plusTwoTeamB(View v) {
        scoreTeamB += 2;
        displayScoreB(scoreTeamB);
        stack.push(Pair.create('B', 2));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void plusOneTeamB(View v) {
        scoreTeamB += 2;
        displayScoreB(scoreTeamB);
        stack.push(Pair.create('B', 1));
    }

    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets both teams score to 0
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }

    public void undoScore(View v) {
        if (!stack.isEmpty()) {
            Pair<Character, Integer> p = stack.pop();
            if (p.first == 'A') {
                scoreTeamA -= p.second;
                displayScoreA(scoreTeamA);
            } else {
                scoreTeamB -= p.second;
                displayScoreB(scoreTeamB);
            }
        }
    }

}
