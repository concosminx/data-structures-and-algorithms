const LinkedList = require('./linked_list_impl');

let myLinkedList = new LinkedList(10);
myLinkedList.append(5);
myLinkedList.append(16);
myLinkedList.prepend(1);
myLinkedList.insert(2, 99);
myLinkedList.insert(20, 88);
myLinkedList.remove(2);

test('check length', () => {
    expect(myLinkedList.length).toBe(5);
});