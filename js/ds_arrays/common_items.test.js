const commonItems = require('./common_items')

const array1 = ['a', 'b', 'c', 'x'];
const array2 = ['z', 'y', 'a'];
const array3 = ['u'];

test('naive, there is no common element', () => {
    expect(commonItems.containsCommonItemNaive(array1, array3)).toBe(false);
});

test('extra space, there is no common element', () => {
    expect(commonItems.containsCommonUsingExtraSpace(array1, array3)).toBe(false);
});

test('api, there is no common element', () => {
    expect(commonItems.containsCommonApi(array1, array3)).toBe(false);
});

test('naive, common element', () => {
    expect(commonItems.containsCommonItemNaive(array1, array2)).toBe(true);
});

test('extra space, common element', () => {
    expect(commonItems.containsCommonUsingExtraSpace(array1, array2)).toBe(true);
});

test('api, common element', () => {
    expect(commonItems.containsCommonApi(array1, array2)).toBe(true);
});