package CollectionFramework;

class  Data {
//    Write a class which return a object with integer and String coupled together

//    Way 1 of creating classes , but we can make it in better way , check way 2
//    public Integer num ;
//    public String str;
//
//    Data(Integer _num , String _str) {
//        this.num = _num;
//        this.str = _str;
//    }

    private Integer id;
    private String name;
    private InternalData internalData;

    Data(Integer _id , String _name , int revenue) {
        this.id = _id;
        this.name = _name;
        this.internalData = new InternalData(revenue);
    }

//    using setter and getter function

    public  void setId (Integer _id) {
        this.id = _id;
    }

    public  void setName (String _name) {
        this.name = _name;
    }


    public  Integer getId () {
        return id;
    }
    public String getName () {
        return  name;
    }
    // Getter method for internalData

    public InternalData getInternalData() {
        return internalData;
    }
}

class InternalData {
    private  Integer revenue;

    InternalData (Integer _revenue) {
        this.revenue = _revenue;
    }

    public  void setRevenue (Integer _revenue) {
        this.revenue = _revenue;
    }

    public  int getRevenue () {
        return  revenue;
    }


}

public class CustomClass {
    public static void main(String[] args) {
        Data dataObj1 = new Data(1 , "Ash" , 20000);
        dataObj1.setId(10);
        dataObj1.setName("Ashish");
        System.out.println(dataObj1.getInternalData().getRevenue());
        dataObj1.getInternalData().setRevenue(1200000);
        System.out.println(dataObj1.getName());
        System.out.println(dataObj1.getInternalData().getRevenue());
//        System.out.println(dataObj1.str);
//        dataObj1.str = "Srivastava";
//        System.out.println(dataObj1.str);

    }
}
