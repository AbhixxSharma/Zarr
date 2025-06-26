//Container with most Water--------------//
1. Here we have two Approach 
1(a). Brute Force Approach 
first we   will height. height will be min  because to avoid overflow of water.
then find width = j - i;
then find area h*w.
After that  find maximum of (area , maxw);
// ------------------------------TWO POINTER SUMMARY----------------------------------------//
2 Two pointer Approach.   //Important//
first of all we will take two point left and right
left start with index 0 and right length of array
first we   will height. height will be min  because to avoid overflow of water.
then find width = j - i;
then find area h*w.
After that  find maximum of (area , maxw);
 then in the last we check if nums[l] < nums[r] 
then increase left + 1.
otherwise  decrease right -1. and return maxw;

//------------------------------------BRUTE FORCE--------------------------///
   for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int h= Math.min(height[i],height[j]);
                int w= j-i;
                int area= h*w;
                maxw= Math.max(maxw,area);
            }
        }
        return maxw;
}
 }


///-------------------------------------TWO POINTER --------------------------///
class Solution {
    public int maxArea(int[] height) {
        int maxw=0;


        int l=0;
        int r=height.length-1;
        while(l<r){
            int h= Math.min(height[l],height[r]);
            int w=r-l;
            int area= h*w;
            maxw=Math.max(maxw,area);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxw;
