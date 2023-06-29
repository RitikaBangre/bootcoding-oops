package com.bootcodingoops.oops.collection.service.number.service;

import com.bootcodingoops.oops.collection.service.number.model.Number;

import java.util.Random;

public class NumberService {
    // to get random number
   public Number getRandomNumber(){
        Random random = new Random();
        int n = random.nextInt(1000);
      Number number = new Number();
       number.setNumber(n);
        return number;
        }
    }

