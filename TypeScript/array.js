var numArr = [10, 20, 30, 40, 50];
var cities = ["Mumbai", "Pune", "Banglore"];
var arr = [1, 2, 3, 4, 5];
console.log(numArr, "\n", cities);
console.log("Using forEach loop");
arr.forEach(function (arr) {
    console.log(arr);
});
var arr1 = [100, 200, 300, 400];
console.log("size of array1: " + arr1.length);
//using for...in loop
for (var i in arr1) {
    console.log(arr1[i]);
}
//using for....of loop
for (var _i = 0, arr1_1 = arr1; _i < arr1_1.length; _i++) {
    var e = arr1_1[_i];
    console.log(e);
}
//Declarev a tuple type
var x;
//Initialize it
x = ["hello", 10];
console.log(x);
console.log(x[0].substr(2));
var y;
y = ["Nishita", "Khandelwal"];
console.log(y);
console.log(y[1].substr(1));
