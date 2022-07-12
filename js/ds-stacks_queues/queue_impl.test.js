const Queue = require('./queue_impl')

test('check peek with empty stack', () => {
    const myQueue = new Queue();
    expect(myQueue.peek()).toBeNull();
});


test('check enqueue and peek', () => {
    const myQueue = new Queue();
    myQueue.enqueue('Joe');
    myQueue.enqueue('Santa Claus');
    myQueue.enqueue('Ronnie');
    expect(myQueue.peek().value).toBe('Joe');
});

test('check dequeue', () => {
    const myQueue = new Queue();
    myQueue.enqueue('google');
    myQueue.dequeue();
    expect(myQueue.peek()).toBeNull();
});