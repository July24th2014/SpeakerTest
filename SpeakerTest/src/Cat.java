public class Cat implements Speaker
{
    private String name;
    public Cat(String nameInit) {
        this.name = nameInit;

    }
    public void speak() {
        //your code here.
        System.out.println(name +" says: woof");
    }
    public void announce(String str) {
        //your code here.
        System.out.println(name +" announces: " + str);
    }
}