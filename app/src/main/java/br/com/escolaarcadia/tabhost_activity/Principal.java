package br.com.escolaarcadia.tabhost_activity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class Principal extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabHost.TabSpec tab1 = tabHost.newTabSpec("ABA UM");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("ABA DOIS");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("ABA TRES");

       // tab1.setIndicator("Tab1");
        tab1.setIndicator("", getResources().getDrawable(R.mipmap.home));
        tab1.setContent(new Intent(this, Tab1Activity.class));

        //tab2.setIndicator("Tab2");
        tab2.setIndicator("", getResources().getDrawable(R.mipmap.perfil));
        tab2.setContent(new Intent(this,Tab2Activity.class));

        tab3.setIndicator("Tab3");
        tab3.setContent(new Intent(this,Tab3Activity.class));

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

    }
}