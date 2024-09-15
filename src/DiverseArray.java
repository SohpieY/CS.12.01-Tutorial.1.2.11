public class DiverseArray {

    public static int arraySum(int[] arr1){
        int sum = 0;

        for(int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }

        return sum;
    }

    public static int[] rowSums(int[][] array2d){
        int[] sums = new int[array2d.length];

        for(int i = 0; i < array2d.length; i++){
            int sum = 0;

            for(int j = 0; j < array2d[i].length; j++){
                sum += array2d[i][j];
            }

            sums[i] = sum;

        }

        return sums;
    }

    public static boolean isDiverse(int [][] array2d){
        int sums[] = rowSums(array2d);

        for(int i = 0; i < sums.length; i++){
            for(int j = i+1; j < sums.length; j++){
                if(sums[i] == sums[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
