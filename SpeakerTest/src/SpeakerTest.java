
public class SpeakerTest
{
    public static void main(String[] args)
    {
        //Interface Reference
        //Polymorphic Ability
        //Invoking the Methods of Interface

        //Calling Dog child class
        Speaker lucky,descartes;
        lucky = new Cat("Lucky");
        lucky.speak();
        lucky.announce("This is how a dog sound");

        //Calling Philosopher child class
        descartes = new Philosopher("René Descartes","I think, therefore I am");
        descartes.speak();
        descartes.announce("I am a Philosopher");

        //Casting the method of Philosopher child class of interface.
        ((Philosopher)descartes).pontificate();
    }
}
