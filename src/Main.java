public class Main {

    public static void Upper(String text){

        for(int i=0; i<text.length(); i++){

            int litera = (int)text.charAt(i);
            System.out.println(litera);

            if((litera>96)&&(litera<122)) {

                text=String.valueOf(((int)text.charAt(i)-32));
                System.out.println(text);

            }
            else
            {
                text=String.valueOf(text.charAt(i));
                System.out.println(text);
            }

        }

    }

    public static void main(String[] args) {

        Upper("test");

    }

}

