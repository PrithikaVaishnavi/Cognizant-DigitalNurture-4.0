package search;
import java.util.Arrays;
import java.util.Comparator;

public class SearchService 
{
    // Linear Search by Product Name
    public static Product linearSearch(Product[] products, String productName) 
    {
        for (Product p : products) 
        {
            if (p.getProductName().equalsIgnoreCase(productName)) 
            {
                return p;
            }
        }
        return null;
    }
    // Binary Search by Product ID
    public static Product binarySearch(Product[] products, int productId) 
    {
        // Sort array by productId first
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
        int left = 0, right = products.length - 1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == productId) 
            {
                return products[mid];
            } 
            else if (products[mid].getProductId() < productId) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return null;
    }
}
