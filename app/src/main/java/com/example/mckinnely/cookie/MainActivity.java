package com.example.mckinnely.cookie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view)
    {

        ImageView myImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        myImage.setImageResource(R.drawable.after);
        displayMessage("I'm so full");

    }


    private void displayMessage(String message)
    {
        TextView fullNow = (TextView) findViewById(R.id.status_text_view);
        fullNow.setText(message);
    }


}
