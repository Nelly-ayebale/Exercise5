public class TwoDimensional {
    public static void main(String[] args) {
        int column, row, total =0;
        int matrix[][] = new int[10][10];

        for(row=0;row<10;row++){
            for(column=0;column<10;column++){
                matrix[column][column]=column;
                System.out.print(matrix[row][column]+" ");
                if(row==column){
                    total+=matrix[row][column];
                }
            }
            System.out.println();
        }
        System.out.println("The total of the primary diagonal is: "+total);
    }
}
