var a=10;

function funcB(){
    // var a=20;
    // console.log(a);
    function funcX(){
        // console.log(a);
    }
funcX();
}

// function funcX(){
//     var a=60;
//     console.log(a);
// }

funcB();
// funcX();

// console.log(a);


//Closure

function outer(){
    let a=40
    return function inner(){
        console.log(a);
    }
}

let result=outer();
console.log(result());


