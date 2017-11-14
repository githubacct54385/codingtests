function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    var minAvg = 10000;
    var returnIndex = 0;
    for (var i = 0; i < A.length - 1; i++) {
        var avg = (A[i] + A[i + 1]) / 2.0;

        if (i < A.length - 2) {
            var threeAvg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            avg = Math.min(avg, threeAvg);
        }
        if (avg < minAvg) {
            minAvg = avg;
            returnIndex = i;
        }
    }
    return returnIndex;
}
