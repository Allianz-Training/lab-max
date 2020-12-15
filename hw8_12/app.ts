/*let command: string;
let count:number;
command = 'My name is HIN';
console.log(`Length: ${command.length}`);
for(count = 0; count<= command.length; count++){
    console.log(`The character using charAT at (${count}) = ${command.charAt(count)}`);
}
for(count = 0; count<= command.length; count++){
    console.log(`The character using array at (${count}) = ${command[count]}`);
}*/
let string1: string;
string1 = 'microsoft excel';
//I am attempting to change every letter to uppercase
console.log(`1.`);
console.log(string1.toUpperCase());

let string2: string;
string2 = 'GOOGLE AND APPLE';
//I am attempting to change every letter to lowercase
console.log(`2.`);
console.log(string2.toLowerCase());

let string3: string;
string3 = 'hello world';

let n: number;
for(n = 1; n<=string3.length; n++){
    if(string3[n] === " "){
        string3 = string3[0].toUpperCase()+ string3.substring(1, n+1) + string3[n+1].toUpperCase() + string3.substring(n+2);
    }
}
console.log(`3.`);
console.log(string3);

let string4: string = 'Hello World2';
// console.log(string4.startsWith('Hello'));
// console.log(string4.endsWith('World2'));

console.log('------------------------------------')


let string5: string = 'Computer'
let string6: string = 'Death race'
let string7: string = 'republication'
console.log(string5.slice(3,6));
console.log(string6.slice(0,5));
console.log(string7.slice(2,8));

console.log('------------------------------------')

let num1:number = 1000000;
let num2:number = 1000000000;
let num3:number = 43000000000;
let num4:number = 0.00045;
let num5:number = 0.00000000056;
console.log(num1.toExponential());
console.log(num2.toExponential());
console.log(num3.toExponential());
console.log(num4.toExponential());
console.log(num5.toExponential());

console.log('------------------------------------')

let num6: number = 1e10;
let num7: number = 2e5;
let num8: number = 12e8;
let num9: number = 1e-8;
let num10: number = 12e-5;
console.log(num6.toLocaleString());
console.log(num7.toLocaleString());
console.log(num8.toLocaleString());
// console.log(num9)
console.log(num10.toString());

console.log('________________________________________')

let num11: number = 534254;
console.log(num11.toString(8));
console.log(num11.toString(2));

console.log('________________________________________')

function random(min:number,max:number){
    console.log(Math.random()*(max-min)+min);
}
random(2,4);
random(2,4);
random(2,4);
random(2,4);

console.log('________________________________________')

let student = {
    name : "abc",
    id : 123,
    height : 166
};

let student2 = Object.assign({}, student);

let student3 = {};
for(let key in student){
    student3[key] = student[key];
}
student3.id = null

student.isActive = true;
delete student.isActive;

console.log(student3)