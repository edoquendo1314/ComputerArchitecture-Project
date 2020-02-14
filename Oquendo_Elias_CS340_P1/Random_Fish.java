import java.util.Random;

public class Random_Fish
{
    //Create a constructor that takes an array of fish and randomly
    //generates the fish till all the Fisherman are done
    //This will be controlled by the threads and their priorities
    private String fisherman_array[] = new String[]{"bait", "10", "20", "30", "40", "50", "200"};
    private String value = " ";
    public Random_Fish()
    {}

    public String get_fish_Array()
    {
        Random rand_indice = new Random();
        int rand_int = rand_indice.nextInt(7);

        for(int i = 0; i <= fisherman_array.length; i++)
        {
            if(i == rand_int)
            {
                String value = fisherman_array[i];
                this.value = value;
            }
        }

        return this.value;
    }



}
