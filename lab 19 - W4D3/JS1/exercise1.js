// Asks the user for two numbers. Displays the result of the subtraction of both, on screen and/or in the console

function substract(x, y) {
  return x - y;
}

let minuend = prompt("Give me the minuend: ");

let subtrahend = prompt("Give me the subtrahend: ");

console.log(
  "the result of subtracting " +
    minuend +
    " and " +
    subtrahend +
    " is: " +
    substract(minuend, subtrahend)
);
