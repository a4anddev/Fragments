package c.verbswithexample.fragments;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FragmentManager manager;
    private EditText first, second;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         manager = getFragmentManager();

         first = findViewById(R.id.edfirst);
         second = findViewById(R.id.edsecond);

    }

    public void sendAtoFragA(View view) {

        int firstNo = Integer.valueOf(first.getText().toString());
        int secondNo = Integer.valueOf(second.getText().toString());

        Bundle bundle = new Bundle();

        bundle.putInt(Constants.FRIST_NUM, firstNo);
        bundle.putInt(Constants.SECOND_NUM, secondNo);

        FragmentA fragmentA = new FragmentA();

        fragmentA.setArguments(bundle);


        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentA, "fragA");
        transaction.commit();



    }
}
