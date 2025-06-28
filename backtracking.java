// Ques 1 Combination ----------------------------
// Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

// You may return the answer in any order.
// Example 1:
// Input: n = 4, k = 2
// Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]



 public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> lst =new ArrayList<>();
        List<Integer> lst1= new ArrayList<>();
       permutation(n,lst,lst1,k,1);
        return lst;

        
    }
//  This functions is used to make the combinations using backtracking
//  1.base case
// 2 . small calculation
// 3. recursive calls
// if u are doing to backtracking then using backtracking .......

    public void permutation(int n, List<List<Integer>>lst ,List<Integer>lst1,int k,int idx){
        if(lst1.size()==k){
            lst.add(new ArrayList<>(lst1));
            // System.out.print(lst);
            return;
        }
        // System.out.print(lst);
        
     
        
          for(int i=idx;i<=n;i++){
         //  why we used idx instead of 0 because to safe duplicate element>>>>>>>>>>>>
             lst1.add(i);

               permutation(n,lst,lst1,k,i+1);
               lst1.remove(lst1.size()-1);
         
    }
    }

//  combination 2----------------------------------------------------------
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ll =new ArrayList<>();
        List<Integer> lst= new ArrayList<>();
                Arrays.sort(candidates);

       sumComb(lst,candidates,target,ll,0,0);
        return  ll;
        
    }
    void sumComb(List<Integer>lst,int [] candidates,int target,List<List<Integer>>ll,int curr,int ind){
        if(target == 0){
            ll.add(new ArrayList<>(lst));
            return;

        }
        
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1])continue;
            // if(lst.contains(candidates[i])) continue;
            if(candidates[i] >target) break;

            lst.add(candidates[i]);
            sumComb(lst,candidates,target-candidates[i],ll,curr,i+1);
            lst.remove(lst.size()-1);
        }
    }


//  comniation 3 --------------------------------------------------------------------

  public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> lst= new ArrayList<>();

        List<List<Integer>>ll = new ArrayList<>();
        sumCombi(k,n,lst,ll,0,1);
        return ll;


        
    }
    void sumCombi(int k,int n,List<Integer> lst,List<List<Integer>>ll,int curr,int idx){
        if(curr == n && lst.size()== k){
            ll.add(new ArrayList<>(lst));
            return ;
        }
        if(curr >n || lst.size()>=k){
            return;
        }
        for(int i=idx;i<=9;i++){
            // if(curr +i>n) break;

            
            lst.add(i);
            sumCombi(k,n,lst,ll,curr+i,i+1);
            lst.remove(lst.size()-1);
