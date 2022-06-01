package com.mseyda.cengometre;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.health.ServiceHealthStats;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.HashMap;


public class test1 extends AppCompatActivity {
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
        setContentView(R.layout.activity_test1);
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
        soru=dao.soru_çekme_dört_secenek(vt,"test1");
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
        a.setBackground(getDrawable(R.drawable.selected));
        counter.şık_sayacı(sayaç,"a",i,4);
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
        Intent intent=new Intent(test1.this,testler.class);
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
            SharedPreferences sp1;

            if(counter.sonuç(sayaç,10,4)==1){
                result1.setText("ROBOTLARIN FETHİNİ SEN DURDURACAKSIN GİBİ DURUYOR YAPAY ZEKACI SENİ. İNSANLIĞIN KADERİ SENİN ELLERİNDE.");
                sp1=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp1.edit().putString("test1",getString(R.string.test1a)).apply();


            }else if(counter.sonuç(sayaç,10,4)==2){
                result1.setText("WEB TASARIMINDA BİR NUMARA OLMA YOLUNDA EMİN ADIMLARLA İLERLEMEYE DEVAM.");
                sp1=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp1.edit().putString("test1",getString(R.string.test1b)).apply();



            }else if(counter.sonuç(sayaç,10,4)==3){
                result1.setText("TELEFONLARLA BAYA HAŞIR NEŞİRİZ SANIRIM.SENDEN SAĞLAM BİR MOBİLCİ OLUR.");
                sp1=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp1.edit().putString("test1",getString(R.string.test1c)).apply();


            } else if(counter.sonuç(sayaç,10,4)==4){
                result1.setText("SİBER GÜVENLİK SANA EMANET. BAŞARABİLİRSİN!!");
                sp1=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp1.edit().putString("test1",getString(R.string.test1d)).apply();


            }else if (counter.sonuç(sayaç,10,3)==-1){
                result1.setText("SANKİ BİRAZCIK KARARSIZ GİBİYİZ TESTİ TEKRAR ÇÖZMEYE NE DERSİN?");
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
