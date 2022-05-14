const sort_methods = require('./sort_methods')

test('bubble sort', () => {
    const a1 = [99, 44, 6, 2, 1, 5, 63]
    sort_methods.bubbleSort(a1);
    expect(a1).toStrictEqual([1, 2, 5, 6, 44, 63, 99]);
});

test('selection sort', () => {
    const a1 = [99, 44, 6, 2, 1, 5, 63]
    sort_methods.selectionSort(a1);
    expect(a1).toStrictEqual([1, 2, 5, 6, 44, 63, 99]);
});

test('insertion sort', () => {
    const a1 = [99, 44, 6, 2, 1, 5, 63]
    sort_methods.insertionSort(a1);
    expect(a1).toStrictEqual([1, 2, 5, 6, 44, 63, 99]);
});

test('merge sort', () => {
    const a1 = [99, 44, 6, 2, 1, 5, 63]
    a2 = sort_methods.mergeSort(a1);
    expect(a2).toStrictEqual([1, 2, 5, 6, 44, 63, 99]);
});

test('quick sort', () => {
    const a1 = [99, 44, 6, 2, 1, 5, 63]
    sort_methods.quickSort(a1, 0, a1.length - 1);
    expect(a1).toStrictEqual([1, 2, 5, 6, 44, 63, 99]);
});