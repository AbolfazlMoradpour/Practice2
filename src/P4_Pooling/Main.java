package P4_Pooling;

public class Main {
    public static void main(String[] args) {
        /*
        *pooling mechanism help to decrease object creating cost.
        *
        * in pooling a object hase created and set in pool and use +
        * after if need this in other variable.
        * */
        String name1 = "Ali";   /*Ali is created and set in pool*/
        String name2 = "Ali";   /*Ali not created again but referenced to Ali in pool*/

        String name3 = new String ("Ali");  /*new object (Ali) hase created and not referenced to old Ali*/

        /*
        * -String is immutable that means Variable can't change .
        *
        * -String Class is always as final.
        *
        * */

        /*
        * -two class of String are mutable :
        * 1-StringBuffer.
        * 2-StringBuilder.
        *
        * -StringBuilder and Buffer use like this :
        * */
         StringBuffer name4 = new StringBuffer("Ali");
         StringBuilder name5 = new StringBuilder("Ali");
    }
}
