package c.verbswithexample.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentA extends Fragment{

    private Button btnAdd;
    private TextView tresult;
    private int firstNo = 0, secondNo = 0;
    private String firstname, secondname;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_a, container, false);

        btnAdd = view.findViewById(R.id.btnAdd);
        tresult = view.findViewById(R.id.tresult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addTwoNo(firstNo, secondNo);
                Toast.makeText(view.getContext(), "First : "+firstname + " second : " +secondname, Toast.LENGTH_SHORT).show();

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

    public void setRohanClassData(MainActivity.Employee employee) {

       firstname = employee.firstPerson;
       secondname = employee.secondPerson;

    }
}
