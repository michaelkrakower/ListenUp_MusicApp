package musicnow.listenup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.*;
/*
*  MainActivity.class
*  The main menu of the application
*  @author mike krakower
*  11/6/2015
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // creates UI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    public void gotoGenre(View view){
        Intent intend = new Intent(this, Genre.class);
        startActivity(intend);
    }

    public void gotoMood(View view){
        Intent intend = new Intent(this, Mood.class);
        startActivity(intend);
    }

    public void gotoSettings(View view){
        Intent intend = new Intent(this, Settings.class);
        startActivity(intend);
    }

    public void weatherPlaylist(View view){
        String url = "https://www.youtube.com/";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


    Calendar calendar = new Calendar() {
        @Override
        public void add(int field, int value) {


        }

        @Override
        protected void computeFields() {

        }

        @Override
        protected void computeTime() {

        }

        @Override
        public int getGreatestMinimum(int field) {
            return 0;
        }

        @Override
        public int getLeastMaximum(int field) {
            return 0;
        }

        @Override
        public int getMaximum(int field) {
            return 0;
        }

        @Override
        public int getMinimum(int field) {
            return 0;
        }

        @Override
        public void roll(int field, boolean increment) {

        }
    };
    public void timePlaylist(View view){
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour > 5 & hour < 12){
            String url = "https://www.youtube.com/watch?v=pIgZ7gMze7A&list=PLpQsxA3LCFDFAlRz5cSAnwoXqqtRTp-ok";
            Intent  i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }

        else if (hour > 18 | hour < 5){
            String url = "https://www.youtube.com/watch?v=dcnd55tLCv8&list=PLpQsxA3LCFDGJMy3_TQQ_qMtSS8jxCwQk";
            Intent  i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else{
            String url = "https://www.youtube.com/watch?v=YgSPaXgAdzE&list=PLpQsxA3LCFDGEfVb_yj06NncsZ7Tq6_FD";
            Intent  i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }

    }

    public void toSurvey(View view){
        Intent i = new Intent(this, Survey.class);
        startActivity(i);
    }
}
