package app.kudzy.service;

import app.kudzy.model.BitsEncoder;
import app.kudzy.utils.HCConstants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HammingBitsCheckerImpl implements HammingBitschecker{

    private BitsEncoder bitsEncoder= new BitsEncoder();
    @Override
    public int bitsChecker(String setStr) {
        int returnCode=0;
        bitsEncoder.setEncodedBits(setStr);
        String [] enBitsArray= setStr.trim().split("");
        int index=0;
        String str="";
        for(String i : enBitsArray){
            index++;
            str+=i;
            if(index%4==0){
                str+="\n";
            }

        }
        System.out.println(str);
        System.out.println("CODE DEALs"+validateBits(setStr));
        if(validateBits(setStr)) {

            int code = getRedundentCode(HCConstants.GROUP_ONE) + getRedundentCode(HCConstants.GROUP_TWO)
                    + getRedundentCode(HCConstants.GROUP_THREE) + getRedundentCode(HCConstants.GROUP_FOUR);
             System.out.println("CODE"+code);
            if (code == 0) {
                returnCode=1;
            }
        }
        return returnCode;
    }

    @Override
    public boolean validateBits(String encodedBits) {
        boolean isValid=false;
        String [] inTextArray= encodedBits.trim().split("");

        if(encodedBits.length()==16) {
            for (String str : inTextArray) {
                if (str.matches("^[0-1]+$")) {
                    if(inTextArray[0].equalsIgnoreCase("0")){
                        isValid = true;
                    }else{
                        bitsEncoder.setMessage("Please mesage enter valid 16-bits thats start with a zerp");
                        message(bitsEncoder.getMessage());
                    }

                }else{
                    bitsEncoder.setMessage("Please mesage enter valid 16-bits code with 0 1s only");
                    message(bitsEncoder.getMessage());
                    //bitsChecker();
                }
            }
        }else{
            bitsEncoder.setMessage("Please mesage enter valid 16-bits code with 16-digits only");
            message(bitsEncoder.getMessage());
            //bitsChecker();
        }
        return isValid;
    }

    @Override
    public void message(String msg) {
        System.out.println("============================================");
        System.out.println(msg);
        System.out.println("============================================");
    }

    @Override
    public String readInput(String msg) throws IOException {
        System.out.println("============================================");
        System.out.println(msg);
        System.out.println("============================================");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inStr= reader.readLine();
        return inStr;
    }

    @Override
    public int getRedundentCode(int[] groupPosArrayOne) {
        int indexForGroupOne=0;
        int index=0;
        String [] enBitsArray= bitsEncoder.getEncodedBits().split("");
        for(int i : HCConstants.GROUP_ONE){
            if(enBitsArray[i].equalsIgnoreCase("1")){
                indexForGroupOne++;
            }

        }

        if(indexForGroupOne % 2 == 1){
          index=1;
        }
        return index;
    }
}
