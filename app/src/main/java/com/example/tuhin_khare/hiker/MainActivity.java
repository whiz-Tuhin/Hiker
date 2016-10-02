package com.example.tuhin_khare.hiker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.SignInButton;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {


    EditText username;
    EditText password ;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        signin = (Button)findViewById(R.id.button);
    }

    /*public void Login(View view){
        if((username.getText().toString()).equals("tuhinkhare3@gmail.com") && (password.getText().toString()).equals("i_love_travelling")){
            startActivity(new Intent(MainActivity.this,Main2Activity.class ));
        }
        else{
            makeToast("my name is tuhun");
        }
    }*/

    public void makeToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    public void SignIn(View v){
        if((username.getText().toString()).equals("abc") && (password.getText().toString()).equals("efg")){
            startActivity(new Intent(MainActivity.this,MapsActivity.class ));
        }
        else{
            makeToast("Incorrect Username or Password");
        }
//        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }

    public void createOne(View v1){
        startActivity(new Intent(MainActivity.this,signUpActivity.class));
    }
}
