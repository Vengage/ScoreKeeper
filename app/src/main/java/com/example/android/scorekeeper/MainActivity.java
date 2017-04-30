package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Game Type can be
     * -1 no game
     * 0 Basketball
     * 1 Football
     * 2 American Football
     * 3 Baseball
     */
    // int gameType = -1;

    // Basketball score
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    // Football score
    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    // American Football score
    int pointsTeamA = 0;
    int pointsTeamB = 0;

    // Baseball score
    int runsTeamA = 0;
    int runsTeamB = 0;
    int outsTeamA = 0;
    int outsTeamB = 0;

    //
    private RelativeLayout basketballRelativeLayout;
    private RelativeLayout footballRelativeLayout;
    private RelativeLayout americanFootballRelativeLayout;
    private RelativeLayout baseballRelativeLayout;
    private LinearLayout gameChangerLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameChangerLinearLayout = (LinearLayout) findViewById(R.id.game_changer);

        basketballRelativeLayout = (RelativeLayout) findViewById(R.id.basketball_score);
        footballRelativeLayout = (RelativeLayout) findViewById(R.id.football_score);
        americanFootballRelativeLayout = (RelativeLayout) findViewById(R.id.american_football_score);
        baseballRelativeLayout = (RelativeLayout) findViewById(R.id.baseball_score);
    }

    // Game choosing functions

    /**
     * This is function is called when a game type is selected
     *
     * @param view The button pressed to select a game
     */
    public void onButtonClicked(View view) {

        // Check which button was clicked
        switch (view.getId()) {
            case R.id.button_basketball_score:
                chooseBasketball();
                break;
            case R.id.button_football_score:
                chooseFootball();
                break;
            case R.id.button_american_football_score:
                chooseAmericanFootball();
                break;
            case R.id.button_baseball_score:
                chooseBaseball();
                break;
        }
    }

    /**
     * This function is called by the Game button and it is used to change
     * the type of game that it is used for to keep the score
     */
    public void changeGame(View view) {

        // We show the gameChanger and we hide the rest of the games
        gameChangerLinearLayout.setVisibility(View.VISIBLE);

        // Hide every game
        basketballRelativeLayout.setVisibility(View.GONE);
        footballRelativeLayout.setVisibility(View.GONE);
        americanFootballRelativeLayout.setVisibility(View.GONE);
        baseballRelativeLayout.setVisibility(View.GONE);

    }

    /**
     * This function is called when the basketball score button is presed
     */
    public void chooseBasketball() {
        // We show the gameChanger and we hide the rest of the games
        gameChangerLinearLayout.setVisibility(View.GONE);

        // Hide every game
        basketballRelativeLayout.setVisibility(View.VISIBLE);
    }

    /**
     * This function is called when the football score button is pressed
     */
    public void chooseFootball() {
        // We show the gameChanger and we hide the rest of the games
        gameChangerLinearLayout.setVisibility(View.GONE);

        // Hide every game
        footballRelativeLayout.setVisibility(View.VISIBLE);
    }

    /**
     * This function called when the american football score button is pressed
     */
    public void chooseAmericanFootball() {
        // We show the gameChanger and we hide the rest of the games
        gameChangerLinearLayout.setVisibility(View.GONE);

        // Hide every game
        americanFootballRelativeLayout.setVisibility(View.VISIBLE);
    }

    /**
     * This function is called when the baseball score button is pressed
     */
    public void chooseBaseball() {
        // We show the gameChanger and we hide the rest of the games
        gameChangerLinearLayout.setVisibility(View.GONE);

        // Hide every game
        baseballRelativeLayout.setVisibility(View.VISIBLE);
    }

    // Basketball score functions

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score_basketball);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score_basketball);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Updates the given score for Team A with 3 points.
     */
    public void addThreePointsForTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Updates the given score for Team A with 2 points.
     */
    public void addTwoPointsForTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Updates the given score for Team A with 1 points.
     */
    public void freeThrowTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Updates the given score for Team B with 3 points.
     */
    public void addThreePointsForTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Updates the given score for Team B with 2 points.
     */
    public void addTwoPointsForTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Updates the given score for Team B with 1 points.
     */
    public void freeThrowTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets specific values for Team A and Team B to 0.
     */
    public void resetScore(View view) {
        switch (view.getId()) {
            case R.id.reset_basketball: {
                // Reset score
                scoreTeamA = 0;
                scoreTeamB = 0;
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
                break;
            }
            case R.id.reset_football: {
                // Reset goals
                goalsTeamA = 0;
                goalsTeamB = 0;
                displayGoalsTeamA(goalsTeamA);
                displayGoalsTeamB(goalsTeamB);

                // Reset fouls
                foulsTeamA = 0;
                foulsTeamB = 0;
                displayFoulsTeamA(foulsTeamA);
                displayFoulsTeamB(foulsTeamB);

                break;
            }
            case R.id.reset_american_football: {
                pointsTeamA = 0;
                pointsTeamB = 0;
                displayScoreAmericanFootballTeamA(pointsTeamA);
                displayScoreAmericanFootballTeamB(pointsTeamB);
                break;
            }
            case R.id.reset_baseball: {
                // Reset runs
                runsTeamA = 0;
                runsTeamB = 0;
                displayRunsTeamA(runsTeamA);
                displayRunsTeamB(runsTeamB);

                // Reset outs
                outsTeamA = 0;
                outsTeamB = 0;
                displayOutsTeamA(outsTeamA);
                displayOutsTeamB(outsTeamB);

                break;
            }
        }

    }

    // Football score functions

    /**
     * Display the number of goals for Team A
     *
     * @param goalsCount The number of goals
     */
    public void displayGoalsTeamA(int goalsCount) {
        TextView goalsTeamA = (TextView) findViewById(R.id.team_a_score_football);
        goalsTeamA.setText(String.valueOf(goalsCount));
    }

    /**
     * Display the number of goals for Team B
     *
     * @param goalsCount The number of goals
     */
    public void displayGoalsTeamB(int goalsCount) {
        TextView goalsTeamB = (TextView) findViewById(R.id.team_b_score_football);
        goalsTeamB.setText(String.valueOf(goalsCount));
    }

    /**
     * Add a goal to Team A
     *
     * @param view The button to increment the score for Team A
     */
    public void addGoalTeamA(View view) {
        goalsTeamA += 1;
        displayGoalsTeamA(goalsTeamA);
    }

    /**
     * Add a goal to Team B
     *
     * @param view The button to increment the score for Team B
     */
    public void addGoalTeamB(View view) {
        goalsTeamB += 1;
        displayGoalsTeamB(goalsTeamB);
    }

    /**
     * Display the number of fouls for Team A
     *
     * @param foulsCount The number of fouls for the Team
     */
    public void displayFoulsTeamA(int foulsCount) {
        TextView foulsTeamA = (TextView) findViewById(R.id.foul_a_football);
        foulsTeamA.setText(String.valueOf(foulsCount));
    }

    /**
     * Add a foul to Team A
     *
     * @param view The button to increment the fouls count for Team A
     */
    public void addFoulTeamA(View view) {
        foulsTeamA += 1;
        displayFoulsTeamA(foulsTeamA);
    }

    /**
     * Display the number of fouls for Team B
     *
     * @param foulsCount The number of fouls for the Team
     */
    public void displayFoulsTeamB(int foulsCount) {
        TextView foulsTeamB = (TextView) findViewById(R.id.foul_b_football);
        foulsTeamB.setText(String.valueOf(foulsCount));
    }

    /**
     * Add a foul to Team B
     *
     * @param view The button to increment the fouls count for Team B
     */
    public void addFoulTeamB(View view) {
        foulsTeamB += 1;
        displayFoulsTeamB(foulsTeamB);
    }

    // American Football score functions

    /**
     * Display the number of points for Team A
     *
     * @param points The number of points of the team
     */
    public void displayScoreAmericanFootballTeamA(int points) {
        TextView pointsTeamA = (TextView) findViewById(R.id.team_a_score_american_football);
        pointsTeamA.setText(String.valueOf(points));
    }

    /**
     * Add 6 points to Team A score
     *
     * @param view The button to increment the score for Team A with 6 points
     */
    public void addTouchdownTeamA(View view) {
        pointsTeamA += 6;
        displayScoreAmericanFootballTeamA(pointsTeamA);
    }

    /**
     * Add 1 points to Team A score
     *
     * @param view The button to increment the score for Team A with 1 point
     */
    public void addExtraPointTeamA(View view) {
        pointsTeamA += 1;
        displayScoreAmericanFootballTeamA(pointsTeamA);
    }

    /**
     * Add 2 points to Team A score
     *
     * @param view The button to increment the score for Team A with 2 points for conversion
     */
    public void addConversionTeamA(View view) {
        pointsTeamA += 2;
        displayScoreAmericanFootballTeamA(pointsTeamA);
    }

    /**
     * Add 3 points to Team A score
     *
     * @param view The button to increment the score for Team A with 3 points
     */
    public void addFieldGoalTeamA(View view) {
        pointsTeamA += 3;
        displayScoreAmericanFootballTeamA(pointsTeamA);
    }

    /**
     * Add 2 points to Team A score
     *
     * @param view The button to increment the score for Team A with 2 points for safety
     */
    public void addSafetyTeamA(View view) {
        pointsTeamA += 2;
        displayScoreAmericanFootballTeamA(pointsTeamA);
    }

    /**
     * Display the number of points for Team B
     *
     * @param points The number of points of the team
     */
    public void displayScoreAmericanFootballTeamB(int points) {
        TextView pointsTeamB = (TextView) findViewById(R.id.team_b_score_american_football);
        pointsTeamB.setText(String.valueOf(points));
    }

    /**
     * Add 6 points to Team B score
     *
     * @param view The button to increment the score for Team B with 6 points
     */
    public void addTouchdownTeamB(View view) {
        pointsTeamB += 6;
        displayScoreAmericanFootballTeamB(pointsTeamB);
    }

    /**
     * Add 1 points to Team B score
     *
     * @param view The button to increment the score for Team B with 1 points
     */
    public void addExtraPointTeamB(View view) {
        pointsTeamB += 1;
        displayScoreAmericanFootballTeamB(pointsTeamB);
    }

    /**
     * Add 2 points to Team B score
     *
     * @param view The button to increment the score for Team B with 2 points for conversion
     */
    public void addConversionTeamB(View view) {
        pointsTeamB += 2;
        displayScoreAmericanFootballTeamB(pointsTeamB);
    }

    /**
     * Add 3 points to Team B score
     *
     * @param view The button to increment the score for Team B with 3 points
     */
    public void addFieldGoalTeamB(View view) {
        pointsTeamB += 3;
        displayScoreAmericanFootballTeamB(pointsTeamB);
    }

    /**
     * Add 2 points to Team B score
     *
     * @param view The button to increment the score for Team B with 2 points for safety
     */
    public void addSafetyTeamB(View view) {
        pointsTeamB += 2;
        displayScoreAmericanFootballTeamB(pointsTeamB);
    }


    // Baseball score functions

    /**
     * Display the number of runs for Team A
     *
     * @param runsNumber The number of runs for the Team
     */
    public void displayRunsTeamA(int runsNumber) {
        TextView runsForTeamA = (TextView) findViewById(R.id.team_a_score_baseball);
        runsForTeamA.setText(String.valueOf(runsNumber));
    }

    /**
     * Display the number of runs for Team B
     *
     * @param runsNumber The number of runs for the Team
     */
    public void displayRunsTeamB(int runsNumber) {
        TextView runsForTeamB = (TextView) findViewById(R.id.team_b_score_baseball);
        runsForTeamB.setText(String.valueOf(runsNumber));
    }

    /**
     * Add one run for Team A
     *
     * @param view The button to increment the runs for Team A
     */
    public void addRunTeamA(View view) {
        runsTeamA += 1;
        displayRunsTeamA(runsTeamA);
    }

    /**
     * Add one run for Team B
     *
     * @param view The button to increment the runs for Team B
     */
    public void addRunTeamB(View view) {
        runsTeamB += 1;
        displayRunsTeamB(runsTeamB);
    }

    /**
     * Display the number of outs for Team A
     *
     * @param outsNumber The number of outs for the team
     */
    public void displayOutsTeamA(int outsNumber) {
        TextView outsForTeamA = (TextView) findViewById(R.id.out_a_baseball);
        outsForTeamA.setText(String.valueOf(outsNumber));
    }

    /**
     * Display the number of outs for Team B
     *
     * @param outsNumber The number of outs for the team
     */
    public void displayOutsTeamB(int outsNumber) {
        TextView outsForTeamB = (TextView) findViewById(R.id.out_b_baseball);
        outsForTeamB.setText(String.valueOf(outsNumber));
    }

    /**
     * Add one out for Team A
     *
     * @param view The button to increment the outs for Team A
     */
    public void addOutTeamA(View view) {
        outsTeamA += 1;
        displayOutsTeamA(outsTeamA);
    }

    /**
     * Add one out for Team B
     *
     * @param view The button to increment the outs for Team A
     */
    public void addOutTeamB(View view) {
        outsTeamB += 1;
        displayOutsTeamB(outsTeamB);
    }
}
