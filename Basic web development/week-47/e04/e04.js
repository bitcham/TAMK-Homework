function square(x) {
    return x * x;
}

function sum(x, y) {
    return x + y;
}

function isPositive(x) {
    return x > 0;
}

function calculateArea(width, height) {
    return width * height;
}

function calculateVolume(width, height, depth) {
    return width * height * depth;
}

function convertCelsiusToFahrenheit(celcius) {
    return celcius * 9 / 5 + 32;
}


console.log(square(2)); // 4
console.log(square(4)); // 16
console.log(sum(2, 3)); // 5
console.log(sum(4, 5)); // 9
console.log(isPositive(2)); // true
console.log(isPositive(-2)); // false
console.log(calculateArea(10, 5)); // Output: 50
console.log(calculateVolume(10, 5, 2)); // Output: 100
console.log(convertCelsiusToFahrenheit(0)); // Output: 32