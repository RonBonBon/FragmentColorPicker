package com.arichafamily.fragmentcolorpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int data) {
        FragmentB f2 = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        f2.changeColor(data);
    }
}
