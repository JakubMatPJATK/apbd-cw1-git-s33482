public class pustaKlasa {
    int liczba = 0;
    private char nazwa;

    pustaKlasa(char nazwa){
        this.nazwa = nazwa;
    }

    public char nazwa(){
        return nazwa;
    }

    public int dzialanie(int a, int b, char znak){
        if(znak=='+'){
            return a+b;
        }else if(znak=='-'){
            return a-b;
        }else if(znak=='*'){
            return a*b;
        }else if(znak=='/'){
            return a/b;
        }
        return 0;
    }
}
