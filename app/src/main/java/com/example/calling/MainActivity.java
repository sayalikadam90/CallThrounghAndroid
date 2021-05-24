package com.example.calling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtcall;
    Button btncall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtcall=findViewById(R.id.edtcall);
        btncall=findViewById(R.id.btncall);

        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String phone=edtcall.getText().toString().trim();

               if(phone.isEmpty()){

                   Toast.makeText(getApplicationContext(),"Plz enter valid no",Toast.LENGTH_LONG).show();
               }

               else{

                   String s="tel"+phone;
                   Intent intent=new Intent(Intent.ACTION_DIAL);
                   intent.setData(Uri.parse(s));
                   startActivity(intent);
               }
            }
        });

    }
}