const reverser = require('./reverse_string');

test('reverse with arrays', () => {
    expect(reverser.reverseWithArrays('Hello!')).toBe('!olleH');
});

test('reverse with api', () => {
    expect(reverser.reverseApi('Hello!')).toBe('!olleH');
});

test('reverse with api / lambda', () => {
    expect(reverser.reverseApiLambda('Hello!')).toBe('!olleH');
});