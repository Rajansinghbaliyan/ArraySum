class ArraySum  extends test{
  void arrSum(int arr[] ,int size){
    int sum=0;//To store the value of the array
    for (int i=0;i<size ;i++ ) {
      sum = sum+arr[i];
    }
    System.out.println("The sumation of the array values is ="+sum);
  }
}
