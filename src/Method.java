public class Method {

    public static void main(String[] args)
    {
        displayHighScorePosition("Ramya", "Senior");
        calculateHighScorePosition(1500);
    }

    public static void displayHighScorePosition( String PlayerName, String Position)
    {
        System.out.println(PlayerName+"managed to get into position"+Position);
    }

    public static void calculateHighScorePosition( int PlayerScore)
    {
        if (PlayerScore>=1000)
        {
            System.out.println(PlayerScore+"greater than 1000");
        }
        else if (PlayerScore>=500 && PlayerScore<1000)
        {
            System.out.println(PlayerScore+"between 500 & 1000");
        }
        else if (PlayerScore>=100 && PlayerScore<500)
        {
            System.out.println(PlayerScore+"between 100 & 500");
        }
        else
        {
            System.out.println("Playerscore is less");
        }


    }
}

