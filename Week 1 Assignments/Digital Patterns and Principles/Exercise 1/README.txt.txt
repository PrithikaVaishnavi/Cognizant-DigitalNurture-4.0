Assignment: Singleton Pattern Implementation

Project: SingletonPatternExample

Description:
This Java project demonstrates the Singleton Design Pattern, ensuring that only one instance of a Logger class exists throughout the application lifecycle.

Key Features:
- Thread-safe Singleton implementation using Double-Checked Locking
- Private constructor prevents direct instantiation
- Global access method (`getInstance()`) to retrieve the single Logger instance
- Demonstration of instance reusability using a test class

How It Works:
- The Logger class has a private static volatile instance.
- The `getInstance()` method checks if the instance is null.
- If null, it synchronizes and initializes the instance (once).
- All subsequent calls return the same instance.

Output (Example):
Logger instance created  
[LOG]: First log message  
[LOG]: Second log message  
Both logger instances are the same (Singleton Verified)

Benefits:
- Ensures consistent logging behavior
- Saves memory by preventing multiple object creation
- Thread-safe with high performance

Time Complexity:
- O(1) for accessing the Singleton instance

Author: Prithika Vaishnavi V U
