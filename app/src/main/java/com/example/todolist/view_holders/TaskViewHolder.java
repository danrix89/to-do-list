package com.example.todolist.view_holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.todolist.R;

public class TaskViewHolder extends RecyclerView.ViewHolder {

    public TextView nameTextView;
    public CheckBox completedCheckBox;

    public TaskViewHolder(View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.task_name_text_view);
        completedCheckBox = itemView.findViewById(R.id.is_completed_checkbox);

    }

}
