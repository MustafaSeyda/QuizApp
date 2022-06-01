package com.mseyda.cengometre;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.HashMap;

public class user {


    public HashMap<String,String > mdata;
    String name;
    String lastName;
    String e_mail;
    String password;
    String result;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public user(HashMap<String, String> mdata, String name, String lastName, String e_mail, String password, String result) {
        this.mdata = mdata;
        this.name = name;
        this.lastName = lastName;
        this.e_mail = e_mail;
        this.password = password;
        this.result = result;
    }

    public user() {
    }
    public user(String e_mail, String password, String result) {
        this.e_mail = e_mail;
        this.password = password;
        this.result = result;
    }

    


    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }




    public void uploadResult(HashMap<String,String> result,FirebaseUser id, Activity test){
        FirebaseFirestore mfirestore;
        mfirestore= FirebaseFirestore.getInstance();
        mfirestore.collection("users").document(id.getUid())
                .set(result, SetOptions.merge())
                .addOnCompleteListener(test, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                            Toast.makeText(test,"TEST SONUÇLARI BAŞARIYLA YÜKLENDİ.",Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(test,task.getException().getMessage(),Toast.LENGTH_LONG).show();

                    }
                });
    }
    public void uploadResult2(HashMap<String,String> result,FirebaseUser id, Activity test){
        FirebaseFirestore mfirestore;
        mfirestore= FirebaseFirestore.getInstance();
        mfirestore.collection("users").document(id.getUid())
                .set(result, SetOptions.merge())
                .addOnCompleteListener(test, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                            System.out.println("");
                        else
                            Toast.makeText(test,task.getException().getMessage(),Toast.LENGTH_LONG).show();

                    }
                });
    }

    }

