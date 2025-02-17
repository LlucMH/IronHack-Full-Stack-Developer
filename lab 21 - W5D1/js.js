// 1- NIGHTCLUB ENTRY
// At the entrance of a nightclub, the customer is asked how old they are.
// Give a different response if the age is greater than, less than, or equal to 18 years.

let age = prompt("How old are you?");

if (age < 18) {
  console.log("You are under 18");
} else if ((age = 18)) {
  console.log("You are 18 years old");
} else if (age > 18) {
  console.log("You are over 18 years old");
}

// 2 - FIVE COLORS
// The user is asked to choose a color (blue, green, red, yellow, or violet)
// and given a response related to the chosen color.
// Example: "Blue is like the sea, as long as the sky is blue (and it's daytime)."
// Provide a different response if they do NOT choose one of the above colors.

let color = prompt("Choose a color (blue, green, red, yellow, or violet)");

switch (color.toLowerCase()) {
  case "blue":
    console.log("Blue is like the ocean, deep and mysterious.");
  case "green":
    console.log("Green is the color of nature, full of life and energy.");
  case "red":
    console.log("Red is passion and fire, strong and bold.");
  case "yellow":
    console.log("Yellow shines like the sun, bringing warmth and happiness.");
  case "violet":
    console.log("Violet is the color of creativity and dreams.");
  default:
    console.log("I don't have a response for this color.");
}

// 3- LAMP DOES NOT TURN ON
// Ask two prompt questions (yes/no).
// You can nest two conditionals (one inside another).
// Create the conditional code for the algorithm represented by the flowchart.

console.log("The lamp does not work. ");

let isPlugged = prompt("Is it plugged in?");

if (!isPlugged) {
  console.log("Plug it in");
} else {
  let isBurned = prompt("Is the bulb burned out?");
  if (isBurned) {
    console.log("Replace the bulb");
  } else {
    console.log("Buy a new lamp");
  }
}
