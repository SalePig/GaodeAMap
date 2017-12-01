package com.pateo.qiuzhiwen.gaodemap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.pateo.qiuzhiwen.gaodemap.Activity.SingleRouteCalculateActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView startNavigation = (TextView) findViewById(R.id.start_navigation);

        startNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SingleRouteCalculateActivity.class));
            }
        });

    }
}
