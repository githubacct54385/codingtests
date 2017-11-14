function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    if (A.length < 3) return 0;       
        A.sort(function(a, b) {
            return a - b;
        });
        for (var i = 2; i < A.length; i++) {
            if (A[i - 2] + A[i - 1] > A[i]) return 1;
        }
        return 0;
}
