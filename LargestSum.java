
//Soltion1:-

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    /*
    1. Take each element and append or prepend it with other elements in the array
    2. swap the elements in such a way that should follow the order of highest value in the combination
    3. Edge Cases:- List empty, List with all Zeros, List with higher Values after eppend or prepend
    */
    public String largestNumber(final List<Integer> A1) {
    
       List<Integer> A = new ArrayList<Integer>(A1);
       int count=0;
       
       for(Integer i: A){
           if(i==0)
           count++;
       }
       if(count==A.size())
       return "0";
       String s1="",s2="";
       int len = A.size();
       for(int i=0;i<len;i++){
           for(int j=i+1;j<len;j++) {
           s1=String.valueOf(A.get(i))+String.valueOf(A.get(j));
           s2=String.valueOf(A.get(j))+String.valueOf(A.get(i));
           if(s2.compareTo(s1)>0)
           {
               A.set(i,A.get(i)+A.get(j));
               A.set(j,A.get(i)-A.get(j));
               A.set(i,A.get(i)-A.get(j));
           }
       }
       }
       return A.toString().replace("[","").replace("]","").replaceAll(",","").replaceAll(" ","");
    }
}

/*
Compilation and correctness successfully passed. But in efficiency says error "Time Limit Exceeded. Your submission didn't complete in the allocated time limit.

In actual interview it is expected to write the most optimal solution at the first attempt. Please be careful, you might not get a second chance in front of a real Interviewer."

Action:- Need to improve the efficency
*/

/*Solution2:-

Alg:-

1. Using Build-in method of Java Arrays.sort with user defined comparator. 
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    /*
    
     Edge Cases:- List empty, List with all Zeros, List with higher Values after eppend or prepend
    */
    public String largestNumber(final List<Integer> A) {
    
       int count=0;
       
       for(Integer i: A){
           if(i==0)
           count++;
       }
       if(count==A.size())
       return "0";
       int len = A.size();
       Collections.sort(A, new Comparator<Integer>(){
           
          public int compare(Integer i1, Integer i2) {
           String s1=String.valueOf(i1)+String.valueOf(i2);
           String s2=String.valueOf(i2)+String.valueOf(i1);
           return s2.compareTo(s1);
          }
       });
       return Arrays.toString(A.toArray()).replace("[","").replace("]","").replaceAll(",","").replaceAll(" ","");
    }
}

-------------------------------------------------------------------------------------------------------------
/*
Try the shortest Sum for an array and LargestSum and ShortestSum for a given Integer E.g. i/p: 109 o/p:- 901 

*/

/*LargestSum from a given Integer:-

I/p: 1209 o/p: 9201
Algorithm:-

1. Convert int to String using String.valueOf() to easily get each digit from the digit using charAt()
2. from i=9 to i=0 iterate through for loop check each digit in the string for every iteration of for loop if digit matches i then append it to the resultant string
3. convert the resultant string to integer and return it

code:-
*/
public int largestSum(int num) {
  String numStr = String.valueOf(num);
  int len = numStr.length(),res="";
  for(int i=9;i>=0;i--) {
    for(int j=0;j<len;j++) {
      if(Character.getNumericValue(numStr.charAt(j))==i)
        res+=String.valueOf(i);
    }
  }
  return Integer.parseInt(res);

}


----------------------------------------------------------------------------------------------------------------------






























































































