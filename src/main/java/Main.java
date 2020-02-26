public class Main {
    public static void main(String[] args) {


        Die die=new Die(6,1,1,1,1,1,1000);
        die.roll();

        System.out.println(die.value);
    }
}
