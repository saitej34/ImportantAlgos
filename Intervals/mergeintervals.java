class Solution {
    public int[][] merge(int[][] intervals) 
    {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=end)
            {
                start = start;
                end = Math.max(intervals[i][1],end);
            }
            else
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                arr.add(new ArrayList<>(temp));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }  
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        if(arr.contains(temp)==false)
        {
            arr.add(new ArrayList<>(temp));
        }
        System.out.println(arr);
        int[][] arr1 = new int[arr.size()][2];
        for(int i=0;i<arr.size();i++)
        {
            arr1[i][0] = arr.get(i).get(0);
            arr1[i][1] = arr.get(i).get(1);
        }
        return arr1;
    }
}