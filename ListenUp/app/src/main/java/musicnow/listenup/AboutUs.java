package musicnow.listenup;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

/*
*   This class stores the About Us activity. This is an activity that can be found under the
*   settings tab. It's just an information page detailing a history.
* */
public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us); // Sets the activity_about_us.xml as the layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); //Sets up the toolbar
        setSupportActionBar(toolbar);


    }

//  The toSettings method is a back button that takes the user to the previous page,
    public void toSettings(View view){
        Intent i = new Intent(this,Settings.class); // intent to go to settings
        startActivity(i); // sends to settings
    }
}
