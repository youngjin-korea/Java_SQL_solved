function solution(n, k) {
    let IsUnder = true;
    let num = 1;
    var answer = [];
   
    while(IsUnder){
        if(num*k <= n){
            answer.push(num*k);
            num++;
        }else{
            IsUnder = false;
        }
    }
    

    return answer;
}