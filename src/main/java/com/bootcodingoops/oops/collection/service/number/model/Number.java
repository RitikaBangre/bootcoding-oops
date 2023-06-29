package com.bootcodingoops.oops.collection.service.number.model;

public class Number {
    private int number;
    private String Even;
    private String Palindrom;
    private String Amstrong;
    private String PrimeNumber;
    public String toString(){
        return number +", " + Palindrom +","+ Amstrong +", "+ PrimeNumber+ "," + Even;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEven() {
        return Even;
    }

    public void setEven(String even) {
        Even = even;
    }

    public String getPalindrom() {
        return Palindrom;
    }

    public void setPalindrom(String palindrom) {
        Palindrom = palindrom;
    }

    public String getAmstrong() {
        return Amstrong;
    }

    public void setAmstrong(String amstrong) {
        Amstrong = amstrong;
    }

    public String getPrimeNumber() {
        return PrimeNumber;
    }

    public void setPrimeNumber(String primeNumber) {
        PrimeNumber = primeNumber;
    }
}
