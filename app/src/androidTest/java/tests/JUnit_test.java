package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.onlyme.fresh_app.MainActivity;
import com.example.onlyme.fresh_app.R;

/**
 * Created by Onlyme on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    View v;

    public JUnit_test(){
        super(MainActivity.class);
    }

    @UiThreadTest
    public void test_sum(){
        mainActivity = getActivity();
        Button button = (Button)mainActivity.findViewById(R.id.button);
        EditText input1 = (EditText)mainActivity.findViewById(R.id.input1);
        EditText input2 = (EditText)mainActivity.findViewById(R.id.input2);
        input1.setText("16");
        input2.setText("8");
        button.callOnClick();
       // mainActivity.sumUp(v);
        TextView output = (TextView)mainActivity.findViewById(R.id.output);
        assertEquals("24",output.getText());
    }

}
