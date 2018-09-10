package com.example.mariam.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorea =0 ;
    int foula = 0 ;
    int scoreb =0 ;
    int foulb = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addaGoal (View view){
        scorea = scorea +1;
        displayGoalForTeamA(scorea);
    }

    public void displayGoalForTeamA (int score){
        TextView scoreView = (TextView) findViewById(R.id.goal_a_team);
        scoreView.setText(String.valueOf(score));
    }

    public void addaFoul (View view){
       foula= foula +1;
        displayFoulForTeamA(foula);
    }

    public void displayFoulForTeamA (int foul){
        TextView foulView = (TextView) findViewById(R.id.foul_a_team);
        foulView.setText(String.valueOf(foul));
    }

    public void addbGoal (View view){
        scoreb = scoreb +1 ;
        displayGoalForTeamB(scoreb);
    }

    public void displayGoalForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.goal_b_team);
        scoreView.setText(String.valueOf(score));
    }

    public void addbFoul (View view){
        foulb++;
        displayFoulForTeamB(foulb);
    }

    public void displayFoulForTeamB (int foul){
        TextView foulView = (TextView)findViewById(R.id.foul_b_team);
        foulView.setText(String.valueOf(foul));
    }

    public void resetButton (View view){
         scorea =0 ;
         foula = 0 ;
         scoreb =0 ;
         foulb = 0 ;

        displayFoulForTeamB(0);
        displayGoalForTeamB(0);
        displayGoalForTeamA(0);
        displayFoulForTeamA(0);

    }
}
