package com.example.student.ost;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button addbutton = (Button) findViewById(R.id.addbutton);

        addbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText et1 = (EditText) findViewById(R.id.no1et);
                EditText et2 = (EditText) findViewById(R.id.no2et);

                int no1 = Integer.parseInt(String.valueOf(et1.getText()));
                int no2 = Integer.parseInt(String.valueOf(et2.getText()));

                int ans = no1 + no2;

                showAnswer("Answer : " + ans);

            }
        });

        Button subbutton = (Button) findViewById(R.id.subbutton);

        subbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText et1 = (EditText) findViewById(R.id.no1et);
                EditText et2 = (EditText) findViewById(R.id.no2et);

                int no1 = Integer.parseInt(String.valueOf(et1.getText()));
                int no2 = Integer.parseInt(String.valueOf(et2.getText()));

                int ans = no1 - no2;

                showAnswer("Answer : " + ans);
            }
        });

        Button mulbutton = (Button) findViewById(R.id.mulbutton);

        mulbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText et1 = (EditText) findViewById(R.id.no1et);
                EditText et2 = (EditText) findViewById(R.id.no2et);

                int no1 = Integer.parseInt(String.valueOf(et1.getText()));
                int no2 = Integer.parseInt(String.valueOf(et2.getText()));

                int ans = no1 * no2;

                showAnswer("Answer : " + ans);
            }
        });

        Button divbutton = (Button) findViewById(R.id.divbutton);

        divbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText et1 = (EditText) findViewById(R.id.no1et);
                EditText et2 = (EditText) findViewById(R.id.no2et);

                int no1 = Integer.parseInt(String.valueOf(et1.getText()));
                int no2 = Integer.parseInt(String.valueOf(et2.getText()));

                float ans = no1 / (float) no2;

                showAnswer("Answer : " + ans);
            }
        });
    }

    public void showAnswer(String ans){
        Intent intent = new Intent(this, ansActivity.class);
        intent.putExtra("ans", ans);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
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
