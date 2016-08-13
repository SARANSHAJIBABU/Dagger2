package com.alpha.saran.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject NetworkApi api;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getComponent().inject(this);
        textView = (TextView) findViewById(R.id.tv);

        if(api.validateUser("123","456")){
            Toast.makeText(this,"True",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"False",Toast.LENGTH_SHORT).show();
        }
    }
}
