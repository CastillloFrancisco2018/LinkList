package com.example.franciscocastillo.linklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        LinkedList ll = new LinkedList();
        ll.addFront(8);
        ll.addFront(7);
        ll.addFront(3);
        ll.display();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
