package com.webdev.arapp.webdevelopmentbasics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Alex on 11/30/2017.
 */

public class Lessons {

    private String lessonName;

    public Lessons(){

    }

    public Lessons(String lessonName){
        this.lessonName = lessonName;
    }

    public String getName(){
        return lessonName;
    }
}
