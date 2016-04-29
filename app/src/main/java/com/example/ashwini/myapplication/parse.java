package com.example.ashwini.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class parse extends AppCompatActivity {
    private String url = "http://api.androidhive.info/volley/person_object.json";
    private static String TAG = parse.class.getSimpleName();
    TextView txtResponse;
    private String jsonResponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parse);
        //Get the bundle here..
        Bundle bundle = getIntent().getExtras();
        //Extract the data..
        String stuff = bundle.getString("message");
        Toast.makeText(parse.this,
                stuff, Toast.LENGTH_LONG).show();
        //txtResponse.setText("Done");
        //txtResponse = (TextView)findViewById(R.id.txtResponse);
        //makeJsonObjectRequest();



    }
}
