function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    var n = A.length + 1;
    var total = n * (n + 1) / 2;
    for(var i = 0; i < A.length; i++) {
        total -= A[i];
    }
    return total;
}
