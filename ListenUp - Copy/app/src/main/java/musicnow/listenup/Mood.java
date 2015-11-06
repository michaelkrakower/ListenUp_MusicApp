package musicnow.listenup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Mood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void toMain(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void happyPlay(View view){
        String url = "https://www.youtube.com/watch?v=y6Sxv-sUYtM&list=PLpQsxA3LCFDFq-wrp-3panVmuTe-xNJAp";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void sadPlay(View view){
        String url = "https://www.youtube.com/watch?v=HsixXCnYVfA&list=PLpQsxA3LCFDGny4cx0avc7FkDYIcKGERr";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void angryPlay(View view){
        String url = "https://www.youtube.com/watch?v=KWmG0ZsUAag&list=PLpQsxA3LCFDGxhtDRNHByz29xG5EhOFZx";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void nostPlay(View view){
        String url = "https://www.youtube.com/watch?v=VaUyJyPekJE&list=PLpQsxA3LCFDFTqcTP8X65f0CsSTtgjLHS";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void excitePlay(View view){
        String url = "https://www.youtube.com/watch?v=pIgZ7gMze7A&list=PLpQsxA3LCFDHxaZstDFX40vPB-yav3pFQ";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void sillyPlay(View view){
        String url = "https://www.youtube.com/watch?v=ugw-sz6ZIGk&list=PLpQsxA3LCFDEpe26zmlRTlIBgqQOFy5xl";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void focusPlay(View view){
        String url = "https://soundcloud.com/davisgalvin/migration";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
