public class Test {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Công");
        list.add("Tuấn");
        list.add("Hải");

        list.add(2,"Chung");
        for (int i = 0; i < list.size() ; i++) {

            System.out.println(list.get(i));
        }


        System.out.println("Số lượng của danh sách: " + list.size());
        System.out.println("Công nghiện có trong danh sách ko: " + list.contains("Công"));
        System.out.println("Element ở vị trí 1: " + list.get(1));

        MyList<String> clonedList = list.clone();
        System.out.println("Cloned list contains Hải: " + clonedList.contains("Hải"));

        System.out.println("Vị trí của Tuấn: " + list.indexOf("Tuấn"));

        list.remove(1);
        System.out.println("Vị trí sau khi xoá Tuấn: " + list.get(1));

        list.clear();
        System.out.println("Số lượng sau khi xoá: " + list.size());
    }
}
