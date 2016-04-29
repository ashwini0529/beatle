package com.example.ashwini.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Search extends AppCompatActivity {


    Button search;
    EditText searchText;
    Button listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        search = (Button)findViewById(R.id.searchButton);
        searchText = (EditText)findViewById(R.id.searchBar);
        listView = (Button)findViewById(R.id.listView);
        search.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {

                        Toast.makeText(Search.this,
                               "This is your search activity..", Toast.LENGTH_LONG).show();


                        Intent i = new Intent(Search.this,parse.class);
                       // startActivity(new Intent(Search.this,parse.class)
                        String passMessage = "I passed this message to another activity.";
                        Bundle bundle = new Bundle();//Create a new bundle..
                        bundle.putString("message",passMessage);
                        i.putExtras(bundle);
                        startActivity(i);


                    }
                }
        );

        listView.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String baseUrl = "13.76.243.123:8000?s=";
                        baseUrl=baseUrl.concat(searchText.getText().toString());
                        Toast.makeText(Search.this,
                                baseUrl, Toast.LENGTH_LONG).show();


                        startActivity(new Intent(Search.this, ListMovies.class)

                         );
                    }
                }
        );

    }
}
