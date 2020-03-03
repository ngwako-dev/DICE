import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DieTest{

    Die die6=new Die(6,-1,0,0,0,0,0);
   @Test

    void handleNegativeNumbers(){
       assertThrows(Exception.class, ()-> die6.roll());
   }

   Die die1=new Die(6,1.2,0,0,0,0,3);
   @Test
    void handleDoubles(){
       assertThrows(Exception.class, ()-> die1.roll());
   }

   Die die2=new Die(6,-2,0,0,0,0,0);
   @Test
    void handleProbabilitiesSumLessThanOne(){
       assertThrows(Exception.class, ()-> die2.roll());
   }



}