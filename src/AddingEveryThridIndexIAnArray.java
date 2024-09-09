public class AddingEveryThridIndexIAnArray {
    public static int[] add(int[] array){
        if(array.length != 6){
            throw new RuntimeException("Array length should be 6");
        };
        int[] arr = new int[2];
        int sum = 0;
        for(int i=0;i<array.length;i++){
            if(i==3){
                arr[0] = sum;
                sum = 0;
            };
            sum+=array[i];
        }
        arr[1] = sum;
        return arr;
    }

}

