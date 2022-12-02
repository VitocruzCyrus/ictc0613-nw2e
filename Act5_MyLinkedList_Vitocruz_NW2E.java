
package act5_mylinkedlist_vitocruz_nw2e;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Act5_MyLinkedList_Vitocruz_NW2E {

    public String FirstName, MiddleName, LastName, AreaCode, CellphoneNo, Sex;

    public int Age;
    public Act5_MyLinkedList_Vitocruz_NW2E next;
    public static Act5_MyLinkedList_Vitocruz_NW2E firstNode;
    public static Act5_MyLinkedList_Vitocruz_NW2E lastNode = null;
    
    public Act5_MyLinkedList_Vitocruz_NW2E(String FName, String MName, String LName, String ARCode, String CPNumber, String Gender, int age, 
                             Act5_MyLinkedList_Vitocruz_NW2E n)
    {
        FirstName = FName;
        MiddleName = MName;
        LastName = LName;
        AreaCode = ARCode;
        CellphoneNo = CPNumber;
        Sex = Gender;
        Age = age;
        next = n;
    }
    
    
   public static void main(String[] args)throws IOException {
        String FName, MName, LName, ARCode, CPNumber, Sex;
        int numnodes, age;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many member's information will be entered? ");
        numnodes = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numnodes; i++){
            
            System.out.println("\nKindly give the information of member #" + (i+1));
           
	    System.out.print("Enter First Name: ");
            FName = reader.readLine();

            System.out.print("Enter Middle Name: ");
            MName = reader.readLine();

            System.out.print("Enter Last Name: ");
            LName = reader.readLine();

            System.out.print("Enter Area Code: ");
            ARCode = reader.readLine();

            System.out.print("Enter Cellphone Number: ");
            CPNumber = reader.readLine();

            System.out.print("Enter Gender: ");
            Sex = reader.readLine();

            System.out.print("Enter Age: ");
            age = Integer.parseInt(reader.readLine());
   Act5_MyLinkedList_Vitocruz_NW2E  n = new Act5_MyLinkedList_Vitocruz_NW2E (FName, MName, LName, ARCode, CPNumber, Sex, age, null);
            
                if (lastNode != null)

                {
                    lastNode.next = n;
                    lastNode = n;
                }

                else

                {
                    firstNode = n;
                    lastNode = n;
                }
                
        }
        
       Act5_MyLinkedList_Vitocruz_NW2E  n = firstNode;
        while (n != null) {
       System.out.println("\nWelcome to the club " + n.FirstName + " " + n.MiddleName + " " + n.LastName + "!");
            System.out.println("Your area code and telephone number is (" + n.AreaCode + ")" + n.CellphoneNo + ".");
            System.out.println("You are a " + n.Sex + " member, and your age is " + n.Age + ".");
            n = n.next;
        }
        
    }
    
}
