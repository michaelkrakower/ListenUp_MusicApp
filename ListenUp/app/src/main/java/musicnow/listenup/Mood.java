package musicnow.listenup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
/*
*  Mood.class
*  The menu that houses mood playlists (happy, sad, ect.) of the application
*  @author mike krakower
*  11/6/2015
* */
public class Mood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // creates actitity UI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void toMain(View view){ // back button. Returns to MainActivity.class
        Intent i = new Intent(this, MainActivity.class); // intent
        startActivity(i); // start activity
    }

    public void happyPlay(View view){ // Happy playlist on youtube
        String url = "https://www.youtube.com/watch?v=y6Sxv-sUYtM&list=PLpQsxA3LCFDFq-wrp-3panVmuTe-xNJAp";
        Intent  i = new Intent(Intent.ACTION_VIEW); // intent
        i.setData(Uri.parse(url)); // checks url
        startActivity(i); // start activity
    }
    public void sadPlay(View view){ // Sad playlist on youtube
        String url = "https://www.youtube.com/watch?v=HsixXCnYVfA&list=PLpQsxA3LCFDGny4cx0avc7FkDYIcKGERr";
        Intent  i = new Intent(Intent.ACTION_VIEW); //intent
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void angryPlay(View view){ // Angry playlist on youtube
        String url = "https://www.youtube.com/watch?v=KWmG0ZsUAag&list=PLpQsxA3LCFDGxhtDRNHByz29xG5EhOFZx";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void nostPlay(View view){ // Nostalgic playlist on youtube
        String url = "https://www.youtube.com/watch?v=VaUyJyPekJE&list=PLpQsxA3LCFDFTqcTP8X65f0CsSTtgjLHS";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void excitePlay(View view){ // Excited playlist
        String url = "https://www.youtube.com/watch?v=pIgZ7gMze7A&list=PLpQsxA3LCFDHxaZstDFX40vPB-yav3pFQ";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void sillyPlay(View view){ // Silly playlist on youtube
        String url = "https://www.youtube.com/watch?v=ugw-sz6ZIGk&list=PLpQsxA3LCFDEpe26zmlRTlIBgqQOFy5xl";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void focusPlay(View view){ // Focus  playlist on youtube
        String url = "https://soundcloud.com/davisgalvin/migration";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
