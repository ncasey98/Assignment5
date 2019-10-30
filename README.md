# Assignment5
CT236 Programming III 

There are four classes required for this assignment : Inventory, ShoppingCart, Item and Test class for main( ).

1. The Inventory class has attributes such as item sku and item. The Item class has attributes such as itemName, price and quantity and must have a toString( ) 
   method for all variables. The ShoppingCart class has the attributes customerName, date (String), and List<Item>
2. The ShoppingCart class must have methods to addItem( ), removeItem( ), searchInventory( ), and viewCart( ).

   Use binary search for the implementation of searchInventory( ).
   The quantity of the item in the inventory list needs to be updated when an item is added or removed from a ShoppingCart.
   The price of the item is retrieved from the inventory list.
   Before adding the item to the shopping cart, check the quantity in the inventory list first. If the quantity is less than what the customer wishes to purchase,
   print out a message that show the quantity available, and only sell the quantity in the inventory list. If the quantity in the inventory list is 0, print a
   message to tell customers the item is not available.
   
3. Create an inventory list with the following information in the Test class. Print the content of the inventory list
    new Inventory("1000", "Apple", 30, 2.50)
    new Inventory("1001", "Orange", 40, 2.00)
    new Inventory("2001", "Milk", 10, 2.39)
    new Inventory("2002", "Orange Juice", 20, 1.99)
    new Inventory("3001", "Blue Cheese", 10, 2.25)
    new Inventory("3002", "Cheddar", 20, 2.79)
    new Inventory("4001", "Chocolate", 40, 2.99)
    new Inventory("4002", "Candy", 30, 0.99)
    new Inventory("5001", "Beef", 10, 5.00)
    new Inventory("5002", "Chicken", 10, 4.00)
    
    Ex : Print out of Inventory list
    
      1000 Apple 30 2.5
      1001 Orange 40 2.0
      2001 Milk 10 2.39
      2002 Orange Juice 20 1.99
      3001 Blue Cheese 10 2.25
      3002 Cheddar 2.79
      4001 Chocolate 40 2.99
      4002 Candy 30 0.99
      5001 Beef 10 5.0
      5002 Chicken 10 4.0
     
4. Create two shopping carts, cart1 and cart2m with the following information in the Test class
   
   Print out the contents of cart1 and cart2.
   Sort cart2 by price in ascending order and print.
   Print out the inventory list before and after each customer finishing shopping.
   
   Cart1__________________________
   cart1.addItem("Apple", 2)
   cart1.addItem("Orange", 5)
   cart1.addItem("Milk", 2)
   cart1.addItem("Blue Cheese, 4)
   cart1.addItem("Candy", 25)
   cart1.removeItem("Candy", 5)
   
   Cart2__________________________
   cart2.addItem("Apple", 2)
   cart2.addItem("Orange", 5)
   cart2.addItem("Milk", 2)
   cart2.addItem("Blue Cheese", 4)
   cart2.addItem("Cheddar", 3)
   cart2.addItem("Beef", 6)
   cart2.addItem("Candy", 20)
   cart2.addItem("Chocolate", 10)
   cart2.addItem("Chicken", 2)
   cart2.removeItem("Chocolate", 5)
   cart2.removeItem("Blue Cheese", 1)
   
   Ex : The contents of cart2
   
      13/10/2017  Name : Mark
      2   Apple         €5
      5   Orange        €10
      2   Milk          €4.78
      3   Blue Cheese   €6.75
      3   Cheddar       €8.37
      6   Beef          €30
      10  Candy         €9.90
      5   Chocolate     €14.95
      2   Chicken       €8
          Total       : €97.75
