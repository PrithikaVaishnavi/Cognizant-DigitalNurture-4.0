Assignment: Factory Method Pattern Implementation

Project: FactoryMethodPatternExample

Description:
This Java project demonstrates the Factory Method Design Pattern by abstracting the creation of different document types (Word, PDF, Excel) in a document management system.

Key Features:
- Interface `Document` with `open()` method
- Concrete classes: `WordDocument`, `PdfDocument`, `ExcelDocument`
- Abstract factory: `DocumentFactory`
- Concrete factories: `WordDocumentFactory`, `PdfDocumentFactory`, `ExcelDocumentFactory`
- Test class demonstrates runtime creation of documents

How It Works:
- Each document type has its own factory.
- The client code (test class) creates documents via factories without knowing the exact class being instantiated.
- Promotes loose coupling and follows Open/Closed Principle.

Output (Example):
Opening Word Document.  
Opening PDF Document.  
Opening Excel Document.

Benefits:
- Encapsulates object creation logic
- Supports adding new document types with minimal changes
- Encourages polymorphism and adherence to SOLID principles

Time Complexity:
- O(1) for creating each document (simple instantiation)

Author: Prithika Vaishnavi V U
