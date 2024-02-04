package Day9;

import java.util.*;

public class DataStructure {
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int calculateSumMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    public static void reverseArray(int[] tab) {
        int i = 0;
        int end = tab.length - 1;

        while (i < end) {
            int temp = tab[i];
            tab[i] = tab[end];
            tab[end] = temp;
            i++;
            end--;
        }
    }
    public static int binarySearch(ArrayList<Integer> list, int value) {
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            int mid = (i + size) / 2;

            if (list.get(mid) == value) {
                return mid;
            } else if (list.get(mid) < value) {
                i = mid + 1;
            } else {
                size = mid - 1;
            }
        }

        return -1; // L'élément n'a pas été trouvé dans la liste
    }


    public static void reverseLinkedlist(LinkedList<String> tab) {
        int i = 0;
        int end = tab.size() - 1;

        while (i < end) {
            String temp = tab.get(i);
            tab.set(i, tab.get(end));
            tab.set(end, temp);
            i++;
            end--;
        }
    }
    public static void main(String []args){


        System.out.println("****************Challenge 1: Array Operations******************* ");
        int[] array={5,2,7};
        int sum=0;
        int max=array[0];
        int min=array[0];
        DataStructure dataStructure=new DataStructure();

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
        System.out.println("MIN is: "+min);
        System.out.println("reverse table: ");
        dataStructure.reverseArray(array);
        for(int list:array){
            System.out.println(list);
        }

        System.out.println("**************** Challenge 2: List Manipulation ******************* ");
        ArrayList<String> list= new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(3,"b");
        list.remove(1);
        if(list.contains("a")){
            System.out.println("'a' is present in the list");
        }
        else {
            System.out.println("'a' not present in the list");
        }

        System.out.println("Arraylist display");

        for(String str:list) System.out.println(str);
        System.out.println("**************** Challenge 3: Stack Implementation ******************* ");
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int poppedValue = stack.pop();
        System.out.println("Élément retiré de la pile : " + poppedValue);
        int topValue = stack.peek();
        System.out.println("Élément en haut de la pile : " + topValue);
        // Vérifier si la pile est vide
        boolean isEmpty = stack.isEmpty();
        System.out.println("La pile est vide : " + isEmpty);
        for(int element:stack){
            System.out.println(element);
        }
     System.out.println("****************  Challenge 4: Queue Implementation ******************* ");
        ArrayList<Integer> queue=new ArrayList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        if(!queue.isEmpty()){
            queue.remove(0);
        }else {
            System.out.println("the queue is empty!!!");
        }
        System.out.println("the updated list is!!!");
        System.out.println(queue);
        System.out.println("the element at the front of the queue is !!!"+queue.get(0));
        System.out.println("****************  Challenge 5: Linked List Operations ******************* ");

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        System.out.println("size of the linkedlist is: "+linkedList.size());
        dataStructure.reverseLinkedlist(linkedList);
        System.out.println("reverse linkedlist: ");
        System.out.println(linkedList);


        System.out.println("****************  Challenge 6: Binary Search ******************* ");

        ArrayList<Integer>sortedList=new ArrayList<>();
        sortedList.add(3);
        sortedList.add(1);
        sortedList.add(2);

        Collections.sort(sortedList);

        int targetValue = 3;
        int result = binarySearch(sortedList, targetValue);

        if (result != -1) {
            System.out.println("La valeur " + targetValue + " a été trouvée à l'index " + result);
        } else {
            System.out.println("La valeur " + targetValue + " n'a pas été trouvée dans la liste.");
        }

        System.out.println("****************  Challenge 7: Matrix Operations ******************* ");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        int sum2 = calculateSumMatrix(matrix);
        System.out.println("Sum of Matrix Elements: " + sum2);
    }


}

