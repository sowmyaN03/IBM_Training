let obj = {
    name: "Aatharva",
    role: "Actor",
    exp: 5
}
console.log(obj.name);

a = 5;
b = 10;
let cal = {
    sum: (...a) => a.reduce((acc, e) => acc + e, 0),
    sub: (a, b) => a - b,
    mul: (a, b) => a * b,
    div: (a, b) => a / b
};
console.log(cal.sum(1, 3, 4 ,2 ,5));
console.log(cal.sub(a,b));
console.log(cal.mul(a,b));
console.log(cal.div(a,b));

let arr = [1, 2, 3];
let arr1 = [4,5,6,7];
console.log(arr +","+arr1)
console.log(...arr, ...arr1);