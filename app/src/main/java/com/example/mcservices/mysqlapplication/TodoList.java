package com.example.mcservices.mysqlapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by MCServices on 16/2/2560.
 */

public class TodoList implements Serializable {
    public int taskid; //ระชุิว
    public String taskname;

    public String getTaskname() {

        return taskname;
    }

    public void setTaskname(String taskname) {

        this.taskname = taskname;
    }

    public int getTaskid() {

        return taskid;
    }

    public void setTaskid(int taskid) {

        this.taskid = taskid;
    }
}