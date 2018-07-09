package c.verbswithexample.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentA extends Fragment{

    private Button btnSend;
    private EditText firstNo, secondNo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_a, container, false);

        btnSend = view.findViewById(R.id.btnSend);
        firstNo = view.findViewById(R.id.edfirst);
        secondNo = view.findViewById(R.id.edsecond);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 sendData();

            }
        });

        return view;

    }

    private void sendData() {

        int firstNum = Integer.valueOf(firstNo.getText().toString());
        int secondNum = Integer.valueOf(secondNo.getText().toString());

        MyListner myListner = (MyListner) getActivity();

        myListner.addTwoNum(firstNum, secondNum);


    }


}
