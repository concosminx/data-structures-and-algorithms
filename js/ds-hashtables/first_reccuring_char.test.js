const charFinder = require('./first_reccuring_char');

test('find existing reccuring char', () => {
    expect(charFinder.firstRecurringChar([2,5,1,2,3,5,1,2,4])).toBe(2);
});

test('not existing reccuring char', () => {
    expect(charFinder.firstRecurringChar([1,2,3])).toBeUndefined();
});