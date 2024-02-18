import java.util.ArrayList;
import java.util.List; // Import List for type safety

// Class name should follow PascalCase convention
public class java_arraylis {

    public static void main(String args[]) {
        // Correct initial capacity syntax:
        List<Integer> arrayList = new ArrayList<>(5);
        for (int i=1;i<6;i++)
        {
            arrayList.add(i);
            System.out.println(arrayList.get(i-1));
        }
        // ... rest of your code using arrayList
    }
}
