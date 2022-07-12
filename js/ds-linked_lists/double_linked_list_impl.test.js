const DoubleLinkedList = require('./double_linked_list_impl');

let myLinkedList = new DoubleLinkedList(12);
myLinkedList.append(5)
myLinkedList.append(16)
myLinkedList.prepend(1)
myLinkedList.insert(2, 99)

test('check length', () => {
    expect(myLinkedList.length).toBe(5);
});