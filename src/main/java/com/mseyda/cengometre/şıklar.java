package com.mseyda.cengometre;

import java.util.ArrayList;


public class şıklar {
    public void sayaç_oluştur(ArrayList<Integer []> sayaç,int soru_sayısı,int şık_sayısı){
        Integer [] soru_say=new Integer[soru_sayısı];
        for(int i=0; i<şık_sayısı;i++){
            soru_say[i]=0;
        }
        for(int i=0; i<soru_sayısı+1;i++){
            sayaç.add(soru_say);
        }
    }
    public void şık_sayacı(ArrayList<Integer []> sayaç, String şık_ismi, int soru_sayısı, int kaçıncı_soru, int şık_sayısı){



        if(şık_ismi=="a"){
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.get(kaçıncı_soru)[0]=1;
        } else if (şık_ismi == "b") {
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.get(kaçıncı_soru)[1]=1;
        }else if (şık_ismi=="c"){
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.get(kaçıncı_soru)[2]=1;
        }else{
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.get(kaçıncı_soru)[3]=1;
        }



    }
    public void şık_sayacı(ArrayList<Integer []> sayaç, String şık_ismi,int kaçıncı_soru, int şık_sayısı){
        Integer [] şık1={1,0,0,0};
        Integer [] şık2={0,1,0,0};
        Integer [] şık3={0,0,1,0};
        Integer [] şık4={0,0,0,1};
        Integer [] pas={0,0,0,0};
        if(şık_ismi=="a"){
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.set(kaçıncı_soru,şık1);
        } else if (şık_ismi == "b") {
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.set(kaçıncı_soru,şık2);
        }else if (şık_ismi=="c"){
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.set(kaçıncı_soru,şık3);
        }else if (şık_ismi=="d"){
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.set(kaçıncı_soru,şık4);
        }else if (şık_ismi=="pas"){
            for(int i =0;i<şık_sayısı;i++){
                sayaç.get(kaçıncı_soru)[i]=0;
            }
            sayaç.set(kaçıncı_soru,pas);
        }



    }
    public int sonuç(ArrayList<Integer []> sayaç,int soru_sayısı,int şık_sayısı){
        int result=0;
        int index =0;
        int counter=0;
        Integer [] temp=sayaç.get(soru_sayısı);
        for(int i=0;i<soru_sayısı;i++){
            for(int j=0;j<şık_sayısı;j++){
                if(sayaç.get(i)[j]==1){
                    temp[j]++;
                    sayaç.set(soru_sayısı,temp);
                    break;

                }
            }
        }
        for(int i =0;i<şık_sayısı;i++){
            if(sayaç.get(soru_sayısı)[i]>result){
                result=sayaç.get(soru_sayısı)[i];
                index=i;

            }
        }
        for(int j =0;j<şık_sayısı;j++){
            if(sayaç.get(soru_sayısı)[j]==result) {
                counter++;
            }
        }
        if(counter>1){
            index=-2;
        }

        return index+1;
    }
}
