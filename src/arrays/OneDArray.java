package arrays;

public class OneDArray {

        public int[] arrayMethod() {
            int a[] = new int[4];
            a[0] = 1;
            a[1] = 4;
            a[2] = 3;
            a[3] = 2;

            System.out.println("Length of an Array: "+a.length);
// For each loop to print the values in the array
            for (int x:a){
                System.out.print(x+" ");
            }

            System.out.println("");
// For  loop to print the values in the array in reverse order
            for (int i=a.length-1;i>=0;i--){
                System.out.print(a[i]+ " ");
            }


return a;
        }


    public static void main(String[] args) {
        OneDArray obj = new OneDArray();
        obj.arrayMethod();

    }

}