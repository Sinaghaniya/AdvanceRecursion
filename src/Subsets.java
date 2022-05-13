import java.util.ArrayList;

public class Subsets {

    static void printSubset(ArrayList<Integer> subset){

        for(int i=0;i< subset.size();i++){
            System.out.print(subset.get(i)+" ");

        }

        System.out.println();
    }

    static void findSubSets(int n, ArrayList<Integer> subset){

        if(n==0){//Base Case
            printSubset(subset);
            return;
        }

        //add hoga
        subset.add(n);
        findSubSets(n-1,subset);

        //add nhi hoga
        subset.remove(subset.size()-1);
        findSubSets(n-1,subset);


    }

    public static void main(String[]args){

       int n = 3;

       ArrayList<Integer> subset = new ArrayList<>();

       findSubSets(n,subset);


    }
}
