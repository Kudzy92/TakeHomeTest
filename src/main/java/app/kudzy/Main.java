package app.kudzy;

import app.kudzy.model.BitsEncoder;
import app.kudzy.service.HammingBitsCheckerImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BitsEncoder bitsEncoder= new BitsEncoder();
        HammingBitsCheckerImpl hbc=new HammingBitsCheckerImpl();
        bitsEncoder.setEncodedBits(hbc.readInput("Enter 16-bits to be checked. Press Enter key"));
        if(hbc.bitsChecker(bitsEncoder.getEncodedBits())==0){
            hbc.message("Your entered 16-bits code has a corrupted bit at position ");
        }else if(hbc.bitsChecker(bitsEncoder.getEncodedBits())==1){
            hbc.message("Your entered 16-bits code has no corrupted bits");
        }

    }
}