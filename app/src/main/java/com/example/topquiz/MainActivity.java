package com.example.topquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mGreetingTextView;
    private EditText mNameEditText;
    private Button mPlayButton;

    mGreetingTextView = findViewById(R.id.main_textview_greeting);
    mNameEditText = findViewById(R.id.main_edittext_name);
    mPlayButton = findViewById(R.id.main_button_play);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlayButton.setEnabled(false);
    }

}