console.log("Hello from Javascript!!");
//variables

let a = 5;
let b = 8.7;

var c;

console.log(a+b, c, a-b, a*b); //13.7 undefined -3.6999999999999993 43.5


if(a > b) {
    console.log("Hi");
} else if(a < b) {
    console.log("Bye");
} else {
    console.log("eq");
}

for(let i = 0; i < b; i++) {
    console.log(i);
}

let i = 0;
while(i < 5) {
    console.log(i);
    i++;
}

do {
    console.log(i);
    i++
} while( i > 10);


let arr = [5, "Virat", true, undefined, null, 60];
console.log(arr);
console.log(arr.indexOf(true)); //2

arr.forEach(e => console.log(e));

arr.filter(e =>e%2 == 0).forEach(e => console.log("Filter", e));
arr.map(e =>e*2).forEach(e => console.log("Map", e));
let num = [1, 3, 6, 4, 9];
console.log(num.reduce((num, e) => {return num+e;}, 0));

let s = (a,b) => a+b;


// of prints values
for(let a of arr) {
    console.log(a);
}


//"in" print index
for(let a in arr) {
    console.log(a);
}

