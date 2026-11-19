package org.example;

public class LoopExercises {
    public int sum(int n) {
        int total=0;
        for (int i=1;i<=n;i++){
            total+=i;
        }
        return total;
    }

    public int sumUntilEven(int n) {
       int sum = 0;
       int counter = 1;
       while (counter<=n){
           sum +=counter;
           counter++;

           if (sum % 2 == 0){
               break;
           }
       }
        return sum;
    }
}
