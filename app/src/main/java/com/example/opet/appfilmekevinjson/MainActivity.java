package com.example.opet.appfilmekevinjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
    }

    public void onJson(View view){

        GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://my-json-server.typicode.com/cordobinha/ServidorJSON/filme";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Filme filme = gson.fromJson(response,Filme.class);
                        textView.setText(filme.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        textView.setText("Falha ao pegar JSON");
                    }
                });

        queue.add(stringRequest);
    }

    }

