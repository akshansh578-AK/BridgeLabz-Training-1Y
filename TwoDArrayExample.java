package BASICS_OF_JAVA;

public class TwoDArrayExample {
    public static void main(String[] args){
        int [][] marks = {
                {80, 90},
                {70, 85}
        };
        for (int i = 0; i<marks.length; i++){
            for(int j =0 ; j< marks[i].length; j++) {
                System.out.println(marks[i][j] +" ");
            }
            System.out.println();
        }
    }
}
