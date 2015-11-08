package com.parse.dukehack.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.parse.ParseUser;
import com.parse.dukehack.R;

public class PointActivity extends AppCompatActivity {

    private TextView nameTxt;
    private TextView pointTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);
        nameTxt= (TextView) findViewById(R.id.usernameTxt);
        pointTxt= (TextView) findViewById(R.id.pointTxt);

        nameTxt.setText(ParseUser.getCurrentUser().getString("name"));
        pointTxt.setText(ParseUser.getCurrentUser().getInt("point")+":)");
    }
}
