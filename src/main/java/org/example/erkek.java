package org.example;

public class erkek extends personel{
    public erkek (String Ad, String Soyad,int Dogumyili){
        super(Ad,Soyad,Dogumyili);
    }
    @Override
    public int KalanYil(){
        int EmekliligeKalanYil=65- yasHesapla(Dogumyili);
        return EmekliligeKalanYil;
    }
}
