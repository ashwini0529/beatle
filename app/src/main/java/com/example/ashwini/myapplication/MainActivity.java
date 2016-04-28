package com.example.ashwini.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn;
    EditText txt1;
    EditText txt2;
    int flag =0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Let's get the parameters!
        btn = (Button)findViewById(R.id.button);
        txt1 = (EditText)findViewById(R.id.text1);
        txt2 = (EditText)findViewById(R.id.text2);
        btn.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String username = txt1.getText().toString();
                        String password = txt2.getText().toString();
                        if(username.equals("swag")&&password.equals("londa")) {
                            Toast.makeText(MainActivity.this,
                                    "Login Successful", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(MainActivity.this, Main2Activity.class));
                        }
                        else{
                            Toast.makeText(MainActivity.this,
                                    "Invalid credentials", Toast.LENGTH_LONG).show();
                        }
                       // Toast.makeText(getActivity())
                        Log.v("EditText",txt1.getText().toString());


                        Log.v("EditText",txt2.getText().toString());

                    }
                }
        );



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
