package com.mseyda.cengometre;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;

public class profil extends AppCompatActivity {
    private FirebaseAuth auth;
    FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser() ;

    TextView Email,name,lastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        name=findViewById(R.id.name);
        lastname=findViewById(R.id.lastName);
        FirebaseFirestore mfirestore;
        mfirestore= FirebaseFirestore.getInstance();

        DocumentReference docRef = mfirestore.collection("users").document(currentFirebaseUser.getUid());
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        HashMap<String, String> tempHashMap;
                        tempHashMap = (HashMap) document.getData();
                        name.setText(tempHashMap.get("Name"));
                        lastname.setText(tempHashMap.get("LastName"));
                    }
                }
            }
        });



        Email = findViewById(R.id.email);
        auth = FirebaseAuth.getInstance();
        Email.setText(auth.getCurrentUser().getEmail());
                    }

    public void testres(View view) {
        Intent intent = new Intent(profil.this, uploadResults.class);
        startActivity(intent);
    }

}
