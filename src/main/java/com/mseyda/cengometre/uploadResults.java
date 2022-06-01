package com.mseyda.cengometre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class uploadResults extends AppCompatActivity {
    user user=new user();
    FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser() ;
    Button button;
    SharedPreferences sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    TextView test1,test2,test3,test4,test5,test6,test7,test8,test9,test1result,test2result,test3result
            ,test4result,test5result,test6result,test7result,test8result,test9result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_results);
        FirebaseFirestore mfirestore;
        mfirestore= FirebaseFirestore.getInstance();
        sp1=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp2=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp3=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp4=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp5=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp6=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp7=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp8=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        sp9=this.getSharedPreferences("com.mseyda.cengometre", Context.MODE_PRIVATE);
        test1=findViewById(R.id.test1);
        test2=findViewById(R.id.test2);
        test3=findViewById(R.id.test3);
        test4=findViewById(R.id.test4);
        test5=findViewById(R.id.test5);
        test6=findViewById(R.id.test6);
        test7=findViewById(R.id.test7);
        test8=findViewById(R.id.test8);
        test9=findViewById(R.id.test9);
        test1result=findViewById(R.id.test1result);
        test2result=findViewById(R.id.test2result);
        test3result=findViewById(R.id.test3result);
        test4result=findViewById(R.id.test4result);
        test5result=findViewById(R.id.test5result);
        test6result=findViewById(R.id.test6result);
        test7result=findViewById(R.id.test7result);
        test8result=findViewById(R.id.test8result);
        test9result=findViewById(R.id.test9result);
        button=findViewById(R.id.button);
        showResults(test1result,sp1,"test1");
        showResults(test2result,sp2,"test2");
        showResults(test3result,sp3,"test3");
        showResults(test4result,sp4,"test4");
        showResults(test5result,sp5,"test5");
        showResults(test6result,sp6,"test6");
        showResults(test7result,sp7,"test7");
        showResults(test8result,sp8,"test8");
        showResults(test9result,sp9,"test9");
        /*DocumentReference docRef = mfirestore.collection("users").document(currentFirebaseUser.getUid());
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        HashMap<String, String> tempHashMap;
                        tempHashMap = (HashMap) document.getData();
                        test1result.setText(tempHashMap.get("test1"));
                        test2result.setText(tempHashMap.get("test2"));
                        test3result.setText(tempHashMap.get("test3"));
                        test4result.setText(tempHashMap.get("test4"));
                        test5result.setText(tempHashMap.get("test5"));
                        test6result.setText(tempHashMap.get("test6"));
                        test7result.setText(tempHashMap.get("test7"));
                        test8result.setText(tempHashMap.get("test8"));
                        test9result.setText(tempHashMap.get("test9"));
                    }
                }
            }
        });*/


    }

    public void uploadResult(View view){
        HashMap<String,String > mdata;
        mdata=new HashMap<>();
        mdata.put("test1",test1result.getText().toString());
        mdata.put("test2",test2result.getText().toString());
        mdata.put("test3",test3result.getText().toString());
        mdata.put("test4",test4result.getText().toString());
        mdata.put("test5",test5result.getText().toString());
        mdata.put("test6",test6result.getText().toString());
        mdata.put("test7",test7result.getText().toString());
        mdata.put("test8",test8result.getText().toString());
        mdata.put("test9",test9result.getText().toString());
        user.uploadResult(mdata,currentFirebaseUser,uploadResults.this);

    }
    public void showResults(TextView test,SharedPreferences result,String keyWord){
            test.setText(result.getString(keyWord,"Henüz bu testi çözmediniz!"));
        }
    }
