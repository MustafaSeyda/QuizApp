package com.mseyda.cengometre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class hakkinda extends AppCompatActivity {
    EditText about,userguide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkinda);
        about=findViewById(R.id.about);
        about.setText("TEZ AMAÇLI HAZIRLANAN UYGULAMAMIZ ANDROİD STUDIO ADLI PROGRAMININ 4.1.2 SÜRÜMÜ KULLANILARAK HAZIRLANMIŞTIR. YAZILIM DİLİ OLARAK JAVA KULLANILMIŞTIR. VERİTABANI OLARAK FİREBASE VE SQLITE KULLANILMIŞTIR.");
        userguide=findViewById(R.id.userguide);
        userguide.setText("TESTLERİN ÇÖZÜMÜ ESNASINDA CEVABINDAN EMİN OLUNMAYAN SORULAR BOŞ BIRAKILABİLİR. TESTİN ÇÖZÜMÜ ESNASINDA CEVABI DEĞİŞTİRİLMEK İSTENEN SORULARA GERİ DÖNÜLÜP CEVAPLAR DEĞİŞTİRİLEBİLMEKTEDİR. TESTİN SONUCU TEST EKRANINDA GÖRÜLEBİLECEĞİ GİBİ TEST SONUCU ÖZETİ TEST SONUÇLARIM EKRANINDA DA MEVCUTTUR. TEST SONUÇLARIM EKRANINDA EN ALTTAKİ BUTONA TIKLAYARAK SONUÇLARINIZI SİSTEME YÜKLEYEREK GENEL KULLANICI YÜZDELERİ ARASINDA YERİNİZİ ALABİLİRSİNİZ.");
    }
}