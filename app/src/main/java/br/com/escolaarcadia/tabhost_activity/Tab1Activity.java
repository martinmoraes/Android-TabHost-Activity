package br.com.escolaarcadia.tabhost_activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Tab1Activity  extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        TextView tvUm=new TextView(this);
        tvUm.setTextSize(30);
        tvUm.setGravity(Gravity.CENTER_VERTICAL);
        tvUm.setText("Aba Um");

        setContentView(tvUm);
    }
}
