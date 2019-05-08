package com.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.todolist.adapters.TaskAdapter;
import com.example.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Button resetButton;
    private Button addButton;
    private RecyclerView recyclerView ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetButton = findViewById(R.id.resetButton);
        addButton = findViewById(R.id.addItemButton);
        recyclerView = findViewById(R.id.task_recycler_view);

        List<Task> tasks = new ArrayList<>();
        EditText editText = findViewById(R.id.editText);
        String editTextValue = editText.getText().toString();
        tasks.add(new Task(editTextValue));

        TaskAdapter taskAdapter = new TaskAdapter(tasks);

        recyclerView.setAdapter(taskAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        resetButton.setOnClickListener(resetButtonListener);
        addButton.setOnClickListener(addButtonListener);
    }

    public View.OnClickListener resetButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Steps for resetting task list
            // 1 - Get the input text view
            TextView editText = findViewById(R.id.editText);
            // 2 - Get the text inside text view
            String editTextValue = editText.getText().toString();
            // 3 - Get the array list (task list)
            // 4 - Get the text from the array list
            // 5 - Clear tasks from task list
            // 4 - Clear text from edit text
            editText.clearComposingText();

        }
    };

    public View.OnClickListener addButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Steps for adding a task (clicking the add button)
            // 1 - Get the input (edit) text view
            TextView editText = findViewById(R.id.editText);
            // 2 - Get the text inside the text view
            String editTextValue = editText.getText().toString();
            // 3 - Create a new "Task" object using the text from step 2
            new Task(editTextValue);
            // 4 - Add the Task to the lists of "tasks"
            new Task(editTextValue);
            // 5 - Delete/clear the input text view
            editText.clearComposingText();
            // 6 - refresh task adapter???

        }
    };

}
