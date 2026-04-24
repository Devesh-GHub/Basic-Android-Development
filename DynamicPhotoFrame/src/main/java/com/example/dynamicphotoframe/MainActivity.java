package com.example.dynamicphotoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int currentImagr = 0;  //0 - 1 - 2 - 3 - 4
    ImageButton prev, next;
    ImageView pic ;
    TextView text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev(View v){
        String idX = "pic" + currentImagr;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImagr = (5 + currentImagr - 1) % 5 ;
        String idY = "pic" + currentImagr;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

    }
    public void next(View v){
        String idX = "pic" + currentImagr;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImagr = (5 + currentImagr + 1) % 5 ;
        String idY = "pic" + currentImagr;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
    }
}