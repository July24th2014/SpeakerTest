public class Philosopher implements Speaker
{
        private String name, quote;

        public Philosopher(String nameInit, String quoteInit)
        {
           this.name = nameInit;
           this.quote = quoteInit;
        }

        public void speak()
        {
            System.out.println(name + " says: " + quote );
        }

        public void announce(String str)
        {
            System.out.println(name + " announces: " + str);
        }

        public void pontificate()
        {
            for (int count =1;count<=3;count++)
                System.out.println(name + " pontificates: Why is always me?");
        }
    }


