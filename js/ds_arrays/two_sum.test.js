const twoSum = require('./two_sum')

const a1 = [0, -1, 2, -3, 1];
const x1 = -2; 

const a2 = [6,4,3,2,1,7];
const x2 = 9;

test('naive, negative sum', () => {
  expect(twoSum.hasPairNaive(a1, x1)).toBe(true);
});


test('naive, positive sum', () => {
  expect(twoSum.hasPairNaive(a2, x2)).toBe(true);
});

test('with map, negative sum', () => {
  expect(twoSum.hasPairWithMap(a1, x1)).toBe(true);
});

test('with map, positive sum', () => {
  expect(twoSum.hasPairWithMap(a2, x2)).toBe(true);
});

test('with map, the array does not contains the sum', () => {
  expect(twoSum.hasPairWithMap([1,2,3], 7)).toBe(false);
});