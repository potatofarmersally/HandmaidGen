package proj.sallys.handmaidgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TheMagicHappens extends AppCompatActivity {

    private EditText name;

    @Override //basically the constructor
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_magic_happens);

        name = findViewById(R.id.nameBox);
    }



}
