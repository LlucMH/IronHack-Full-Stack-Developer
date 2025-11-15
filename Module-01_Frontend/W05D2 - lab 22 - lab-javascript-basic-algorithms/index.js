// -----------------------------------------------------------
// Iteration 1: Names and Input
// -----------------------------------------------------------
const hacker1 = "Alice";
console.log(`The driver's name is ${hacker1}`);

const hacker2 = "Bob";
console.log(`The navigator's name is ${hacker2}`);

// -----------------------------------------------------------
// Iteration 2: Conditionals
// -----------------------------------------------------------
if (hacker1.length > hacker2.length) {
  console.log(
    `The driver has the longest name, it has ${hacker1.length} characters.`
  );
} else if (hacker2.length > hacker1.length) {
  console.log(
    `It seems that the navigator has the longest name, it has ${hacker2.length} characters.`
  );
} else {
  console.log(
    `Wow, you both have equally long names, ${hacker1.length} characters!`
  );
}

// -----------------------------------------------------------
// Iteration 3: Loops
// -----------------------------------------------------------
let driverNameSpaced = "";
for (let char of hacker1) driverNameSpaced += char.toUpperCase() + " ";
console.log(driverNameSpaced.trim());

let navigatorReversed = "";
for (let i = hacker2.length - 1; i >= 0; i--) navigatorReversed += hacker2[i];
console.log(navigatorReversed);

if (hacker1.localeCompare(hacker2) < 0) {
  console.log("The driver's name goes first.");
} else if (hacker1.localeCompare(hacker2) > 0) {
  console.log("Yo, the navigator goes first, definitely.");
} else {
  console.log("What?! You both have the same name?");
}

// -----------------------------------------------------------
// Bonus 1
// -----------------------------------------------------------
const longText = `Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ornare nibh nec congue scelerisque. Nullam vel suscipit magna. Maecenas et lacus metus. Vestibulum et feugiat risus, vitae efficitur dolor. Ut ut diam eget orci interdum maximus. Nam vel sapien mi. Aenean id lacus ac metus scelerisque efficitur sed ut elit. Cras dui nulla, mattis at tortor et, consequat dapibus sapien. Nunc non arcu non libero fringilla volutpat pulvinar in velit. Cras a elit in ante vestibulum tempus. Sed et nibh a metus luctus facilisis sed ut leo. Aenean vestibulum lorem neque, luctus lobortis nunc rutrum in. Nam aliquet, felis quis ullamcorper viverra, tellus dolor molestie lectus, ut rutrum nisl ipsum sed nisi. Maecenas eget elementum sem.

Nulla facilisi. In sed metus ut nisl commodo malesuada. Proin rhoncus metus nisi, eget dictum nisi faucibus in. Nam viverra, libero gravida iaculis vestibulum, mauris orci faucibus dui, sit amet aliquam diam orci id est. Curabitur interdum lacinia risus non mattis. Suspendisse ipsum lectus, vehicula nec pulvinar a, aliquam in augue. Phasellus vitae magna consectetur, ultrices sapien a, dapibus dolor. Mauris aliquet fringilla massa, id efficitur turpis fermentum nec. Fusce tristique semper nisl et laoreet. Cras rhoncus ac purus pretium interdum. Aenean in pulvinar nibh. Ut mattis diam sit amet lacinia euismod. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Sed eu lectus nisi. Suspendisse sit amet justo dui. Nulla scelerisque maximus tempor.

Nulla porta velit non tellus convallis imperdiet. Mauris scelerisque faucibus sodales. Proin sit amet augue ac diam consequat lobortis at non lacus. Cras bibendum eros at magna dignissim, id auctor ligula bibendum. Interdum et malesuada fames ac ante ipsum primis in faucibus. In facilisis, nibh eu sollicitudin efficitur, risus velit gravida arcu, id tincidunt diam risus quis purus. Morbi ut convallis ex. Duis rhoncus orci vitae sem venenatis suscipit. Pellentesque enim justo, malesuada in tempus nec, scelerisque quis velit. Aliquam erat volutpat.

Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec suscipit nisi tortor. Phasellus consectetur ut lorem id efficitur. Suspendisse fermentum libero eu elit ultrices, non gravida nisi pellentesque. Vivamus faucibus augue nulla, eget efficitur lacus dapibus quis. Vestibulum convallis euismod nibh, ut pretium odio consectetur id. Donec sagittis congue nulla, ut suscipit orci fringilla et.

Vivamus ac ante vel nulla posuere tincidunt quis et quam. Praesent viverra, nibh nec pharetra lobortis, urna dolor pretium felis, eu commodo nulla lorem et quam. Nunc ultricies augue id nibh sollicitudin sodales. Nunc risus orci, efficitur et volutpat at, maximus eget sapien. Morbi rutrum vestibulum augue, eget cursus justo luctus et. Duis sed risus leo. Sed ut lectus malesuada, ultrices nibh a, vestibulum felis. Nunc elementum tellus dui, maximus porttitor mauris ullamcorper sit amet. Suspendisse ligula elit, aliquam sit amet pharetra at, blandit et dui. Duis mattis lorem a tortor bibendum, sed faucibus orci sollicitudin. Curabitur ornare sit amet diam id porttitor. Nulla placerat id dui in ultrices. Integer ultrices feugiat ligula vitae gravida. Nam condimentum et arcu quis fermentum. Nulla nibh metus, egestas quis tellus nec, scelerisque aliquam libero.`;

const wordCount = longText.split(/\s+/).length;
console.log(`Number of words: ${wordCount}`);

const etCount = longText.match(/\bet\b/gi)?.length || 0;
console.log(`Number of times "et" appears: ${etCount}`);

// -----------------------------------------------------------
// Bonus 2
// -----------------------------------------------------------
const phraseToCheck = "A man, a plan, a canal, Panama!";
/* 
const phraseToCheck = "Amor, Roma";
const phraseToCheck = "race car";
const phraseToCheck = "stack cats";
const phraseToCheck = "step on no pets";
const phraseToCheck = "taco cat";
const phraseToCheck = "put it up";
const phraseToCheck = "Was it a car or a cat I saw?";
const phraseToCheck = "No 'x' in Nixon";
*/

let cleaned = "";

for (let i = 0; i < phraseToCheck.length; i++) {
  const char = phraseToCheck[i].toLowerCase();
  if (/[a-z0-9]/.test(char)) cleaned += char;
}

let isPalindrome = true;

for (let i = 0; i < cleaned.length / 2; i++) {
  if (cleaned[i] !== cleaned[cleaned.length - 1 - i]) {
    isPalindrome = false;
    break;
  }
}

console.log(isPalindrome ? "It's a palindrome!" : "Not a palindrome.");
