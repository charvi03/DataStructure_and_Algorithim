package Arrays;

public class second_largest {
    public static void main(String[] args) {
        int arr[]={5,20,20,12,10};
        System.out.println("the element at index "+secondLargest(arr,5)
        + " is second largest");

    }

    static int secondLargest(int a[], int n){
        int largest=0;
        int res=-1;

        for(int i=1;i<n;i++)
        {
            if(a[i]>a[largest])
            {
                res=largest;
                largest=i;
            }
            else if(a[i]!=a[largest])
            {
                if(res==-1||a[i]>a[res])
                    res=i;
            }
        }
        return res;
    }
}
