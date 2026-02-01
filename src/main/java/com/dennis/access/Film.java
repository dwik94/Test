package com.dennis.access;

public class Film {
    private String titel;
    private int year;
    private boolean childApproved;

    Film() {
    }

    public Film(String titel, int year, boolean childApproved){
        this.titel = titel;
        this.year = year;
        this.childApproved = childApproved;
    }

    public String getTitel(){
        return this.titel;
    }

    public Film setTitel(String titel){
        this.titel = titel;
        return this;
    }

    public int getYear(){
        return this.year;
    }

    public Film setYear(int year){
        this.year = year;
        return this;
    }



}


