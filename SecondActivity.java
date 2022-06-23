package com.example.valuepass2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
    public  void onAssign(View v)
    {
        EditText e=(EditText) findViewById(R.id.et2);
        Intent IR=new Intent();
        IR.setData(Uri.parse(""+e.getText().toString()));
        setResult(RESULT_OK,IR);;
        finish();
    }

}