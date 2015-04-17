package deltagruppen.circles;

import android.content.SharedPreferences;
import android.widget.TextView;
import android.content.Context;
import java.math.*;

/**
 * Created by Dante Johansson on 2015-04-09.
 */
public class HighScoreCalculator {

    public static final String HIGH_SCORE = "HighScoreFile";

    boolean isHighScore = false;

    public void startComparing (float pi){

    }

    public void compareWithCurrent(float pi) {
        int i = 0;
        SharedPreferences highscore = getSharedPreferences(HIGH_SCORE, Context.MODE_PRIVATE);
        isHighScore = false;
        while (i < 10) {

            if (isHighScore) {
                addToList(i, pi);
                break;
            }
            i++;
        }

    }

    public void addToList(int placing, float pi) {

    }

    public void updateOldPositions (int startingPosition, float not_as_good_pi) {
        float temp;
        int i = startingPosition+1;
        while (i < 10) {

            i++;
        }
    }

    public void comparer (float user_pi, float record_pi) {
        if (user_pi - record_pi < 0){
            isHighScore = true;
        }
    }


}
