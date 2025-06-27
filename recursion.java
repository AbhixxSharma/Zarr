// Backtracking-------------------------------------------
// Combination Sum---------------------------------------
int candidates[]={2,3,6,7};
    int target=7;
    // }

    List<List<Integer>> lst2= new  ArrayList<>();
        List<Integer> lst=new ArrayList<>();
         coinchange(candidates,target,0,lst,0,lst2);

        //  return lst2;
        System.out.println(lst2);
         
         

        
    }
    public static void coinchange(int [] candidates,int target,int current,List<Integer> lst,int idx,List<List<Integer>>lst2){
        if(current==target){
            lst2.add(new ArrayList<>(lst));
            return;
        }
        if(current>target){
            return;
        }
      // Why we use idx instead of 0 ?
      //  because they want to unique combination to avoid duplicate combination---------
        for(int i=idx;i<candidates.length;i++){
            lst.add(candidates[i]);
            coinchange(candidates,target,current+candidates[i],lst,i,lst2);
            lst.remove(lst.size()-1);
        }

    }


    
}
