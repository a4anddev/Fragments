package c.verbswithexample.fragments;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements MyListner{

    private FragmentManager manager;
    TextView tresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         manager = getFragmentManager();
         tresult = findViewById(R.id.tresult);

         addFragmentA();
    }

    private void addFragmentA() {

        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentA, "fragA");
        transaction.commit();



    }


    @Override
    public void addTwoNum(int num1, int num2) {

        int result = num1 + num2;
        tresult.setText("Result : " + result);
    }
}
