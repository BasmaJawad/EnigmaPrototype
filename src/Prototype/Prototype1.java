package Prototype;

public class Prototype1 {
    char[] alfabet = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Ø','Å'};

    public static void main(String[] args) {
      // new Prototype1().print();
    }

    int charToInt(char bogstav){
        bogstav = Character.toUpperCase(bogstav);
        for (int i = 0; i < alfabet.length; i++) {
            if(alfabet[i] == bogstav)
                return i;
        }
        return -1;
    }

    char intToChar(int talVærdi) {
        return alfabet[talVærdi];
    }
    /*test
    void print(){
      System.out.println(charToInt('u'));
       System.out.println(intToChar(9));
    }
       */
}

