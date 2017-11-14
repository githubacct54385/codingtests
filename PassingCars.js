function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    var count = 0;
    var increment = 0;
    var n = A.length;
    for(var i = 0; i < n; i++) {
        if(A[i] == 0) {
            increment++;
        }
        else if(A[i] == 1) {
            count += increment;
        }
        if(count > 1000000000) return -1;
    }
    return count;
}
