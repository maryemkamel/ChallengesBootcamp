package Day9;

public class DataStructure {

    public static void main(String []args){

        System.out.println("****************Challenge 1: Array Operations******************* ");
        int[] array={1,2,3};
        int sum=0;
        int max=array[0];
        int min=array[0];

        for(int list:array){
            sum+=list;
            if(list>max){
                max=list;
            }
            if(list<min)
                min=list;

        }
        System.out.println("SUM is: "+sum);
        System.out.println("MAX is: "+max);
        System.out.println("MAX is: "+min);
        System.out.println("****************Challenge 1: Array Operations******************* ");



    }



}
