function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    var N = A.length;
    var sum = (N * (N+1)) / 2;
    var array = [];
    for (var i = 0; i < A.length; i++) {
        sum-=A[i];
        if(array[A[i]]) {
            return 0;
        }
        array[A[i]] = true;
    }
    if(sum == 0) return 1;
    else return 0;    
}
