package com.example.shubham.bodymassindex;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;


public class MainActivity extends Activity {
    EditText e1, e2, e3;
    Button btn;
    View view;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.height);
        e3 = (EditText) findViewById(R.id.weight);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, FirstActivity.class);
                String name = e1.getText().toString();
                Float f1=null;
                Float f2=null;
                //   float height = Float.parseFloat(e2.getText().toString());
               // float weight = Float.parseFloat(e3.getText().toString());
                try {
                    f1 = new Float(e2.getText().toString());
                    f2 = new Float(e3.getText().toString());
                }
                catch(Exception e)
                {
                  //  Toast.makeText(getBaseContext(),"Enter Details", LENGTH_LONG).show();

                }
                if(name.equals("") || f1 == null || f2 == null)
                {
                    Toast.makeText(getBaseContext(),"All fields are mandatory", LENGTH_LONG).show();
                }
                else
                {
                    mIntent.putExtra("NAME", name);
                    mIntent.putExtra("HEIGHT",f1);
                    mIntent.putExtra("WEIGHT",f2);
                    startActivity(mIntent);
                }
            }

        });
        }
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        }


