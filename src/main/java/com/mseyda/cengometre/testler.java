package com.mseyda.cengometre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class testler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testler);
    }
    public void test1(View view){
        Intent intent=new Intent(testler.this,test1.class);
        startActivity(intent);
        finish();


    }
    public void test2(View view){
        Intent intent=new Intent(testler.this,test2.class);
        startActivity(intent);
        finish();


    }
    public void test3(View view){
        Intent intent=new Intent(testler.this,test3.class);
        startActivity(intent);
        finish();


    }
    public void test4(View view){
        Intent intent=new Intent(testler.this,test4.class);
        startActivity(intent);
        finish();


    }
    public void test5(View view){
        Intent intent=new Intent(testler.this,test5.class);
        startActivity(intent);
        finish();


    }
    public void test6(View view){
        Intent intent=new Intent(testler.this,test6.class);
        startActivity(intent);
        finish();


    }
    public void test7(View view){
        Intent intent=new Intent(testler.this,test7.class);
        startActivity(intent);
        finish();


    }
    public void test8(View view){
        Intent intent=new Intent(testler.this,test8.class);
        startActivity(intent);
        finish();


    }
    public void test9(View view){
        Intent intent=new Intent(testler.this,test9.class);
        startActivity(intent);
        finish();


    }

}