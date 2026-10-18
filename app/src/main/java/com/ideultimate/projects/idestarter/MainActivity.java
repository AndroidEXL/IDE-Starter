package com.ideultimate.projects.idestarter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeLogic();
    }

    private void initializeLogic() {
        // Event: textview1: onTextClick
        findViewById<TextView>(R.id.textview1).setOnClickListener {
            val text = (it as TextView).text.toString()
        
        }
    }
}
