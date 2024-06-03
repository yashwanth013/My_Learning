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
