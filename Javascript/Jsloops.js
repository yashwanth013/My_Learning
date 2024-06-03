for (i = 0; i < 10; i++) {
  console.log("Namaste World!");
}

//for..In
//Objects
let animal = {
  name: "Tiger",
  leg: 4,
};
for (let key in animal) {
  console.log(key, animal[key]);
}

//Arrays
let names = ["Rahul", "Yash", "Aman", "Rishabh"];
for (let index in names) {
  console.log(index, names[index]);
}
4;
//For.. of
for (let name of names) {
  console.log(name);
}
