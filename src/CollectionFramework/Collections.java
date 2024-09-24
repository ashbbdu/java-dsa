package CollectionFramework;

import java.util.ArrayList;
import java.util.List;


class DataTest  {
   public Integer id;
    public String name;

    DataTest (Integer _id ,String _name) {
        this.id = _id;
        this.name = _name;
    }
}

public class Collections {
    public static void main(String[] args) {
        ArrayList <Integer> myArr = new ArrayList<Integer>();
        ArrayList<DataTest> myTestArr = new ArrayList<DataTest>();

        for(int i = 0 ;  i<5 ; i++) {
            myTestArr.add(new DataTest(i + 1, "Name_" + (i + 1)));
        }

        DataTest d1 = myTestArr.get(2);
        System.out.println("ID " + d1.id + " , Name " + d1.name);

//        removing
//        myTestArr.remove(3);
        System.out.println(myTestArr.size() + " size");
        // Printing the elements to verify insertion
        for (int i = 0; i < myTestArr.size() ; i++) {
            DataTest data = myTestArr.get(i);
            System.out.println("ID: " + data.id + ", Name: " + data.name);
        }
    }
}
