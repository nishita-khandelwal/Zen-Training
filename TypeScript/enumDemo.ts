enum Color {Red,Green,Blue}
let c:Color = Color.Blue;
console.log(c);
console.log(Color[c])

enum Days {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
let d:Days = Days.Monday;
//console.log(d);
console.log(Days[d])
for(let d in Days){
    console.log(Days[d])
}



let colorName: string = Color[2];
console.log(colorName)

enum Color1 {Red = 1,Green , Blue = 4}
var c1: Color1 = Color1.Green;
console.log(c1)

