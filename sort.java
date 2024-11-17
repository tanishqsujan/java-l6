class sort{
    public static void main(String[] args){
        int []arr= new int[] {5,4,6,7,9,3};
        int temp=0;
        System.out.println("Elements of Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

            for(i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
                System.out.println();
                System.out.println("Elements of array in ascending order");
                for(i=0; i<arr.length;i++){
                    System.out.print(arr[i]+ " ");
                }
        }
    }
}
