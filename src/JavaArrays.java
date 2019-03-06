public class JavaArrays {
    public static void main(String[] args) {
        int marks[] = {78, 88, 90, 97, 56, 89, 100, 98, 87, 88};
        String names[] = {"Kim", "Anitah", "Ladasha", "Emmanuel", "Henry"};
        System.out.println(marks[0]);
        try {
            System.out.println(names[10]);
        } catch (Exception e) {
            System.out.println("Error while fetching the name");
            Functions.areacircle(21);
        }

    }
}