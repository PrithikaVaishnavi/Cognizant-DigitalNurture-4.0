package search;

public class SearchTest {
    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Smartphone", "Electronics"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Tablet", "Electronics")
        };

        // Linear Search Test
        System.out.println("=== Linear Search ===");
        Product result1 = LinearSearch.search(products, "Smartphone");
        if (result1 != null) {
            System.out.println("Found: " + result1);
        } else {
            System.out.println("Product not found.");
        }

        // Binary Search Test
        System.out.println("\n=== Binary Search ===");
        BinarySearch.sortProducts(products);  // Sort before binary search
        Product result2 = BinarySearch.search(products, "Smartphone");
        if (result2 != null) {
            System.out.println("Found: " + result2);
        } else {
            System.out.println("Product not found.");
        }
    }
}

