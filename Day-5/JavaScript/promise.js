function getData() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if(1 != 1){
                resolve("Data received");
            }
            else {
                reject("Data rejected");
            }
        }, 1000);
    });
}
getData().then(data => console.log(data)).catch(err => console.log(err));


fetch("https://jsonplaceholder.typicode.com/todos")
    .then(res => res.json())
    .then(data => data.filter(d => d.completed == true))
    .then(data => console.log(data.reduce((acc, curr) => acc + curr.id, 0)))
    .catch(err => console.log(err));