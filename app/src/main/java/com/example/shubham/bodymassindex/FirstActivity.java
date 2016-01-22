package com.example.shubham.bodymassindex;

/**
 * Created by Shubham on 15-01-2016.
 */
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.content.Intent;

public class FirstActivity extends Activity
{
    @Override
    public void onCreate(Bundle SavedInstanceState )
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.firstactivity);
        Intent mIntent=getIntent();
        TextView textView=(TextView)findViewById(R.id.getName);
        TextView textView1=(TextView)findViewById(R.id.getBmi);
        TextView underWeight=(TextView)findViewById(R.id.underWeight);
        TextView underWeight1=(TextView)findViewById(R.id.underWeight1);
        TextView normalWeight=(TextView)findViewById(R.id.normalWeight);
        TextView overWeight=(TextView)findViewById(R.id.overWeight);
        TextView obeseClass1=(TextView)findViewById(R.id.obeseClass1);
        TextView obeseClass2=(TextView)findViewById(R.id.obeseClass2);
        TextView obeseClass3=(TextView)findViewById(R.id.obeseClass3);
        textView.setText(getIntent().getExtras().getString("NAME"));
        float height=mIntent.getFloatExtra("HEIGHT",0);
        float weight=mIntent.getFloatExtra("WEIGHT",0);
        float bmi=bodyMassIndex(height,weight);
        String mytext=Float.toString(bmi);
        String myText1="Your BMI is "+mytext;
        textView1.setText(myText1);
        if(bmi<16.0)
        {
            underWeight.setBackgroundColor(Color.rgb(255,0,0));
        }
        if(bmi>=16.0 && bmi<18.5)
        {
            underWeight1.setBackgroundColor(Color.rgb(255, 215, 0));
        }
        if(bmi>=18.5 && bmi<25.0)
        {
            normalWeight.setBackgroundColor(Color.rgb(0,255,0));
        }
        if(bmi>=25.0 && bmi<30.0)
        {
            overWeight.setBackgroundColor(Color.rgb(255,215,0));
        }
        if(bmi>=30.0 && bmi<35.0)
        {
            obeseClass1.setBackgroundColor(Color.rgb(250,128,114));
        }
        if(bmi>=35.0 && bmi<40.0)
        {
            obeseClass2.setBackgroundColor(Color.rgb(255,0,0));
        }
        if(bmi>=40.0)
        {
            obeseClass3.setBackgroundColor(Color.rgb(255,0,0));
        }
    }
    public float bodyMassIndex(float height,float weight)
    {
        float bmi;
        height=height/100;
        bmi=weight/(height*height);
        return bmi;
    }

}
