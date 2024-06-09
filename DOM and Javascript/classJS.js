class Product {
  constructor(itemName, price, discount, itemCode) {
    this.itemName = itemName;
    this.price = price;
    this.discount = discount;
    this.itemCode = itemCode;
  }
}
let pencil = new Product("Pencil", 20, 2, "P20");

const Product1 = class Product {
  constructor(itemName, price, discount, itemCode) {
    this.itemName = itemName;
    this.price = price;
    this.discount = discount;
    this.itemCode = itemCode;
  }
  get getDiscountValue() {
    return this.discount;
  }
  set setDiscountValue(value) {
    this.discount = value;
  }
};
let chair = new Product1("chair", 499, 15, "C10");

//super function parent and child

class Product_1 {
  constructor(itemName) {
    this.itemName = itemName;
  }
  getItemName() {
    return this.itemName + " is a Product";
  }
}

class Furniture extends Product_1 {
  constructor(itemName) {
    super(itemName);
  }
  getItemName() {
    return this.itemName + " is a Furniture";
  }
}

let pencil1 = new Product_1("Pencil", 20, 2, "P20");
let chair1 = new Furniture("chair", 499, 15, "C10");
