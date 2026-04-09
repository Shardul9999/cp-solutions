class Solution {
    public String defangIPaddr(String address) {
        String ans = address.replace(".", "[.]");
       
        return ans;

        // for(int i=0; i<address.length(); i++){
        //     if(s.charAt(i+1) == '.'){

        //     }
        // }
    }
}