package deltagruppen.circles;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

public class HighScore extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name));
        setContentView(R.layout.activity_highscore);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        updateAllScores();
    }

//    @Override
//    protected void onResume() {
//        updateAllScores();
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_highscore, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showPiInfo(MenuItem item) {
        Intent intent = new Intent(this, PiInfo.class);
        startActivity(intent);
    }

    public void showAppInfo(MenuItem item) {
        Intent intent = new Intent(this, AppInfo.class);
        startActivity(intent);
    }

    public void updateAllScores () {
        getPiAtLocation1();
        getPiAtLocation2();
        getPiAtLocation3();
        getPiAtLocation4();
        getPiAtLocation5();
        getPiAtLocation6();
        getPiAtLocation7();
        getPiAtLocation8();
        getPiAtLocation9();
        getPiAtLocation10();
    }

    public void getPiAtLocation1 () {
        setContentView(R.layout.activity_highscore);
        TextView score1 = (TextView) findViewById(R.id.pi1);
        score1.setText("Temp1");
    }

    public void getPiAtLocation2 () {
        setContentView(R.layout.activity_highscore);
        TextView score2 = (TextView) findViewById(R.id.pi2);
        score2.setText("Temp2");
    }

    public void getPiAtLocation3 () {
        setContentView(R.layout.activity_highscore);
        TextView score3 = (TextView) findViewById(R.id.pi3);
        score3.setText("Temp3");
    }

    public void getPiAtLocation4 () {
        setContentView(R.layout.activity_highscore);
        TextView score4 = (TextView) findViewById(R.id.pi4);
        score4.setText("Temp4");
    }

    public void getPiAtLocation5 () {
        setContentView(R.layout.activity_highscore);
        TextView score5 = (TextView) findViewById(R.id.pi5);
        score5.setText("Temp5");
    }

    public void getPiAtLocation6 () {
        setContentView(R.layout.activity_highscore);
        TextView score6 = (TextView) findViewById(R.id.pi6);
        score6.setText("Temp6");
    }

    public void getPiAtLocation7 () {
        setContentView(R.layout.activity_highscore);
        TextView score7 = (TextView) findViewById(R.id.pi7);
        score7.setText("Temp7");
    }

    public void getPiAtLocation8 () {
        setContentView(R.layout.activity_highscore);
        TextView score8 = (TextView) findViewById(R.id.pi8);
        score8.setText("Temp8");
    }

    public void getPiAtLocation9 () {
        setContentView(R.layout.activity_highscore);
        TextView score9 = (TextView) findViewById(R.id.pi9);
        score9.setText("Temp9");
    }

    public void getPiAtLocation10 () {
        setContentView(R.layout.activity_highscore);
        TextView score10 = (TextView) findViewById(R.id.pi10);
        score10.setText("Temp10");
    }

}
