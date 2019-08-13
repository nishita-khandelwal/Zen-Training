var Student = /** @class */ (function () {
    function Student(rollNo, name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    Student.prototype.display = function () {
        console.log(this.rollNo + " " + this.name);
    };
    return Student;
}());
var add1 = function (a, b) { return a + b; };
console.log("Addition is", add1(10, 20));
var message = function () {
    console.log("Hello World");
    console.log("Lamda!!!");
};
message();
var raiseValue = function (x) { return x + 1; };
console.log(raiseValue(10));
