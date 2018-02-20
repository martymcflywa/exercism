class Hamming {

    char[] leftStrand;
    char[] rightStrand;

    Hamming(String leftStrand, String rightStrand) {

        if(leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        this.leftStrand = leftStrand.toLowerCase().toCharArray();
        this.rightStrand = rightStrand.toLowerCase().toCharArray();
    }

    int getHammingDistance() {
        // switch to char
        int distance = 0;
        for(int i = 0; i < leftStrand.length; i++) {
            if(leftStrand[i] != rightStrand[i])
                distance++;
        }

        return distance;
    }
}
