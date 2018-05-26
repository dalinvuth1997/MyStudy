package kh.rupp.mestudy.mystudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import kh.rupp.mestudy.mystudy.adapter.EventAdapter;

public class Firstpage extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //listView =(ListView) findViewById(R.id.listview);
        //EventAdapter adapter= new EventAdapter(this);
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent= new Intent(getApplicationContext(),GallaryActivity.class);
//                intent.putExtra("Position",position);
//                startActivity(intent);
//
//            }
//        });
    }
}
