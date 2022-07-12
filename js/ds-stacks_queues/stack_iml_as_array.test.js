const Stack = require('./stack_iml_as_array')

test('check peek with empty stack', () => {
    const myStack = new Stack();
    expect(myStack.peek()).toBeUndefined();
});

test('check push and peek', () => {
    const myStack = new Stack();
    myStack.push('google');
    myStack.push('udemy');
    myStack.push('discord');
    expect(myStack.peek()).toBe('discord');
});

test('check pop', () => {
    const myStack = new Stack();
    myStack.push('google');
    myStack.push('udemy');
    myStack.pop();
    expect(myStack.peek()).toBe('google');
});