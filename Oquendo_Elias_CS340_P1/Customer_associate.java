public class Customer_associate extends Thread{

    private int num_of_customer_associates = 2;
    private boolean help_value = false;

    public Customer_associate()
    {}

    public void setNumOfCustomerAssociates(int num_of_customer_associates)
    {
        this.num_of_customer_associates = num_of_customer_associates;
    }

    public void Customer_associate_service()
    {

        //busy waits for a clerk to help so use lock
        //basically synchronized but without the mishaps that can occur with synchronized

        //see if the respective thread recouped his vacation cost
    }


    @Override
    public void run() {
        msg("Going to get Customer assistance");
        Customer_associate_service();
    }

    public void msg (String m) {
        System.out.println("[" + (System.currentTimeMillis())+ "]" + this.getClass().getName() + ":" + m );
    }

    public boolean needs_help(boolean value)
    {
        this.help_value = value;
        return this.help_value;
    }
}
