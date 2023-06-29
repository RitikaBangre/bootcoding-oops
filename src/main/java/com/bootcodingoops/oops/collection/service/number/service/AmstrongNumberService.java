package com.bootcodingoops.oops.collection.service.number.service;

import com.bootcodingoops.oops.collection.service.number.model.Number;

public class AmstrongNumberService {
    public Boolean Amstrong(Number number){

        int temp = number.getNumber();
        int digit=0;
        int last=0;
        int sum=0;
        temp = number.getNumber();
        while (temp>0){
            temp=temp/10;
            digit++;
        }
        temp = number.getNumber();
        while (temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
        if(number.getNumber() ==sum){
            return true;
        }else {
            return false;
        }
    }
    
}
