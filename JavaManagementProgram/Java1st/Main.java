class Main {
    public static int[] gugudan(int n, int size) {
        int [] Result = new int [size + 1];
        for(int i = 0; i < Result.length; i++) {
            Result[i] = (i + 1) * n;
        }
        return Result;
    }

    public static void print(int []arr, int start, int end) {
        System.out.printf("%d단\n", start);
        for(int j = 0; j < end; j++){
            System.out.printf("%d * %d = %d\n",start ,j+1, arr[j]);
        }
    }
}