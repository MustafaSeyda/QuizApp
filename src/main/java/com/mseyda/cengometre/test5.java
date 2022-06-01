package com.mseyda.cengometre;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.health.ServiceHealthStats;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;

import java.util.ArrayList;
import java.util.HashMap;

public class test5 extends AppCompatActivity {

    ArrayList<Integer []> sayaç=new ArrayList<Integer []>();
    Button a,b,c,nextbtn,start,prevbtn,goBack,pas;
    TextView sorumetni,result1;
    DocumentReference docRef;
    DB_Question vt=new DB_Question(this);
    ArrayList<Sorular>soru=new ArrayList<>();
    SorularDao dao=new SorularDao();


    String Email;
    String result1_text="Frond-End Yazılımcısı olmak için doğmuşsun";
    String result2_text="Back-End Yazılımcısı olmak için doğmuşsun";
    String result3_text="Tüm skiller sende maşallah";
    şıklar counter=new şıklar();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test5);
        Intent intent3=getIntent();
        Email=intent3.getStringExtra("email");
        goBack=findViewById(R.id.goBack);
        goBack.setVisibility(View.INVISIBLE);
        prevbtn=findViewById(R.id.prevbtn);
        result1=findViewById(R.id.result1);
        result1.setVisibility(View.INVISIBLE);
        a=findViewById(R.id.test1a);
        b=findViewById(R.id.test1b);
        c=findViewById(R.id.test1c);
        start=findViewById(R.id.start);
        nextbtn=findViewById(R.id.nextbtn);
        sorumetni=findViewById(R.id.test1sorumetni1);
        soru=dao.soru_çekme_üç_secenek(vt,"test5");
        sorumetni.setText(soru.get(0).getSoru_metni());
        a.setText(soru.get(0).getA_sıkkı());
        b.setText(soru.get(0).getB_sıkkı());
        c.setText(soru.get(0).getC_sıkkı());
        counter.sayaç_oluştur(sayaç,10,3);
        pas=findViewById(R.id.pas);



    }
    public int i=0;
    public void pasClicked(View view){
        counter.şık_sayacı(sayaç,"pas",i,3);
        a.setBackground(getDrawable(R.drawable.rounded_rectangle));
        pas.setBackground(getDrawable(R.drawable.selected));
        b.setBackground(getDrawable(R.drawable.rounded_rectangle));
        c.setBackground(getDrawable(R.drawable.rounded_rectangle));

    }
    public void A_counter(View view){
        counter.şık_sayacı(sayaç,"a",i,3);
        a.setBackground(getDrawable(R.drawable.selected));
        b.setBackground(getDrawable(R.drawable.rounded_rectangle));
        c.setBackground(getDrawable(R.drawable.rounded_rectangle));
        pas.setBackground(getDrawable(R.drawable.rounded_rectangle));

        a.setBackgroundTintMode(null);
        b.setBackgroundTintMode(null);
        c.setBackgroundTintMode(null);

    }
    public void B_counter(View view){
        counter.şık_sayacı(sayaç,"b",i,3);
        b.setBackground(getDrawable(R.drawable.selected));
        c.setBackground(getDrawable(R.drawable.rounded_rectangle));
        a.setBackground(getDrawable(R.drawable.rounded_rectangle));
        pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
        a.setBackgroundTintMode(null);
        b.setBackgroundTintMode(null);
        c.setBackgroundTintMode(null);
    }
    public void C_counter(View view){
        counter.şık_sayacı(sayaç,"c",i,3);
        c.setBackground(getDrawable(R.drawable.selected));
        b.setBackground(getDrawable(R.drawable.rounded_rectangle));
        a.setBackground(getDrawable(R.drawable.rounded_rectangle));
        pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
        a.setBackgroundTintMode(null);
        b.setBackgroundTintMode(null);
        c.setBackgroundTintMode(null);
    }

    public void prev(View view){
        if(i==0){
            Toast.makeText(this,"You can't go back",Toast.LENGTH_LONG).show();
        }
        else{
            c.setBackground(getDrawable(R.drawable.rounded_rectangle));
            b.setBackground(getDrawable(R.drawable.rounded_rectangle));
            a.setBackground(getDrawable(R.drawable.rounded_rectangle));
            pas.setBackground(getDrawable(R.drawable.rounded_rectangle));

            if (i<soru.size()){
                i--;
                sorumetni.setText(soru.get(i).getSoru_metni());
                a.setText(soru.get(i).getA_sıkkı());
                b.setText(soru.get(i).getB_sıkkı());
                c.setText(soru.get(i).getC_sıkkı());
            }
            if(i!=soru.size()-1){
                nextbtn.setText("Next");
            }


        }}
    public void go_back(View view){
        Intent intent=new Intent(test5.this,testler.class);
        startActivity(intent);
        finish();
    }
    public void next(View view){
        if(nextbtn.getText().equals("Finish")){
            a.setVisibility(View.INVISIBLE);
            b.setVisibility(View.INVISIBLE);
            c.setVisibility(View.INVISIBLE);
            nextbtn.setVisibility(View.INVISIBLE);
            prevbtn.setVisibility(View.INVISIBLE);
            sorumetni.setVisibility(View.INVISIBLE);
            result1.setVisibility(View.VISIBLE);
            goBack.setVisibility(View.VISIBLE);
            SharedPreferences sp5;
            pas.setVisibility(View.INVISIBLE);




            if(counter.sonuç(sayaç,10,3)==1){
                result1.setText("ÇOK MU ŞEKİLCİYİZ ACABA? YAPTIĞIN İŞLERİN ESTETİĞİ GÖZÜMÜZÜ KAMAŞTIRDI.(FRONT-END)");
                sp5=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp5.edit().putString("test5",getString(R.string.test5a)).apply();





            }else if(counter.sonuç(sayaç,10,3)==2){
                result1.setText("HER ŞEYİN ARKASINDA BU KADAR MANTIK ARAMA BAK DÜŞÜN DÜŞÜN KAFAYI YERSİN(BACK-END)");
                sp5=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp5.edit().putString("test5",getString(R.string.test5b)).apply();



            }else if(counter.sonuç(sayaç,10,3)==3){
                result1.setText("DOPDOLU BİR PAKETİNİZ DEMEK. SENDEN CİVARDA ÇOK YOK KIYMETİNİ BİL.(FULLSTACK)");
                sp5=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
                sp5.edit().putString("test5",getString(R.string.test5c)).apply();



            }else if (counter.sonuç(sayaç,10,3)==-1){
                result1.setText("SANKİ BİRAZCIK KARARSIZ GİBİYİZ TESTİ TEKRAR ÇÖZMEYE NE DERSİN?");
            }

        }
        else{
            c.setBackground(getDrawable(R.drawable.rounded_rectangle));
            b.setBackground(getDrawable(R.drawable.rounded_rectangle));
            a.setBackground(getDrawable(R.drawable.rounded_rectangle));
            pas.setBackground(getDrawable(R.drawable.rounded_rectangle));
            if (i<soru.size()){
                i++;
                sorumetni.setText(soru.get(i).getSoru_metni());
                a.setText(soru.get(i).getA_sıkkı());
                b.setText(soru.get(i).getB_sıkkı());
                c.setText(soru.get(i).getC_sıkkı());

            }

            if(i==soru.size()-1){
                nextbtn.setText("Finish");

            }

        }}

}