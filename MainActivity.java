package kh.rupp.mestudy.mystudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.jar.Attributes;

import kh.rupp.mestudy.mystudy.adapter.EventAdapter;


public class MainActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<Event> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar tlb = (Toolbar) findViewById(R.id.tlb_main);
        //setSupportActionBar(tlb);
        //getSupportActionBar().setTitle("Faculty of Engineering");
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList = new ArrayList<>();
        loadData();
        adapter = new EventAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
    public void loadData() {

        for (int i = 1; i <10; i++) {
            itemList.add(new Event());

        }

    }



}
