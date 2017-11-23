// Problem Description
// https://codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
// My Codility Test Results
// https://codility.com/demo/results/training9ATNGN-ZFY/
private static int TapeEquilibrium(int[] A, int n) {
        int lowerSum = 0;
        int upperSum = 0;
        int smallestSum = Integer.MAX_VALUE;
        if(n == 2)
            return Math.abs(A[1] - A[0]);
        for(int i = 0; i < n; i++) {
            upperSum += A[i];
        }
        for(int i = 0; i < n - 1; i++) {
            lowerSum += A[i];
            upperSum -= A[i];
            int absVal = Math.abs(lowerSum - upperSum);
            smallestSum = Math.min(absVal, smallestSum);
        }
        return smallestSum;
    }
