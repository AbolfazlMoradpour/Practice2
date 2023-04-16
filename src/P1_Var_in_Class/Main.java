package P1_Var_in_Class;

import java.util.Date;

public class Main {
    static int var3;    /*Static Variables or class variables*/

    public static void main(String[] arg){

        int var1;   /*Classes Field or local variable*/

        for(int var4 = 1; var4<=19; var4++){    /*Variables in For loops*/
            System.out.println("helloworld");
            /*
            * Variables in for loops have short life and remove+
            * when operation finish in loop.
            * for loop variables never can use out of loop.
            * */
        }

        /*
        * 1-this variables should use in local variables.
        * 2-this variables should use in main method only >> (public static void main(String[] arg)).
        * */
        var var5 =12;                      /*Local variable inference in integer variables*/
        var var6 =12.3;                   /*Local variable inference in double variables*/
        var var9 = 14.5F;                /*Local Variable inference in float variables*/
        var var7 =1234934754393249L;    /*Local variable inference in long variables*/
        var var8 = new Date();         /*Local variable inference in new objects fields*/

    }

    public static String mt1 (String s1){  /*Method parameter Variable*/
        return s1;
    }

    public void mt2(){
        int var2;   /*Variable in a Method Body*/
        /*
        * Variables that use in a methods +
        * never can use out of the method.
        * */
    }

}
