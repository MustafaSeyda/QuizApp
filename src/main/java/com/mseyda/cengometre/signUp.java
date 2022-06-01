package com.mseyda.cengometre;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;
import com.mseyda.cengometre.databinding.ActivitySignUpBinding;

import java.util.HashMap;

public class signUp extends AppCompatActivity {
    private ActivitySignUpBinding binding;
    private FirebaseAuth auth;
    user user=new user();
    String Email;
    String Password;
    EditText EmailRemember,Name,lastName,password,confirm;
    Button signup;
    HashMap<String,String> map;
    FirebaseFirestore mfirestore;
    FirebaseUser currentFirebaseUser;
    HashMap<String,String > mdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySignUpBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        auth= FirebaseAuth.getInstance();
        EmailRemember=findViewById(R.id.email);
        Name=findViewById(R.id.name);
        lastName=findViewById(R.id.lastName);
        password=findViewById(R.id.password);
        confirm=findViewById(R.id.confirm);
        signup=findViewById(R.id.signup);




    }
    public void signedUp(View view){

        mdata=new HashMap<>();
        mdata.put("test1","Henüz bu testi çözmediniz!");
        mdata.put("test2","Henüz bu testi çözmediniz!");
        mdata.put("test3","Henüz bu testi çözmediniz!");
        mdata.put("test4","Henüz bu testi çözmediniz!");
        mdata.put("test5","Henüz bu testi çözmediniz!");
        mdata.put("test6","Henüz bu testi çözmediniz!");
        mdata.put("test7","Henüz bu testi çözmediniz!");
        mdata.put("test8","Henüz bu testi çözmediniz!");
        mdata.put("test9","Henüz bu testi çözmediniz!");
        Email=binding.email.getText().toString();
        Password=binding.password.getText().toString();
        if(EmailRemember.getText().toString().equals("") ){
            Toast.makeText(this,"Enter Email!!",Toast.LENGTH_LONG).show();

        } else if(Name.getText().toString().equals("")){
            Toast.makeText(this,"Enter Your Name!!",Toast.LENGTH_LONG).show();

        } else if(lastName.getText().toString().equals("")){
            Toast.makeText(this,"Enter Your Last Name!!",Toast.LENGTH_LONG).show();

        } else if(password.getText().toString().equals("")){
            Toast.makeText(this,"Enter Your Password!!",Toast.LENGTH_LONG).show();

        } else if(!(password.getText().toString().equals(confirm.getText().toString()))){
            Toast.makeText(this,"Your Password Does Not Match!!",Toast.LENGTH_LONG).show();

        } else if(confirm.getText().toString().equals("")){
            Toast.makeText(this,"Confirm Your Password!!",Toast.LENGTH_LONG).show();

        }else{
            auth.createUserWithEmailAndPassword(Email,Password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    mfirestore= FirebaseFirestore.getInstance();
                    currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
                    Toast.makeText(signUp.this,"Signed Up Successfully",Toast.LENGTH_LONG).show();
                    map=new HashMap<>();
                    map.put("Name",Name.getText().toString());
                    map.put("LastName",lastName.getText().toString());
                    map.put("Email",currentFirebaseUser.getEmail());
                    mfirestore.collection("users").document(currentFirebaseUser.getUid())
                            .set(map, SetOptions.merge());


                    user.uploadResult2(mdata,currentFirebaseUser,signUp.this);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(signUp.this,e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }
            });

        }

    }
    }
