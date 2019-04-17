package com.example.todolist;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.todolist.adapters.TaskAdapter;
import com.example.todolist.model.Task;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    private Button resetButton;
    private Button addButton;
    private TextInputLayout newTaskInput;
    private RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetButton = findViewById(R.id.resetButton);
        addButton = findViewById(R.id.addItemButton);
//        newTaskInput = findViewById(R.id.add_item_box);
        recyclerView = findViewById(R.id.task_recycler_view);

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("dishes"));
        tasks.add(new Task("walk dog"));
        tasks.add(new Task("trash"));

        TaskAdapter taskAdapter = new TaskAdapter(tasks);

        recyclerView.setAdapter(taskAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


//        resetButton.setOnClickListener(resetButtonListener);
//        addButton.setOnClickListener(addButtonListener);

    }

//    public View.OnClickListener resetButtonListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//        }
//    };
//
//    public View.OnClickListener addButtonListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            String.valueOf(List);
//            newTaskInput.setText
//
//        }
//    };

}
