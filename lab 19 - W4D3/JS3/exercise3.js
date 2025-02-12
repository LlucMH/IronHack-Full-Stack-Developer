/*
Ask the user for the radius to calculate the area of ​​a circle. 
Find the formula to calculate the surface of the circle and the value 
of PI (with 4 decimal places).
*/

const pi = 3.1416;

function areaCircle(pi, radius) {
  return pi * radius ** 2;
}

let radius = prompt("Give me the radius of the circle ");

let area = areaCircle(pi, radius).toFixed(4);

console.log("The area of ​​the circle is: " + area);
