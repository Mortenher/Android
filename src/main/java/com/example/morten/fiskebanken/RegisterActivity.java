package com.example.morten.fiskebanken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.morten.fiskebanken.database.FishDataSource;
import com.example.morten.fiskebanken.database.SQLiteHelper;

public class RegisterActivity extends AppCompatActivity {

    private static FishDataSource fishDataSource;
    private int fishNumber = 0;
    Button mButton;
    EditText mEdit1;
    EditText mEdit2;
    EditText mEdit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mButton = (Button)findViewById(R.id.registrerfisk);
        mEdit1 = (EditText)findViewById(R.id.fisketype);
        mEdit2 = (EditText)findViewById(R.id.fiskevekt);
        mEdit3 = (EditText)findViewById(R.id.fiskelengde);

        mButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        fishDataSource.createFisk(mEdit1.getText().toString(),Double.parseDouble(mEdit2.getText().toString()),Double.parseDouble(mEdit3.getText().toString()));

                        Log.d("EditText", mEdit1.getText().toString() + " " + mEdit2.getText().toString() + " " + mEdit3.getText().toString());
                    }
                }
        );
    }
}
