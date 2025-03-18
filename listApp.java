import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListApp {
    static Scanner userinput = new Scanner(System.in);
    static Scanner userinput2 = new Scanner(System.in);
    public static void main(String[] args) {

        List < Object> list = new ArrayList<>();
        String listBuilder = "yes";
        String listChanger;
        String listEditor;
        int listLocation;
        String listReplace;

        while(listBuilder.equals("yes")) {

            System.out.println("What would you like to add to the list?");
            list.add(userinput.nextLine());
            System.out.println(list);

            System.out.println("Would you like to continue the loop? yes or no");
            listBuilder = userinput.nextLine();
            listBuilder = listBuilder.toLowerCase();
            }

        System.out.println("Would you like to edit your list? yes or no");
        listChanger = userinput.nextLine();
        listChanger = listChanger.toLowerCase();

        while(listChanger.equals("yes")) {

            System.out.println("Would you like to add, edit, or remove something from the list? ");
            listEditor = userinput.nextLine();
            listEditor = listEditor.toLowerCase();

            if(listEditor.equals("remove")) {
                System.out.println("What index would you like to remove?");
                listLocation = userinput.nextInt();

                list.remove(listLocation);
            }

            if(listEditor.equals("edit")) {
                System.out.println("What index would you like to edit?");
                listLocation = userinput.nextInt();

                list.remove(listLocation);
                System.out.println("What would you like to add?");
                listReplace = userinput2.nextLine();
                list.add(listLocation,listReplace);
            }

            if(listEditor.equals("add")){
                System.out.println("What index would you like to add to the list at?");
                listLocation = userinput.nextInt();
                System.out.println("What would you like to add?");
                listReplace = userinput2.nextLine();
                list.add(listLocation, listReplace);

            }
            System.out.println(list);

            System.out.println("Would you like to continue the loop? yes or no");
            listChanger = userinput2.nextLine();
            listChanger = listChanger.toLowerCase();
        }

    }
}
