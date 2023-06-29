package com.bootcodingoops.oops.collection.service.number.service;

import com.bootcodingoops.oops.collection.service.number.model.Number;

public class PalindromService {
    public void palindrom(Number number){
        int org = number.getNumber();
        int rem=0;
        while(org !=0){
            rem = rem*10 + org%10;
            org = org/10;
        }
        if(rem== number.getNumber()){
            number.setPalindrom("Palindrom");
        }else{
            number.setPalindrom("Not Palindrom");
        }
}
}
