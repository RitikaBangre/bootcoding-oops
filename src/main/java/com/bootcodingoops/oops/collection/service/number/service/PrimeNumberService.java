package com.bootcodingoops.oops.collection.service.number.service;

import com.bootcodingoops.oops.collection.service.number.model.Number;

public class PrimeNumberService {
    public void PrimeNumber(Number number) {
        for (int i = 2; i < number.getNumber() / 2; i++) {
            if (number.getNumber() % i == 0) {
                number.setPrimeNumber("Not Prime Number");
                return;
            }
        }
        number.setPrimeNumber("Prime Number");
    }
}