package mcm.edu.ph.stringtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView fname = findViewById(R.id.fname);
        TextView lname = findViewById(R.id.lname);

        String firstname = "Christine";
        String Lastname = "Galido";

        fname.setText(firstname);
        lname.setText(Lastname);



    }
}
