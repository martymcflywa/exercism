class Twofer {
    String twofer(String name) {
        String sentence = "One for %s, one for me.";
        return String.format(sentence, (name == null ? "you" : name));
    }
}
