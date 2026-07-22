
function sum(x=10, y) {
    console.log(x+y);
    return x+y;
}
console.log(sum(undefined,8)); // takes the default x value


//let-> block scope
//var -> function scope (which can be used globally)

function closure() {
    let a = 5;
    console.log(a);

    function inner() {
        // let a = 2; // this is considered as its prioritized in thi block
        console.log(a);
    }
    inner();
}
closure();


let l = 10;
var v = 20;
{
    l = 5;
    v = 15;
    console.log("Inside", l);
    console.log("Inner", v);
}

console.log("outside", l);
console.log("Outer", v);

const c = 6;
//const c = 5; cannot be changed as it is constant


let str = "Virat";
console.log(str.length);
console.log(str.toUpperCase());
console.log(str.includes("Vi"));

console.log("This is my program " + str +"!!");
console.log(`This is also my program only ${str}`)