const dyno = require('./dynamic_prg')

test('fibonacci with cache', () => {
    expect(dyno.fibonacciCache()(6)).toBe(8);
});

test('fibonacci with cache array', () => {
    expect(dyno.fibonacciArray(6)).toBe(8);
});