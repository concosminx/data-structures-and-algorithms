const recursion = require('./recursion')

test('factorial iterative', () => {
    expect(recursion.factorialIterative(3)).toBe(6);
});

test('factorial recursive', () => {
    expect(recursion.factorialRecursive(3)).toBe(6);
});

test('fibonacci iterative', () => {
    expect(recursion.fibonacciIterative(8)).toBe(21);
});

test('fibonacci recursive', () => {
    expect(recursion.fibonacciRecursive(8)).toBe(21);
});

test('reverse', () => {
    expect(recursion.reverseStringRecursive("Ana are mere")).toBe('erem era anA');
});