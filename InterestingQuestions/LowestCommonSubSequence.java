//package Debugging;
//
//import java.util.*;
//
//public class LowestCommonSubSequence {
//	
//	public class TreeNode {
//		TreeNode(int x) { 
//			val = x; 
//		}
//		
//		int val;
//		TreeNode left;
//		TreeNode right;  
//	}
//
//	public static void main(String[] args) {
//		lowestCommonAncestor(null, null, null);
//	}
//	
//	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        
//        List<Integer> pathToP = helper(root,p);
//        List<Integer> pathToQ = helper(root,q);
//        System.out.println(pathToP);
//        System.out.println(pathToQ);
//        int common =pathToP.get(0);
//        for(int i=0;i<Math.min(pathToP.size(),pathToQ.size());i++){
//            if(pathToP.get(i)==pathToQ.get(i)){
//                common = pathToP.get(i);
//            }
//        }
//        
//        TreeNode res = new TreeNode(common);
//        return res;
//        
//    }
//
//	public static List<Integer> helper(TreeNode root, TreeNode target) {
//		List<Integer> ans = new ArrayList<Integer>();
//        if (root == null){
//            return ans;
//        }
//        if (root.val == target.val){
//            ans.add(target.val);
//            return ans;
//        }
//        
//        List<Integer> inLeft =  helper(root.left,target);
//        List<Integer> inRight = helper(root.right,target);
//        
//        if(inLeft.size() > 0){
//            ans.addAll(inLeft);
//            ans.add(0,root.val);
//        }
//        else if (inRight.size()>0){
//             ans.addAll(inRight);
//             ans.add(0,root.val);
//        }
//        
//        return ans;
//	}
//
//}
