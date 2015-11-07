package musicnow.listenup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
*  Question7.class
*  Question 7 of the survey.
*   @author mike krakower
*  11/6/2015
* */
public class Question7 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.question_7, container, false);
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
