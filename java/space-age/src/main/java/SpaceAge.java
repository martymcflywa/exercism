class SpaceAge {

    double seconds;
    final double earthYearSeconds = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / earthYearSeconds;
    }

    double onMercury() {
        double mercuryPc = 0.2408467;
        return seconds / (earthYearSeconds * mercuryPc);
    }

    double onVenus() {
        double venusPc = 0.61519726;
        return seconds / (earthYearSeconds * venusPc);
    }

    double onMars() {
        double marsPc = 1.8808158;
        return seconds / (earthYearSeconds * marsPc);
    }

    double onJupiter() {
        double jupiterPc = 11.862615;
        return seconds / (earthYearSeconds * jupiterPc);
    }

    double onSaturn() {
        double saturnPc = 29.447498;
        return seconds / (earthYearSeconds * saturnPc);
    }

    double onUranus() {
        double uranusPc = 84.016846;
        return seconds / (earthYearSeconds * uranusPc);
    }

    double onNeptune() {
        double neptunePc = 164.79132;
        return seconds / (earthYearSeconds * neptunePc);
    }

}
