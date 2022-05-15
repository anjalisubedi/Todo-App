package com.example.todoApp.Adapter;

import com.example.todoApp.Model.Task;

public interface OnTodoClickListener
{
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
