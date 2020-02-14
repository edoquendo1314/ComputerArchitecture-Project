import java.util.Scanner;

public class BigCatchManager extends Thread{


public static void main(String[] args)
{
    //goes straight to display
    //when program is opened to question the user
    display();

    Fisherman fm_amount = new Fisherman();
    int fisherman_Size = fm_amount.get_Number_of_Fisherman();
    Fisherman my_Fisherman_Threads[] = new Fisherman[fisherman_Size];

    for(int i = 0; i < fisherman_Size; i++)
    {
        my_Fisherman_Threads[i] = new Fisherman();
        //how does this thread get to ranger?
    }

    for(Thread thr: my_Fisherman_Threads)
    {
        msg("Starting Thread");
        thr.start();
    }

}

public static void msg (String m) {
    BigCatchManager obj1 = new BigCatchManager();
    System.out.println("[" + (System.currentTimeMillis())+ "]" + obj1.getClass().getName() +  ":" + m );
}

public static void display()
{

    Fisherman fm_obj = new Fisherman();
    Customer_associate ca_obj = new Customer_associate();
    //Ranger ranger_obj = new Ranger();

    Scanner input = new Scanner(System.in);
    char answer = ' ';
    int num_of_Fishermen = 0;
    int num_of_Customer_Associates = 0;
    int num_of_Vacation_Cost = 0;


    System.out.println("Would you like to use the default values for Fishermen, Number of Customer Associates and vacation cost or set your own?");
    answer = input.next().charAt(0);
    if(answer == 'Y' || answer == 'y')
    {
        System.out.println("Your defaults are: 6 Fishermen, 2 Customer Associates," +
        " and your Vacation cost is 250 dollars");
    }
    else
    {
        System.out.println("How many Fishermen would you like? ");
        num_of_Fishermen = input.nextInt();
        fm_obj.setNumOfFisherman(num_of_Fishermen);

        System.out.println("How many Customer Associates would you like?");
        num_of_Customer_Associates = input.nextInt();
        ca_obj.setNumOfCustomerAssociates(num_of_Customer_Associates);

        System.out.println("How much is your vacation cost?");
        num_of_Vacation_Cost = input.nextInt();
        fm_obj.setNumOfVacationCost(num_of_Vacation_Cost);
        
    }

    input.close();

}

}
