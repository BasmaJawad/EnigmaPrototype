package Prototype;

public class Prototype1 {
    char[] alfabet = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Ø','Å'};

    public static void main(String[] args) { }

    int charToInt(char bogstav){
        for (int i = 0; i < alfabet.length; i++) {
            if(alfabet[i]==bogstav)
                return i;
        }
        return -1;
    }
    char intToChar(int talVærdi) {
        for (int i = 0; i < alfabet.length; i++) {
            if (i == talVærdi)
                return alfabet[i];
        }
        return '-';
    }

}

