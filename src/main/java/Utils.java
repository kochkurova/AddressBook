public class Utils {
    String[] addressBookName = new String[100];
    String[] addressBookNum = new String[100];

    public void clear () {

        // обнуление массивов

        for (int i = 0; i < 100; i++) {
            addressBookName[i] = null;
            addressBookNum[i] = null;

        }
    }



//    public static void show () {
//
//        System.out.println("Вывод адресной книги" +  );
}
