package search;
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
    }
    public static Product search(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midName = products[mid].getProductName();

            int comparison = productName.compareToIgnoreCase(midName);
            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }
}
