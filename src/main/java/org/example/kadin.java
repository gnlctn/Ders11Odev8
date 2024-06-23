package org.example;

public class kadin extends personel {
    public kadin(String Ad, String Soyad,int Dogumyili){
        super(Ad,Soyad,Dogumyili);
    }
    @Override
    public int KalanYil(){
        int EmekliligeKalanYil=60- yasHesapla(Dogumyili);
        return EmekliligeKalanYil;
    }
}
