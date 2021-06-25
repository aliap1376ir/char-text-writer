package ir.aliap1376ir.lib;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Data
public class TextWriter {
    private String text;
    private char delimiter;

    @Getter(value = AccessLevel.PRIVATE)
    @Setter(value = AccessLevel.PRIVATE)
    private HashMap<Character, String[]> alphabet;

    public TextWriter() {
        this.text = "Hello World";
        this.delimiter = '.';
        load();
    }

    public TextWriter(String text) {
        this.text = text;
        this.delimiter = '.';
        load();
    }

    public TextWriter(String text, char delimiter) {
        this.text = text;
        this.delimiter = delimiter;
        load();
    }

    private void load() {
        alphabet = new HashMap<>();
        alphabet.put('A', new String[]{
                        "   .   ",
                        "  . .  ",
                        " ..... ",
                        " .   . ",
                        ".     ."
                }
        );
        alphabet.put('B', new String[]{
                        ".....  ",
                        ".    . ",
                        "....   ",
                        ".    . ",
                        ".....  "
                }
        );
        alphabet.put('C', new String[]{
                        "  .....",
                        " .     ",
                        ".      ",
                        " .     ",
                        "  .....",
                }
        );
        alphabet.put('D', new String[]{
                        ".....  ",
                        ".    . ",
                        ".     .",
                        ".    . ",
                        ".....  ",
                }
        );
        alphabet.put('E', new String[]{
                        ".......",
                        ".      ",
                        ".......",
                        ".      ",
                        ".......",
                }
        );
        alphabet.put('F', new String[]{
                        ".......",
                        ".      ",
                        ".......",
                        ".      ",
                        ".      ",
                }
        );
        alphabet.put('G', new String[]{
                        " ..... ",
                        ".      ",
                        ".  ... ",
                        ".     .",
                        " ..... ",
                }
        );
        alphabet.put('H', new String[]{
                        ".     .",
                        ".     .",
                        ".......",
                        ".     .",
                        ".     .",
                }
        );
        alphabet.put('I', new String[]{
                        " ..... ",
                        "   .   ",
                        "   .   ",
                        "   .   ",
                        " ..... ",
                }
        );
        alphabet.put('J', new String[]{
                        "    ...",
                        "      .",
                        ".     .",
                        " .    .",
                        "   ... ",
                }
        );
        alphabet.put('K', new String[]{
                        ".     .",
                        ".    . ",
                        ".....  ",
                        ".    . ",
                        ".     .",
                }
        );
        alphabet.put('L', new String[]{
                        ".      ",
                        ".      ",
                        ".      ",
                        ".      ",
                        ".......",
                }
        );
        alphabet.put('M', new String[]{
                        ".     .",
                        "..   ..",
                        ". . . .",
                        ".  .  .",
                        ".     .",
                }
        );
        alphabet.put('N', new String[]{
                        ".     .",
                        "..    .",
                        ". .   .",
                        ".  .  .",
                        ".     .",
                }
        );
        alphabet.put('O', new String[]{
                        "  ...  ",
                        " .   . ",
                        ".     .",
                        " .   . ",
                        "  ...  ",
                }
        );
        alphabet.put('P', new String[]{
                        ".....  ",
                        ".    . ",
                        "....   ",
                        ".      ",
                        ".      ",
                }
        );
        alphabet.put('Q', new String[]{
                        "  ...  ",
                        " .   . ",
                        ".   . .",
                        " .   . ",
                        "  ... .",
                }
        );
        alphabet.put('R', new String[]{
                        ".....  ",
                        ".    . ",
                        "....   ",
                        ".   .  ",
                        ".    . ",
                }
        );
        alphabet.put('S', new String[]{
                        " ..... ",
                        ".      ",
                        "  .    ",
                        "     . ",
                        " ....  ",
                }
        );
        alphabet.put('T', new String[]{
                        ".......",
                        "   .   ",
                        "   .   ",
                        "   .   ",
                        "   .   ",
                }
        );
        alphabet.put('U', new String[]{
                        ".     .",
                        ".     .",
                        ".     .",
                        " .   . ",
                        "  ...  ",
                }
        );
        alphabet.put('V', new String[]{
                        ".     .",
                        ".     .",
                        " .   . ",
                        "  . .  ",
                        "   .   ",
                }
        );
        alphabet.put('W', new String[]{
                        ".     .",
                        ".  .  .",
                        ". . . .",
                        "..   ..",
                        ".     .",
                }
        );
        alphabet.put('X', new String[]{
                        ".     .",
                        " .   . ",
                        "  ...  ",
                        " .   . ",
                        ".     .",
                }
        );
        alphabet.put('Y', new String[]{
                        ".     .",
                        " .   . ",
                        "  ...  ",
                        "   .   ",
                        "   .   ",
                }
        );
        alphabet.put('Z', new String[]{
                        ".......",
                        "     . ",
                        "    .  ",
                        "  .    ",
                        ".......",
                }
        );
        alphabet.put('1', new String[]{
                        "   .   ",
                        " . .   ",
                        "   .   ",
                        "   .   ",
                        "  ...  ",
                }
        );
        alphabet.put('2', new String[]{
                        " ....  ",
                        ".   .  ",
                        "  .    ",
                        " .     ",
                        ".....  ",
                }
        );
        alphabet.put('3', new String[]{
                        "...... ",
                        "      .",
                        "...... ",
                        "      .",
                        "...... ",
                }
        );
        alphabet.put('4', new String[]{
                        ".     .",
                        ".     .",
                        ".......",
                        "      .",
                        "      .",
                }
        );
        alphabet.put('5', new String[]{
                        " ..... ",
                        "      .",
                        " ..... ",
                        ".      ",
                        " ..... ",
                }
        );
        alphabet.put('6', new String[]{
                        " ......",
                        ".      ",
                        " ..... ",
                        ".     .",
                        " ..... ",
                }
        );
        alphabet.put('7', new String[]{
                        ".......",
                        "     . ",
                        "    .  ",
                        "   .   ",
                        "  .    ",
                }
        );
        alphabet.put('8', new String[]{
                        " ..... ",
                        ".     .",
                        ".......",
                        ".     .",
                        " ..... ",
                }
        );
        alphabet.put('9', new String[]{
                        " ..... ",
                        ".     .",
                        " ..... ",
                        "      .",
                        "...... ",
                }
        );
        alphabet.put('0', new String[]{
                        " ..... ",
                        ".     .",
                        ".     .",
                        ".     .",
                        " ..... ",
                }
        );
        alphabet.put('.', new String[]{
                        "       ",
                        "       ",
                        "       ",
                        " ...   ",
                        " ...   ",
                }
        );
        alphabet.put('!', new String[]{
                        "   .   ",
                        "   .   ",
                        "   .   ",
                        "  ...  ",
                        "  ...  ",
                }
        );
        alphabet.put(' ', new String[]{
                        "       ",
                        "       ",
                        "       ",
                        "       ",
                        "       ",
                }
        );
    }

    public void print() {
        String text = this.text.toUpperCase();
        String[] textStorage = new String[5];
        StringBuilder beautyText = new StringBuilder();
        for (char c : text.toCharArray()) {
            String[] character = alphabet.getOrDefault(c, alphabet.get(' '));
            for (int i = 0; i < character.length; i++) {
                if (textStorage[i] == null) {
                    textStorage[i] = "";
                }
                textStorage[i] += character[i] + " ";
            }
        }
        for (String line : textStorage) {
            beautyText.append(line.replace('.', delimiter));
            beautyText.append("\n");
        }
        System.out.println(beautyText);
    }

}
