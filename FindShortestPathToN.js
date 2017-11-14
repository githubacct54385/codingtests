<p id="arrayIntro">  
</p>
<p id=arrayOutro>
<p id="demo"></p>
<p id="textResult">
</p>

document.getElementById("arrayIntro").innerHTML += "Find the shortest path to N by multiplying by 2 or adding by 1 to the previous number.  Start with A[0] = 1";

var N = 5000000;

document.getElementById("demo").innerHTML = 
"For N = " + N + ", the shortest path has " + FindShortestPath(N) + " entries.";

// Find the shortest path to N by multiplying by 2 or adding by 1
function FindShortestPath(N) {
  var count = 0;
  return Recursive(N, count + 1);
}

function Recursive(N, count) {
	if(N == 1) return count;
  if(N % 2 == 0) {
  	return Recursive(N / 2, ++count);
  }
  return Recursive(N - 1, ++count);
}
