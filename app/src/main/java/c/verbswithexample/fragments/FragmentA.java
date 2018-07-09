package c.verbswithexample.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentA extends Fragment{

    private Button btnAdd;
    private TextView tresult;
    private int firstNo = 0, secondNo = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        btnAdd = view.findViewById(R.id.btnAdd);
        tresult = view.findViewById(R.id.tresult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addTwoNo(firstNo, secondNo);

            }
        });

        return view;

    }

    private void addTwoNo(int firstNo, int secondNo) {

        int result = firstNo + secondNo;
        tresult.setText("Result : " + result);

    }


    public void setRohaData(int firstNo, int secondNo) {

         this.firstNo = firstNo;
         this.secondNo = secondNo;


    }
}
