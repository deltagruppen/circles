package deltagruppen.circles;


import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.view.ViewGroup.LayoutParams;


public class MainActivity extends ActionBarActivity {
    Button showLangWindow;
    ImageButton showLangWindowIm;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        layout = new LinearLayout(this);
        windowInit();
        prepareButtons();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void windowInit(){
        showLangWindow = (Button) findViewById(R.id.button4);
        showLangWindowIm = (ImageButton) findViewById(R.id.imageButton5);
    }

    public void prepareButtons(){
        showLangWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View langPopup = inflater.inflate(R.layout.layout_lang_popup, null);
                final PopupWindow pop = new PopupWindow(langPopup, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                pop.showAtLocation(layout, 0, 700, 700);
            }
        });
        showLangWindowIm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View langPopup = inflater.inflate(R.layout.layout_lang_popup, null);
                final PopupWindow pop = new PopupWindow(langPopup, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                pop.showAtLocation(layout, 0, 700, 700);
            }
        });
    }


 /*   public void changeLanguage () {

    }*/

    public void showPiInfo(MenuItem item) {
        Intent intent = new Intent(this, PiInfo.class);
        startActivity(intent);
    }

    public void showPiInfo(View view) {
        Intent intent = new Intent(this, PiInfo.class);
        startActivity(intent);
    }

    public void showAppInfo(MenuItem item) {
        Intent intent = new Intent(this, AppInfo.class);
        startActivity(intent);
    }

    public void showAppInfo(View view) {
        Intent intent = new Intent(this, AppInfo.class);
        startActivity(intent);
    }

    public void showCalculatingPiInfo(MenuItem item) {
        Intent intent = new Intent(this, CalculatingPi.class);
        startActivity(intent);
    }

    public void showCalculatingPiInfo(View view) {
        Intent intent = new Intent(this, CalculatingPi.class);
        startActivity(intent);
    }

}
