import java.util.*;

public class SongsPlaylist {
    Scanner sc = new Scanner(System.in);

    public void showAllSongs(){
        System.out.println("");
        System.out.println("------------------------------ Available Songs -------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 1; i <pla.length ; i++) {
            System.out.println(i+":"+pla[i]);
        }
        System.out.println("------------------------------------------------------------------------------");
        main(null);

    }


    static int count=0;
    static  int count2=0;
    static String pla[]= {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
    static String play1[]=new String[15];
    static String play2[]=new String[15];

    public void createplaylist() {
        System.out.println("");
        System.out.println("-------------------------- Create Your Own Playlist --------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Here are your all play lists: ");
        System.out.println("Plalist 1");
        System.out.println("Plalist 2");
        System.out.print("In which you want to add songs: ");
        int n1 = sc.nextInt();
        if (n1 == 1) {
            playlist1();
        } else if (n1 == 2) {
            playlist2();
        } else {
            System.out.println("you enterd wrong key plz select correct one:");
            main(null);
            System.out.println("------------------------------------------------------------------------------");

        }
    }
    public void playlist1() {
        System.out.println("");
        System.out.println("-------------------------------- Play List 1 ---------------------------------");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <pla.length ; i++) {
            System.out.println(i+":"+pla[i]);
        }
        System.out.print("Choose your song to add: ");
        int choose = sc.nextInt();

        play1[count]=  pla[choose]  ;
        count++;
        //System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        main(null);
    }
    public void showplaylist1(){
        System.out.println("");
        System.out.println("-------------------------------- Play List 1 ---------------------------------");
        for (int i = 0; i <count ; i++)
            System.out.println(play1[i]);

        System.out.println("------------------------------------------------------------------------------");
        main(null);
    }
    public void playlist2() {
        System.out.println("-------------------------------- Play List 2 ---------------------------------");
        System.out.println("");
        for (int i = 1; i <pla.length ; i++) {
            System.out.println(i+":"+pla[i]);
        }
        System.out.print("Choose your song to add: ");
        int choose = sc.nextInt();

        play2[count2]=  pla[choose]  ;
        count2++;
        // System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        //System.out.println("");
        main(null);
    }
    public void showplaylist2(){
        System.out.println("");
        System.out.println("-------------------------------- Play List 2 ---------------------------------");
        for (int i = 0; i <count2 ; i++) {
            System.out.println(play2[i]);
        }
        System.out.println("");
        //System.out.println("------------------------------------------------------------------------------");
        main(null);
    }
    public void union(){
        System.out.println("");
        System.out.println("--------------------------- All Songs of Playlist ----------------------------");
        System.out.println("------------------------------------------------------------------------------");
        Set<String> unionOfArrays = new HashSet<>();
        unionOfArrays.addAll(Arrays.asList(play1));
        unionOfArrays.addAll(Arrays.asList(play2));
        String[] unionArray = {};
        unionArray = unionOfArrays.toArray(unionArray);
        for (int i = 0; i <unionArray.length-1; i++) {
            System.out.println(unionArray[i+1]);
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        //System.out.println("");
        main(null);
    }
    public int end(){
        return 0;
    }

    public void Favourite(){
        System.out.println("");
        System.out.println("----------------------------- My Favourites Songs ----------------------------");
        System.out.println("------------------------------------------------------------------------------");
        HashSet<String> set = new HashSet<>();

        set.addAll(Arrays.asList(play1));

        set.retainAll(Arrays.asList(play2));


        String[] intersection = {};
        intersection = set.toArray(intersection);

        for (int i = 0; i <intersection.length-1; i++) {
            System.out.println(intersection[i+1]);
        }
        System.out.println("");
        main(null);
        System.out.println("------------------------------------------------------------------------------");

    }

    public void Allplaylists(){
        System.out.println("");
        System.out.println("------------------------------- My All Playlists -----------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Which playlist you want to see: ");
        System.out.println("Plalist 1");
        System.out.println("Plalist 2");

        System.out.print("Please enter a Playlist number: ");
        int n2 = sc.nextInt();
        if (n2 == 1) {
            showplaylist1();
        } else if (n2 == 2) {
            showplaylist2();
        } else {
            System.out.print("You Entered a wrong key, please select correct one: ");
            main(null);
            System.out.println("------------------------------------------------------------------------------");

        }

    }

    public static void main(String[] args) {
        {
            System.out.println("");
            System.out.println("**************************");
            System.out.println("------------------------------ SONGS PLAYLIST --------------------------------");
            System.out.println("**************************");
            System.out.println("");
            SongsPlaylist obj1= new SongsPlaylist();

            System.out.println("1: Show all songs");
            System.out.println("2: Create your own playlist");
            System.out.println("3: Show all playlists");
            System.out.println("4: Show all songs of playlist");
            System.out.println("5: Your Favourite songs:");
            System.out.println("6: If you want to end the program");

            System.out.println("Enter the number of task you want to perform: ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            if (n<=6){
                switch (n) {
                    case 1:
                        obj1.showAllSongs();
                        break;
                    case 2:
                        obj1.createplaylist();
                        break;

                    case 3:
                        obj1.Allplaylists();
                        break;

                    case 4:
                        obj1.union();
                        break;
                    case 5:
                        obj1.Favourite();
                        break;
                    case 6:
                        obj1.end();
                        break;
                }
            }else {
                System.out.println("you have enterd wrong pin plz try again:");
                main(null);
            }
        }
    }
}