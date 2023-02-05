import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void createFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name for the new File ");
        String name = sc.nextLine();
        File obj = new File(name + ".txt");
        if (obj.createNewFile()) System.out.println("File " + name + " Created Successfully");
        else System.out.println("File Already exists");


    }

    public static void deleteFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name for Deleting the File from current Directory");
        String name = sc.nextLine();
        File obj = new File(name + ".txt");
        if (obj.delete()) System.out.println("File " + name + " Deleted Successfully");
        else System.out.println("File Does not exist");

    }

    public static void searchFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name for Searching the file in the Directory");
        String name = sc.nextLine();
        File obj = new File(name + ".txt");
        if (obj.exists()) System.out.println("File " + name + " Exists in the Current Directory");
        else System.out.println("File Does not exist");
    }

    public static void main(String args[]) throws IOException {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        Boolean doContinue = true;
        while(doContinue == true){

        System.out.println("Welcome to the Virtual Key Repository");
        System.out.println("Developer Name : Pravin Borole");
        System.out.println("User Interactions :");
        System.out.println("Press 1 to get the File Names from the Directory in Sorted Manner");
        System.out.println("Press 2 For Business level Operations");
        System.out.println("Press 3 to Close the Application");
        input = sc.nextInt();
        switch (input) {

            case 1:
                System.out.println("File Names from the current Directory");
                File folder = new File("D:\\Pravin");
                File[] listOfFiles = folder.listFiles();
                int count = folder.list().length;
                for (int i = 0; i < count; i++) {
                    if (listOfFiles[i].isFile()) {
                        System.out.println(listOfFiles[i].getName());
                    } else if (listOfFiles[i].isDirectory()) {
                        System.out.println(listOfFiles[i].getName());
                    }
                }
                break;

            case 2:
                System.out.println("Business level Operations");
                int bloInput;
                Boolean doCon = true;
                while(doCon == true)
                {
                System.out.println("Enter 1 For Creating a new File in the current Directory");
                System.out.println("Enter 2 For Deleting a File from the current Directory");
                System.out.println("Enter 3 For Searching a File in the current Directory");
                System.out.println("Enter 4 To Go back to main menu");
                bloInput = sc.nextInt();
                String name;
                switch (bloInput) {

                    case 1:
                        createFile();
                        break;

                    case 2:
                        deleteFile();
                        break;

                    case 3:
                        searchFile();
                        break;

                    case 4:
                        System.out.println("Redirecting to the main menu");
                        doCon = false;
                        break;
                }
                }
                break;


            case 3:
                System.out.println("Closing the Application");
                doContinue = false;
                System.exit(0);


            default:
                System.out.println("Please Enter a valid option");
                break;

        }
        }
    }
}

