package org.example;

public class Hlavni {
    public static void main(String[] args) {
       Zlomek z1 = new Zlomek();
       z1.setCitatel(1);
       z1.setJmenovatel(2);
       long c = z1.getCitatel();
       long j = z1.getJmenovatel();
       System.out.println(c + "/" + j);
    }
}
