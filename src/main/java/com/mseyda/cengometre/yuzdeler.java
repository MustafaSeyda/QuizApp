package com.mseyda.cengometre;

import android.content.Intent;
import android.icu.number.Precision;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class yuzdeler extends AppCompatActivity {
    ArrayList<yüzdelerClass> oranlistesi=new ArrayList<yüzdelerClass>();
    HashMap<String ,String > yüzdeler;
    TextView başlık,A,B,C,D,a,b,c,d;
    Button next,prev;
    DecimalFormat df = new DecimalFormat("#.##");
    int test1a=0,test1b=0,test1c=0,test1d=0,test2a=0,test2b=0,test2c=0,test2d=0,
            test3a=0,test3b=0,test3c=0,test4a=0,test4b=0,test5a=0,test5b=0,test5c=0,
            test6a=0,test6b=0,test7a=0,test7b=0,test7c=0,test8a=0,test8b=0,test9a=0,test9b=0,sum=0;

    FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser() ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuzdeler);
        next=findViewById(R.id.next);
        prev=findViewById(R.id.prev);
        başlık=findViewById(R.id.testbaşlığı);
        A=findViewById(R.id.a_şıkkı);
        B=findViewById(R.id.b_şıkkı);
        C=findViewById(R.id.c_şıkkı);
        D=findViewById(R.id.d_şıkkı);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        d=findViewById(R.id.d);
        veri_çek();

    }
    public void veri_çek(){
        FirebaseFirestore mfirestore;
        mfirestore= FirebaseFirestore.getInstance();
        mfirestore.collection("users").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                if(error!=null){
                    Toast.makeText(yuzdeler.this,error.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }
                if (value!=null){
                    for (DocumentSnapshot doc : value.getDocuments()){
                        sum++;
                        HashMap<String,String > tempHashMap;
                        tempHashMap=(HashMap)doc.getData();
                        if (tempHashMap.get("test1").equals(getString(R.string.test1a))){
                            test1a++;
                            A.setText(""+test1a);
                        }
                        if (tempHashMap.get("test1").equals(getString(R.string.test1b))){
                            test1b++;
                        }
                        if (tempHashMap.get("test1").equals(getString(R.string.test1c))){
                            test1c++;
                        }
                        if (tempHashMap.get("test1").equals(getString(R.string.test1d))){
                            test1d++;
                        }
                        if (tempHashMap.get("test2").equals(getString(R.string.test2a))){
                            test2a++;
                        }
                        if (tempHashMap.get("test2").equals(getString(R.string.test2b))){
                            test2b++;
                        }
                        if (tempHashMap.get("test2").equals(getString(R.string.test2c))){
                            test2c++;
                        }
                        if (tempHashMap.get("test2").equals(getString(R.string.test2d))){
                            test2d++;
                        }
                        if (tempHashMap.get("test3").equals(getString(R.string.test3a))){
                            test3a++;
                        }
                        if (tempHashMap.get("test3").equals(getString(R.string.test3b))){
                            test3b++;
                        }
                        if (tempHashMap.get("test3").equals(getString(R.string.test3c))){
                            test3c++;
                        }
                        if (tempHashMap.get("test4").equals(getString(R.string.test4a))){
                            test4a++;
                        }
                        if (tempHashMap.get("test4").equals(getString(R.string.test4b))){
                            test4b++;
                        }
                        if (tempHashMap.get("test5").equals(getString(R.string.test5a))){
                            test5a++;
                        }
                        if (tempHashMap.get("test5").equals(getString(R.string.test5b))){
                            test5b++;
                        }
                        if (tempHashMap.get("test5").equals(getString(R.string.test5c))){
                            test5c++;
                        }
                        if (tempHashMap.get("test6").equals(getString(R.string.test6a))){
                            test6a++;
                        }
                        if (tempHashMap.get("test6").equals(getString(R.string.test6b))){
                            test6b++;
                        }
                        if (tempHashMap.get("test7").equals(getString(R.string.test7a))){
                            test7a++;
                        }
                        if (tempHashMap.get("test7").equals(getString(R.string.test7b))){
                            test7b++;
                        }
                        if (tempHashMap.get("test7").equals(getString(R.string.test7c))){
                            test7c++;
                        }
                        if (tempHashMap.get("test8").equals(getString(R.string.test8a))){
                            test8a++;
                        }
                        if (tempHashMap.get("test8").equals(getString(R.string.test8b))){
                            test8b++;
                        }
                        if (tempHashMap.get("test9").equals(getString(R.string.test9a))){
                            test9a++;
                        }
                        if (tempHashMap.get("test9").equals(getString(R.string.test9b))){
                            test9b++;
                        }


                    }
                    float[] şık_oranları={test1a,test1b,test1c,test1d,test2a,test2b,test2c,test2d,
                            test3a,test3b,test3c,0,test4a,test4b,0,0,test5a,test5b,test5c,0,
                            test6a,test6b,0,0,test7a,test7b,test7c,0,test8a,test8b,0,0,test9a,test9b,0,0};


                    String[] sonuçlar={getString(R.string.test1a),getString(R.string.test1b),getString(R.string.test1c),getString(R.string.test1d),
                            getString(R.string.test2a),getString(R.string.test2b),getString(R.string.test2c),getString(R.string.test2d),
                            getString(R.string.test3a),getString(R.string.test3b),getString(R.string.test3c),"",getString(R.string.test4a)
                            ,getString(R.string.test4b),"","",getString(R.string.test5a),getString(R.string.test5b),getString(R.string.test5c),
                            "",getString(R.string.test6a),getString(R.string.test6b),
                            "","",getString(R.string.test7a),getString(R.string.test7b),getString(R.string.test7c),"",
                            getString(R.string.test8a),getString(R.string.test8b),"","",getString(R.string.test9a),getString(R.string.test9b),"","",
                            "","","","","","","","","","","","","","","","","","","","","","","","","","",
                            "","","","","","","","","","",};
                    for(int i=0;i<şık_oranları.length;i++ ){
                        şık_oranları[i]= Float.parseFloat(df.format((şık_oranları[i]/sum)*100));
                        sonuçlar[i+36]=String.valueOf(şık_oranları[i]);
                    }
                    int j=0;

                    for(int i=1;i<10;i++){
                        yüzdelerClass oranlar2=new yüzdelerClass((i+". TEST SONUÇLARI"),sonuçlar[j],
                                sonuçlar[j+1],sonuçlar[j+2],sonuçlar[j+3],sonuçlar[j+36],sonuçlar[j+37],sonuçlar[j+38],sonuçlar[j+39]);
                        oranlistesi.add(oranlar2);
                        j=j+4;
                        System.out.println(oranlistesi.get(0).getTest_ismi());

                    }
                    başlık.setText(" "+oranlistesi.get(0).getTest_ismi()+" ");
                    A.setText(" "+oranlistesi.get(0).getA_şıkkı_result()+" ");
                    a.setText(" %"+oranlistesi.get(0).getA_şıkkı_yüzde()+" ");
                    B.setText(" "+oranlistesi.get(0).getB_şıkkı_result()+" ");
                    b.setText(" %"+oranlistesi.get(0).getB_şıkkı_yüzde()+" ");
                    if (oranlistesi.get(0).getC_şıkkı_result().equals("")){
                        C.setVisibility(View.INVISIBLE);
                        D.setVisibility(View.INVISIBLE);
                        c.setVisibility(View.INVISIBLE);
                        d.setVisibility(View.INVISIBLE);
                    }else{
                        C.setVisibility(View.VISIBLE);
                        D.setVisibility(View.VISIBLE);
                        c.setVisibility(View.VISIBLE);
                        d.setVisibility(View.VISIBLE);

                    }
                    C.setText(" "+oranlistesi.get(0).getC_şıkkı_result()+" ");
                    c.setText(" %"+oranlistesi.get(0).getC_şıkkı_yüzde()+" ");
                    if (oranlistesi.get(0).getD_şıkkı_result().equals("")){
                        D.setVisibility(View.INVISIBLE);
                        d.setVisibility(View.INVISIBLE);

                    }else{
                        D.setVisibility(View.VISIBLE);
                        d.setVisibility(View.VISIBLE);
                    }
                    D.setText(" "+oranlistesi.get(0).getD_şıkkı_result()+" ");
                    d.setText(" %"+oranlistesi.get(0).getD_şıkkı_yüzde()+" ");



                }
            }
        });


    }

    int k=0;
    public void prev(View view) {
        if (k == 0) {
            Toast.makeText(yuzdeler.this, "You can't go back", Toast.LENGTH_LONG).show();
        } else {

            if (k < oranlistesi.size()) {
                k--;
                başlık.setText(" "+oranlistesi.get(k).getTest_ismi()+" ");
                A.setText(" "+oranlistesi.get(k).getA_şıkkı_result()+" ");
                a.setText(" %"+oranlistesi.get(k).getA_şıkkı_yüzde()+" ");
                B.setText(" "+oranlistesi.get(k).getB_şıkkı_result()+" ");
                b.setText(" %"+oranlistesi.get(k).getB_şıkkı_yüzde()+" ");
                if (oranlistesi.get(k).getC_şıkkı_result().equals("")){
                    C.setVisibility(View.INVISIBLE);
                    D.setVisibility(View.INVISIBLE);
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                }else{
                    C.setVisibility(View.VISIBLE);
                    D.setVisibility(View.VISIBLE);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.VISIBLE);
                }
                C.setText(" "+oranlistesi.get(k).getC_şıkkı_result()+" ");
                c.setText(" %"+oranlistesi.get(k).getC_şıkkı_yüzde()+" ");
                if (oranlistesi.get(k).getD_şıkkı_result().equals("")){
                    D.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                }else{
                    D.setVisibility(View.VISIBLE);
                    d.setVisibility(View.VISIBLE);
                }
                D.setText(" "+oranlistesi.get(k).getD_şıkkı_result()+" ");
                d.setText(" %"+oranlistesi.get(k).getD_şıkkı_yüzde()+" ");

            }
            if (k != oranlistesi.size() - 1) {
                next.setText("Next");
            }


        }
    }

    public void next(View view) {
        if (next.getText().equals("ANA SAYFAYA DÖN")) {
            Intent intent = new Intent(yuzdeler.this, MainMenu.class);
            startActivity(intent);
            finish();


        } else {
            if (k< oranlistesi.size()) {
                k++;
                başlık.setText(" "+oranlistesi.get(k).getTest_ismi()+" ");
                A.setText(" "+oranlistesi.get(k).getA_şıkkı_result()+" ");
                a.setText(" %"+oranlistesi.get(k).getA_şıkkı_yüzde()+" ");
                B.setText(" "+oranlistesi.get(k).getB_şıkkı_result()+" ");
                b.setText(" %"+oranlistesi.get(k).getB_şıkkı_yüzde()+" ");
                if (oranlistesi.get(k).getC_şıkkı_result().equals("")){
                    C.setVisibility(View.INVISIBLE);
                    D.setVisibility(View.INVISIBLE);
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                }
                else{
                    C.setVisibility(View.VISIBLE);
                    D.setVisibility(View.VISIBLE);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.VISIBLE);
                }
                C.setText(" "+oranlistesi.get(k).getC_şıkkı_result()+" ");
                c.setText(" %"+oranlistesi.get(k).getC_şıkkı_yüzde()+" ");
                if (oranlistesi.get(k).getD_şıkkı_result().equals("")){
                    D.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);

                }else{
                    D.setVisibility(View.VISIBLE);
                    d.setVisibility(View.VISIBLE);
                }
                D.setText(" "+oranlistesi.get(k).getD_şıkkı_result()+" ");
                d.setText(" %"+oranlistesi.get(k).getD_şıkkı_yüzde()+" ");

            }

            if (k== 8) {
                next.setText("ANA SAYFAYA DÖN");

            }

        }
    }
}

