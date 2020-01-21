package mcm.edu.ph.internalfilestorage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.util.Size;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final int READ_BLOCK_SIZE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Box = findViewById(R.id.Box);
        final Button Read = findViewById(R.id.Read);
        final Button buttonclr = findViewById(R.id.Clear);
        final Button Write = findViewById(R.id.Write);


        buttonclr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Box.setText("");
                    }
                }
        );
        Read.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            FileInputStream fileIn=openFileInput("mytextfile.txt");
                            InputStreamReader InputRead= new InputStreamReader(fileIn);

                            char[] inputBuffer= new char[READ_BLOCK_SIZE];
                            String s="";
                            int charRead;

                            while ((charRead=InputRead.read(inputBuffer))>0) {
                                // char to string conversion
                                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                                s +=readstring;
                            }
                            InputRead.close();
                            Box.setText(s);


                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        Write.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            FileOutputStream fileout=openFileOutput("mytextfile.txt", MODE_PRIVATE);
                            OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                            outputWriter.write(Box.getText().toString());
                            outputWriter.close();

                            //display file saved message
                            Toast.makeText(getBaseContext(), "File saved successfully!",
                                    Toast.LENGTH_SHORT).show();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }
        );
    }
}//https/www.journalday.com/9383/android-internal-storage-exampletutorialss