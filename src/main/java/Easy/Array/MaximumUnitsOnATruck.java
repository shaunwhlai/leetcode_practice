package Easy.Array;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {
    int[][] boxTypes = {{1,3},{2,2},{3,1}};
    int truckSize = 4;

        System.out.println(maximumUnits(boxTypes,truckSize));

    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int column = boxTypes[0].length;
        int row = boxTypes.length;
        int currentSize = 0;
        int sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                currentSize = currentSize + boxTypes[i][j];
                if(currentSize <= truckSize){
                     sum += boxTypes[i][j] * boxTypes[i][j+1];
                }
            }
        }
        return sum;
    }
}
