package com.dulldull.android.project0;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_spotify = (Button) findViewById(R.id.btn_spotify);
        btn_spotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                sendToast ("This button will launch spotify streamer app ");
            }
        });

        Button btn_scores = (Button) findViewById(R.id.btn_scores);
        btn_scores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                sendToast ("This button will launch scores app ");
            }
        });

        Button btn_library = (Button) findViewById(R.id.btn_library);
        btn_library.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                sendToast ("This button will launch library app");
            }
        });

        Button btn_reader = (Button) findViewById(R.id.btn_reader);
        btn_reader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                sendToast ("This button will launch XYZ reader app");
            }
        });

        Button btn_build = (Button) findViewById(R.id.btn_build);
        btn_build.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                sendToast ("This button will launch build it bigger app");
            }
        });

        Button btn_capstone = (Button) findViewById(R.id.btn_capstone);
        btn_capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                sendToast ("This button will launch my capstone app");
            }
        });

    }

    /** Called when the user touches the button */
    public void sendToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
