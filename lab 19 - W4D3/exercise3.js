/*
Ask the user for the radius to calculate the area of ​​a circle. 
Find the formula to calculate the surface of the circle and the value 
of PI (with 4 decimal places).
*/

function areaCircle(radius) {
  return 3.14159265359 * radius ** 2;
}

let radius = prompt("Give me the radius of the circle ");

console.log("The area of ​​the circle is: " + areaCircle(radius).toFixed(4));
