package com.webdev.arapp.webdevelopmentbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LessonContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_layout);

        Intent intent = getIntent();
        String extraString = intent.getStringExtra(HtmlLessons.LESSON_NAME);
        TextView title = (TextView) findViewById(R.id.lessonTitle);

        if(extraString.equalsIgnoreCase("structure")){
            title.setText("Lesson 1 - The Structure of a Webpage");
        }else if(extraString.equalsIgnoreCase("<!DOCTYPE html>")){
            title.setText("Lesson 2 - <!DOCTYPE html> Explained");
        }
    }
}
