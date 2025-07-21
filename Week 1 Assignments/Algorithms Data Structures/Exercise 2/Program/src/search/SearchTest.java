package search;

public class SearchTest 
{
    public static void main(String[] args) 
    {
        Product[] products = 
        {
            new Product(101, "iPhone 14", "Mobile"),
            new Product(205, "MacBook Air", "Laptop"),
            new Product(150, "Sony Headphones", "Audio"),
            new Product(120, "Samsung TV", "Electronics")
        };
        // Linear Search by Name
        Product result1 = SearchService.linearSearch(products, "MacBook Air");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));
        // Binary Search by ID
        Product result2 = SearchService.binarySearch(products, 150);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}

