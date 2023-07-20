package sg.edu.rp.c346.id22043453.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> items = new ArrayList<ToDoItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.todoListView);

        Calendar movieDate = Calendar.getInstance();
        movieDate.set(2020,8,1);

        Calendar haircutDate = Calendar.getInstance();
        haircutDate.set(2020,8,2);


        items.add(new ToDoItem("Go for movie", movieDate));
        items.add(new ToDoItem("Go for haircut", haircutDate));


        ArrayAdapter<ToDoItem> adapter = new ArrayAdapter<ToDoItem>(this, android.R.layout.simple_list_item_1, items);
        lvToDo.setAdapter(adapter);
    }
}