package Day10;

public class BinarySearchTechnique {

    public static void main(String[] args) {
        int arr[]={2,9,34,56,75,89};
        int target=89;
        int low=0;
        int high=arr.length-1;
        int idx=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                idx=mid;
                break;
            }else if(arr[mid]>target)
            {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(idx==-1)
        {
            System.out.println("Element not Found");
        }else{
            System.out.println("Element idx is :"+idx);
        }
    }
    
}
