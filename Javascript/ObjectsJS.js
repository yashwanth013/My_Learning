// Object
let animal = {
  name: "Zebra",
  legs: 4,
};
console.log(animal);
//Dot notation
console.log(animal.name);
// Bracket notation
console.log(animal[name]);

//Arrays
let books = ["book1", "book2", "book3"];
console.log(books);
console.log(books[0]);
console.log(books[4]);

//functions

function namasteworld() {
  console.log("Namaste World!");
}
namasteworld();

//passing value parameter

function welcome(firstName, lastName) {
  console.log("Namaste" + " " + firstName + " " + lastName);
}
welcome("Yashwanth", "Kantha");
welcome("Demon", "Salvatore");

function addition(a, b) {
  return a + b;
}
console.log(addition(5, 5));
