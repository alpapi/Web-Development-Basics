package com.webdev.arapp.webdevelopmentbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HtmlLessons extends AppCompatActivity {
    public static final String LESSON_NAME = "com.webdev.arapp.webdevelopmentbasics.NAME";
    LessonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_lessons);

        ListView listView = (ListView) findViewById(R.id.lesson_list);

        ArrayList<Lessons> lessonList = new ArrayList<Lessons>();
        Lessons lesson1 = new Lessons("Structure");

        lessonList.add(lesson1);

        Lessons lesson2 = new Lessons("<!DOCTYPE html>");

        lessonList.add(lesson2);

        adapter = new LessonAdapter(getApplicationContext(), R.layout.lesson_layout, lessonList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Lessons item = ((Lessons) adapter.getViewId(i));
                ArrayList<Lessons> lessonList = adapter.getCustomList();
                String name = item.getName();

                Intent intent = new Intent(getApplicationContext(), LessonContainer.class);
                intent.putExtra(LESSON_NAME, name);
                startActivity(intent);
            }
        });
    }
}
