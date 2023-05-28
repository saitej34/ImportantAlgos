import java.util.*;
class Solution 
{
    //Level Order Traversal

    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> finlist = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
        {
            return finlist;
        }
        q.add(root);
        while(q.isEmpty()==false)
        {
            int k = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<k;i++)
            {
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            finlist.add(list);
        }
        return finlist;  
    }
}
