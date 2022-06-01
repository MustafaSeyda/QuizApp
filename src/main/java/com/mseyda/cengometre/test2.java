package com.mseyda.cengometre;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.HashMap;

public class test2 extends AppCompatActivity {
    ArrayList<Integer []> sayaç=new ArrayList<Integer []>();
    Button a,b,c,d,nextbtn,prevbtn,goBack,pas;
    TextView sorumetni,result1;
    DB_Question vt=new DB_Question(this);
    ArrayList<Sorular>soru=new ArrayList<>();
    SorularDao dao=new SorularDao();
    şıklar counter=new şıklar();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        goBack=findViewById(R.id.goBack);
        goBack.setVisibility(View.INVISIBLE);
        prevbtn=findViewById(R.id.prevbtn);
        result1=findViewById(R.id.result1);
        result1.setVisibility(View.INVISIBLE);
        a=findViewById(R.id.test1a);
        b=findViewById(R.id.test1b);
        c=findViewById(R.id.test1c);
        d=findViewById(R.id.test2D);
        nextbtn=findViewById(R.id.nextbtn);
        sorumetni=findViewById(R.id.test1sorumetni1);
        soru=dao.soru_çekme_dört_secenek(vt,"test2");
        sorumetni.setText(soru.get(0).getSoru_metni());
        a.setText(soru.get(0).getA_sıkkı());
        b.setText(soru.get(0).getB_sıkkı());
        c.setText(soru.get(0).getC_sıkkı());
        d.setText(soru.get(0).getD_sıkkı());
        pas=findViewById(R.id.pas);
        counter.sayaç_oluştur(sayaç,10,4);


    }


    public int i=0;
    public void pasClicked(View view){
        counter.şık_sayacı(sayaç,"pas",i,4);
        a.setBackground(getDrawable(R.drawable.rounded_rectangle));
        pas.setBackground(getDrawable(R.drawable.selected));
        b.setBackground(getDrawable(R.drawable.rounded_rectangle));
        d.setBackground(getDrawable(R.drawable.rounded_rectangle));
        c.setBackground(getDrawable(R.drawable.rounded_rectangle));
    }
    public void A_counter(View view){
        counter.şık_sayacı(sayaç,"a",i,4);
        a.setBackground(getDrawable(R.drawable.selected));
        pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
        b.setBackground(getDrawable(R.drawable.rounded_rectangle));
        d.setBackground(getDrawable(R.drawable.rounded_rectangle));
        c.setBackground(getDrawable(R.drawable.rounded_rectangle));
        a.setBackgroundTintMode(null);
        b.setBackgroundTintMode(null);
        c.setBackgroundTintMode(null);
        d.setBackgroundTintMode(null);

    }
    public void B_counter(View view){
        counter.şık_sayacı(sayaç,"b",i,4);
        a.setBackground(getDrawable(R.drawable.rounded_rectangle));
        b.setBackground(getDrawable(R.drawable.selected));
        c.setBackground(getDrawable(R.drawable.rounded_rectangle));
        pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
        d.setBackground(getDrawable(R.drawable.rounded_rectangle));
        a.setBackgroundTintMode(null);
        b.setBackgroundTintMode(null);
        c.setBackgroundTintMode(null);
        d.setBackgroundTintMode(null);
    }
    public void C_counter(View view){
        counter.şık_sayacı(sayaç,"c",i,4);
        a.setBackground(getDrawable(R.drawable.rounded_rectangle));
        b.setBackground(getDrawable(R.drawable.rounded_rectangle));
        c.setBackground(getDrawable(R.drawable.selected));
        d.setBackground(getDrawable(R.drawable.rounded_rectangle));
        a.setBackgroundTintMode(null);
        b.setBackgroundTintMode(null);
        c.setBackgroundTintMode(null);
        d.setBackgroundTintMode(null);
        pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
    }
    public void D_counter(View view){
        counter.şık_sayacı(sayaç,"b",i,4);
        a.setBackground(getDrawable(R.drawable.rounded_rectangle));
        d.setBackground(getDrawable(R.drawable.selected));
        c.setBackground(getDrawable(R.drawable.rounded_rectangle));
        b.setBackground(getDrawable(R.drawable.rounded_rectangle));
        a.setBackgroundTintMode(null);
        b.setBackgroundTintMode(null);
        c.setBackgroundTintMode(null);
        d.setBackgroundTintMode(null);
        pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
    }


    public void prev(View view){
        if(i==0){
            Toast.makeText(this,"You can't go back",Toast.LENGTH_LONG).show();
        }
        else{
            a.setBackground(getDrawable(R.drawable.rounded_rectangle));
            d.setBackground(getDrawable(R.drawable.rounded_rectangle));
            c.setBackground(getDrawable(R.drawable.rounded_rectangle));
            b.setBackground(getDrawable(R.drawable.rounded_rectangle));
            pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
            if (i<soru.size()){
                i--;
                sorumetni.setText(soru.get(i).getSoru_metni());
                a.setText(soru.get(i).getA_sıkkı());
                b.setText(soru.get(i).getB_sıkkı());
                c.setText(soru.get(i).getC_sıkkı());
                d.setText(soru.get(i).getD_sıkkı());
            }
            if(i!=soru.size()-1){
                nextbtn.setText("Next");
            }


        }}
    public void go_back(View view){
        Intent intent=new Intent(test2.this,testler.class);
        startActivity(intent);
        finish();
    }
    public void next(View view){
        if(nextbtn.getText().equals("Finish")){

            a.setVisibility(View.INVISIBLE);
            b.setVisibility(View.INVISIBLE);
            c.setVisibility(View.INVISIBLE);
            d.setVisibility(View.INVISIBLE);
            pas.setVisibility(View.INVISIBLE);
            nextbtn.setVisibility(View.INVISIBLE);
            prevbtn.setVisibility(View.INVISIBLE);
            sorumetni.setVisibility(View.INVISIBLE);
            result1.setVisibility(View.VISIBLE);
            goBack.setVisibility(View.VISIBLE);
            SharedPreferences sp2;
            pas.setVisibility(View.INVISIBLE);

            if(counter.sonuç(sayaç,10,4)==1){
                result1.setText("KOLAY AMA GÜÇLÜ DİYORSUN DEMEK? ÇOK MANTIKLI BİR SEÇİM PYTHON BU YOLDA YANINDA DOSTUM!");
                sp2=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp2.edit().putString("test2",getString(R.string.test2a)).apply();


            }else if(counter.sonuç(sayaç,10,4)==2){
                result1.setText("DEMEK JAVASCRİPT E MERAKLIYIZ. SÜPER BÖYLE DEVAM.");
                sp2=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp2.edit().putString("test2",getString(R.string.test2b)).apply();


            }else if(counter.sonuç(sayaç,10,4)==3){
                result1.setText("C# 'a YÖNELİMİN OLDUĞUNA GÖRE ÇOK YÖNLÜ BİRİ OLMALISIN. SEVDİM BU ÖZELLİĞİNİ.");
                sp2=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp2.edit().putString("test2",getString(R.string.test2c)).apply();


            } else if(counter.sonuç(sayaç,10,4)==4){
                result1.setText("BİRAZ AĞIR ABİYİZ SANIRIM JAVA HERKESİN HARCI DEĞİLDİR.");
                sp2=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp2.edit().putString("test2",getString(R.string.test2d)).apply();


            }else if (counter.sonuç(sayaç,10,3)==-1){
                result1.setText("KAFAN BAYA KARIŞMIŞ DURUMDA BENCE TEKRAR ÇÖZMELİSİN!");
            }

        }
        else{
            a.setBackground(getDrawable(R.drawable.rounded_rectangle));
            d.setBackground(getDrawable(R.drawable.rounded_rectangle));
            c.setBackground(getDrawable(R.drawable.rounded_rectangle));
            b.setBackground(getDrawable(R.drawable.rounded_rectangle));
            pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
            if (i<soru.size()){
                i++;
                sorumetni.setText(soru.get(i).getSoru_metni());
                a.setText(soru.get(i).getA_sıkkı());
                b.setText(soru.get(i).getB_sıkkı());
                c.setText(soru.get(i).getC_sıkkı());
                d.setText(soru.get(i).getD_sıkkı());

            }

            if(i==soru.size()-1){
                nextbtn.setText("Finish");

            }

        }}
}