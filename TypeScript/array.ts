let numArr: number[] = [10,20,30,40,50];

let cities:Array<string>=["Mumbai","Pune","Banglore"];

let arr:Array<number>=[1,2,3,4,5];

console.log(numArr, "\n",cities)

console.log("Using forEach loop");
arr.forEach(arr=>{
    console.log(arr);
});



let arr1 = [100,200,300,400];
console.log("size of array1: " +arr1.length);

//using for...in loop
for(let i in arr1){
    console.log(arr1[i]);
}

//using for....of loop
for(let e of arr1){
    console.log(e)
}

//Declarev a tuple type
let x: [string,number];
//Initialize it
x= ["hello",10];
console.log(x)

console.log(x[0].substr(2));

let y: [string,string];

y= ["Nishita","Khandelwal"];
console.log(y)

console.log(y[1].substr(1));

