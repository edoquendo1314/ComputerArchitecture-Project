import java.util.Random;

public class Ranger extends Thread{
    Random interrupt_Randomly = new Random();
    public Ranger()
    {}
    public synchronized void fishing() {
        int rand_inter = interrupt_Randomly.nextInt(7);
        try
        {
            Thread.sleep(2500);
        }
        catch(InterruptedException e)
        {}


        if (rand_inter == 3) {
            //how can I interrupt a specific thread?
            Random_Fish get_a_Random_Fish = new Random_Fish();
            Customer_associate start_Customer_associate_thread = new Customer_associate();
            String type_of_fish = get_a_Random_Fish.get_fish_Array();
            //The type of Fish you caught
            msg(type_of_fish);

            if(type_of_fish == "10" || type_of_fish == "20" || type_of_fish == "30"
                    || type_of_fish == "40" || type_of_fish == "50" || type_of_fish == "200")
            {
                msg("Congrats you caught a fish" + type_of_fish);
                start_Customer_associate_thread.run();
            }
            else if(type_of_fish == "bait")
            {
                msg("Sorry you caught bait try again");
            }
        }
    }

    @Override
    public void run() {
        //start fishing
        msg("Starting to Fish");
        fishing();
        msg("Done Fishing");
    }

    public void msg (String m) {
        System.out.println("[" + (System.currentTimeMillis())+ "]" + this.getClass().getName() + ":" + m );
    }
}
