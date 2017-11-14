// https://jsfiddle.net/cp3jw8b6/ 
// Please feel free to take a look at this demo in JSFiddle


<p id="arrayIntro">  
</p>
<p id=arrayOutro>
<p id="demo"></p>


var A = [1, 5, 3, 19, 18, 25];
var B = [8, 24, 3, 20, 1, 17];
var C = [7, 21, 3, 42, 3, 7];
var D = [3, 6, 10, 14, 17, 18];
document.getElementById("arrayIntro").innerHTML += "For the Array:" + D;

var result = MinDiff(D, D.length);

var myElement = document.getElementById("intro");


document.getElementById("demo").innerHTML = 
"The minimum difference of any two elements is: " + result;


function MinDiff(A, N) {
	
  A.sort(function(a,b) {
  	return a-b;
  });
  
  var minDiff = 1000000;
  for(var i = 0; i < N - 1; i++) {
  		if(A[i + 1] - A[i] < minDiff) {
      	minDiff = A[i + 1] - A[i];
      }
  }
  return minDiff;
}
