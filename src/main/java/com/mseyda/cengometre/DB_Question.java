package com.mseyda.cengometre;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_Question extends SQLiteOpenHelper {
    public DB_Question (Context c){
        super(c,"Sorular",null,1);

    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS test1(soru VARCHAR,a VARCHAR,b VARCHAR,c VARCHAR,d VARCHAR)");
        db.execSQL("CREATE TABLE IF NOT EXISTS test2(soru VARCHAR,a VARCHAR,b VARCHAR,c VARCHAR,d VARCHAR)");
        db.execSQL("CREATE TABLE IF NOT EXISTS test3(soru VARCHAR,a VARCHAR,b VARCHAR,c VARCHAR)");
        db.execSQL("CREATE TABLE IF NOT EXISTS test4(soru VARCHAR,a VARCHAR,b VARCHAR)");
        db.execSQL("CREATE TABLE IF NOT EXISTS test5(soru VARCHAR,a VARCHAR,b VARCHAR,c VARCHAR)");
        db.execSQL("CREATE TABLE IF NOT EXISTS test6(soru VARCHAR,a VARCHAR,b VARCHAR)");
        db.execSQL("CREATE TABLE IF NOT EXISTS test7(soru VARCHAR,a VARCHAR,b VARCHAR,c VARCHAR)");
        db.execSQL("CREATE TABLE IF NOT EXISTS test8(soru VARCHAR,a VARCHAR,b VARCHAR)");
        db.execSQL("CREATE TABLE IF NOT EXISTS test9(soru VARCHAR,a VARCHAR,b VARCHAR)");

        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Kreatif biri misin?','Kesinlikle.','Sayılır.','Pek Sayılmaz.','Söylenemez.')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Hangisini tercih edersin?','Birşeylerin icadını yapmayı.','Birşeylerden analiz yapayı.','Bir Şeyleri tamir etmeyi.','Bir sistemin açıklarını bulmayı.')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Hangisi ilgini çeker?','Coding.','Veri kontrol ve analiz.','İki cihazı birbirine bağlayıp çalıştırmak.','Bir sistemi hacklemeyi.')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Zamanını nasıl geçirmekten hoşlanırsın?','Öğrenmek.','Okumak.','Tasarlamak.','Araştırmak.')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Ne tarz bir yerde çalışmak istersin?','Büyük ofis.','Ev.','Fabrika.','Kapılı kapılar ardında.')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('En güçlü yanın nedir?','Coding-Matematik','Analiz','Multitasking','Keşfetmek')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Kod yazmayı sever misin(1-4 arası)?','4','3','2','1')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Değişimi ne kadar seversin(1-4 arası)?','4','3','2','1')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Hangi terim senin ilgini daha çok çekiyor?','Travelling Sales Man','Data Mining','Logic Gates','Man in the Middle')");
        db.execSQL("INSERT INTO test1 (soru,a,b,c,d) VALUES('Hangisinde daha çok bilgi sahibi olmak isterdin?','Programlama Dilleri. ','Veriyi bilgiye çevirmek.','eni network cihazları.','Güvenli bilgi akışı')");

        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Hangi amaçla PL öğrenmek istiyorsunuz?','Hobby.','İş imkanı.','Hayalimdeki proje.','Gelir.')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Herhangi bir PL biliyor musunuz?','0','1','2-3','3+')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Hangi Platforma ilgi duyuyorsunuz?','Veri Bilimi.','Web.','Oyun.','Mobil')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Bir dilde aradığınız en büyük özellik nedir?','Esneklik.','Sadelik.','Çok Yönlülük.','Hız.')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Ne tarz bir uygulama geliştirmek istiyorsunuz?','Veri Analizi.','Web sitesi.','Oyun.','Mobil uygulama.')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Haftada kaç saatinizi PL öğrenmek için ayırabilirsiniz?','0-2','2-4','4-8','8+')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Marketten bir şey alırken ambalajı benim için birinci önceliktir.','Evet.','Hayır.','Bazen.','Çoğunlukla.')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Bir gün Yapay Zeka’nın yerini alacak olması sizi korkurtur mu?','Beraber çalışırız.','Evet.','Bazen.','Hayır.')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Görsel tasarımı yapmak hoşuma gider(1-4)?','1','3','4','2')");
        db.execSQL("INSERT INTO test2 (soru,a,b,c,d) VALUES('Video Oyun oynar mısınız?','Hayır. ','Vaktim varsa.','Bayılırım.','Birkaç oynadığım oyun var')");

        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('İnsanlarla yüz yüze etkileşimi tercih ederim.','Evet.','Hayır.','Bazen.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('Öz Disiplini olan bir insanımdır.','Hayır.','Evet.','Günüme Bağlı.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('İşe giderken geçirilen zaman çöpe atılan zamandır.','Hayır.','Evet.','Yolda geçirdiğin zamana bağlı.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('Öğlen yemeğiyle iş arkadaşlarıyla çıkmak bana keyif verir.','Evet.','Hayır.','Moduma bağlı.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('Sosyal bir insanım.','Evet.','Hayır.','İstediğim Zaman.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('Giyinmeyi kuşanmayı severim.','Evet.','Hayır.','Her gün her gün sıkar.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('Ekip ruhu benim için önemlidir.','Evet.','Hayır.','Ara sıra görüşsek fena olmaz.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('Bazen bir deniz kenarında, bazen de evde çalışmayı tercih ederim.','Hayır.','Evet.','Arada işyerine de uğramak lazım.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('İletişim, başarıda bir anahtardır.','Evet.','Hayır.','Bazen.')");
        db.execSQL("INSERT INTO test3 (soru,a,b,c) VALUES('Evde çalışmak dikkatimi dağıtır.','Evet. ','Hayır.','Bazen pijamayla çalışmak da iyidir.')");

        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('Kendi işimin patronu olmak tam benlik.','Evet,Neyi ne zaman yapacağıma ben karar veririm.','Biri bana ne yapmam gerektiğini söylesin.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('Öz Disiplini olan bir insanımdır.','Hayır.','Evet.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('İşe giderken geçirilen zaman çöpe atılan zamandır.','Hayır.','Evet.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('Öğlen yemeğiyle iş arkadaşlarıyla çıkmak bana keyif verir.','Evet.','Hayır.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('Sosyal bir insanım.','Evet.','Hayır.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('Giyinmeyi kuşanmayı severim.','Evet.','Hayır.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('Ekip ruhu benim için önemlidir.','Evet.','Hayır.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('Bazen bir deniz kenarında, bazen de evde çalışmayı tercih ederim.','Hayır.','Evet.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('İletişim, başarıda bir anahtardır.','Evet.','Hayır.')");
        db.execSQL("INSERT INTO test4 (soru,a,b) VALUES('Evde çalışmak dikkatimi dağıtır.','Evet. ','Hayır.')");

        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Dış görünüş işlevsellikten daha önemlidir.','Ürünü şekli satar.','İçi boşsa ne yapayım dış görünüşü.','İçi de dışı da önemlidir.')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Renklerle aram iyidir.','Süperdir.','Çok kötü.','İdare eder.')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Tasarım süreci beni heyecanlandırır.','Kesinlikle.','İşim olmaz.','Bayılmasamda yapıyorum.')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Bir ürünün arka planı benim için merak uyandırmıyor.','İşini yapsın da nasıl yaparsa yapsın.','Tabiki de tüm olay arka plan.','Ürün bir bütündür arka planda önemli.')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Eğer tasarım yada mantıksallık arasında kalırsan hangisini seçersin?','Tasarım.','Mantıksallık.','Karar veremiyorum!!')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Olaylar arasında mantık ilişkisi kurmak benim için çocuk oyuncağıdır.','Olan olmuştur düşünmeye gerek yok.','Mantık benim işim.','O kadar kolay olmasa da yapıyoruz bir şeyler.')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Marketten bir şey alırken ambalajı benim için birinci önceliktir.','Kesinlikle.','İçindekileri okumadan hiçbir şey almam.','Fiyat performans ürünü olmalı.')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('İlkokulda bir sürü renkli kalemim vardı.','Hemde her renkten.','Kurşun kalem neyime yetmiyordu.','Hem renkli hem kurşun kalemim vardı.')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Yediğim yemeğin sunumu da güzel olmalı.','Sunum her şeydir.','Tadı güzel olsun yeter.','Hem göze hem mideye.')");
        db.execSQL("INSERT INTO test5 (soru,a,b,c) VALUES('Kıyafetlerimi özenle seçerim şıklık çok önemli.','En güzel ben olmalıyım. ','Podyuma çıkmıyoruz ya.','Ortamına göre uygun giyinmek en iyisi.')");

        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Ben çalıştığım nesneyi tutucam, görücem arkadaş!','Aynen öyle.','Soyutluk iyidir.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Hangi programlama dilini tercih edersin?','Assembly.','Java.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Bilgisayarı almaktansa toplamayı tercih ederim.','Evet.','Hayır.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Mikroişlemciler mi Nesne Tabanlı Programlama mı?','Mikroişlemciler.','Nesne Tabanlı Programlama.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('İntel’de mi Google’da mı çalışmak istersin?','İntel.','Google.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Donanım olmasa yazılım da olmazdı.','Son derece haklısın!','Bunlar etle tırnak gibi, ayıramayız.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Elektrik derslerinden hiçbir zaman elektrik alamadım.','Verirsek 50W, o zaman bir daha düşünürsün!','Maalesef doğru.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Fizik 1 mi Fizik 2 mi?','Fizik 2.','Fizik 1.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Dokunmak mı Hissetmek mi?','Dokunmak.','Hissetmek.')");
        db.execSQL("INSERT INTO test6 (soru,a,b) VALUES('Para mı Huzur mu?','Para huzuru satın alır. ','Huzurum yoksa ne yapayım parayı pulu.')");

        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('TERCİH EDECEĞİN HANGİSİ OLURDU ?','YAZILIM VE MATEMATİK AĞIRLIKLI DERSLER DONANIM DA VAR.','DONANIM VE ELEKTRİK AĞIRLIKLI DERSLER AZICIK YAZILIM.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('ERTESİ GÜN YENİ ŞEYLER, SÜREKLİ ÖĞRENME, TASARLAMA VE GELİŞTİRME İLE DOLU BİR HAYAT OLSUN İSTİYOR MUSUN ?','ELBETTE TAM DA İSTEDİĞİM ŞEY.','BEN O KADAR HIZA AYAK UYDURAMAM DAHA DÜN ÖĞRENDİK SAKİN.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('ÇIKTI NASIL OLMALI ?','SOMUT OLMASA DA OLUR.','KESİNLİKLE SOMUT BİR ÜRÜN İSTERİM.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('DÜŞÜNCE YAPIN NASIL ?','MATEMATİKÇİ KAFASI BENİMKİSİ MANTIKSAL YAKLAŞIRIM.','BİR FİZİKÇİ GİBİ DÜŞÜNÜP DEVRELERİ YAKARIM GENELDE.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('HANGİSİ DAHA ÇOK İLGİ ÇEKİCİ ?','BİR İŞLEMCİ İLE YAPILABİLECEKLER.','İŞLEMCİNİN İÇ MİMARİSİ.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('ÇALIŞMA ALANI FİZİKSEL BİR SAHA OLMALI MI ?','HAYIR EVİMDE YA DA OFİSTE OLAYIM.','AKTİF BİR ÇALIŞMA SAHASI İSTERİM DURAMAM YERİ GELECEK HİSSEDİCEM.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('HANGİSİNİ GERÇEKLEŞTİRİRKEN SIKILMAZSIN ?','BİR MOBİL,MASAÜSTÜ VEYA WEB UYGULAMA GELİŞTİRMEK.','RADAR,NAVİGASYON VEYA OTOMOBİL İÇİN ELEKTRİKLİ EKİPMANLAR GELİŞTİRMEK VE ELEKTRİK SİSTEMİ TASARLAMAK.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('ANALİTİK DÜŞÜNME GÜCÜN KUVVETLİ Mİ ?','FAZLASIYLA.','OLABİLİR.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('İletişim, başarıda bir anahtardır.','Evet.','Hayır.')");
        db.execSQL("INSERT INTO test7 (soru,a,b) VALUES('Evde çalışmak dikkatimi dağıtır.','Evet. ','Hayır.')");

        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('LİSANS EĞİTİMİ SÜRESİNCE BİLGİSAYAR BİLİMLERİNDEN EN AZ BİRİNDE UZMAN OLABİLECEK SEVİYEYE ERİŞEBİLDİN Mİ VEYA ERİŞEBİLECEK MİSİN?','KARARSIZIM TEKNİĞİM İYİ AMA GELİŞTİRMEM GEREK.','TABİ,ELİMDEN BİR UÇAN BİR DE KAÇAN KURTULUR.')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('KAÇ STAJ YAPTIN ?','İKİYİ GEÇMEZ YOĞUNUM VAKİT Mİ VAR!','SAY SAY BİTMEZ İKİ NE Kİ')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('ÖĞRETMEYE Mİ YATKINSIN SÜREKLİ YENİ ŞEYLER ÖĞRENMEYE Mİ ?','ÖĞRETMEK İÇİN YARATILMIŞIM.','ŞEYTANIN YATTIĞI YERİ BİLE BİLİRİM.')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('PRATİK DÜŞÜNEBİLEN VE HIZLI GELİŞTİRME YAPMAYI SEVEN BİRİ MİSİN ?','ZAMAN VARSA DAHA DÜŞÜNÜRÜZ YA.','YAVAŞ OLANA GEÇMİŞ OLSUN BEN HEP HIZLIYDIM.')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('ÜRÜN VE İLETİŞİM ODAKLI MISIN ?','BİLGİSAYARIMA AŞIK BİRİYİM GENELDE ONUNLA KONUŞURUM.','İNSANLARLA İLETİŞİMİM OLDUKÇA İYİDİR.')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('YÜKSEK LİSANS VE DOKTORA YAPMAK ÖNEMLİ MİDİR ?','.OLMAZSA OLMAZIM.','OLMASA DA OLUR.')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('ARAŞTIRMAYI VE İLGİNİ ÇEKEN KONULARIN ÖZÜNÜ ANLAMAYA YÖNELİK ÇALIŞMAYI SEVİYOR MUSUN?','BUNUN İÇİN ZAMANIMI HUNHARCA HARCAYABİLİRİM .','BEN SONUCA BAKARIM ORTAYA ÇIKAN ŞEY BANA AİT OLMALI.')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('ELEŞTİREL BİR YAKLAŞIM SERGİLEYEBİLİR MİSİN ? FARKLI DÜŞÜNSEL YAKLAŞIMLARA AÇIK MISIN?','BU TAMDA BEN.','DURUMA GÖRE BAKILIR.')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('UZMANLAŞTIĞIN ALANDAKİ AKADEMİK GELİŞMELERİ TAKİP ETMEK İLGİNİ ÇEKİYOR MU ?','MESLEKTAŞLARIMIN BU KONUDAKİ ÇALIŞMALARINI TAKİP ETMEZSEM OLMAZ.','BİR PROJENİN GELİŞTİRME SÜRECİNDE KATKIMIN OLMASI DAHA TATMİN EDİCİ.')");
        db.execSQL("INSERT INTO test8 (soru,a,b) VALUES('AKADEMİSYEN OLMAK SABIR VE ÇABA İSTER BUNA HAZIR MISIN ?','İPLE ÇEKİYORUM. ','BANA MÜSADE O ZAMAN.')");

        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('KALABALIK ORTAMLAR BENİ RAHATSIZ ETMEZ.','HAYIR EDER.','HİÇ RAHATSIZ OLMAM.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('NE KADAR AZ İNSAN O KADAR AZ SORUN.','KESİNLİKLE KATILIYORUM.','SORUN ÇÖZÜLÜR İNSAN OLSUN YETER.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('YÜKSELEBİLECEĞİM BİR ŞİRKETTE ÇALIŞMAK İSTERİM.','İŞİM SABİT OLSUN AKSİYONA GEREK YOK.','EN ÜST MEVKİYE GELENE KADAR DURMAK YOK.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('KÜÇÜK TATLI BİR BUNGALOVDA MI TATİL YAPMAK İSTERSİN YOKSA DEV BİR VİLLA DA MI?','TATLI BİR BUNGALOV KULAĞA HOŞ GELİYOR.','VİLLANIN ODALARI İÇİNDE KAYBOLMAK İSTİYORUM.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('İMKANSIZLIKLAR SENİ YILDIRIR MI?','BİR ŞEKİLDE OLDURURUZ.','GENİŞ İMKAN DEMEK RAHATLIK DEMEK.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('İNSAN İLİŞKİLERİNDE SAMİMİYETİ Mİ TERCİH EDERSİN YOKSA RESMİYETİ Mİ?','SAMİMİYET CANDIR.','CANIM CİCİME GEREK YOK BEY/HANIM YETERLİ.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('İŞYERİNİN GELİŞİMİNE GÖZLE GÖRÜLÜR KATKIDA BULUNMAK SENİ MUTLU EDER Mİ?','ASIL AMAÇ BU ZATEN.','BABAMIN ŞİRKETİ Mİ CANIM BANA NE.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('YERİ GELDİĞİNDE İŞ YETİŞMESİ İÇİN KİŞİSEL ZAMANINDAN FEDAKARLIK YAPAR MISIN?','BENİ İLGİLENDİRMEZ.','FİRMAM MÜŞTERİ KARŞISINDA MAHÇUP OLMAMALI.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('OFİSİN EN KALİTELİ EN TEKNOLOJİK DONANIMA MI SAHİP OLSUN İSTERSİN YOKSA ORTA HALLİ BİR ŞEKİLDE İDARE EDEBİLİR MİSİN?','EN KALİTELİSİ OLACAK Kİ EN İYİ ŞEKİLDE ÇALIŞAYIM.','ELDEKİ İMKANLAR NEYSE O YETER.')");
        db.execSQL("INSERT INTO test9 (soru,a,b) VALUES('HİSSE ORANI OLARAK ÜCRET ALMAYI KABUL EDER MİSİN?','NAKİT DIŞINDA ÇALIŞMAM. ','YATIRIM AMAÇLI OLARAK KABUL EDEBİLİRİM.')");


    }
    public void onUpgrade(SQLiteDatabase db,int eski,int yeni){
        db.execSQL("DROP TABLE IF EXISTS test1");
        db.execSQL("DROP TABLE IF EXISTS test2");
        db.execSQL("DROP TABLE IF EXISTS test3");
        db.execSQL("DROP TABLE IF EXISTS test4");
        db.execSQL("DROP TABLE IF EXISTS test5");
        db.execSQL("DROP TABLE IF EXISTS test6");
        db.execSQL("DROP TABLE IF EXISTS test7");
        db.execSQL("DROP TABLE IF EXISTS test8");
        db.execSQL("DROP TABLE IF EXISTS test9");
        onCreate(db);

    }

}
