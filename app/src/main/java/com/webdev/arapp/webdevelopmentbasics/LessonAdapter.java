package com.webdev.arapp.webdevelopmentbasics;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alex on 11/30/2017.
 */

public class LessonAdapter extends ArrayAdapter<Lessons> {
    private Context context;
    private int resource;
    private ArrayList<Lessons> lessonList = null;

    public LessonAdapter(@NonNull Context context, int resource, ArrayList<Lessons> lessonList) {
        super(context, resource, lessonList);

        this.context = context;
        this.resource = resource;
        this.lessonList = lessonList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Lessons lesson = lessonList.get(position);

        if(convertView == null)
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);

        TextView lessonName = (TextView) convertView.findViewById(R.id.lessonTitle);

        lessonName.setText(lesson.getName());

        return convertView;
    }

    public ArrayList<Lessons> getCustomList(){
        return lessonList;
    }

    public Lessons getViewId(int position){
        return lessonList.get(position);
    }
}
