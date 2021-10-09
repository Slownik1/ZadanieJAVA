public class Main {

    public static String Upper(String text){

        for(int i=0; i<text.length(); i++){

            int litera = (int)text.charAt(i);

            if((litera>96)&&(litera<122)) {

                litera -= 32;

            }

        }

        return "";

    }

    public static void main(String[] args) {



    }

}

