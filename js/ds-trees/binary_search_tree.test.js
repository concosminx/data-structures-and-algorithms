const BinarySearchTree = require('./binary_search_tree')

function traverse(node) {
    const tree = { value: node.value };
    tree.left = node.left === null ? null : traverse(node.left);
    tree.right = node.right === null ? null : traverse(node.right);
    return tree;
}

test('check tree structure', () => {
    const tree = new BinarySearchTree();
    tree.insert(9)
    tree.insert(4)
    tree.insert(6)
    tree.insert(20)
    tree.insert(170)
    tree.insert(15)
    tree.insert(1)
    tree.remove(170)
    const asString = JSON.stringify(traverse(tree.root))
    
    expect(asString).toBe('{"value":9,"left":{"value":4,"left":{"value":1,"left":null,"right":null},"right":{"value":6,"left":null,"right":null}},"right":{"value":20,"left":{"value":15,"left":null,"right":null},"right":null}}');
});