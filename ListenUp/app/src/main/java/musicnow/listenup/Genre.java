package musicnow.listenup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Genre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Creats the UI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre); // sets layout to activity_genre.xml
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); // Toolbar delcared
        setSupportActionBar(toolbar);


    } // Sends user to the main menu. Associated with the back button.
    public void toMain(View view){
        Intent i = new Intent(this, MainActivity.class); // set intent MainActivity.class
        startActivity(i); // Start MainActivity.class
    }

    public void rockPlaylist(View view) { // goes to the rock playlist on youtube
        String url = "https://www.youtube.com/watch?v=JwYX52BP2Sk&list=PLpQsxA3LCFDFOsLiMBqoBIOqkNzzo-ltd"; // youtube link
        Intent i = new Intent(Intent.ACTION_VIEW); //  sets intent
        i.setData(Uri.parse(url)); // parses at Url to determine intent
        startActivity(i); // goes to youtube
    }

    public void rapPlaylist(View view){ // to rap playliat on youtube
        String url = "https://www.youtube.com/watch?v=mcjL8w7p1Xc&list=PLpQsxA3LCFDFbcj4cTdls_0V_ybXvMn6i"; // youtube link
        Intent  i = new Intent(Intent.ACTION_VIEW,Uri.parse(url)); // intent
        startActivity(i); // goes to youtube
    }

    public void jazzPlaylist(View view){ // to jazz playlist on youtube
        String url = "https://www.youtube.com/watch?v=sR13ECD71xU&list=PLpQsxA3LCFDF7JNcTUqfd7Kj16FmGLttQ"; // youtube link
        Intent  i = new Intent(Intent.ACTION_VIEW); // parses at Url to determine intent
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void oldiesPlaylist(View view){ // to oldies playlist on youtube
        String url = "https://www.youtube.com/watch?v=m8OlDPqYBLw&list=PLpQsxA3LCFDFKCK5X2m8X0VwM8z8Rhafm";// youtube link
        Intent  i = new Intent(Intent.ACTION_VIEW); // parses at Url to determine intent
        i.setData(Uri.parse(url));
        startActivity(i);// goes to youtube
    }

    public void showtunesPlaylist(View view){ // to showtunes playlist on youtube
        String url = "https://www.youtube.com/watch?v=7TsrfAfSUAs&list=PLpQsxA3LCFDE0KXDYfCwiJ-GyfafVr6rI"; // youtube link
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);// goes to youtube
    }

    public void soulPlaylist(View view){ // to soul playlist on youtube
        String url = "https://www.youtube.com/watch?v=pX6QlnlMqjE&list=PLpQsxA3LCFDEHuk_O--bTHf-H8AkE5WST"; // youtube link
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);// goes to youtube
    }

    public void funkPlaylist(View view){ // to funk playlist on youtube
        String url = "https://www.youtube.com/watch?v=FnH_zwVmiuE&list=PLpQsxA3LCFDGYc_QilC6kx07SfsTNsm36"; // youtube link
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i); // goes to youtube
    }
}
