public class Max{
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,8};
        int k=3;
        int sum = 0;
        for(int i=0;i<k;i++)
            sum+=arr[i];
        int max=sum;
        for(int i =k;i< arr.length; i++){
            sum+=arr[i]-arr[i-k];
        max=Math.max(sum,max);
        }
    System.out.println("max sum of k consecutive elements:"+max);
  }
}

