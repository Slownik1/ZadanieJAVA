public class Main {
    public static String cezar(String str){
        char x[] = str.toCharArray();

        for(int i=0; i != x.length; i++){
            int n = x[i];
            n += 5;
            x[i] = (char)n;
        }
        return new String(x);
    }
    //Upper case method
    public static String Upper(String text){

        int letter=0;
        String StringInUpperCase="";
        char tmp;

        for(int i=0; i<text.length(); i++){

            letter=text.charAt(i);

            if((letter>96)&&(letter<123)){

                letter-=32;
                tmp = (char)letter;
                StringInUpperCase+=Character.toString(tmp);

            }
            else{

                tmp = (char)letter;
                StringInUpperCase+=Character.toString(tmp);

            }
        }
        return StringInUpperCase;
    }

    //Upper case method
    public static String Lower(String text){

        int letter=0;
        String StringInUpperCase="";
        char tmp;

        for(int i=0; i<text.length(); i++){

            letter=text.charAt(i);

            if((letter>64)&&(letter<89)){

                letter+=32;
                tmp = (char)letter;
                StringInUpperCase+=Character.toString(tmp);

            }
            else{

                tmp = (char)letter;
                StringInUpperCase+=Character.toString(tmp);

            }
        }
        return StringInUpperCase;
    }

    public static void main(String[] args) {

        System.out.println(Upper("test"));

        System.out.println(Lower("TEST"));






    }

}

