package org.example;

public class Main {
    public static void main(String[] args) {
        personel personel1= new kadin("Merve","Kara",1994);
        System.out.println(personel1.KalanYil());

        personel personel2 = new erkek("Ali","Çetin",1990);
        System.out.println(personel2.KalanYil());
        }
    }