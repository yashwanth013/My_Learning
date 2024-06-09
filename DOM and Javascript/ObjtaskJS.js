const createproduct = {
  itemname: "flower",
  price: 40,
  discount: 20,
  itemcode: "F40",
};

//factory function

function createProduct(name, price, discount, code) {
  return {
    itemname: name,
    price: price,
    discount: discount,
    itemcode: code,
  };
}
const football = createProduct("football", 480, 10, "F30");

//constructor function
function Product(name, price, discount, code) {
  this.itemname = name;
  this.price = price;
  this.discount = discount;
  this.itemcode = code;
  this.discountvalue = function () {
    return (price * discount) / 100;
  };
}
const mobile = new Product("samsung S23", 60000, 15, "SS23");

//square area

let square = {
  side: 5,
  get area() {
    return this.side * this.side;
  },
};
//square.side = 10;
console.log(square.area);

//stringconcat using separator

function stringConcat(separator, ...strings) {
  let returnVal = "";
  strings.forEach((string, i) => {
    if (i == strings.length - 1) {
      returnVal += string;
    } else {
      returnVal += string + separator;
    }
  });
  return returnVal;
}
stringConcat();
console.log(stringConcat("+", "asdssda", "addawd", "asdasda"));

//excersie resturcturing
//without rstructure
arr = [1, 2, 3, 4, 5, 6, 7, 8];
let first = arr[0];
let second = arr[1];
let third = arr[2];
let other = arr.slice[3];
console.log(first);
console.log(second);
console.log(third);
console.log(other);
//with restructure

let [first1, second2, third3, ...other1] = [1, 2, 3, 4, 5, 6, 7, 8];

console.log(first1);
console.log(second2);
console.log(third3);
console.log(other1);

const obj = {
  1: "a",
  1: "b",
  [1]: "c",
};
console.log(obj["1"]);

function Person(name) {
  this.name = name;
  return name;
}
const alice = new Person("Alice");
console.log(alice);

class Animal {}
class Cat extends Animal {}
const cat = new Cat();
console.log(cat instanceof Animal);
