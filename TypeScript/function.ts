function add(x:number, y:number):number{
    return x+y;
}

let c = add(10,20);
console.log("Result is " +c);

function multiply(a,b){
    return a*b;
}

let d:number = multiply(40,50)
console.log("Multiplication is " +d)

//Define annonymous function
let anoAdd = function(a:number, b:number):number{
    return a+b;
}

//call annonymous function
let res = anoAdd(100,200);
console.log("Addition =" +res);

let anoAdd1: (x,y)=> number= function (a ,b) {
    return a+b;
};

function f(ini: boolean){
    if(ini){
        var x= 10;

    }return x;
}
console.log(f(true));
console.log(f(false));

const PI : number = 3.14;
console.log(PI)

let student = {
    rollNo: 95,
    name: "Nishita Khandelwal",
    Percentage: 86.5

};
console.log(student.name);