package sg.edu.rp.c346.id20031634.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<AndroidVersion> al;
//    ArrayAdapter<AndroidVersion> aa;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        AndroidVersion item1 = new AndroidVersion("Pie","9.0");
        al = new ArrayList();
        al.add(item1);
        al.add(new AndroidVersion("Orea","8.0 - 8.1"));
        al.add(new AndroidVersion("Nougat","7.0"));

//        aa= new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,al);
        adapter = new CustomAdapter(MainActivity.this,
                R.layout.row,al);
        lv.setAdapter(adapter);
    }
}