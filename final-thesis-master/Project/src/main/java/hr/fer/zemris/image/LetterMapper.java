package hr.fer.zemris.image;

/**
 * @author Filip Gulan
 */
public class LetterMapper {

    public static int mapLetter(Character letter) {
        int output = 63;
        switch (letter) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'Č':
                return 3;
            case 'Ć':
                return 4;
            case 'D':
                return 5;
            case 'Đ':
                return 6;
            case 'E':
                return 7;
            case 'F':
                return 8;
            case 'G':
                return 9;
            case 'H':
                return 10;
            case 'I':
                return 11;
            case 'J':
                return 12;
            case 'K':
                return 13;
            case 'L':
                return 14;
            case 'M':
                return 15;
            case 'N':
                return 16;
            case 'O':
                return 17;
            case 'P':
                return 18;
            case 'R':
                return 19;
            case 'S':
                return 20;
            case 'Š':
                return 21;
            case 'T':
                return 22;
            case 'U':
                return 23;
            case 'V':
                return 24;
            case 'Z':
                return 25;
            case 'Ž':
                return 26;
            case 'X':
                return 27;
            case 'Y':
                return 28;
            case 'W':
                return 29;
            case 'Q':
                return 30;
            case '-':
                return 31;
            case 'a':
                return 32;
            case 'b':
                return 33;
            case 'c':
                return 34;
            case 'č':
                return 35;
            case 'ć':
                return 36;
            case 'd':
                return 37;
            case 'đ':
                return 38;
            case 'e':
                return 39;
            case 'f':
                return 40;
            case 'g':
                return 41;
            case 'h':
                return 42;
            case 'i':
                return 43;
            case 'j':
                return 44;
            case 'k':
                return 45;
            case 'l':
                return 46;
            case 'm':
                return 47;
            case 'n':
                return 48;
            case 'o':
                return 49;
            case 'p':
                return 50;
            case 'r':
                return 51;
            case 's':
                return 52;
            case 'š':
                return 53;
            case 't':
                return 54;
            case 'u':
                return 55;
            case 'v':
                return 56;
            case 'z':
                return 57;
            case 'ž':
                return 58;
            case 'x':
                return 59;
            case 'y':
                return 60;
            case 'w':
                return 61;
            case 'q':
                return 62;
        }
        return output;
    }
}