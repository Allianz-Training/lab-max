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
var string1;
string1 = 'microsoft excel';
//I am attempting to change every letter to uppercase
console.log("1.");
console.log(string1.toUpperCase());
var string2;
string2 = 'GOOGLE AND APPLE';
//I am attempting to change every letter to lowercase
console.log("2.");
console.log(string2.toLowerCase());
var string3;
string3 = 'hello world';
var n;
for (n = 1; n <= string3.length; n++) {
    if (string3[n] === " ") {
        string3 = string3[0].toUpperCase() + string3.substring(1, n + 1) + string3[n + 1].toUpperCase() + string3.substring(n + 2);
    }
}
console.log("3.");
console.log(string3);
var string4 = 'Hello World2';
// console.log(string4.startsWith('Hello'));
// console.log(string4.endsWith('World2'));
console.log('------------------------------------');
var string5 = 'Computer';
var string6 = 'Death race';
var string7 = 'republication';
console.log(string5.slice(3, 6));
console.log(string6.slice(0, 5));
console.log(string7.slice(2, 8));
console.log('------------------------------------');
var num1 = 1000000;
var num2 = 1000000000;
var num3 = 43000000000;
var num4 = 0.00045;
var num5 = 0.00000000056;
console.log(num1.toExponential());
console.log(num2.toExponential());
console.log(num3.toExponential());
console.log(num4.toExponential());
console.log(num5.toExponential());
console.log('------------------------------------');
var num6 = 1e10;
var num7 = 2e5;
var num8 = 12e8;
var num9 = 1e-8;
var num10 = 12e-5;
console.log(num6.toLocaleString());
console.log(num7.toLocaleString());
console.log(num8.toLocaleString());
// console.log(num9)
console.log(num10.toString());
console.log('________________________________________');
var num11 = 534254;
console.log(num11.toString(8));
console.log(num11.toString(2));
console.log('________________________________________');
function random(min, max) {
    console.log(Math.random() * (max - min) + min);
}
random(2, 4);
random(2, 4);
random(2, 4);
random(2, 4);
console.log('________________________________________');
var student = {
    name: "abc",
    id: 123,
    height: 166
};
var student2 = Object.assign({}, student);
var student3 = {};
for (var key in student) {
    student3[key] = student[key];
}
student3.id = null;
student.isActive = true;
delete student.isActive;
console.log(student3);
//# sourceMappingURL=app.js.map