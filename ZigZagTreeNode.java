



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. 
 (i.e., from left to right, then right to left for the next level and alternate between).
 
 
 Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]


 */
class ZigZagTreeNode {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        if(null == root)
            return new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean reverse = false;
        queue.add(root);
        
        while(!queue.isEmpty()){
             List<Integer> current = new ArrayList<>();
            int size = queue.size();
            
            while(size>0){
               
                TreeNode curr = queue.poll();
                if(reverse){
                    current.add(0,curr.val);
                }else{
                     current.add(curr.val);
                }
                
                
                if(null != curr.left){
                    queue.add(curr.left);
                    
                }
                if(null != curr.right){
                    queue.add(curr.right);
                    
                }
                
                size--;
            }
            
            results.add(current);
            reverse = !reverse;
            
        }
        
        return results;
        
        
    }
    
   
}
