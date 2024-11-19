let num = 42;

if(num > 50){
    console.log('Number is greater than 50');
} else{
    console.log('Number is not greater than 50');
}

let str = "hello";

switch(str){
    case "hello":
        console.log("Greeting!");
        break;
    case "goodbye":
        console.log('Farewell!');
        break;
    default:
        console.log('Unexpected input');
        break;
}

let bool = true;
let isBoolTrue = bool == true ? 'Boolean is true' : 'Boolean is false';
console.log(isBoolTrue);