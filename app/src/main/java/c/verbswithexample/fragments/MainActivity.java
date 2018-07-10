package c.verbswithexample.fragments;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements MyListner{

    private FragmentManager manager;

    private int firstNum, secondNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         manager = getFragmentManager();

         addFragmentA();
        addFragmentB();
    }

    private void addFragmentA() {

        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragContainerA, fragmentA, "fragA");
        transaction.commit();

    }

    private void addFragmentB() {

        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragContainerB, fragmentB, "fragB");
        transaction.commit();

    }

    @Override
    public void addTwoNum(int num1, int num2) {



        this.firstNum = num1;
        this.secondNum = num2;

        Toast.makeText(this, "Numbers received in activity : " +num1 + " " + num2 , Toast.LENGTH_SHORT).show();
    }

    public void sendDataFragmentB(View view) {

    FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");

    fragmentB.addTwoNumInFragB(firstNum, secondNum);


    }
}
