package kh.rupp.mestudy.mystudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

import kh.rupp.mestudy.mystudy.adapter.EventAdapter;


public class MainActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Event> itemList;
//    private ArrayList<Event> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar tlb = (Toolbar) findViewById(R.id.tlb_main);
        //setSupportActionBar(tlb);
        //getSupportActionBar().setTitle("Faculty of Engineering");
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        itemList = new ArrayList<>();
        adapter = new EventAdapter(this, itemList);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        prepareData();
    }
    private void prepareData() {
        int[] img = new int[]{
                R.drawable.vfour,
                R.drawable.vfive,
                R.drawable.vf,
                R.drawable.vs,
                R.drawable.v18,
                R.drawable.v20,
                R.drawable.v19,
                R.drawable.vth,
                R.drawable.v16,
                R.drawable.v15,
                R.drawable.vth};
        Event a = new Event(1,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
         a = new Event(2,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
         a = new Event(3,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
         a = new Event(4,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
         a = new Event(5,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
         a = new Event(6,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
         a = new Event(7,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
         a = new Event(8,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
         a = new Event(9,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
          a = new Event(10,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);
        a = new Event(11,"kampot","sea","kampot province","12/Apil/2015");
        itemList.add(a);



        adapter.notifyDataSetChanged();
    }

    }
