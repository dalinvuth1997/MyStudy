package kh.rupp.mestudy.mystudy;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;



 /* Created by ACER on 03/12/2018.
 */

public class LoginActivity extends AppCompatActivity implements View.OnCreateContextMenuListener{
    private Button button;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        text=(TextView) findViewById(R.id.textnotnow);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstActivity();
            }
        });

        button=(Button) findViewById(R.id.buttonlogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMenu();
            }
        });
    }
    public void openFirstActivity(){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void openActivityMenu(){
        Intent intent =new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}

