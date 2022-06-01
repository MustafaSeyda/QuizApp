package com.mseyda.cengometre;

public class Sorular {
    String soru_metni;
    String a_sıkkı;
    String b_sıkkı;
    String c_sıkkı;
    String d_sıkkı;

    public Sorular(String soru_metni, String a_sıkkı, String b_sıkkı, String c_sıkkı, String d_sıkkı) {
        this.soru_metni = soru_metni;
        this.a_sıkkı = a_sıkkı;
        this.b_sıkkı = b_sıkkı;
        this.c_sıkkı = c_sıkkı;
        this.d_sıkkı = d_sıkkı;
    }


    public Sorular(String soru_metni, String a_sıkkı, String b_sıkkı) {
        this.soru_metni = soru_metni;
        this.a_sıkkı = a_sıkkı;
        this.b_sıkkı = b_sıkkı;
    }


    public Sorular(String soru_metni, String a_sıkkı, String b_sıkkı, String c_sıkkı) {
        this.soru_metni = soru_metni;
        this.a_sıkkı = a_sıkkı;
        this.b_sıkkı = b_sıkkı;
        this.c_sıkkı = c_sıkkı;

    }
    public String getSoru_metni() {
        return soru_metni;
    }

    public String getA_sıkkı() {
        return a_sıkkı;
    }

    public String getB_sıkkı() {
        return b_sıkkı;
    }

    public String getC_sıkkı() {
        return c_sıkkı;
    }

    public String getD_sıkkı() {
        return d_sıkkı;
    }

    public void setSoru_metni(String soru_metni) {
        this.soru_metni = soru_metni;
    }

    public void setA_sıkkı(String a_sıkkı) {
        this.a_sıkkı = a_sıkkı;
    }

    public void setB_sıkkı(String b_sıkkı) {
        this.b_sıkkı = b_sıkkı;
    }

    public void setC_sıkkı(String c_sıkkı) {
        this.c_sıkkı = c_sıkkı;
    }
    public void setD_sıkkı(String d_sıkkı) {
        this.d_sıkkı = d_sıkkı;
    }

}
