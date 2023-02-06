public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //1
        String myFavoriteArtist = "Bob";

        //2
        System.out.print(myFavoriteArtist);

        //3
        int myFavoriteArtistLength = myFavoriteArtist.length();

        //4
        System.out.println(myFavoriteArtistLength);

        //5
        String myFavoriteArtistUpper = myFavoriteArtist.toUpperCase();

        //6
        System.out.println(myFavoriteArtistUpper);

        //7
        String myFavoriteArtistLower = myFavoriteArtist.toLowerCase();

        //8
        System.out.println(myFavoriteArtistLower);

        //9
        String checkFor = "ift";

        //10
        boolean myFavoriteArtistContains = myFavoriteArtist.contains(checkFor);

        //11
        System.out.println(myFavoriteArtistContains);

        //12
        String firstName = "Emily";

        //13
        String lastName = "Luo";

        //14
        int age = 15;

        //15
        String myInfo;

        //16
        myInfo = "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nFavorite artist: " + myFavoriteArtist;

        //17
        System.out.println(myInfo);

        //18
        String stringToIntTest = "16";

        //19
        int stringToIntTestScore = Integer.parseInt(stringToIntTest);

        //20
        String intToStringTest = "" + stringToIntTestScore;
                System.out.println(intToStringTest);


    }
}

