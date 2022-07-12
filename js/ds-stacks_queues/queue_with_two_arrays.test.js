const Queue = require('./queue_with_two_arrays')

test('check peek with empty stack', () => {
    const myQueue = new Queue();
    expect(myQueue.peek()).toBeUndefined();
});


test('check enqueue and peek', () => {
    const myQueue = new Queue();
    myQueue.enqueue('Joe');
    myQueue.enqueue('Santa Claus');
    myQueue.enqueue('Ronnie');
    expect(myQueue.peek()).toBe('Joe');
});

test('check dequeue', () => {
    const myQueue = new Queue();
    myQueue.enqueue('google');
    myQueue.dequeue();
    expect(myQueue.peek()).toBeUndefined();
});