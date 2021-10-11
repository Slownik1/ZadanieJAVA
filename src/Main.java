public class Main {

    public static void Upper(String text){

        int litera=0;
        char tmp;

        for(int i=0; i<text.length(); i++){

            litera=text.charAt(i);

            if((litera>96)&&(litera<123)){

                litera-=32;
                tmp = (char)litera;
                System.out.print(tmp);

            }
            else{

                tmp = (char)litera;
                System.out.print(tmp);

            }
        }
    }

    public static void main(String[] args) {

        Upper("test");

    }

}

