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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        btnAdd = view.findViewById(R.id.btnAdd);
        tresult = view.findViewById(R.id.tresult);

        Bundle bundle = getArguments();
        final int first = bundle.getInt(Constants.FRIST_NUM, 0);
        final int second = bundle.getInt(Constants.SECOND_NUM, 0);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addTwoNum(first, second);
            }
        });

        return view;

    }

    private void addTwoNum(int first, int second) {

        int result = first + second;
        tresult.setText("Result : " + result);


    }


}
