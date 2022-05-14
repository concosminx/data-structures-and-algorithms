/* 
  Given an array A[] and a number x, check for pair in A[] with sum as x (aka Two Sum)
  Examples:
  1. [0, -1, 2, -3, 1], x = -2 -> returns true
  2. [6,4,3,2,1,7], x = 9 -> returns true
  */

function hasPairNaive(arr, sum) {
    var len = arr.length;
    for (var i = 0; i < len - 1; i++) {
        for (var j = i + 1; j < len; j++) {
            if (arr[i] + arr[j] === sum)
                return true;
        }
    }

    return false;
}


function hasPairWithMap(arr, sum) {
    const mySet = new Set();
    const len = arr.length;
    for (let i = 0; i < len; i++) {
        if (mySet.has(arr[i])) {
            return true;
        }
        mySet.add(sum - arr[i]);
    }
    return false;
}

module.exports = {
    hasPairNaive: hasPairNaive, 
    hasPairWithMap: hasPairWithMap
}