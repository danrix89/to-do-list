package com.example.todolist.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.todolist.R;
import com.example.todolist.model.Task;
import com.example.todolist.view_holders.TaskViewHolder;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {

    private List<Task> tasks;

    /**
     * Create a new TaskAdapter object in memory with a list of tasks
     * @param tasks A provided list of tasks to set into your "tasks" member variable
     */
    public TaskAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.task_item, parent, false);

        // Return a new holder instance
        TaskViewHolder taskViewHolder = new TaskViewHolder(view);
        return taskViewHolder;
    }

    // Involves populating data into the item through holder

    @Override
    public void onBindViewHolder(TaskViewHolder taskViewHolder, int position) {
        // Get the data model based on position
        Task task = tasks.get(position);

        // Set item views based on your views and data model
        TextView textView = taskViewHolder.nameTextView;
        textView.setText(task.getName());
        CheckBox checkBox = taskViewHolder.completedCheckBox;
        checkBox.setText(task.isCompleted() ? "Done" : "Not Done");
        checkBox.setEnabled(true);
        checkBox.setChecked(task.isCompleted());
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
