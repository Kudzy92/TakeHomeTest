package app.kudzy.service;

import java.io.IOException;

public interface HammingBitschecker {

    int bitsChecker(String encodedBits);
    boolean validateBits(String encodedBits);
    void message(String msg);
    String readInput(String msg) throws IOException;

    int getRedundentCode(int[] groupPosArrayOne);

}
