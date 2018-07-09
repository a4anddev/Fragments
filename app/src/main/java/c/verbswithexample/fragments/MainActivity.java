package c.verbswithexample.fragments;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         manager = getFragmentManager();


    }

    public void addFragA(View view) {
        FragmentA fragmentA = new FragmentA();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentA, "fragA");
        transaction.commit();

    }

    public void removeFragA(View view) {

        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");

        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentA);
            transaction.commit();
        }else {
            Toast.makeText(this, "Frangment A not found", Toast.LENGTH_SHORT).show();
        }

    }

    public void addFragB(View view) {

        FragmentB fragmentB = new FragmentB();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentB, "fragB");
        transaction.commit();
    }

    public void removeFragB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");

        if (fragmentB != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentB);
            transaction.commit();
        }else {
            Toast.makeText(this, "Fragment B not found", Toast.LENGTH_SHORT).show();
        }

    }

    public void replaceFragA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragmentA, "fragA");
        transaction.commit();

    }

    public void replaceFragB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragmentB, "fragB");
        transaction.commit();

    }

    public void attachFragA(View view) {

        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");

        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentA != null){

            transaction.attach(fragmentA);
            transaction.commit();

        }else{

            Toast.makeText(this, "not found fragment a", Toast.LENGTH_SHORT).show();

        }


    }

    public void detachFraga(View view) {

        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");

        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentA != null){

            transaction.detach(fragmentA);
            transaction.commit();

        }else{

            Toast.makeText(this, "not found fragment a", Toast.LENGTH_SHORT).show();

        }
    }

    public void hideFragA(View view) {
    }

    public void showFraga(View view) {
    }
}
