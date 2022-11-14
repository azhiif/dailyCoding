class Solution {
public:
    bool isPalindrome(int x) {
        long  temp,l,rev;
        temp = x;
        rev =0;
        
      
        while(temp>0){
            
            l=temp%10;
            rev = rev*10+(temp%10);
            temp=temp/10;
        }
        
        if(rev==x){
            return true;
        }
   else return false;
}};