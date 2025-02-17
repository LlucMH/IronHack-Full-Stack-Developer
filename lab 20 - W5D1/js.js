// 1- BECA ESTUDIANTE
// Para conseguir una beca en Hack-Iron el estudiante debe cumplir las siguientes condiciones:
//  1- Que sea mayor o igual a 18 años y resida en Barcelona
//  2- O bien, que sea mayor de 30 años y tenga familia numerosa
//  3- O bien, Que tenga entre 12 y 18 años y sea un geni@ de la programación
// Recuerda que puedes usar los métodos toLowerCase() o toUpperCase() para facilitar la comparación de strings.

let age = prompt("How old are you? ");
let city = prompt("In which city do you live? ");
let hasLargeFamily = prompt("Do you have a large family? (true/false) ");
let isGenius = prompt("Are you a programming genius? (true/false) ");

if (age >= 18 && city.toLowerCase() == "barcelona") {
  console.log("CONGRATULATIONS! You have a scholarship at Hack-Iron");
} else if (age > 30 && hasLargeFamily) {
  console.log("CONGRATULATIONS! You have a scholarship at Hack-Iron");
} else if (age > 12 && age < 18 && isGenius) {
  console.log("CONGRATULATIONS! You have a scholarship at Hack-Iron");
} else {
  console.log("We’re sorry, we cannot offer you a scholarship at Hack-Iron");
}

// 2- COCHE NO ARRANCA
// Solucionar mediante condicionales el siguiente algoritmo:
// Oh! Estás aparcado en la calle, pero el coche no arranca...
// Si vives cerca AND tienes ganas de caminar, te vas andando y ya lo arreglarás mañana. Si no, realiza las siguientes comprobaciones:
//  - Tiene gasolina?
//      * No => hay que poner gasolina -> Tienes dinero?
//              • Si => poner gasolina
//              • No => vas en metro
//      * Sí que tiene gasolina: -> Tiene batería?
//              • No => recargar batería
//              • Sí => pásate por el mecánico

let hasGasoline = prompt("Do you have gasoline? (true/false) ");

if (!hasGasoline) {
  console.log("You need to put gasoline.");
  let hasMoney = prompt("Do you have money? (true/false) ");
  if (hasMoney) {
    console.log("Put gasoline");
  } else if (!hasMoney) {
    console.log("Go by subway");
  }
} else {
  console.log("It has gasoline.");
  let hasBattery = prompt("Does it have battery? (true/false) ");
  if (hasBattery) {
    console.log("Charge the battery");
  } else if (!hasBattery) {
    console.log("Go to the mechanic");
  }
}
