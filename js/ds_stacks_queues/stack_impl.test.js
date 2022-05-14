const {Node, Stack} = require('./stack_impl')

test('check peek with empty stack', () => {
    const myStack = new Stack();
    expect(myStack.peek()).toBeNull();
});

test('check push and peek', () => {
    const myStack = new Stack();
    myStack.push('google');
    myStack.push('udemy');
    myStack.push('discord');
    expect(myStack.peek().value).toBe('discord');
});

test('check pop', () => {
    const myStack = new Stack();
    myStack.push('google');
    myStack.push('udemy');
    myStack.pop();
    expect(myStack.peek().value).toBe('google');
});