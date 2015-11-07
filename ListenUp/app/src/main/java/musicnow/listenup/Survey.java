package musicnow.listenup;

import android.support.v4.app.FragmentActivity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
/*
*  Survey.class
*  The survey main page. Calls all the questions as tabs
*   @author mike krakower
*  11/6/2015
* */
public class Survey extends FragmentActivity {



    // viewPager allows page to have swipe tabs
    ViewPager viewPager=null;
    //public android.app.ActionBar actionBar = getActionBar();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey); // calls layout activity_survey.xml
        viewPager=(ViewPager) findViewById(R.id.survey); // survey declared in activity_survey.xml
        FragmentManager fm = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fm));
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

}

class MyAdapter extends FragmentPagerAdapter{

    public MyAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {// This class gets item page and returns it to show that question
        Fragment frag = null;
        Log.d("Mike", "getItem is called "+position);
        if (position==0){ // First survey question
            frag=new Question1();
        }
        if (position==1){// 2nd survey question
            frag=new Question2();
        }
        if (position==2){// 3rd survey question
            frag=new Question3();
        }
        if (position==3){// 4th survey question
            frag=new Question4();
        }
        if (position==4){ // ect...
            frag=new Question5();
        }
        if (position==5){
            frag=new Question6();
        }
        if (position==6){
            frag=new Question7();
        }
        if (position==7){
            frag=new Question8();
        }
        if (position==8){
            frag=new Question9();
        }
        if (position==9){
            frag=new Question10();
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 10;
    }// returns the number of pages

}