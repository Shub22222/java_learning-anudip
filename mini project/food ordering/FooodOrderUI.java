
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class FooodOrderUI extends JFrame {
    private JPanel centerPanel;
    private CardLayout cardLayout;
    
    // Store product data for each category
    private Map<String, String[]> productNames = new HashMap<>();
    private Map<String, String[]> productPrices = new HashMap<>();

    public FooodOrderUI() {
        // Initialize product data with unique names and prices for each sub-product
        initializeProductData();
        
        setTitle("Food Order System");
        setSize(1300, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // LEFT PANEL with category buttons
        JPanel leftPanel = new JPanel(new GridLayout(9, 1));
        leftPanel.setPreferredSize(new Dimension(180, 300));

        JButton chipsBtn = new JButton("Chips & Crisps");
        JButton cookiesBtn = new JButton("Cookies & Biscuits");
        JButton nutsBtn = new JButton("Nuts & Seeds");
        JButton fruitsBtn = new JButton("Fruits & Veggies");
        JButton friedBtn = new JButton("Fried Snacks");
        JButton dairyBtn = new JButton("Dairy-Based");
        JButton candyBtn = new JButton("Candy & Chocolates");
        JButton crackersBtn = new JButton("Savory Crackers");
        JButton healthyBtn = new JButton("Healthy Snacks");

        leftPanel.add(chipsBtn);
        leftPanel.add(cookiesBtn);
        leftPanel.add(nutsBtn);
        leftPanel.add(fruitsBtn);
        leftPanel.add(friedBtn);
        leftPanel.add(dairyBtn);
        leftPanel.add(candyBtn);
        leftPanel.add(crackersBtn);
        leftPanel.add(healthyBtn);

        add(leftPanel, BorderLayout.WEST);

        // CENTER PANEL with CardLayout
        cardLayout = new CardLayout();
        centerPanel = new JPanel(cardLayout);

        // Add category panels with product names and prices
        centerPanel.add(createCategoryPanel("Chips", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/BalaG1.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Balagi.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Kurkure.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/LaysCrunch.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Bingo.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Unclechips.png"
        }), "Chips");

        centerPanel.add(createCategoryPanel("Cookies", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Bounce.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/ParleG.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Hide&seek.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Britania.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Sunfeas.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/pngegg.png"
        }), "Cookies");

        centerPanel.add(createCategoryPanel("Nuts", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/almond.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/walnut.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/casu.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/pista.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/peanut.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/madamia.png"
        }), "Nuts");

        centerPanel.add(createCategoryPanel("Fruits", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/apple.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/banana.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/watermelon.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/beet.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/bellpaper.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/coliflower.png"
        }), "Fruits");

        centerPanel.add(createCategoryPanel("Fried", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/samosa.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/jalebi.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/kachori.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/puribhaji.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/vadapav.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/medu.png"
        }), "Fried");

        centerPanel.add(createCategoryPanel("Dairy", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/amul.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/gokul.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/tak.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/buterscotch.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/paneer.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/rasgulla.png"
        }), "Dairy");

        centerPanel.add(createCategoryPanel("Candy", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/mago.png",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/juztjelly.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/eclairs.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/ornage.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/lacto.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Dairymilk.jpg"
        }), "Candy");

        centerPanel.add(createCategoryPanel("Crackers", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/karckjack.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Britaniacrack.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Sunfeastcrack.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/milkast.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/hum.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Snaper.jpg"
        }), "Crackers");

        centerPanel.add(createCategoryPanel("Healthy", new String[]{
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Sprouts.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/oatsChilla.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/poha.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/FruitChaat.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/Upma.jpg",
            "D:/coding learning/coading/java/Yes_i_started/advaned java/applate/images/VegetableSoup.jpg"
        }), "Healthy");

        add(centerPanel, BorderLayout.CENTER);

        // Blank column on the right side
        JPanel rightBlank = new JPanel();
        rightBlank.setPreferredSize(new Dimension(340, 700));
        rightBlank.setBackground(Color.WHITE);
        add(rightBlank, BorderLayout.EAST);

        // Button actions
        chipsBtn.addActionListener(e -> cardLayout.show(centerPanel, "Chips"));
        cookiesBtn.addActionListener(e -> cardLayout.show(centerPanel, "Cookies"));
        nutsBtn.addActionListener(e -> cardLayout.show(centerPanel, "Nuts"));
        fruitsBtn.addActionListener(e -> cardLayout.show(centerPanel, "Fruits"));
        friedBtn.addActionListener(e -> cardLayout.show(centerPanel, "Fried"));
        dairyBtn.addActionListener(e -> cardLayout.show(centerPanel, "Dairy"));
        candyBtn.addActionListener(e -> cardLayout.show(centerPanel, "Candy"));
        crackersBtn.addActionListener(e -> cardLayout.show(centerPanel, "Crackers"));
        healthyBtn.addActionListener(e -> cardLayout.show(centerPanel, "Healthy"));

        setVisible(true);
    }
    
    private void initializeProductData() {
        // Chips & Crisps (6 unique products)
        productNames.put("Chips", new String[]{
            "Bala G1 Masala (50g)", 
            "Balaji Tomato Wafers (70g)", 
            "Kurkure Masala Munch (52g)", 
            "Lays Spanish Tomato (48g)", 
            "Bingo Mad Angles (60g)", 
            "Uncle Chips Premium (45g)"
        });
        productPrices.put("Chips", new String[]{
            "₹20", "₹25", "₹22", "₹30", "₹28", "₹35"
        });
        
        // Cookies & Biscuits (6 unique products)
        productNames.put("Cookies", new String[]{
            "Bounce Choco Fills (150g)", 
            "Parle-G Glucose (100g)", 
            "Hide & Seek Choco (75g)", 
            "Britannia Good Day (200g)", 
            "Sunfeast Dark Fantasy (150g)", 
            "Oreo Chocolate Cream (137g)"
        });
        productPrices.put("Cookies", new String[]{
            "₹45", "₹10", "₹30", "₹40", "₹50", "₹35"
        });
        
        // Nuts & Seeds (6 unique products)
        productNames.put("Nuts", new String[]{
            "California Almonds (100g)", 
            "Kashmiri Walnuts (100g)", 
            "Premium Cashews (100g)", 
            "Iranian Pistachios (100g)", 
            "Roasted Peanuts (200g)", 
            "Australian Macadamia (100g)"
        });
        productPrices.put("Nuts", new String[]{
            "₹180", "₹160", "₹250", "₹320", "₹90", "₹450"
        });
        
        // Fruits & Veggies (6 unique products)
        productNames.put("Fruits", new String[]{
            "Fresh Shimla Apples (1kg)", 
            "Organic Bananas (6 pcs)", 
            "Watermelon Slice (500g)", 
            "Fresh Beetroot (500g)", 
            "Colored Bell Peppers (3 pcs)", 
            "Fresh Cauliflower (1 pc)"
        });
        productPrices.put("Fruits", new String[]{
            "₹140", "₹35", "₹50", "₹40", "₹85", "₹38"
        });
        
        // Fried Snacks (6 unique products)
        productNames.put("Fried", new String[]{
            "Spicy Samosa (2 pcs)", 
            "Sweet Jalebi (250g)", 
            "Masala Kachori (2 pcs)", 
            "Puri Bhaji Combo", 
            "Mumbai Vada Pav", 
            "South Medu Vada (4 pcs)"
        });
        productPrices.put("Fried", new String[]{
            "₹25", "₹40", "₹30", "₹45", "₹20", "₹35"
        });
        
        // Dairy-Based (6 unique products)
        productNames.put("Dairy", new String[]{
            "Amul Butter (100g)", 
            "Gokul Fresh Milk (1L)", 
            "Tak Yogurt (400g)", 
            "Butterscotch Ice Cream", 
            "Fresh Paneer (200g)", 
            "Bengali Rasgulla (6 pcs)"
        });
        productPrices.put("Dairy", new String[]{
            "₹55", "₹65", "₹45", "₹80", "₹95", "₹60"
        });
        
        // Candy & Chocolates (6 unique products)
        productNames.put("Candy", new String[]{
            "Mango Bite Candy (100g)", 
            "Juzt Jelly (150g)", 
            "Cadbury Eclairs (100g)", 
            "Orange Candy Tangy", 
            "Lacto King (150g)", 
            "Dairy Milk Silk (80g)"
        });
        productPrices.put("Candy", new String[]{
            "₹15", "₹25", "₹20", "₹18", "₹30", "₹55"
        });
        
        // Savory Crackers (6 unique products)
        productNames.put("Crackers", new String[]{
            "Krack Jack (150g)", 
            "Britannia Cream Crackers", 
            "Sunfeast Crackers", 
            "Milka Cream Biscuit", 
            "Humor Crackers", 
            "Snap Crackers Cheese"
        });
        productPrices.put("Crackers", new String[]{
            "₹35", "₹40", "₹30", "₹45", "₹25", "₹38"
        });
        
        // Healthy Snacks (6 unique products)
        productNames.put("Healthy", new String[]{
            "Mixed Sprouts Salad", 
            "Oats Chilla (2 pcs)", 
            "Poha Breakfast", 
            "Fresh Fruit Chaat", 
            "Upma Breakfast", 
            "Vegetable Soup Bowl"
        });
        productPrices.put("Healthy", new String[]{
            "₹65", "₹45", "₹40", "₹55", "₹50", "₹60"
        });
    }

    // Method to create high-quality scaled image with aspect ratio preserved
    private ImageIcon getScaledImageIcon(String imagePath, int maxWidth, int maxHeight) {
        try {
            File file = new File(imagePath);
            if (!file.exists()) {
                System.out.println("File not found: " + imagePath);
                return null;
            }
            
            // Read the image
            BufferedImage originalImage = ImageIO.read(file);
            if (originalImage == null) {
                System.out.println("Could not read image: " + imagePath);
                return null;
            }
            
            // Calculate scaling while preserving aspect ratio
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            
            double widthRatio = (double) maxWidth / originalWidth;
            double heightRatio = (double) maxHeight / originalHeight;
            double ratio = Math.min(widthRatio, heightRatio);
            
            // Calculate new dimensions
            int newWidth = (int) (originalWidth * ratio);
            int newHeight = (int) (originalHeight * ratio);
            
            // Create high-quality scaled image
            BufferedImage scaledImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = scaledImage.createGraphics();
            
            // Set rendering hints for high quality
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, 
                                 RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, 
                                 RenderingHints.VALUE_RENDER_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                                 RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,
                                 RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
            
            // Draw the scaled image
            g2d.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
            g2d.dispose();
            
            return new ImageIcon(scaledImage);
            
        } catch (IOException e) {
            System.out.println("Error loading image: " + imagePath);
            e.printStackTrace();
            return null;
        }
    }

    // Create a panel with 6 boxes for a category
    private JPanel createCategoryPanel(String categoryName, String[] imagePaths) {
        JPanel boxesPanel = new JPanel(new GridLayout(2, 3, 20, 20));
        boxesPanel.setBorder(BorderFactory.createEmptyBorder(40, 50, 40, 50));

        String[] names = productNames.get(categoryName);
        String[] prices = productPrices.get(categoryName);

        for (int i = 0; i < 6; i++) {
            JPanel box = new JPanel(new BorderLayout());
            box.setPreferredSize(new Dimension(300, 285));
            box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            box.setBackground(Color.WHITE);

            // Title and Price Panel at the top
            JPanel titlePanel = new JPanel(new BorderLayout());
            titlePanel.setBackground(Color.WHITE);
            titlePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            
            JLabel nameLabel = new JLabel("<html><b>" + names[i] + "</b></html>");
            nameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            
            JLabel priceLabel = new JLabel("<html><b><font color='green'>" + prices[i] + "</font></b></html>");
            priceLabel.setFont(new Font("Arial", Font.BOLD, 14));
            
            titlePanel.add(nameLabel, BorderLayout.CENTER);
            titlePanel.add(priceLabel, BorderLayout.SOUTH);
            
            box.add(titlePanel, BorderLayout.NORTH);
            
            // Image panel with proper centering
            JPanel imageContainer = new JPanel(new GridBagLayout());
            imageContainer.setBackground(Color.WHITE);
            
            if (imagePaths != null && i < imagePaths.length) {
                // Load image with high quality scaling
                ImageIcon icon = getScaledImageIcon(imagePaths[i], 200, 140);
                
                if (icon != null) {
                    JLabel imgLabel = new JLabel(icon);
                    imageContainer.add(imgLabel);
                } else {
                    JLabel placeholder = new JLabel("Image not found", SwingConstants.CENTER);
                    placeholder.setForeground(Color.GRAY);
                    imageContainer.add(placeholder);
                }
            } else {
                JLabel placeholder = new JLabel("No Image", SwingConstants.CENTER);
                placeholder.setForeground(Color.GRAY);
                imageContainer.add(placeholder);
            }
            
            box.add(imageContainer, BorderLayout.CENTER);

            // Bottom controls
            JPanel counterPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            JButton leftBtn = new JButton("-");
            JButton rightBtn = new JButton("+");
            JLabel counterLabel = new JLabel("0");
            
            // Style buttons
            leftBtn.setPreferredSize(new Dimension(40, 25));
            rightBtn.setPreferredSize(new Dimension(40, 25));
            leftBtn.setBackground(new Color(220, 220, 220));
            rightBtn.setBackground(new Color(220, 220, 220));
            
            counterLabel.setPreferredSize(new Dimension(30, 25));
            counterLabel.setHorizontalAlignment(SwingConstants.CENTER);
            counterLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            counterLabel.setFont(new Font("Arial", Font.BOLD, 12));

            counterPanel.add(leftBtn);
            counterPanel.add(counterLabel);
            counterPanel.add(rightBtn);

            JPanel addPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JButton addBtn = new JButton("Add to Cart");
            addBtn.setPreferredSize(new Dimension(100, 25));
            addBtn.setBackground(new Color(0, 120, 215));
            addBtn.setForeground(Color.WHITE);
            addPanel.add(addBtn);

            JPanel bottomPanel = new JPanel(new BorderLayout());
            bottomPanel.add(addPanel, BorderLayout.WEST);
            bottomPanel.add(counterPanel, BorderLayout.EAST);

            box.add(bottomPanel, BorderLayout.SOUTH);

            // Counter logic
            leftBtn.addActionListener(e -> {
                int value = Integer.parseInt(counterLabel.getText());
                if (value > 0) counterLabel.setText(String.valueOf(value - 1));
            });
            
            rightBtn.addActionListener(e -> {
                int value = Integer.parseInt(counterLabel.getText());
                if (value < 20) counterLabel.setText(String.valueOf(value + 1));
            });
            
            // Add to cart action with product details
            final int productIndex = i;
            addBtn.addActionListener(e -> {
                int quantity = Integer.parseInt(counterLabel.getText());
                if (quantity > 0) {
                    String message = String.format("Added to Cart:\n\nProduct: %s\nPrice: %s\nQuantity: %d\nTotal: ₹%.2f",
                            names[productIndex], 
                            prices[productIndex], 
                            quantity, 
                            getPriceValue(prices[productIndex]) * quantity);
                    JOptionPane.showMessageDialog(this, message, "Added to Cart", JOptionPane.INFORMATION_MESSAGE);
                    counterLabel.setText("0");
                } else {
                    JOptionPane.showMessageDialog(this, "Please select quantity first!", "No Quantity Selected", JOptionPane.WARNING_MESSAGE);
                }
            });

            boxesPanel.add(box);
        }

        return boxesPanel;
    }
    
    // Helper method to extract numeric value from price string
    private double getPriceValue(String priceStr) {
        try {
            // Remove ₹ symbol and any non-numeric characters except decimal point
            String cleanStr = priceStr.replaceAll("[^0-9.]", "");
            return Double.parseDouble(cleanStr);
        } catch (Exception e) {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        // Run on EDT for thread safety
        SwingUtilities.invokeLater(() -> {
            new FooodOrderUI();
        });
    }
}
