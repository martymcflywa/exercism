class Hamming {

    String[] leftStrand;
    String[] rightStrand;

    Hamming(String leftStrand, String rightStrand) {

        if(leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        this.leftStrand = leftStrand.toLowerCase().split("");
        this.rightStrand = rightStrand.toLowerCase().split("");
    }

    int getHammingDistance() {
        // naive solution
        int distance = 0;
        for(int i = 0; i < leftStrand.length; i++) {
            if(!leftStrand[i].equals(rightStrand[i]))
                distance++;
        }
        return distance;
    }
}
