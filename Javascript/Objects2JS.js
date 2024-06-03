let lecture = 10;
let section = 3;
let title = "Javascript";

const course = {
  lecture: 10,
  section: 3,
  title: "Javascript",
  notes: {
    introduction: "Welcome to JS course",
  },
  enroll() {
    console.log("you are succesfully enrolled");
  },
};

course.enroll();
console.log(course);

// Factory function

function createCourse(lecture, section, title) {
  return {
    lecture: lecture,
    section: section,
    title: title,
    enrolled() {
      console.log("you are successfully enrolled");
    },
  };
}

course1 = createCourse(10, 3, "Javascript");
console.log(course1);
course1.enrolled();

// Constructor function

function Course(title) {
  (this.title = title),
    (this.enrolll = function () {
      console.log("you are successfully enrolled");
    });
}

const course_1 = new Course("Javascript");
course_1.enrolll();
console.log(course_1);

const Course_2 = new Function(
  "title",
  `this.title = title,
    this.enroll = function () {
      console.log("you are successfully enrolled");
    }

`
);
const course_2 = new Course_2("Javascript");
course_2.enroll();
console.log(course_2);

//Primitive datatype
//Pass by value

let number = 10;
let number_2 = number;
number = 15;

console.log(number);
console.log(number_2);

//Reference datatype
//Pass by reference
let obj = { number: 10 };
let obj2 = obj;
obj.number = 15;

console.log(obj);
console.log(obj2);

const course_3 = {
  title: "Javascript",
  enroll() {
    console.log("you are successfully enrolled");
  },
};
const course_4 = { ...course_3 };
course_4.title = "C++";
console.log(course_3);
console.log(course_4);
//Object with for in loop
for (let key in course_4) {
  console.log(key, course_4[key]);
}
//Object as array with for of loop
for (let key of Object.keys(course_4)) {
  console.log(key, course_4[key]);
}
