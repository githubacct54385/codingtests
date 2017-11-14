function solution(A, K) {
    // write your code in JavaScript (Node.js 6.4.0)
    if(A.length == 0) return A;
    if(K == 0) return A;
    for(var i = 0; i < K; i++) {
      A = RotateOnce(A);
    }
    return A;
}

function RotateOnce(A) {
  if(A.length == 1) return A;
  var store = A[A.length - 1];
  for(var i = A.length - 2; i >= 0; i--) {
    A[i + 1] = A[i];
  }
  A[0] = store;
  return A;
}
