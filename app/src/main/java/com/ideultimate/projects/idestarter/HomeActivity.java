package com.ideultimate.projects.idestarter;

import android.app.Activity;
import android.os.Bundle;

/**
 * Java Android Activity linked to layout: res/layout/activity_home.xml
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}