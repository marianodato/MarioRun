package com.example.marianodato.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Play_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_activity);
        //Intent intent = getIntent();

        Button center = (Button) findViewById(R.id.center);
        center.setBackgroundResource(R.mipmap.ic_stickman);


        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            ActionBar actionBar = getActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                //openSearch();
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /** Called when the user clicks the buttons */
    public void Left(View view) {
        Button left = (Button) findViewById(R.id.left);
        Button center = (Button) findViewById(R.id.center);
        Button right = (Button) findViewById(R.id.right);
        left.setBackgroundResource(R.mipmap.ic_stickman);
        center.setBackgroundDrawable(null);
        right.setBackgroundDrawable(null);
        // Do something in response to button
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, "Play");
        //startActivity(intent);
    }

    public void Center(View view) {
        Button left = (Button) findViewById(R.id.left);
        Button center = (Button) findViewById(R.id.center);
        Button right = (Button) findViewById(R.id.right);
        center.setBackgroundResource(R.mipmap.ic_stickman);
        left.setBackgroundDrawable(null);
        right.setBackgroundDrawable(null);
        // Do something in response to button
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, "Just run");
        //startActivity(intent);
    }

    public void Right(View view) {
        Button left = (Button) findViewById(R.id.left);
        Button center = (Button) findViewById(R.id.center);
        Button right = (Button) findViewById(R.id.right);
        right.setBackgroundResource(R.mipmap.ic_stickman);
        left.setBackgroundDrawable(null);
        center.setBackgroundDrawable(null);
        // Do something in response to button
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, "Thanks");
        //startActivity(intent);
    }
}

