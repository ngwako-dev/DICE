import java.util.ArrayList;
import java.util.Arrays;


public class Die {


    public int size;
    public int value;

    //An array to store probabilities
    Number [] Aarray;

    public Die(int size,Number...probability) {

        //storing probabilities in the array
        this.Aarray=probability;
        //assigning the size of the die
        this.size = size;

    }

    public void roll() throws Exception{

        ArrayList<Double> arr=new ArrayList<>();
        int sum=0;
        // for each loop for checking negative numbers in the array
        for(Number prob:Aarray){
            if(prob.intValue()<0){
                throw new Exception("Negative numbers not allowed");
            }
        }


        //generating random numbers if an array is not empty
        if(!Arrays.toString(Aarray).equals("[]") ){
            double rand = Math.random();

            //adding each value in the array to get the sum
            for (Number a : Aarray) {
                sum += a.intValue();
             //throws an Exception if the numbers in array are not integers
                if(a.doubleValue()%a.intValue()!=0 && a.intValue()!=0){
                    throw new Exception("only integer values allowed");
                }
            }
            //throws an Exception if number probability sum is less than zero
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



