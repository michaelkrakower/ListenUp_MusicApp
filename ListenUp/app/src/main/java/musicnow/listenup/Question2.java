package musicnow.listenup;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
*  Question2.class
*  Question 2 of the survey.
*   @author mike krakower
*  11/6/2015
* */
public class Question2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.question_2, container, false);
    }

    public void aInc(){
        // adds point to A
    }
    public void bInc(){
        // adds point to B
    }
    public void cInc(){
        // adds point to C
    }
}
