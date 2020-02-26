import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Die {

    //Random rand;

    public int size;
    public int value;
    int [] Aarray;

    public Die(int size,int...probability) {


        this.Aarray=probability;
        this.size = size;
//        this.value = 0;
    }

    public void roll() {

        ArrayList<Double> arr=new ArrayList<>();
        int sum=0;


        double rand = Math.random();

//        value = rand.nextInt(getSize()) + 1;
        for(int a:Aarray){
            sum+=a;
        }
        for (int b=0;b<Aarray.length;b++){
            if (b==0) {
                arr.add(((double)Aarray[b]/sum));
            }else {
                arr.add(((double)Aarray[b]/sum)+arr.get(b-1));
            }
            for(int j=0;j<arr.size();j++){

                if(rand<arr.get(j)){

                    value=j+1;
                    break;
                }

            }
        }



    }


}
