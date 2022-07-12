const HashTableImplementation = require('./hashtable_implementation');

test('check get method', () => {
    const myHashTable = new HashTableImplementation(50);
    myHashTable.set('grapes', 10000)
    myHashTable.set('grapes', 10000)

    expect(myHashTable.get('grapes')).toBe(10000);
});


test('check keys method', () => {
    const myHashTable = new HashTableImplementation(50);
    myHashTable.set('grapes', 10000)
    myHashTable.set('apples', 9)

    expect(myHashTable.keys()).toContain('apples');
});