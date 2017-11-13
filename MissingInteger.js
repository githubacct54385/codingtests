function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    
    var arr = [];
    var min = 1;
    
    for(var i = 0; i < A.length; i++) {
        if(A[i] > 0) {
            arr[A[i]] = true;
        }
    }
    
    if(!arr[min]) return min;
    
    while(arr[min]) {
        min++;
    }
    
    return min;
}