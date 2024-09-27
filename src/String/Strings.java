package String;

public class Strings {
    public static void main(String[] args) {
//        In java strings are immutable
        String ash = "Ash";
        System.out.println(ash);
        System.out.println(ash.length());
        char firstElem = ash.charAt(0);
        System.out.println(firstElem);

        for(int i = 0 ; i <= ash.length() - 1 ; i++) {
            System.out.println(ash.charAt(i));
        }


        int[] intArray = new int[]{ 1,2,3 };
        System.out.println(intArray[0]);
        System.out.println(intArray.length);
    }
}
