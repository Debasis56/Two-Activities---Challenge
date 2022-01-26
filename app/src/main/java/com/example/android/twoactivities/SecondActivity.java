package com.example.android.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";
    private EditText mReply;
    TextView textView;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.article_subheading);
        textView2 = findViewById(R.id.article);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //textView.setText(String.valueOf(message.equals("text1")));
        if(message.equals("text1"))
        {
            textView.setText(R.string.article_subtitle1);
            textView2.setText(R.string.article_text1);

        }
        else if(message.equals("text2"))
        {
            textView.setText(R.string.article_subtitle2);
            textView2.setText(R.string.article_text2);
        }
        else if(message.equals("text3"))
        {
            textView.setText(R.string.article_subtitle3);
            textView2.setText(R.string.article_text3);
        }

    }

//    public void returnReply(View view) {
//        String reply = mReply.getText().toString();
//        Intent replyIntent = new Intent();
//        replyIntent.putExtra(EXTRA_REPLY, reply);
//        setResult(RESULT_OK, replyIntent);
//        finish();
//    }
}