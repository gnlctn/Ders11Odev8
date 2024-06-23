package org.example;

abstract class personel {
    private String Ad;
    private String Soyad;
    protected int Dogumyili;

    public personel(String Ad, String Soyad, int Dogumyili){
        this.Ad=Ad;
        this.Soyad=Soyad;
        this.Dogumyili=Dogumyili;

    }

    public abstract int KalanYil();
    public int yasHesapla(int Dogumyili) {
        int GuncelYil = 2024;
        int kalan = GuncelYil - Dogumyili;
        return kalan;
    }


}
