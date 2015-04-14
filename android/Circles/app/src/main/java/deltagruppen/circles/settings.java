package deltagruppen.circles;

/**
 * Created by aphia on 2015-04-13.
 */
import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.Locale;


public class settings extends ActionBarActivity {
    TextView textbtn; Locale mylocale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name));
        setContentView(R.layout.setting);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        textbtn = (TextView)findViewById(R.id.textView01);
        textbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            LayoutInflater inflator = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View popupview = inflator.inflate(R.layout.popuplanguage, null);
            final PopupWindow popupWindow = new PopupWindow(popupview, ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT );

            Button eng = (Button)popupview.findViewById(R.id.eng);
                eng.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //popupWindow.dismiss();
                        String languageToLoad = "en";
                        mylocale = new Locale(languageToLoad);
                        Resources res = getResources();
                        DisplayMetrics dm = res.getDisplayMetrics();
                        Configuration conf = res.getConfiguration();
                        conf.locale = mylocale;
                        res.updateConfiguration(conf, dm);
                        Intent refresh = new Intent(settings.this, settings.class);
                        startActivity(refresh);
                        // popupWindow.dismiss();
                    }
                });

            Button swe = (Button)popupview.findViewById(R.id.swe);
                swe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String languageToLoad = "sv";
                        mylocale = new Locale(languageToLoad);
                        Resources res = getResources();
                        DisplayMetrics dm = res.getDisplayMetrics();
                        Configuration conf = res.getConfiguration();
                        conf.locale = mylocale;
                        res.updateConfiguration(conf, dm);
                        Intent refresh = new Intent(settings.this, settings.class);
                        startActivity(refresh);
                       // popupWindow.dismiss();
                    }
                });
                popupWindow.showAsDropDown(textbtn, 50,50);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_setting, menu);
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
    public void showCalculatingPiInfo(MenuItem item) {
        Intent intent = new Intent(this, CalculatingPi.class);
        startActivity(intent);
    }
}
