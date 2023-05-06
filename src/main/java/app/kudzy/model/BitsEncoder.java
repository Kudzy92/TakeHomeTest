package app.kudzy.model;

public class BitsEncoder {
    private String encodedBits;
    private int corruptedBitPosition;
    private String message;

    public BitsEncoder() {
    }

    public BitsEncoder(String encodedBits, int corruptedBitPosition, String message) {
        this.encodedBits = encodedBits;
        this.corruptedBitPosition = corruptedBitPosition;
        this.message = message;
    }

    public String getEncodedBits() {
        return encodedBits;
    }

    public void setEncodedBits(String encodedBits) {
        this.encodedBits = encodedBits;
    }

    public int getCorruptedBitPosition() {
        return corruptedBitPosition;
    }

    public void setCorruptedBitPosition(int corruptedBitPosition) {
        this.corruptedBitPosition = corruptedBitPosition;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
