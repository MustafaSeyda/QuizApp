package com.mseyda.cengometre;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.firebase.auth.FirebaseAuth;

public class MainMenu extends AppCompatActivity {
    SharedPreferences sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
        auth=FirebaseAuth.getInstance();
        sp1=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp2=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp3=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp4=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp5=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp6=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp7=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp8=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp9=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);

    }
    public void testClicked(View view){
        Intent intentTest=new Intent(MainMenu.this,testler.class);
        startActivity(intentTest);
    }
    public void exitClicked(View view){
        sp1.edit().remove("test1").apply();
        sp2.edit().remove("test2").apply();
        sp3.edit().remove("test3").apply();
        sp4.edit().remove("test4").apply();
        sp5.edit().remove("test5").apply();
        sp6.edit().remove("test6").apply();
        sp7.edit().remove("test7").apply();
        sp8.edit().remove("test8").apply();
        sp9.edit().remove("test9").apply();
        auth.signOut();
        Intent intent=new Intent(MainMenu.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void sonuclarClicked(View view){
        Intent intentTest=new Intent(MainMenu.this,uploadResults.class);
        startActivity(intentTest);
    }
    public void yüzdelerClicked(View view){
        Intent intentTest=new Intent(MainMenu.this,yuzdeler.class);
        startActivity(intentTest);

    }
    public void profil(View view){
        Intent intent=new Intent(MainMenu.this,profil.class);
        startActivity(intent);
    }
    public void hakkında(View view){
        Intent intent=new Intent(MainMenu.this,hakkinda.class);
        startActivity(intent);
    }
}