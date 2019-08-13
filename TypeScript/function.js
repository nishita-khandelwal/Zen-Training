function add(x, y) {
    return x + y;
}
var c = add(10, 20);
console.log("Result is " + c);
function multiply(a, b) {
    return a * b;
}
var d = multiply(40, 50);
console.log("Multiplication is " + d);
//Define annonymous function
var anoAdd = function (a, b) {
    return a + b;
};
//call annonymous function
var res = anoAdd(100, 200);
console.log("Addition =" + res);
var anoAdd1 = function (a, b) {
    return a + b;
};
function f(ini) {
    if (ini) {
        var x = 10;
    }
    return x;
}
console.log(f(true));
console.log(f(false));
var PI = 3.14;
console.log(PI);
var student = {
    rollNo: 95,
    name: "Nishita Khandelwal",
    Percentage: 86.5
};
console.log(student.name);
