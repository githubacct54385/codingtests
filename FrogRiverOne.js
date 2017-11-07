// Problem Desc: https://codility.com/programmers/lessons/4-counting_elements/frog_river_one/
// Solution Assistance from: http://codilityjs.guru/item/frog-river-one

function FrogRiverOne(X, A) {
    var len = A.length;
    var leaves = [];
    var elements = 0;
    
    for(var i = 0; i < len; i++) {
        var pos = A[i];
        if(pos <= X && !leaves[pos]) {
            leaves[pos] = true;
            elements++;
            if(elements === X) return i;
        }
    }
}

var A = [1, 3, 1, 4, 2, 3, 5, 4];
var x = 5;
print(FrogRiverOne(x, A));
