/*
Adam Anderson
4/25/2019
(Min-heap) The heap presented in the text is also known as a max-heap , in which each node is greater than or equal to any of its children. A min-heap is a heap in which each node is less than or equal to any of its children. Min-heaps are often used to implement priority queues. Revise the Heap class in Listing 23.9 to implement a min-heap. Use HeapSortPreview the document as your test class.
 */

public class MinHeap_23_07<E extends Comparable<E>> {
  public static void main(String[] args) {
    
    MinHeap<Integer> heap = new MinHeap<>();
    
  heap.add(110);
  heap.add(15);
  heap.add(110);
  heap.add(12);
  heap.add(13);
  heap.add(23);
  heap.add(435);
  heap.add(139);
  
  // Create a while loop that goes through heap size and prints out the removed indexes
  while (heap.size() > 0) {
    System.out.print(heap.remove() + " ");
  }


  }
  static class MinHeap<E extends Comparable<E>> {
    private final java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public MinHeap<E> add(E newObject) {
      list.add(newObject);
      int currentIndex = list.size() - 1;

      while (currentIndex > 0) {
        int parentIndex = (currentIndex - 1) / 2;
        if (list.get(currentIndex).compareTo(list.get(parentIndex)) < 0) {
          E temp = list.get(currentIndex);
          list.set(currentIndex, list.get(parentIndex));
          list.set(parentIndex, temp);
        } else break;
        currentIndex = parentIndex;
      }
      return this;
    }

    public E remove() {
      if (list.size() == 0) return null;

      E removedObject = list.get(0);
      list.set(0, list.get(list.size() - 1));
      list.remove(list.size() - 1);

      int currentIndex = 0;
      while (currentIndex < list.size()) {
        int leftChildIndex = 2 * currentIndex + 1;
        int rightChildIndex = 2 * currentIndex + 2;

        if (leftChildIndex >= list.size()) break; // The tree is a heap
        int maxIndex = leftChildIndex;
        if (rightChildIndex < list.size()) {
          if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) > 0) {
            maxIndex = rightChildIndex;
          }
        }
        if (list.get(currentIndex).compareTo(list.get(maxIndex)) > 0) {
          E temp = list.get(maxIndex);
          list.set(maxIndex, list.get(currentIndex));
          list.set(currentIndex, temp);
          currentIndex = maxIndex;
        } else break;
      }
      return removedObject;
    }

    public int size() {
      return list.size();
    }
  }
}