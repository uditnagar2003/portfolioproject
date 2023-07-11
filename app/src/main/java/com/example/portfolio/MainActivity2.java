package com.example.portfolio;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.portfolio.model.course;
import com.example.portfolio.model.education;
import com.example.portfolio.model.portfolio;

public class MainActivity2 extends AppCompatActivity {
    public static final String Udit="Udit_Portfolio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name1 = findViewById(R.id.etxt1);
                EditText name2 = findViewById(R.id.etxt2);
                EditText name3 = findViewById(R.id.etxt3);
                EditText name4 = findViewById(R.id.etxt4);
                EditText name5 = findViewById(R.id.etxt5);
                EditText name6 = findViewById(R.id.etxt6);
                EditText name7 = findViewById(R.id.etxt7);
                EditText name8 = findViewById(R.id.etxt8);
                EditText name9 = findViewById(R.id.etxt9);
                if(name1.getText().toString().isEmpty()||name1.getText().toString()==null)
                {
                    name1.setError("Detail is mandatory");
                    name1.requestFocus();
                }
                else if(name2.getText().toString().isEmpty()||name2.getText().toString()==null)
                {
                    name2.setError("Detail is mandatory");
                    name2.requestFocus();
                }else if(name3.getText().toString().isEmpty()||name3.getText().toString()==null)
                {
                    name3.setError("Detail is mandatory");
                    name3.requestFocus();
                }else if(name4.getText().toString().isEmpty()||name4.getText().toString()==null)
                {
                    name4.setError("Detail is mandatory");
                    name4.requestFocus();
                }else if(name5.getText().toString().isEmpty()||name5.getText().toString()==null)
                {
                    name5.setError("Detail is mandatory");
                    name5.requestFocus();
                }else if(name6.getText().toString().isEmpty()||name6.getText().toString()==null)
                {
                    name6.setError("Detail is mandatory");
                    name6.requestFocus();
                }else if(name7.getText().toString().isEmpty()||name7.getText().toString()==null)
                {
                    name7.setError("Detail is mandatory");
                    name7.requestFocus();
                }else if(name8.getText().toString().isEmpty()||name8.getText().toString()==null)
                {
                    name8.setError("Detail is mandatory");
                    name8.requestFocus();
                }
                else if(name9.getText().toString().isEmpty()||name9.getText().toString()==null)
                {
                    name9.setError("Detail is mandatory");
                    name9.requestFocus();
                }
                else {
                    education ed = new education(name3.getText().toString(), name4.getText().toString(), name5.getText().toString());
                    course cou = new course(name6.getText().toString(), name7.getText().toString(), name8.getText().toString());
                    portfolio por = new portfolio(name1.getText().toString(), name2.getText().toString(), name9.getText().toString(), ed, cou);
                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);

                    intent.putExtra(Udit, por);
                    setResult(RESULT_OK, intent);
                    MainActivity2.this.finish();

                }

            }
        });




  }


}