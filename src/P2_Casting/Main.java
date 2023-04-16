package P2_Casting;

public class Main {
    public static void main(String[] arg){
        /*
        * -in casting we change variables capacity.
        *
        * -conditions of casting:
        * 1-attention to boolean variables conditions.
        *
        * 2-if set a small variable in larger variable we don't have error but+
        * if set larger variable in smaller variable we should get error form jvm+
        * and we should have (Data loos).
        *
        * */

        int var1 = 20;
        long var2 = var1;   /*we have a true casting with out any error that called(promote or implicit)*/

        /*
        * if we forced to use larger variable in smaller variable we should do this :
        * -in this example we should have data loos too but don't have error.
        * -this called (force full or explicit)
        * */
        long var3 = 111213123123134321L;
        int var4 = (int)var3;
        System.out.println(var4);   /*we have data loos here (output is [169721713])*/
    }
}
