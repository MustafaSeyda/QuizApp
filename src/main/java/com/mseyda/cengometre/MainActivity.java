package com.mseyda.cengometre;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.mseyda.cengometre.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private FirebaseAuth auth;
    String Email;
    String Password;
    EditText EmailRemember;
    EditText PasswordRemember;
    Button Login;
    CheckBox Remember;
    SharedPreferences emailSP;
    SharedPreferences passwordSP;
    String storedEmail;
    String storedPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        auth= FirebaseAuth.getInstance();
        FirebaseUser user=auth.getCurrentUser();
        emailSP=this.getSharedPreferences("com.mseyda.cengometre",Context.MODE_PRIVATE);
        passwordSP=this.getSharedPreferences("com.mseyda.cengometre",Context.MODE_PRIVATE);
        EmailRemember=findViewById(R.id.e_mailText);
        PasswordRemember=findViewById(R.id.passwordText);
        Login=findViewById(R.id.loginButton);
        Remember=findViewById(R.id.rememberCheckBox);
        storedEmail= emailSP.getString("storedEmail","");



        storedPassword= passwordSP.getString("storedPassword","");
        if (storedEmail=="" && storedPassword=="") {
            EmailRemember.setText("");
            PasswordRemember.setText("");
        } else{
            EmailRemember.setText(storedEmail);
            PasswordRemember.setText(storedPassword);
        }
        emailSP=this.getSharedPreferences("com.mseyda.cengometre",Context.MODE_PRIVATE);
        passwordSP=this.getSharedPreferences("com.mseyda.cengometre",Context.MODE_PRIVATE);
        if(user!=null){
            Intent intent=new Intent(MainActivity.this,MainMenu.class);
            startActivity(intent);
            finish();
        }



    }
    public void loginClicked(View view){
        if(Remember.isChecked() && !EmailRemember.getText().toString().matches("") && !PasswordRemember.getText().toString().matches("")){
            emailSP.edit().putString("storedEmail", EmailRemember.getText().toString()).apply();
            passwordSP.edit().putString("storedPassword", PasswordRemember.getText().toString()).apply();

        }
        Email=binding.eMailText.getText().toString();
        Password=binding.passwordText.getText().toString();
        if(Email.equals("") || Password.equals("")){
            Toast.makeText(this,"Enter email and password!!",Toast.LENGTH_LONG).show();

        }else{
            auth.signInWithEmailAndPassword(Email,Password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent=new Intent(MainActivity.this,MainMenu.class);
                    Intent intent2=new Intent(MainActivity.this,user.class);
                    intent2.putExtra("email",Email);
                    startActivity(intent);
                    finish();

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }
            });

        }


    }
    public void signUpClicked(View view){
        Intent intent=new Intent(MainActivity.this,signUp.class);
        startActivity(intent);
    }
        /*Email=binding.eMailText.getText().toString();
        Password=binding.passwordText.getText().toString();
        if(Email.equals("") || Password.equals("")){
            Toast.makeText(this,"Enter email and password!!",Toast.LENGTH_LONG).show();

        }else{
            auth.createUserWithEmailAndPassword(Email,Password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Toast.makeText(MainActivity.this,"Signed Up Successfully",Toast.LENGTH_SHORT).show();
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }
            });

        }

    }*/
}