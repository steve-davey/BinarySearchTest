public class BinarySearchTest {
    public static void main(String[] args) throws Exception{
        SortedADT sorted = new SortedArray(5);
        sorted.insert(3);
        sorted.insert(5);
        sorted.insert(6);
        sorted.insert(7);
        sorted.insert(8);
        System.out.println(sorted);
        Integer value;
        do{
            value = Input.getInteger("value: ");
            try {
                sorted.find(value);
                System.out.println("found");
            } catch (SortedADT.NotFoundException e) {
                System.out.println("value not found");
            }
        }while(Repeat.repeat());
    }
}
