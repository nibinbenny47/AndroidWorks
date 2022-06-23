package com.example.valuepass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onNext(View v)
    {
        Intent IS;
        IS=new Intent(this,SecondActivity.class);
        startActivityForResult(IS,1);
    }
    @Override
    protected  void onActivityResult(int rq,int rc,Intent data)
    {
        super.onActivityResult(rq,rc,data);
        EditText e1=(EditText) findViewById(R.id.et1);
        if(rc== RESULT_OK)
        {
            e1.setText(data.getData().toString());
        }
    }
}