class Solution {
    public String solution(String code) {
       
        String[] st = code.split("");
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<st.length; i++){
            String it = st[i];
            if(it.equals("1") ){
                flag = !flag;
            }else{
                if(flag == false){
               if (i%2==0){
                   sb.append(it);
               }
            }
            else if(flag == true){
                if(i%2==1){
                    sb.append(it);
                }
            }
          
            
            }
        }
       
        return sb.length() == 0 ? "EMPTY" :sb.toString();
    }
}