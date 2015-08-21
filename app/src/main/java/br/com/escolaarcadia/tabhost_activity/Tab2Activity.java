package br.com.escolaarcadia.tabhost_activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class Tab2Activity  extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        TextView  tvDois=new TextView(this);
        tvDois.setTextSize(25);
        tvDois.setGravity(Gravity.CENTER_VERTICAL);
        tvDois.setText("Aba Dois");

        setContentView(tvDois);
    }
}