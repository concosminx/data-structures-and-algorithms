/*
  Reverse a string
  Examples: 
  1. Hello! -> !olleH
*/
function reverseWithArrays(str) {
    if (!str || typeof str != 'string' || str.length < 2) return str;

    const backwards = [];
    const totalItems = str.length - 1;
    for (let i = totalItems; i >= 0; i--) {
        backwards.push(str[i]);
    }
    return backwards.join('');
}

function reverseApi(str) {
    //check for valid input
    return str.split('').reverse().join('');
}

const reverseApiLambda = str => [...str].reverse().join('');

module.exports = {
    reverseWithArrays: reverseWithArrays, 
    reverseApi: reverseApi, 
    reverseApiLambda: reverseApiLambda
}