class Student{
    rollNo: number;
    name: string;
    constructor(rollNo,name){
        this.rollNo = rollNo;
        this.name = name;
    }
    display(): void{
        console.log(this.rollNo + " " + this.name);
    }
}

let add1 = (a,b) => a+b;

console.log("Addition is",add1(10,20));

let message = () => {
    console.log("Hello World")
    console.log("Lamda!!!")
}
message();
let raiseValue = x => x+1;
console.log(raiseValue(10))