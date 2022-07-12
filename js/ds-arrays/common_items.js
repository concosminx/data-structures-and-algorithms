/*
  Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
  Examples: 
  1. ['a', 'b', 'c', 'x'] and ['z', 'y', 'i'] -> should return false
  2. ['a', 'b', 'c', 'x'] and ['z', 'y', 'x'] -> should return true

*/

//O(a*b)
//O(1) - Space Complexity
function containsCommonItemNaive(arr1, arr2) {
    for (let i = 0; i < arr1.length; i++) {
        for (let j = 0; j < arr2.length; j++) {
            if (arr1[i] === arr2[j]) {
                return true;
            }
        }
    }
    return false
}
 
//O(a + b) Time Complexity
//O(a) Space Complexity
function containsCommonUsingExtraSpace(arr1, arr2) {
    let map = {};
    for (let i = 0; i < arr1.length; i++) {
        if (!map[arr1[i]]) {
            const item = arr1[i];
            map[item] = true;
        }
    }

    for (let j = 0; j < arr2.length; j++) {
        if (map[arr2[j]]) {
            return true;
        }
    }
    return false
}
  

  
function containsCommonApi(arr1, arr2) {
    return arr1.some(item => arr2.includes(item))
}


module.exports = {
    containsCommonItemNaive: containsCommonItemNaive,
    containsCommonUsingExtraSpace: containsCommonUsingExtraSpace,
    containsCommonApi: containsCommonApi
}
  
