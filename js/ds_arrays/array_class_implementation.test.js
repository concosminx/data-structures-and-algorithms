const CustomArrayImplementation = require('./array_class_implementation');

const a1 = new CustomArrayImplementation();
a1.push('Hello');
a1.push('World');
a1.push('!');

test('check length', () => {
    expect(a1.length).toBe(3);
});

test('check pop method', () => {
    expect(a1.pop()).toBe('!');
});

test('check deleteAtIndex method', () => {
    expect(a1.deleteAtIndex(0)).toBe('Hello');
});