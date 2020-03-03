public class Main {
    public static void main(String[] args) throws Exception {


        Die die=new Die(6,3,0,0,0,0,0);
        die.roll();

        System.out.println(die.value);
        die.setProbabilities(0,1,0,0,0,0);
        die.roll();
        System.out.println(die.value);


        Die die20=DiceFactory.makeDie(20);
        die20.roll();

        System.out.println(die20.value);
    }
}
