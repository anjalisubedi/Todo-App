package com.example.todoApp.Data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.todoApp.Model.Task;
import com.example.todoApp.Utility.TaskRoomDatabase;

import java.util.List;

public class Repository {
    private final TaskDao taskDao;
    private final LiveData<List<Task>> allTasks;

    public Repository(Application application)
    {
        TaskRoomDatabase database = TaskRoomDatabase.getDatabase(application);
        taskDao = database.taskDao();
        allTasks = taskDao.getTask();
    }

    public LiveData<List<Task>> getAllTasks()
    {
        return allTasks;
    }
    public void insert(Task task)
    {
        TaskRoomDatabase.databaseWriterExecutor.execute(() ->taskDao.insertTask(task));
    }
    public LiveData<Task> get(long id)
    {
        return taskDao.get(id);
    }
    public void update(Task task)
    {
        TaskRoomDatabase.databaseWriterExecutor.execute(() ->taskDao.update(task));
    }
    public void delete(Task task)
    {
        TaskRoomDatabase.databaseWriterExecutor.execute(() ->taskDao.delete(task));
    }
}
