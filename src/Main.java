public class Main {

    public static String Upper(String text){

        for(int i=0; i<text.length(); i++){

            int litera = (int)text.charAt(i);
            String text2="";

            if((litera>96)&&(litera<122)) {

                text2=String.valueOf(text.charAt(i));

            }
            else
            {
                text2=String.valueOf(text.charAt(i));
            }

        }

        return text;

    }

    public static void main(String[] args) {

        System.out.println(Upper("Test"));

    }

}

