let String = "My name is Yash";
console.log(String);
console.log(typeof String);
let concatString = String + " Roll E7";
console.log(concatString);

let numberString = "123";
Number(numberString);
console.log(numberString);
numberString.toString();
console.log(numberString);

let numberString2 = "234";

let outputMsg = String + " Roll E7 " + numberString2;
console.log(outputMsg);

let Mydetails = `${String} My Roll Number Is E7 and My Score is ${numberString2}`;
console.log(Mydetails);

let favShow = "Game Of Thrones";

console.log(favShow.length);
console.log(favShow[0]);
console.log(favShow[favShow.length - 1]);
console.log(favShow.indexOf("Of"));
console.log(favShow.slice(5, 7));

var String2 = "My name IS Khan";
console.log(String2.toUpperCase());
console.log(String2.toLowerCase());
