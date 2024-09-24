package CollectionFramework;


import java.util.Vector;

public class VectorTutorial {
    public static void main(String[] args) {
//        vector is similar to ArrayList with some additional features  , it is thread safe
        Vector<Integer> myArr = new Vector<Integer>();
        myArr.add(2);
        System.out.println(myArr.get(0));
    }
}
