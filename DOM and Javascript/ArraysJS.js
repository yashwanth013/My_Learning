const names = [
  "amal",
  "aman",
  "dewansh",
  "rahul",
  "neha",
  "akash",
  "supriya",
  "dhanvan",
];
console.log(names.indexOf("aman"));
//lastindex
console.log(names.lastIndexOf("akash"));
//includes
console.log(names.includes("akash", 2));

let channels = [
  {
    name: "Apna College",
    subscriber: 10000,
  },
  {
    name: "Apni kaksha",
    subscriber: 20000,
  },
  {
    name: "Aman Dhatarwal",
    subscriber: 30000,
  },
];
console.log(
  channels.find(function (element) {
    return element.name === "Apni Kaksha";
  })
);

let names1 = ["aman", "dhavan", "akash"];
let names2 = ["akash", "neha", "supriya"];
let names3 = [...names1, ...names2];
console.log(names3.slice(3, 5));

for (i = 0; i < names.length; i++) {
  console.log(names[i]);
}
//for..of
for (let name of names) {
  console.log(name);
}

//forEach
names.forEach(function (name, index) {
  console.log(name);
});

//join
let student = ["s", "h", "i", "v", "a"];
console.log(student.join("_"));
console.log(student.splice("_"));

//filter
let cities = [
  { name: "Mumbai", population: 3792621 },
  { name: "Delhi", population: 8792621 },
  { name: "Bangalore", population: 2792621 },
  { name: "Chennai", population: 2092621 },
  { name: "Lucknow", population: 1592621 },
];
console.log(cities.filter((city) => city.population > 3000000));
//map
console.log(cities.map((city) => city.population * 2));
