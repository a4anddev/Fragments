package c.verbswithexample.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment{

    TextView tresult;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        tresult = view.findViewById(R.id.tresult);

        return view;
    }


    public void addTwoNumInFragB(int x, int y){

        int result = x + y;
        tresult.setText("Result : " + result);


    }
}
