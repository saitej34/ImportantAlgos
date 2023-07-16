class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] ans = new long[arr.length];
        Stack<Long> s = new Stack<>();
        s.push(arr[n-1]);
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--)
        {
            while(s.empty()==false && s.peek()<=arr[i])
            {
                s.pop();
            }
            long nextgreat = s.empty()==true ? -1 : s.peek();
            ans[i]=nextgreat;
            s.push(arr[i]);
        }
        // Arrays.reverse(ans);
        return ans;
        
    } 
}