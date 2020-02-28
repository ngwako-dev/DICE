import java.util.ArrayList;
import java.util.Arrays;


public class Die {

    //Random rand;

    public int size;
    public int value;
    Number [] Aarray;

    public Die(int size,Number...probability) {


        this.Aarray=probability;
        this.size = size;

    }

    public void roll() throws Exception{

        ArrayList<Double> arr=new ArrayList<>();
        int sum=0;

        for(Number prob:Aarray){
            if(prob.intValue()<0){
                throw new Exception("Negative numbers not allowed");
            }
        }



        if(!Arrays.toString(Aarray).equals("[]") ){
            double rand = Math.random();

//        value = rand.nextInt(getSize()) + 1;
            for (Number a : Aarray) {
                sum += a.intValue();
                //- + / * %
                if(a.doubleValue()%a.intValue()!=0 && a.intValue()!=0){
                    throw new Exception("only integer values allowed");
                }
            }
            if(sum<1){
                throw new Exception("probability sum must be greater than 0");
            }

            for (int b = 0; b < Aarray.length; b++) {
                if (b == 0) {
                    arr.add(((double) Aarray[b].intValue() / sum));
                } else {
                    arr.add(((double) Aarray[b].intValue() / sum) + arr.get(b - 1));
                }
                for (int j = 0; j < arr.size(); j++) {

                    if (rand < arr.get(j)) {

                        value = j + 1;
                        break;
                    }

                }
            }
        }else {
            value= (int) (Math.random()*getSize()+1);
        }
    }

    public void setProbabilities(Number...probabilities) {

        this.Aarray = probabilities;
    }

        public int getSize(){
            return size;
        }


    }



