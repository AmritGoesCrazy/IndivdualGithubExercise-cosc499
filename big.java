import org.junit.Test;

public class big {

    public static void main (String [] args){
        int aInt = 5;
        int bInt = -40;
        int cInt = bigIntCheck(aInt, bInt);

        System.out.println("The bigger of "+ aInt+ " and "+ bInt +" is " + cInt);



    }

    public static int bigIntCheck(int x, int y){
        if(x > y) {
            return x;
        }
        else{
            return y;
        }
    }

    


}