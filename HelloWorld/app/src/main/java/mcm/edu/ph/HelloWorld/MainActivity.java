package mcm.edu.ph.HelloWorld;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Byte age = 19;
        short birthmonth = 8;
        int birthyear = 2000;
        double MyCash = 0;
        boolean inaRelationship = false;
        char middleInitial = 'G';

        TextView agetxt = (TextView) findViewById(R.id.ageText);
        TextView yeartxt = (TextView) findViewById(R.id.monthText);
        TextView monthtxt = (TextView) findViewById(R.id.yearText );
        TextView cashtxt = (TextView) findViewById(R.id.cashText);
        TextView inaRelationship = (TextView) findViewById(R.id.inaRelationdshipText);
        TextView middleInitial = (TextView) findViewById(R.id.middleInitialText);

        agetxt.setText(age);
        yeartxt.setText(birthyear);
        monthtxt.setText(birthmonth);
        cashtxt.setText(Double.toString(MyCash));
        inaRelationship.setText(Boolean.toString(inaRelationship));
        middleInitial.setText(String.valueOf(middleInitial));

    }

}
