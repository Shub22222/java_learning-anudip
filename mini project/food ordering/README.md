# 🍔 Food Ordering System (Java Swing) A desktop-based 
**Food Ordering UI** built with **Java Swing**.
This project demonstrates GUI design, dynamic image loading, cart management, and receipt generation
__________________________________

## ✨ Features
- **Category Navigation**:
   Chips, Cookies, Nuts, Fruits, Fried Snacks, Dairy, Candy, Crackers, Healthy.
- **Dynamic Product Display**:
  - Each product shows **name, price, and image**.
  - Images are scaled proportionally using `Graphics2D` for sharp display.
- **Interactive Controls**:
  - Quantity selector (`+` / `-` buttons). -
  - **Add to Cart** button for each product.
- **Cart Management**:
  - Items stored in a `LinkedHashMap` to preserve order.
  - Cart table shows Item, Quantity, Price, and Total.
  - **Clear Cart** and **Checkout** buttons.
- **Receipt Generation**:
  Displays a formatted receipt with order summary.
- **Polished UI**:
  - Balanced layouts using `BorderLayout`, `GridLayout`, and `CardLayout`.
  - Styled buttons,labels, and tables.

 ## 🛠️ Tech Stack - **Language**: Java (JDK 8+)
- **GUI Toolkit**: Swing (`JFrame`, `JPanel`, `JTable`, `CardLayout`)
- **Image Handling**: `BufferedImage`, `Graphics2D`, `ImageIO`
-**Data Structures**: `HashMap`, `LinkedHashMap`, `DefaultTableModel
