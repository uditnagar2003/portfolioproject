package com.example.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.portfolio.model.portfolio;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_DETAIL_CODE=1337;
    private static final String TAG="MainActivity";
     private String gituser= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton ft = findViewById(R.id.fbt);
        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               createnewactivity();
                }
        });

    }

    private void createnewactivity() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
         startActivityForResult(intent, REQUEST_DETAIL_CODE);

    }

    protected void onActivityResult ( int requestCode, int resultCode, @Nullable Intent data){
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == REQUEST_DETAIL_CODE && resultCode == RESULT_OK && data != null) {
                portfolio po = data.getParcelableExtra(MainActivity2.Udit);
                if (po != null) {
                    setDetails(po);
                }
            }
        }



    private void setDetails(portfolio por) {
        TextView t1 = findViewById(R.id.textView1);
        TextView t2 = findViewById(R.id.txt2);
        TextView t3 = findViewById(R.id.txt4);
        TextView t4 = findViewById(R.id.txt5);
        TextView t5 = findViewById(R.id.txt6);
        TextView t6 = findViewById(R.id.txt8);
        TextView t7 = findViewById(R.id.txt9);
        TextView t8 = findViewById(R.id.txt10);
        t1.setText(por.getName());
        t2.setText(por.getPosition());
        t3.setText(por.getEdu().getName());
        t4.setText(por.getEdu().getDegree());
        t5.setText(por.getEdu().getYear());
        t6.setText(por.getCou().getName());
        t7.setText(por.getCou().getDegree());
        t8.setText(por.getCou().getYear());
        gituser=por.getGit();



    }

    public void opengithub(View view) {
        String url = "https://github.com/";
        if(gituser!=null)
        {
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url+gituser));
            startActivity(intent1);
        }
        else
        {
            Toast.makeText(MainActivity.this,"not valid user",Toast.LENGTH_SHORT).show();
        }
    }
}