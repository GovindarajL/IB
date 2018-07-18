/*
 1. EdgeCase:- Order of matrix should be any i.e not square matrix so while traversing in k and l we need to check r1!=r2 and c1!=c2
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result=new ArrayList<>();
        int m=A.size(),n=A.get(0).size(), r1=0, r2=m-1,c1=0,c2=n-1;
        while(r1<=r2&&c1<=c2){
            for(int i=r1;i<=c2;i++)
            result.add(A.get(r1).get(i));
            for(int j=r1+1;j<=r2;j++)
            result.add(A.get(j).get(c2));
            for(int k=c2-1;k>=c1&&r1!=r2;k--)
            result.add(A.get(r2).get(k));
            for(int l=r2-1;l>r1&&c1!=c2;l--)
            result.add(A.get(l).get(c1));
            r1++;r2--;c1++;c2--;
        }
        return result;
    }
}