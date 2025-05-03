//features involed : 
//use of static , final , this , super keyword 
//inheritence , abstratcion , encapsulation , packages , interfaces , constrcutor chaining 
import market.derived;
import java.util.*;
abstract class games {
    static int count = 0;
    String name;
    int ratings;
    float price;
    String developers;
    String graphicsPreset ; 

    games() {
        name = "Not Sure";
        ratings = 7;
        price = 450;
        developers = "Any";
        graphicsPreset = "Balanced";
        count++;
    }

    games(String name,  int ratings, float price, String developers) 
    {
        this.name = name;
        this.ratings = ratings;
        this.price = price;
        this.developers = developers;
        graphicsPreset = setGraphicsPreset();
        count++;
    }                               

    final static String g[] = {"QUALITY" , "BALANCED" , "PERFORMACE"};
    String setGraphicsPreset()
    {
        int j = 1 ; 
        System.out.println("\nSelect which graphic preset you prioritize the most");
        for(String i : g)
        {
            System.out.printf("%d. %s\t",j,i);
            j++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your choice here : ");
        int ch = sc.nextInt();
        return g[ch-1]; 
    } 
    abstract void display(); 
}
class roleplay extends games {
    String favRolePlayGame;
    int hoursPlayed;
    final static String fav[] = {"GTA","READ DEAD REMPTION","ELDEN RING","SEKIRO SHADOWS DIES TWICE","GHOST OF TUSHIMA","LAST OF US","WITCHER","Enter youself","No favourite game"}; 
    roleplay(int h) {
        super();
        favRolePlayGame = "No favourite game as such";
        hoursPlayed = h ; 
    }
    roleplay(String name,int ratings, float price, String developers, String favRolePlayGame, int hours) {
        super(name, ratings, price, developers);
        this.favRolePlayGame = favRolePlayGame;
        hoursPlayed = hours;
    }
    void display()
    {
        System.out.println("\n\nSummarizing your synopsis");
        System.out.printf("Roleplay Game's name : %s\nMinimum Ratings it must have : %d\nPrice it should be costing : %f\nDevelopers : %s\nYour favourite role play game : %s\nNumber of hours you have played roleplay games : %d\nGraphics Preset : %s\n",name,ratings,price,developers,favRolePlayGame,hoursPlayed,graphicsPreset);
    }
}

class racing extends games {
    String favRacingGame ; 
    final static String fav[] = {"FORZA HORIZON","FORZA MOTORSPORTS","NEED FOR SPEED","ASPHALT","MOTOGP","Enter yourself","No favourite game"};
    racing()
    {
        super(); 
        favRacingGame = "No favourite Game as such"; 
    }
    racing(String name,int ratings, float price, String developers, String favRacingGame)
    {   
        super(name, ratings, price, developers);
        this.favRacingGame = favRacingGame;
    }   
    void display()
    {
        System.out.println("\nSummarizing your synopsis");
        System.out.printf("Racing Game's name : %s\nMinimum Ratings it must have : %d\nPrice it should be costing : %f\nDevelopers : %s\nYour favourite racing game : %s\n",name,ratings,price,developers,favRacingGame);

    }
}

class horror extends games {
    String favhorrorGame ; 
    final static String fav[] = {"OUTLAST","PHASMOPHOBIA","RESIDENT EVIL","FIVE NIGHT AT FREDDYS","PACIFY","ANGRY GRANNY","Enter yourself","No favourite game"};
    horror()
    {
        super(); 
        favhorrorGame = "No favourite Game as such"; 
    }
    horror(String name,int ratings, float price, String developers, String favhorrorGame)
    {   
        super(name, ratings, price, developers);
        this.favhorrorGame = favhorrorGame;
    }   
    void display()
    {
        System.out.println("\nSummarizing your synopsis");
        System.out.printf("Horror Game's name : %s\nMinimum Ratings it must have : %d\nPrice it should be costing : %f\nDevelopers : %s\nYour favourite horror game : %s\n",name,ratings,price,developers,favhorrorGame);
;
    }
}

class fpsMultiplayer extends games {
    String favfpsGame ; 
    final static String fav[] = {"Counter Strike","Call of Duty","Battlefield","Overwatch","Valorant","Halo","Enter yourself","No favourite game"};
    fpsMultiplayer()
    {
        super(); 
        favfpsGame = "No favourite Game as such"; 
    }
    fpsMultiplayer(String name,int ratings, float price, String developers, String favfpsGame)
    {   
        super(name, ratings, price, developers);
        this.favfpsGame = favfpsGame;
    }   
    void display()
    {
        System.out.println("\nSummarizing your synopsis");
        System.out.printf("fpsMultiplayer Game's name : %s\nMinimum Ratings it must have : %d\nPrice it should be costing : %f\nDevelopers : %s\nYour favourite fpsMultiplayer game : %s\n",name,ratings,price,developers,favfpsGame);

    }
}
class sports extends games {
    String favsportsGame ; 
    final static String fav[] = {"FIFA","CRICKET","NBA","GOLF","RUGBY","Enter yourself","No favourite game"};
    sports()
    {
        super(); 
        favsportsGame = "No favourite Game as such"; 
    }
    sports(String name,int ratings, float price, String developers, String favsportsGame)
    {   
        super(name, ratings, price, developers);
        this.favsportsGame = favsportsGame;
    }   
    void display()
    {
        System.out.println("\nSummarizing your synopsis");
        System.out.printf("Sports Game's name : %s\nMinimum Ratings it must have : %d\nPrice it should be costing : %f\nDevelopers : %s\nYour favourite Sports game : %s\n",name,ratings,price,developers,favsportsGame);

    }
}

interface details1
{ 
    void display(); 
}
interface details2 extends details1 
{
    String device_select() ; 
}
final class fillerDetails implements details2{
    private String name ; 
    private int age ; 
    private String country ; 
    float experience ; 
    int gamesPlayed ; 
    final static String de[] = {"Console" , "Mobile/Tab" , "PC/Laptop" , "Handheld", "Any"};
    String device ; 
    // final static String tog[] = {"Casual" , "Professional" , "New" , "Old" , "Try Harder" , "Not Sure"};
    // String typeOfGamer ; 

    fillerDetails()
    {
        name = "Not mentioned" ; 
        age =  18 ; 
        country = "Not mentioned" ; 
        experience = 4 ; 
        gamesPlayed = 1; 
        device = "Any";
    } 
    fillerDetails(String n , int a , String c , float e )
    {
        name = n ; 
        age = a ; 
        country = c ; 
        experience = e ; 
    }
     
    fillerDetails(String n , int a , String c , float e , int g)
    {   
        this(n,a,c,e);
        gamesPlayed = g ; 
        device = device_select() ; 
    }
    public String device_select()
    {
        Scanner s = new Scanner(System.in);
        int choice ; 
        int j = 1 ;
        System.out.println("\nEnter the device you prefer to play games on : "); 
        for(String i : de)
        {
            System.out.printf("%d. %s\t\t",j,i);
            j++;
        }   
        choice = s.nextInt();
        if(choice>=1 && choice <=de.length)
        {
          device = de[choice-1];
        }
        else
        {
          device = de[de.length - 1] ;
        }
        return device ; 
    }
    public void display() 
    {
     System.out.printf("\nName : %s  \tAge : %d  \tCountry : %s  Experience : %f  \t Device prefered : %s\n",name,age,country,experience,device);
    }

}
public class SurveyCode
{
    static 
    {
        System.out.println(" ___       __   _______   ___       ________  ________  _____ ______   _______          \r\n" + //
                "|\\  \\     |\\  \\|\\  ___ \\ |\\  \\     |\\   ____\\|\\   __  \\|\\   _ \\  _   \\|\\  ___ \\         \r\n" + //
                "\\ \\  \\    \\ \\  \\ \\   __/|\\ \\  \\    \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|        \r\n" + //
                " \\ \\  \\  __\\ \\  \\ \\  \\_|/_\\ \\  \\    \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\\\|__| \\  \\ \\  \\_|/__      \r\n" + //
                "  \\ \\  \\|\\__\\_\\  \\ \\  \\_|\\ \\ \\  \\____\\ \\  \\____\\ \\  \\\\\\  \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\     \r\n" + //
                "   \\ \\____________\\ \\_______\\ \\_______\\ \\_______\\ \\_______\\ \\__\\    \\ \\__\\ \\_______\\    \r\n" + //
                "    \\|____________|\\|_______|\\|_______|\\|_______|\\|_______|\\|__|     \\|__|\\|_______|    \r\n" + //
                "                                                                                        \r\n" + //
                "                                                                                        \r\n" + //
                "                                                                                        ");
             System.out.println("  _______ _     _        _                                       _                                                _     \r\n" + //
                     " |__   __| |   (_)      (_)                                     (_)                                              (_)    \r\n" + //
                     "    | |  | |__  _ ___    _ ___     __ _     __ _  __ _ _ __ ___  _ _ __   __ _    ___ _   _ _ __   ___  _ __  ___ _ ___ \r\n" + //
                     "    | |  | '_ \\| / __|  | / __|   / _` |   / _` |/ _` | '_ ` _ \\| | '_ \\ / _` |  / __| | | | '_ \\ / _ \\| '_ \\/ __| / __|\r\n" + //
                     "    | |  | | | | \\__ \\  | \\__ \\  | (_| |  | (_| | (_| | | | | | | | | | | (_| |  \\__ \\ |_| | | | | (_) | |_) \\__ \\ \\__ \\\r\n" + //
                     "    |_|  |_| |_|_|___/  |_|___/   \\__,_|   \\__, |\\__,_|_| |_| |_|_|_| |_|\\__, |  |___/\\__, |_| |_|\\___/| .__/|___/_|___/\r\n" + //
                     "                                            __/ |                         __/ |        __/ |           | |              \r\n" + //
                     "                                           |___/                         |___/        |___/            |_|              ");
                     System.out.println("\n\n\n");
                     System.out.printf("WHAT MAKES A GAME A GOOD VIDEO GAME \n\n");
                     System.out.print("1. GAMEPLAY\n"+"2. STORY\n" + "3. GRAPHICS AND PHYSICS\n"+"4. CHALLENGE\n");
                     System.out.println("\nAny designer who wants to understand what makes for a quality video game should start by concentrating on those components.\nBuilding on each of these will take up the remainder of your job.");
                     System.out.println("\nGreetings to everybody. My name is Mohammad Zaid, and in this programme code, my primary goal is to gather helpful data from all types of gamers on the kinds of games they enjoy playing and the kinds of games they would like the game developers to create so that it may assist them build the best games for everyone.");
                     System.out.println("\n\nLets BEGIN with the synopsis\n\n");
    }
    public static String setName()
    {
        Scanner sc = new Scanner(System.in); 
        String gameName ; 
        int choice ; 
                String s1[] = {"Aggressive","Funny","Cool","R rated","Classy","Traditional"};

                System.out.print("What type of name you want a game to have : \n");
                for(int i = 0 ; i < s1.length ; i ++)
                {
                    System.out.printf("%d) %s\t\t",i+1,s1[i]);
                }

                System.out.printf("%d) Enter Yourself\t%d) Not sure : ",s1.length + 1,s1.length + 2);
                System.out.printf("\nEnter your choice here : ");
                choice = sc.nextInt();
                sc.nextLine();
                if(choice >= 1 && choice <= s1.length)
                {
                    gameName = s1[choice-1];
                }
                else if (choice == (s1.length+1))
                {
                    System.out.print("Enter you desired type of a game's name : ");
                    gameName = sc.nextLine();
                }
                else
                {
                    gameName = null ; 
                }
                return gameName ; 
    }
    public static String selectDeveloper()
    {
        int choice ; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("\n\nChoose the game developer whom you want to create the game");
        String developers ; 
        String dev[] = {"Unity" , "Fromsoftware" , "EA" , "Ubisoft" , "Valve" , "Riot Games" , "Activision" , "Sony" , "Microsoft" , "Any" , "Enter yourself"};
        for(int i = 0 ; i < dev.length ; i++)
                {
                    System.out.printf("%d) %s\t\t",i+1,dev[i]);
                }
        System.out.print("\nEnter you choice here : ");
        choice = sc.nextInt();
        if(choice >= 1 && choice <=(dev.length - 1))
                {
                    developers = dev[choice -1];
                }
        else if (choice == dev.length)
                {
                    sc.nextLine();
                    System.out.println("Enter the name of the developer whom you want to build the game : ");
                    developers = sc.nextLine();
                }
        else
                {
                    developers = null ; 
                }
                return developers;
    }
    public static int setRate()
    {
        Scanner sc = new Scanner(System.in);
        int rate ; int choice2 ; 
                System.out.print("\n\nWhat ratings a good game must have (on a scale of 0-10*) : ");
                choice2 = sc.nextInt();
                if(choice2 >= 0 && choice2 <= 10)
                {
                    rate = choice2 ; 
                }
                else if(choice2 < 0)
                {
                    rate = 0 ; 
                }
                else
                {
                    rate = 10 ; 
                }
                return rate ; 
    }
    public static float setPrice()
    {
        Scanner sc = new Scanner(System.in);
        float price ; 
                System.out.print("\n\nWhat must be the price of the game  : ");
                price = sc.nextFloat(); 
                return price ; 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        fillerDetails f1 ;
        String name ; int  age ; String country ; float exp ; int gamesplayed ; int ch ; 
        System.out.printf("\nEnter you choice :    1. Enter your name\t\t2. Dont mention name    : ");
        ch = sc.nextInt();
        sc.nextLine();

        if(ch == 1)
        {
            System.out.print("\nEnter your name : ");
            name = sc.nextLine(); 
        }
        else
        {
            name = "Dont mention" ; 
        }

        System.out.print("\nEnter you choice :    1. Enter your age\t\t2. Dont mention age    : ");
        ch = sc.nextInt();
        if(ch == 1)
        {
            System.out.print("Enter your age : ");
            age = sc.nextInt();
        } 
        else
        {
            age = 0;
        }

        System.out.print("\nEnter you choice :    1. Enter your Country's name\t\t2. Dont mention Country's name    : ");
        ch = sc.nextInt();
        sc.nextLine();
        if(ch == 1)
        {
            System.out.printf("Enter you Country's Name : ");
            country = sc.nextLine();
        }
        else
        {
            country = "Dont mention" ; 
        }
        System.out.printf("\nAverage gaming experience is usally 4 years \nHow much experience you have in gaming :   1) Enter  2)Same\t ");
        ch = sc.nextInt();
        if(ch == 1)
        {
            System.out.print("Enter you experience in games here : ");
            exp = sc.nextFloat();
        }
        else
        {
            exp = 4 ;
        }
        System.out.printf("\nEnter no. of games that you have completed/played : ");
        gamesplayed = sc.nextInt();

        if(name == "Dont mention" && age == 0 && country == "Dont mention" && exp == 4 && gamesplayed == 1)
        {f1 = new fillerDetails();}
        else
        {f1= new fillerDetails(name , age , country , exp , gamesplayed );}

        f1.display();
        System.out.printf("\n_______________Enter how many entries you want to fill_______________ : ");
        int n = sc.nextInt();

        games ga[] = new games[n];
        roleplay r[] = new roleplay[n];
        racing ra[] = new racing[n]; 
        horror h[] = new horror[n]; 
        fpsMultiplayer fps[] = new fpsMultiplayer[n];
        sports s[] = new sports[n] ; 
 
        int choice ; 
        int choice2 ;

        Date date = new Date();                   
        
        int c = 0 ;         
        while(c < n)
        {
            System.out.println("\nThis is your synopsis number "+(c+1));
            System.out.println("You are filling this synopsis on "+ date);
            System.out.printf("Enter the choice of game that you enjoy playing the most\n");
            System.out.printf("1. ROLEPLAY GAMES\n");
            System.out.printf("2. RACING GAMES\n");
            System.out.printf("3. HORROR GAMES\n");
            System.out.printf("4. FPS_MULTIPLAYER GAMES\n");
            System.out.printf("5. SPORTS GAMES\n");
            System.out.print("Enter your choice here : ");
            choice = sc.nextInt();

            if(choice == 1)
            {
                System.out.printf("___You have chosen Roleplay games___\n\n");

                String gameName = setName() ; 
                if(gameName != null)
                {                
                System.out.print("Type of name a roleplay game should have according to you : " +gameName+"\n");
                }

                String developers = selectDeveloper();
                if(developers != null)
                {
                System.out.println("Devlopers you have chosen to build the roleplay game : " + developers);
                }

                int rate = setRate();

                float price =  setPrice();  


                System.out.printf("\n\n_____Selected your favourite roleplay game_____\n");
                String favgame;
                for(int i = 0 ; i < roleplay.fav.length ; i++)
                {
                    System.out.printf("%d) %s\t\t",i+1,roleplay.fav[i]);
                }
                
                System.out.printf("\nEnter your prefered choice : ");
                choice2 = sc.nextInt();
                sc.nextLine(); 

                if(choice2 >=1 && choice2 <= roleplay.fav.length-2)
                {
                    favgame = roleplay.fav[choice2 -1];
                }
                else if(choice2 == roleplay.fav.length -1)
                {
                    System.out.printf("Enter your favourite roleplay game : ");
                    favgame = sc.nextLine();
                }
                else
                {
                    favgame = roleplay.fav[roleplay.fav.length-1];
                }
                System.out.printf("Your favourite roleplay game is : %s\n",favgame);

                int ho ; 
                System.out.print("\n\nHow many hours have you played games : ");
                ho = sc.nextInt();

                //gameName , developers , rate , price , favgame 
                if(gameName == null && developers == null && price>= 400 &&price <=500 && favgame == "No favourite game" && rate>=5 && rate <=8)
                {
                    r[c] = new roleplay(ho);
                }
                else
                {
                    r[c] = new roleplay(gameName, rate, price, developers , favgame,ho);
                }
                ga[c] = r[c]; 
                ga[c].display();
                c++;
            }

            else if(choice == 2)
            {
                System.out.printf("___You have chosen racing games___\n\n");

                String gameName = setName() ; 
                if(gameName != null)
                {                
                System.out.print("Type of name a racing game should have according to you : " +gameName+"\n");
                }

                String developers = selectDeveloper();
                if(developers != null)
                {
                System.out.println("Devlopers you have chosen to build the racing game : " + developers);
                }

                int rate = setRate();

                float price =  setPrice();  


                System.out.printf("\n\n_____Selected your favourite racing game_____\n");
                String favgame;
                for(int i = 0 ; i < racing.fav.length ; i++)
                {
                    System.out.printf("%d) %s\t\t",i+1,racing.fav[i]);
                }
                
                System.out.printf("\nEnter your prefered choice : ");
                choice2 = sc.nextInt();
                sc.nextLine(); 

                if(choice2 >=1 && choice2 <= racing.fav.length-2)
                {
                    favgame = racing.fav[choice2 -1];
                }
                else if(choice2 == racing.fav.length -1)
                {
                    System.out.printf("Enter your favourite racing game : ");
                    favgame = sc.nextLine();
                }
                else
                {
                    favgame = racing.fav[racing.fav.length-1];
                }
                System.out.printf("Your favourite racing game is : %s\n",favgame);


                //gameName , developers , rate , price , favgame 
                if(gameName == null && developers == null && price>= 400 &&price <=500 && favgame == "No favourite game" && rate>=5 && rate <=8)
                {
                    ra[c] = new racing();
                }
                else
                {
                    ra[c] = new racing(gameName, rate, price, developers , favgame);
                }
                ga[c] = ra[c]; 
                ga[c].display();
                c++;
            }
            else if(choice == 3)
            {
                System.out.printf("___You have chosen horror games___\n\n");

                String gameName = setName() ; 
                if(gameName != null)
                {                
                System.out.print("Type of name a horror game should have according to you : " +gameName+"\n");
                }

                String developers = selectDeveloper();
                if(developers != null) // use .Empty() method 
                {
                System.out.println("Devlopers you have chosen to build the horror game : " + developers);
                }

                int rate = setRate();

                float price =  setPrice();  


                System.out.printf("\n\n_____Selected your favourite horror game_____\n");
                String favgame;
                for(int i = 0 ; i < horror.fav.length ; i++)
                {
                    System.out.printf("%d) %s\t\t",i+1,horror.fav[i]);
                }
                
                System.out.printf("\nEnter your prefered choice : ");
                choice2 = sc.nextInt();
                sc.nextLine(); 

                if(choice2 >=1 && choice2 <= horror.fav.length-2)
                {
                    favgame = horror.fav[choice2 -1];
                }
                else if(choice2 == horror.fav.length -1)
                {
                    System.out.printf("Enter your favourite horror game : ");
                    favgame = sc.nextLine();
                }
                else
                {
                    favgame = horror.fav[horror.fav.length-1];
                }
                System.out.printf("Your favourite horror game is : %s\n",favgame);


                //gameName , developers , rate , price , favgame 
                if(gameName == null && developers == null && price>= 400 &&price <=500 && favgame == "No favourite game" && rate>=5 && rate <=8)
                {
                    h[c] = new horror();
                }
                else
                {
                    h[c] = new horror(gameName, rate, price, developers , favgame);
                }
                ga[c] = h[c]; 
                ga[c].display();
                c++;
            }
            else if (choice == 4)
            {
                System.out.printf("___You have chosen FPS_multiplayer games___\n\n");

                String gameName = setName() ; 
                if(gameName != null)
                {                
                System.out.print("Type of name a fpsMultiplayer game should have according to you : " +gameName+"\n");
                }

                String developers = selectDeveloper();
                if(developers != null) // use .Empty() method 
                {
                System.out.println("Devlopers you have chosen to build the fpsMultiplayer game : " + developers);
                }

                int rate = setRate();

                float price =  setPrice();  


                System.out.printf("\n\n_____Selected your favourite fpsMultiplayer game_____\n");
                String favgame;
                for(int i = 0 ; i < fpsMultiplayer.fav.length ; i++)
                {
                    System.out.printf("%d) %s\t\t",i+1,fpsMultiplayer.fav[i]);
                }
                
                System.out.printf("\nEnter your prefered choice : ");
                choice2 = sc.nextInt();
                sc.nextLine(); 

                if(choice2 >=1 && choice2 <= fpsMultiplayer.fav.length-2)
                {
                    favgame = fpsMultiplayer.fav[choice2 -1];
                }
                else if(choice2 == fpsMultiplayer.fav.length -1)
                {
                    System.out.printf("Enter your favourite fpsMultiplayer game : ");
                    favgame = sc.nextLine();
                }
                else
                {
                    favgame = fpsMultiplayer.fav[fpsMultiplayer.fav.length-1];
                }
                System.out.printf("Your favourite fpsMultiplayer game is : %s\n",favgame);


                //gameName , developers , rate , price , favgame 
                if(gameName == null && developers == null && price>= 400 &&price <=500 && favgame == "No favourite game" && rate>=5 && rate <=8)
                {
                    fps[c] = new fpsMultiplayer();
                }
                else
                {
                    fps[c] = new fpsMultiplayer(gameName, rate, price, developers , favgame);
                }
                ga[c] = fps[c]; 
                ga[c].display();
                c++;
            }
            else if (choice == 5)
            {
                System.out.printf("___You have chosen sports games___\n\n");

                String gameName = setName() ; 
                if(gameName != null)
                {                
                System.out.print("Type of name a sports game should have according to you : " +gameName+"\n");
                }

                String developers = selectDeveloper();
                if(developers != null) // use .Empty() method 
                {
                System.out.println("Devlopers you have chosen to build the sports game : " + developers);
                }

                int rate = setRate();

                float price =  setPrice();  


                System.out.printf("\n\n_____Selected your favourite sports game_____\n");
                String favgame;
                for(int i = 0 ; i < sports.fav.length ; i++)
                {
                    System.out.printf("%d) %s\t\t",i+1,sports.fav[i]);
                }
                
                System.out.printf("\nEnter your prefered choice : ");
                choice2 = sc.nextInt();
                sc.nextLine(); 

                if(choice2 >=1 && choice2 <= sports.fav.length-2)
                {
                    favgame = sports.fav[choice2 -1];
                }
                else if(choice2 == sports.fav.length -1)
                {
                    System.out.printf("Enter your favourite sports game : ");
                    favgame = sc.nextLine();
                }
                else
                {
                    favgame = sports.fav[sports.fav.length-1];
                }
                System.out.printf("Your favourite sports game is : %s\n",favgame);


                //gameName , developers , rate , price , favgame 
                if(gameName == null && developers == null && price>= 400 &&price <=500 && favgame == "No favourite game" && rate>=5 && rate <=8)
                {
                    s[c] = new sports();
                }
                else
                {
                    s[c] = new sports(gameName, rate, price, developers , favgame);
                }
                ga[c] = s[c]; 
                ga[c].display();
                c++;
            }
            
        }
        System.out.printf("\nTotal synopsis filled : %d\n",games.count);
        if(c!=0)
        {
        for(int i = 0 ; i < n ; i++)
        {
            
            System.out.printf("\nSynopsis %d : ",i+1);
            ga[i].display();
        }
        }
       
        System.out.println("\nI have made a rudimentry form of a marketplace from where you can buy games");
        System.out.println("You are provided a balance of 10,000 Rs.");
        System.out.println("Lets see which games you are interested in buying");
        System.out.println("Also you can buy one game multiple times , maybe for your friends or as a gift :)\n");


        derived obj = new derived();
        System.out.print("Current Budget : "+obj.budget+"\n");
        boolean f = true ; 
        int count = 0 ; 
        while(f)
        {
            System.out.println("\n");
            System.out.println("Enter 1 for roleplay");
            System.out.println("Enter 2 for racing");
            System.out.println("Enter 3 for horror");
            System.out.println("Enter 4 for fps");
            System.out.println("Enter 5 for sports");
            System.out.println("Enter 6 to view your cart : ");
            System.out.println("Enter 0 to exit");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            System.out.println("");
            switch(choice)
            {
                case 0 :  
                {
                    obj.display(); 
                    f = false ; 
                    break ; 
                }
                case 1 :
                {
                    obj.buyRoleplay();
                    obj.display(); 
                    break ; 
                }
                case 2 : 
                {
                    
                    obj.buyracing();
                    obj.display(); 
                    break ; 
                }
                case 3 : 
                {
                    obj.buyHorror();
                    obj.display(); 
                    break ; 
                }
                case 4 :
                {
                    obj.buyfps();
                    obj.display(); 

                    break ; 
                }
                case 5 : 
                {
                    obj.buysports();
                    obj.display(); 

                    break ;
                }
                case 6 :
                {
                    obj.display();
                    break ; 
                }
            }
        }
        System.out.println("\nWould you like to have to have an entire summary of your Survey ?(1 : Yes\t0 : No) : ");
        choice = sc.nextInt(); 
        if(choice != 0)
        {
            f1.display();
            System.out.println("\n");
            for(int i = 0 ; i < n ; i++)
        {
            System.out.printf("\nSynopsis %d : ",i+1);
            ga[i].display();
        }
        System.out.println("\n");
        obj.display();
        }
        sc.close();
    }
}

    
    

