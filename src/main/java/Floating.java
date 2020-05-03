public class Floating {

    static double[]  arr = {2.13,3.46,5.647,8.34};
    static int arrayLength = arr.length;

    public void inverseArray (){

            for ( int i = arrayLength - 1; i >= 0; i-- )
                if (i == 0)
                    System.out.print(+ arr[i]);
                else
                    System.out.print(+ arr[i]+",");

    }

    public static void main(String[] args) {
        System.out.print("arr[");
        for( int j=0; j < arrayLength; j++ ){
             if (j +1== arrayLength )
                 System.out.print(+ arr[j]);
             else
                 System.out.print( arr[j]+",");

        }

        System.out.println("]");
        System.out.print("InveretedArr[");
        new Floating().inverseArray();
        System.out.print("]");
    }
}
