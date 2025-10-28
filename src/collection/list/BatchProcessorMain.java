package collection.list;

public class BatchProcessorMain {

  public static void main(String[] args) {
    MyArrayList<Integer> arrayList = new MyArrayList<>();
    MyLinkedList<Integer> linkedList = new MyLinkedList<>();

    BatchProcessor arrayListProcessor = new BatchProcessor(arrayList);
    arrayListProcessor.logic(50_000);

    BatchProcessor linkedListProcessor = new BatchProcessor(linkedList);
    linkedListProcessor.logic(50_000);
  }
}
