public class Main {

    public static String Upper(String text){

        int litera=0;
        String StringInUpperCase="";
        char tmp;

        for(int i=0; i<text.length(); i++){

            litera=text.charAt(i);

            if((litera>96)&&(litera<123)){

                litera-=32;
                tmp = (char)litera;
                StringInUpperCase+=Character.toString(tmp);

            }
            else{

                tmp = (char)litera;
                StringInUpperCase+=Character.toString(tmp);

            }
        }
        return StringInUpperCase;
    }

    public static void main(String[] args) {

        System.out.println(Upper("test"));


    }

}

