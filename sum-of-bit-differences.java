
class Solution {
    long sumBitDifferences(int[] arr, int n) {
         // code here
         long num=1,ans=0,hai=0,nhiHai=0;
         for(int i=0;i<21;i++){
             for(int j=0;j<n;j++){
                 if((arr[j]&num)!=0)hai++;
                 else nhiHai++;
             }
             ans+=2*hai*nhiHai;
             hai=0;
             nhiHai=0;
             num<<=1;
         }
         return ans;
     }
 }
 