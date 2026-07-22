function greet() {
    console.log("Good Morning");
}

function start(func) {
    func();
}

start(greet);

let a = 5;
console.log(a);

//HOISTING
greeting();
function greeting() {
    console.log("Hello");
}
greeting();

const c = setTimeout(() => {
    console.log('Heyy')
}, 1000);
//clearTimeout(c);
console.log('Hey you again');

let count = 0;
const d = setInterval(() => {
    console.log('How are you');
        count++;
    if(count > 5) {
        clearInterval(d);
    }
}, 2000);
