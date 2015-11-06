package musicnow.listenup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Genre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void toMain(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void rockPlaylist(View view) {
        String url = "https://www.youtube.com/watch?v=JwYX52BP2Sk&list=PLpQsxA3LCFDFOsLiMBqoBIOqkNzzo-ltd";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void rapPlaylist(View view){
        String url = "https://www.youtube.com/watch?v=mcjL8w7p1Xc&list=PLpQsxA3LCFDFbcj4cTdls_0V_ybXvMn6i";
        Intent  i = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(i);
    }

    public void jazzPlaylist(View view){
        String url = "https://www.youtube.com/watch?v=sR13ECD71xU&list=PLpQsxA3LCFDF7JNcTUqfd7Kj16FmGLttQ";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void oldiesPlaylist(View view){
        String url = "https://www.youtube.com/watch?v=m8OlDPqYBLw&list=PLpQsxA3LCFDFKCK5X2m8X0VwM8z8Rhafm";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void showtunesPlaylist(View view){
        String url = "https://www.youtube.com/watch?v=7TsrfAfSUAs&list=PLpQsxA3LCFDE0KXDYfCwiJ-GyfafVr6rI";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void soulPlaylist(View view){
        String url = "https://www.youtube.com/watch?v=pX6QlnlMqjE&list=PLpQsxA3LCFDEHuk_O--bTHf-H8AkE5WST";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void funkPlaylist(View view){
        String url = "https://www.youtube.com/watch?v=FnH_zwVmiuE&list=PLpQsxA3LCFDGYc_QilC6kx07SfsTNsm36";
        Intent  i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
