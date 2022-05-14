function factorialIterative(number) {
    let answer = 1;
    for (let i = 2; i <= number; i++) {
        answer = answer * i;
    }
    return answer;
}

function factorialRecursive(number) {
    if (number === 2) {
        return 2;
    }
    return number * factorialRecursive(number - 1)
}

function fibonacciIterative(n) {
    let arr = [0, 1];
    for (let i = 2; i < n + 1; i++) {
        arr.push(arr[i - 2] + arr[i - 1]);
    }
    return arr[n];
}

function fibonacciRecursive(n) {
    if (n < 2) {
        return n;
    }
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
}

function reverseString(str) {
    let arrayStr = str.split("");
    let reversedArray = [];
    function addToArray(array) {
       if (array.length > 0) {
            reversedArray.push(array.pop());
            addToArray(array);
        }
        return;
    }
    addToArray(arrayStr);
    return reversedArray.join("");
}

function reverseStringRecursive(str) {
    if (str === "") {
        return "";
    } else {
        return reverseStringRecursive(str.substr(1)) + str.charAt(0);
    }
}

module.exports = {
    factorialIterative: factorialIterative, 
    factorialRecursive: factorialRecursive, 
    fibonacciIterative: fibonacciIterative, 
    fibonacciRecursive: fibonacciRecursive,
    reverseStringRecursive: reverseStringRecursive
}