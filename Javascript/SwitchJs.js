var fruittype = prompt("What fruit you want?");
switch (fruittype) {
  case "Orange":
    console.log("Orange hai 80Rs Kilo.");
    break;
  case "Apple":
    console.log("Apple hai 50Rs Kilo.");
    break;
  case "grapes":
    console.log("grapes hai 90Rs Kilo.");
    break;
  case "mango":
    console.log("mango hai 60Rs Kilo.");
    break;
  case "banana":
    console.log("banana hai 30Rs Dozen.");
    break;
  default:
    console.log(`${fruittype} is not available today, come tomorrow`);
}
console.log("Do you need anything else?");
