package ru.drivermql.p0026;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends Activity implements View.OnClickListener {
    /*Called when the activity is first created*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button time = (Button) findViewById(R.id.btnTime);
        Button date = (Button) findViewById(R.id.btnDate);

        time.setOnClickListener(this);
        date.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
            switch(view.getId()) {
            case R.id.btnTime:
                intent = new Intent("ru.drivermql.p0026.showtime");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("ru.drivermql.p0026.showdate");
                startActivity(intent);
                break;
        }
    }
}
