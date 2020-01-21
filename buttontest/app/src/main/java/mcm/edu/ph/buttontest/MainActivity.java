package mcm.edu.ph.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String Use = "PS";
        final String Pass = "TY";

        final TextView yeah = findViewById(R.id.shet);
        final TextView Welcome = findViewById(R.id.Welcome);
        final Button touchme = findViewById(R.id.Button);
        final EditText PS = findViewById(R.id.name);
        final EditText TY = findViewById(R.id.password);

        //yeah.setText("TOUCH ME HERE");
        //touchme.setText("Touch");
        //touchme.setEnabled(false);

        touchme.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String typedun = String.valueOf(PS.getText());
                        String typedpw = String.valueOf(TY.getText());

                        if(typedun.equalsIgnoreCase(Use) && typedpw.equals(Pass)){
                            Toast.makeText(MainActivity.this,
                                    "CORRECT",
                                    Toast.LENGTH_LONG).show();
                        }
                        else if(typedun!=Pass || typedpw!=Use){
                            Toast.makeText(MainActivity.this,
                                    "Wrong",
                                    Toast.LENGTH_LONG).show();

                        }






                    }
                }

        );


    }
}
