function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    if(A.length == 0) {
        return 0;
    }
    if(A.length == 1) {
        return 1;
    }
    
    A.sort(function(a, b) {
        return a-b;
    });
    
    var count = 1;
    for(var i = 1; i < A.length; i++) {
        if(A[i] != A[i - 1]) {
            count++;
        }
    }
    return count;
}
