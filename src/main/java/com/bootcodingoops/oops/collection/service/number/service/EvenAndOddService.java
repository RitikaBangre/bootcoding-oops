package com.bootcodingoops.oops.collection.service.number.service;

import com.bootcodingoops.oops.collection.service.number.model.Number;

public class EvenAndOddService {
 public  void evenOdd(Number number) {
        if (number.getNumber()%2==0){
        number.setEven("Even");
        }
        else{
         number.setEven("Odd");
        }
 }
}
