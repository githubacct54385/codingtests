function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    if(A.length < 3) return 0;
    var N = A.length;
    A.sort(function(a,b) {
        return a - b;
    });
    if (A[0] * A[1] < 0)
        return Math.max(A[0] * A[1] * A[N - 1], A[N - 3] * A[N - 2] * A[N - 1]);
    else
        return Math.max(A[0] * A[1] * A[N - 1], A[N - 1] * A[N - 2] * A[N - 3]);
}
