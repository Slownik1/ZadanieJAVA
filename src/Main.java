public class Main {
    public static String cezar(String str){        //metoda szyfrujaca;
        char x[] = str.toCharArray();

        for(int i=0; i != x.length; i++){
            int n = x[i];
            n += 5;
            x[i] = (char)n;
        }
        return new String(x);
    }
    public static void main(String[] args) {




    }

}

