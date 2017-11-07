https://www.w3schools.com/js/js_htmldom_elements.asp

// Get element by ID //

<!DOCTYPE html>
<html>
<body>

<p id="intro">Hello World!</p>

<p>This example demonstrates the <b>getElementById</b> method!</p>

<p id="demo"></p>

<script>
var myElement = document.getElementById("intro");
document.getElementById("demo").innerHTML = 
"The text from the intro paragraph is " + myElement.innerHTML;
</script>

</body>
</html>

// Get element by Tag Name //

<!DOCTYPE html>
<html>
<body>

<p>Hello World!</p>

<p>The DOM is very useful.</p>
<p>This example demonstrates the <b>getElementsByTagName</b> method</p>

<p id="demo"></p>

<script>
var x = document.getElementsByTagName("p");
document.getElementById("demo").innerHTML = 
'The first paragraph (index 0) is: ' + x[0].innerHTML;
</script>

</body>
</html>

// Get Element by Class Name

<!DOCTYPE html>
<html>
<body>

<p>Hello World!</p>

<p class="intro">The DOM is very useful.</p>
<p class="intro">This example demonstrates the <b>getElementsByClassName</b> method.</p>

<p id="demo"></p>

<script>
var x = document.getElementsByClassName("intro");
document.getElementById("demo").innerHTML = 
'The first paragraph (index 0) with class="intro": ' + x[0].innerHTML;
</script>

</body>
</html>
