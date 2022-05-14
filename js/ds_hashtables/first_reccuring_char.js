/*
  Display first recurring char from an array 
  Examples: 
  1. [2,5,1,2,3,5,1,2,4] -> returns 2
  2. [2,1,1,2,3,5,1,2,4] -> return 1
  3. [2,1,5] -> returns undefined
*/

function firstRecurringChar(input) {
    let map = {};
    for (let i = 0; i < input.length; i++) {
        if (map[input[i]] !== undefined) {
            return input[i]
        } else {
            map[input[i]] = i;
        }
    }
    return undefined
}

module.exports = {
    firstRecurringChar: firstRecurringChar
}