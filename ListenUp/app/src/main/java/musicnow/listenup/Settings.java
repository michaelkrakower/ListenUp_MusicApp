package musicnow.listenup;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
/*
*  Settings.class
*  The setting menu of the application
*  @author mike krakower
*  11/6/2015
* */
public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // creates page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings); // loads layout activity_settings.xml
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void toMain(View view){ // takes user to MainActivity.class
        Intent i = new Intent(this, MainActivity.class); // intent
        startActivity(i); // starts activity
    }

    public void toAbout(View view){ // takes user to AboutUs.class
        Intent i = new Intent(this, AboutUs.class); // intent
        startActivity(i); // start activity
    }

}
