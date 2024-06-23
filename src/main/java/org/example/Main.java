package org.example;

public class Main {
    public static void main(String[] args) {
        personel personel1= new kadin("Merve","Kara",1994);
        System.out.println(personel1.KalanYil());

        personel personel2 = new erkek("Ali","Çetin",1990);
        System.out.println(personel2.KalanYil());

        personel personel3 = new kadin("Özgül","Göknur",1987);
        System.out.println(personel3.KalanYil());

        Department department = new Department("HR", personel3);

        }
    }