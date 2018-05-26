//package kh.rupp.mestudy.mystudy;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import kh.rupp.mestudy.mystudy.adapter.EventAdapter;
//
//
//public class GallaryActivity extends AppCompatActivity {
//    int pos=0;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.list_item);
//        Intent intent=getIntent();
//        pos=intent.getExtras().getInt("Position");
//        final EventAdapter adapter=new EventAdapter(this);
//        final ImageView i =(ImageView) findViewById(R.id.img);
//        final TextView name= (TextView) findViewById(R.id.name);
//        final TextView price= (TextView) findViewById(R.id.price);
//        //set data
//        i.setImageResource(adapter.img[pos]);
//        name.setText(adapter.names[pos]);
//        price.setText(adapter.price[pos]);
////        Button buttontnext=(Button) findViewById(R.id.btnext);
////        buttontnext.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                int position =pos+1;
////                i.setImageResource(adapter.img[position]);
////                name.setText("name:"+adapter.names[position]);
////                price.setText("price:"+adapter.price[position]);
////                if(!(position>=adapter.getCount()-1)){
////                    pos+=1;
////                }else
////                {pos=-1;}
////            }
////        });
//
//
//    }
//}
