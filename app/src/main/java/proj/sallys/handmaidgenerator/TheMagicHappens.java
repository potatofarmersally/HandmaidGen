package proj.sallys.handmaidgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;

public class TheMagicHappens extends AppCompatActivity {

    private EditText name;
    private ArrayList<String> boyList;
    private ArrayList<String> girlList;

    @Override //basically the constructor
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_magic_happens);

        name = findViewById(R.id.nameBox);
        boyList = new ArrayList<String>();
        girlList = new ArrayList<String>();
    }

    public void parse() {

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("app/sampledata/boyNames.txt"));
            BufferedReader brGirl =
                    new BufferedReader(new FileReader("app/sampledata/girlNames.txt"));

        }
        catch (FileNotFoundException e){

        }

    }


}
