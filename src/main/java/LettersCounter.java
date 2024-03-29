public class LettersCounter {
    private char character;
    private String text;

    public LettersCounter(char character, String text) {
        this.character = character;
        this.text = text;
    }

    public int countLetters() {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count += 1;
            }
        }
        System.out.println("Character " + character + " appears " + count + " times.");
    }
}

