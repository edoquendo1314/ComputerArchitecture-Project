public class Fisherman extends Thread
{
    private int num_fm = 6; // default value
    private int vacation_cost = 250; // default value

    //default constructor so I can use default values
    public Fisherman()
    {}

    public void setNumOfFisherman(int value)
    {
        this.num_fm = value;
    }

    public void setNumOfVacationCost(int vacation_cost)
    {
        this.vacation_cost = vacation_cost;
    }

    public int getPriceOfVacationCost()
    {
        return this.vacation_cost;
    }

    public int get_Number_of_Fisherman()
    {
        return this.num_fm;
    }


    public synchronized void begin_boat_travel_to_the_island()
    {
       try
       {
            Thread.sleep(2500);
       }
       catch (InterruptedException e)
       {}

       Ranger go_to_the_fishing_hole = new Ranger();

       msg("Going to the fishing hole");
       go_to_the_fishing_hole.run();
    }
    public void run()
    {
        msg("Traveling to the island");
        begin_boat_travel_to_the_island();
    }

    public void msg (String m) {
        System.out.println("[" + (System.currentTimeMillis())+ "]" + this.getClass().getName() +  ":" + m );
    }
}
