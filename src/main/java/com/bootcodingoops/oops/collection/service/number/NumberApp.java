package com.bootcodingoops.oops.collection.service.number;

import com.bootcodingoops.oops.collection.service.number.model.Number;
import com.bootcodingoops.oops.collection.service.number.service.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class NumberApp {
    public static void main(String[] args) throws IOException {

           NumberService ns = new NumberService();
            EvenAndOddService eos = new EvenAndOddService();
            PalindromService ps = new PalindromService();
            PrimeNumberService pns = new PrimeNumberService();
            AmstrongNumberService ams = new AmstrongNumberService();
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\bootcoding\\Numbers.csv"));

            ArrayList<Number> numbers = new ArrayList<>();
            for(int i=0;i<1000;i++){
                Number randomNumber = ns.getRandomNumber();
                eos.evenOdd(randomNumber);
                ps.palindrom(randomNumber);
                pns.PrimeNumber(randomNumber);
                ams.Amstrong(randomNumber);
                numbers.add(randomNumber);

            }
            for(Number number : numbers){
                writer.write (number.toString());
                 writer.write ("\n");
            }
            writer.flush();
            writer.close();
        }
    }

