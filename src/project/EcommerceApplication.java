package project;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

/**
 * Author: [Tharun Sreekar]
 * category
 * Project Name: E-commerce Application 
 */
public class EcommerceApplication extends JFrame {

    // ---------------------------- Models ----------------------------
    static class Products {
        String name, brand, description;
        double price, rating;
        int quantity = 1;

        Products(String name, String brand, double price, double rating, String desc) {
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.rating = rating;
            this.description = desc;
        }

        public String toString() { return name + " (" + brand + ")"; }

        public String toCartString() {
            return quantity + "× " + name + " – ₹" + String.format("%.2f", price * quantity);
        }
    }

    // Represents a subcategory containing products
    static class SubCategory {
        String name;
        List<Products> prods;

        public SubCategory(String name, List<Products> prods) {
            this.name = name;
            this.prods = prods;
        }
        public String toString() { return name; }
    }

    // Represents a category containing subcategories
    static class Category {
        String name;
        List<SubCategory> subs;

        Category(String name, List<SubCategory> subs) {
            this.name = name;
            this.subs = subs;
        }
        public String toString() { return name; }
    }

    // ---------------------------- Fields ----------------------------

    // Catalog + Cart
    private final List<Category> catalog = new ArrayList<>();
    private final List<Products> cart = new ArrayList<>();

    // UI
    private JTextField tfSearch;
    private JLabel lblCartCount;
    private JLabel lblTotal;
    private JTextArea taCart;
    private JPanel productGrid; 
    private JTree categoryTree; 

    // ---------------------------- Constructor ----------------------------

    public EcommerceApplication() {
        setTitle("Shopping");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1100, 700);
        setLocationRelativeTo(null);

        buildCatalog();
        buildUI();
        loadAllProducts(); 
        refreshCart();

        setVisible(true);
    }

    // ---------------------------- Catalog Setup ----------------------------

    private void buildCatalog() {
        catalog.clear();

        // ---------------- Furniture ----------------
        catalog.add(new Category("Furniture", Arrays.asList(
            new SubCategory("Living Room", Arrays.asList(
                new Products("Sofa Set", "UrbanLuxe", 22999, 4.4, "3-seater fabric sofa with premium cushioning."),
                new Products("Coffee Table", "WoodCraft", 5499, 4.3, "Solid wood table with glass top finish."),
                new Products("TV Unit", "Homescape", 8999, 4.2, "Compact TV unit with storage shelves.")
            )),
            new SubCategory("Bedroom", Arrays.asList(
                new Products("King Size Bed", "SleepWell", 25999, 4.5, "Wooden bed with hydraulic storage."),
                new Products("Wardrobe", "SpaceMax", 18999, 4.4, "3-door wardrobe with mirror and organizer."),
                new Products("Study Table", "WorkNest", 6999, 4.3, "Ergonomic study desk with drawers.")
            )),
            new SubCategory("Outdoor", Arrays.asList(
                new Products("Patio Chair", "GardenJoy", 2999, 4.2, "Foldable chair with weather-resistant material."),
                new Products("Swing", "Relaxo", 7499, 4.5, "Hanging swing with steel frame and cushion."),
                new Products("Hammock", "Breezy", 2299, 4.1, "Cotton hammock suitable for balcony and backyard.")
            ))
        )));

        // ---------------- Clothing ----------------
        catalog.add(new Category("Clothing", Arrays.asList(
            new SubCategory("Men", Arrays.asList(
                new Products("Formal Shirt", "Allen Solly", 1499, 4.3, "Slim fit cotton shirt with full sleeves."),
                new Products("Trousers", "Van Heusen", 1999, 4.4, "Stretchable formal trousers with slim fit."),
                new Products("Sports Shoes", "Puma", 2999, 4.6, "Running shoes with breathable mesh.")
            )),
            new SubCategory("Women", Arrays.asList(
                new Products("Maxi Dress", "Zara", 2599, 4.5, "Printed dress with lightweight fabric."),
                new Products("Handbag", "Lavie", 2199, 4.4, "PU leather handbag with multiple pockets."),
                new Products("Heels", "Mochi", 1799, 4.3, "Block heel sandals with ankle strap.")
            )),
            new SubCategory("Kids", Arrays.asList(
                new Products("T-shirt", "Gini & Jony", 799, 4.2, "Graphic print cotton T-shirt for kids."),
                new Products("School Bag", "Skybags", 1299, 4.4, "Durable bag with water resistance."),
                new Products("Sports Cap", "Adidas", 699, 4.1, "Cotton cap with adjustable strap.")
            ))
        )));

        

        // ---------------- Groceries ----------------
        catalog.add(new Category("Groceries", Arrays.asList(
            new SubCategory("Vegetables", Arrays.asList(
                new Products("Tomatoes (1kg)", "FarmFresh", 69, 4.3, "Juicy red tomatoes, pesticide-free."),
                new Products("Onions (1kg)", "AgroBest", 49, 4.1, "Fresh onions with natural flavor."),
                new Products("Carrots (500g)", "VeggieKart", 39, 4.2, "Bright orange carrots, rich in Vitamin A.")
            )),
            new SubCategory("Snacks", Arrays.asList(
                new Products("Nachos", "Doritos", 99, 4.5, "Crunchy corn chips with tangy flavor."),
                new Products("Chocolate", "KitKat", 60, 4.6, "Crispy wafers coated in chocolate."),
                new Products("Cookies", "Oreo", 35, 4.4, "Chocolate cream-filled sandwich biscuits.")
            )),
            new SubCategory("Beverages", Arrays.asList(
                new Products("Mango Juice (1L)", "Real", 120, 4.3, "Made from real Alphonso mangoes."),
                new Products("Energy Drink", "Red Bull", 110, 4.5, "Classic energy drink with caffeine boost."),
                new Products("Herbal Tea (50 bags)", "Tetley", 199, 4.2, "Natural herbal tea for detox and relaxation.")
            ))
        )));

        // ---------------- Sports & Fitness ----------------
        catalog.add(new Category("Sports & Fitness", Arrays.asList(
            new SubCategory("Gym Essentials", Arrays.asList(
                new Products("Dumbbells", "ProGym", 2599, 4.5, "5kg adjustable dumbbell set."),
                new Products("Skipping Rope", "FitGear", 399, 4.3, "Durable jump rope for cardio workouts."),
                new Products("Kettlebell", "StrongLift", 1599, 4.4, "Cast iron kettlebell with ergonomic grip.")
            )),
            new SubCategory("Outdoor Sports", Arrays.asList(
                new Products("Basketball", "Spalding", 2299, 4.6, "Official size basketball with durable grip."),
                new Products("Tennis Racket", "Wilson", 3499, 4.5, "Graphite racket for better control."),
                new Products("Cricket Kit", "SG", 5999, 4.4, "Complete kit with bat, pads, and gloves.")
            )),
            new SubCategory("Footwear", Arrays.asList(
                new Products("Running Shoes", "Nike", 4499, 4.7, "Lightweight shoes with cushioned sole."),
                new Products("Studs", "Nivia", 1999, 4.3, "Football studs for firm ground."),
                new Products("Training Sandals", "Campus", 1299, 4.2, "Comfort sandals for everyday fitness.")
            ))
        )));
    }

    // ---------------------------- UI Construction ----------------------------

    private void buildUI() {
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(240, 244, 248));

        // Header bar
        JPanel header = new JPanel(new BorderLayout(10, 10));
        header.setBorder(new EmptyBorder(12, 16, 12, 16));
        header.setBackground(Color.WHITE);

        JLabel title = new JLabel("Shopping page");
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));

        JPanel searchArea = new JPanel(new BorderLayout(6, 6));
        tfSearch = new JTextField();
        tfSearch.setToolTipText("Search products...");
        JButton btnSearch = new JButton("Search");
        stylePrimary(btnSearch);
        searchArea.add(tfSearch, BorderLayout.CENTER);
        searchArea.add(btnSearch, BorderLayout.EAST);
        searchArea.setOpaque(false);

        JPanel cartArea = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        lblCartCount = new JLabel("Cart: 0 items");
        lblCartCount.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        cartArea.setOpaque(false);
        cartArea.add(lblCartCount);

        header.add(title, BorderLayout.WEST);
        header.add(searchArea, BorderLayout.CENTER);
        header.add(cartArea, BorderLayout.EAST);

        // Left: Category Tree
        categoryTree = buildCategoryTree();
        JScrollPane leftScroll = new JScrollPane(categoryTree);
        leftScroll.setPreferredSize(new Dimension(220, 0));
        TitledBorder leftBorder = BorderFactory.createTitledBorder("Categories");
        leftBorder.setTitleFont(new Font("Segoe UI", Font.BOLD, 14));
        leftScroll.setBorder(new CompoundBorder(new EmptyBorder(6, 10, 6, 6), leftBorder));

        // Center: Product Grid
        productGrid = new JPanel(new GridLayout(0, 2, 12, 12));
        productGrid.setBorder(new EmptyBorder(10, 6, 12, 6));
        productGrid.setBackground(new Color(52, 152, 219));
        JScrollPane centerScroll = new JScrollPane(productGrid);
        centerScroll.getVerticalScrollBar().setUnitIncrement(16);
        centerScroll.setBorder(new EmptyBorder(0, 0, 0, 0));

        // Right: Cart panel
        JPanel cartPanel = new JPanel(new BorderLayout(8, 8));
        cartPanel.setPreferredSize(new Dimension(320, 0));
        cartPanel.setBackground(Color.WHITE);
        cartPanel.setBorder(new CompoundBorder(
            new EmptyBorder(6, 6, 6, 10),
            BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(225, 230, 235)), "Your Cart")
        ));

        taCart = new JTextArea(14, 24);
        taCart.setEditable(false);
        taCart.setFont(new Font("Monospaced", Font.PLAIN, 13));
        taCart.setBackground(new Color(250, 255, 252));
        JScrollPane cartScroll = new JScrollPane(taCart);

        JPanel cartBottom = new JPanel(new GridBagLayout());
        cartBottom.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;

        lblTotal = new JLabel("Total: ₹0.00");
        lblTotal.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTotal.setForeground(new Color(46, 134, 222));

        JButton btnRemove = new JButton("Remove Last");
        styleBtn(btnRemove, new Color(128, 0, 0));
        JButton btnClear = new JButton("Clear Cart");
        styleBtn(btnClear, new Color(52, 152, 219));
        JButton btnCheckout = new JButton("Checkout");
        styleBtn(btnCheckout, new Color(63, 81, 181));

        cartBottom.add(lblTotal, gbc); gbc.gridy++;
        cartBottom.add(btnRemove, gbc); gbc.gridy++;
        cartBottom.add(btnClear, gbc); gbc.gridy++;
        cartBottom.add(btnCheckout, gbc);

        cartPanel.add(cartScroll, BorderLayout.CENTER);
        cartPanel.add(cartBottom, BorderLayout.SOUTH);

        // Layout add
        add(header, BorderLayout.NORTH);
        add(leftScroll, BorderLayout.WEST);
        add(centerScroll, BorderLayout.CENTER);
        add(cartPanel, BorderLayout.EAST);

        // ---------------- Events ----------------

        // Search
        btnSearch.addActionListener(e -> applySearch());
        tfSearch.addActionListener(e -> applySearch());

        // Category tree selection -> load products of subcategory or category
        categoryTree.addTreeSelectionListener(ev -> {
            TreePath path = categoryTree.getSelectionPath();
            if (path == null) return;
            Object nodeObj = ((DefaultMutableTreeNode) path.getLastPathComponent()).getUserObject();
            if (nodeObj instanceof SubCategory) {
                loadProducts(((SubCategory) nodeObj).prods);
            } else if (nodeObj instanceof Category) {
                // If category selected, aggregate and show all its products
                List<Products> list = new ArrayList<>();
                for (SubCategory s : ((Category) nodeObj).subs) list.addAll(s.prods);
                loadProducts(list);
            }
        });

        // Cart buttons
        btnRemove.addActionListener(e -> {
            if (!cart.isEmpty()) {
                cart.remove(cart.size() - 1);
                refreshCart();
            }
        });

        btnClear.addActionListener(e -> {
            cart.clear();
            refreshCart();
        });

        btnCheckout.addActionListener(e -> checkoutBill());
    }

    private void applySearch() {
        String q = tfSearch.getText().trim().toLowerCase();
        if (q.isEmpty()) {
            loadAllProducts();
            return;
        }
        List<Products> all = new ArrayList<>();
        for (Category c : catalog) for (SubCategory s : c.subs) all.addAll(s.prods);
        List<Products> filtered = new ArrayList<>();
        for (Products p : all) {
            if (p.name.toLowerCase().contains(q)
                || p.brand.toLowerCase().contains(q)
                || p.description.toLowerCase().contains(q)) {
                filtered.add(p);
            }
        }
        loadProducts(filtered);
    }

    // ---------------------------- Tree Builder ----------------------------

    private JTree buildCategoryTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("All Categories");
        for (Category c : catalog) {
            DefaultMutableTreeNode cNode = new DefaultMutableTreeNode(c);
            for (SubCategory s : c.subs) {
                DefaultMutableTreeNode sNode = new DefaultMutableTreeNode(s);
                cNode.add(sNode);
            }
            root.add(cNode);
        }
        JTree tree = new JTree(root);
        tree.setRootVisible(true);
        tree.setShowsRootHandles(true);
        tree.setBackground(new Color(250, 251, 252));
        tree.setCellRenderer(new DefaultTreeCellRenderer() {
            private final Color sel = new Color(230, 240, 255);
            private final Color norm = new Color(250, 251, 252);

            @Override
            public Component getTreeCellRendererComponent(
                    JTree tr, Object value, boolean selc, boolean exp, boolean leaf, int row, boolean hasFocus) {
                Component c = super.getTreeCellRendererComponent(tr, value, selc, exp, leaf, row, hasFocus);
                setBorder(new EmptyBorder(4, 6, 4, 6));
                if (selc) setBackgroundSelectionColor(sel); else setBackgroundNonSelectionColor(norm);
                setFont(new Font("Segoe UI", Font.PLAIN, 13));
                return c;
            }
        });
        for (int i = 0; i < tree.getRowCount(); i++) tree.expandRow(i);
        return tree;
    }

    // ---------------------------- Product Grid ----------------------------

    private void loadAllProducts() {
        List<Products> all = new ArrayList<>();
        for (Category c : catalog) for (SubCategory s : c.subs) all.addAll(s.prods);
        loadProducts(all);
    }

    private void loadProducts(List<Products> prods) {
        productGrid.removeAll();
        if (prods == null || prods.isEmpty()) {
            JLabel empty = new JLabel("No products found.", SwingConstants.CENTER);
            empty.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            JPanel wrap = new JPanel(new BorderLayout());
            wrap.setOpaque(false);
            wrap.add(empty, BorderLayout.CENTER);
            productGrid.add(wrap);
        } else {
            for (Products p : prods) productGrid.add(new ProductCard(p));
        }
        productGrid.revalidate();
        productGrid.repaint();
    }

    private class ProductCard extends JPanel {
        Products p;
        JSpinner qty;

        ProductCard(Products p) {
            this.p = p;
            setLayout(new BorderLayout(8, 8));
            setBackground(Color.WHITE);
            setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 1, true), new EmptyBorder(10, 12, 12, 12)));

            // Title area
            JLabel lblName = new JLabel(p.name);
            lblName.setFont(new Font("Segoe UI", Font.BOLD, 16));

            JLabel lblBrand = new JLabel("Brand: " + p.brand);
            JLabel lblRating = new JLabel("Rating: " + p.rating + " " + stars(p.rating));
            JLabel lblPrice = new JLabel("₹" + String.format("%.2f", p.price));
            lblPrice.setFont(new Font("Segoe UI", Font.BOLD, 16));
            lblPrice.setForeground(new Color(0, 128, 0));

            JTextArea desc = new JTextArea(p.description);
            desc.setEditable(false);
            desc.setLineWrap(true);
            desc.setWrapStyleWord(true);
            desc.setBackground(new Color(192, 192, 192));
            desc.setFont(new Font("Segoe UI", Font.PLAIN, 12));

            JPanel top = new JPanel(new BorderLayout());
            top.setOpaque(false);
            top.add(lblName, BorderLayout.NORTH);

            JPanel info = new JPanel(new GridLayout(3, 1));
            info.setOpaque(false);
            info.add(lblBrand);
            info.add(lblRating);
            info.add(lblPrice);

            top.add(info, BorderLayout.CENTER);

            // Bottom controls
            JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 0));
            bottom.setOpaque(false);
            qty = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
            JButton btnAdd = new JButton("Add to Cart");
            styleSuccess(btnAdd);
            btnAdd.addActionListener(e -> addToCart(p, (int) qty.getValue()));
            bottom.add(new JLabel("Qty:"));
            bottom.add(qty);
            bottom.add(btnAdd);

            add(top, BorderLayout.NORTH);
            add(new JScrollPane(desc), BorderLayout.CENTER);
            add(bottom, BorderLayout.SOUTH);
        }
    }

    private String stars(double rating) {
        int full = (int) Math.round(rating); // simple approximation 0..5
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) sb.append(i < full ? '★' : '☆');
        return sb.toString();
    }

    // ---------------------------- Cart Logic ----------------------------

    private void addToCart(Products p, int q) {
        boolean found = false;
        for (Products cp : cart) {
            if (cp.name.equals(p.name) && cp.brand.equals(p.brand)) {
                cp.quantity += q;
                found = true;
                break;
            }
        }
        if (!found) {
            Products pp = new Products(p.name, p.brand, p.price, p.rating, p.description);
            pp.quantity = q;
            cart.add(pp);
        }
        refreshCart();
    }

    private void refreshCart() {
        taCart.setText("");
        double tot = 0;
        int idx = 1;
        int itemCount = 0;
        for (Products p : cart) {
            double sub = p.price * p.quantity;
            taCart.append(String.format("%2d. %-22s ×%d  ₹%.2f%n", idx++, p.name, p.quantity, sub));
            tot += sub;
            itemCount += p.quantity;
        }
        lblTotal.setText("Total: ₹" + String.format("%.2f", tot));
        lblCartCount.setText("Cart: " + itemCount + (itemCount == 1 ? " item" : " items"));
    }

    private void checkoutBill() {
        if (cart.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cart is empty.");
            return;
        }
        StringBuilder bill = new StringBuilder("FINAL BILL\n---------------------------\n");
        double tot = 0;
        int idx = 1;
        for (Products p : cart) {
            double sub = p.price * p.quantity;
            bill.append(String.format("%d. %-20s %2d × ₹%.2f = ₹%.2f%n", idx++, p.name, p.quantity, p.price, sub));
            tot += sub;
        }
        bill.append("---------------------------\nTOTAL = ₹").append(String.format("%.2f", tot));

        JTextArea ba = new JTextArea(bill.toString());
        ba.setFont(new Font("Monospaced", Font.PLAIN, 12));
        ba.setEditable(false);

        JOptionPane.showMessageDialog(this, new JScrollPane(ba), "Invoice", JOptionPane.PLAIN_MESSAGE);
    }

    // ---------------------------- Button Styles ----------------------------

    private void stylePrimary(AbstractButton b) { styleBtn(b, new Color(10, 132, 255)); }
    private void styleSuccess(AbstractButton b) { styleBtn(b, new Color(48, 209, 88)); }
    private void styleWarning(AbstractButton b) { styleBtn(b, new Color(255, 159, 10)); }
    private void styleDanger(AbstractButton b) { styleBtn(b, new Color(255, 69, 58)); }

    private void styleBtn(AbstractButton b, Color base) {
        b.setFocusPainted(false);
        b.setForeground(Color.WHITE);
        b.setBackground(base);
        b.setBorder(new EmptyBorder(8, 14, 8, 14));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) { b.setBackground(base.darker()); }
            @Override public void mouseExited(MouseEvent e) { b.setBackground(base); }
        });
    }

    // ---------------------------- Main ----------------------------
    public static void main(String[] args) {
        // Make all Swing texts black (note: we style buttons ourselves)
        UIManager.put("Label.foreground", Color.BLACK);
        UIManager.put("Button.foreground", Color.BLACK);
        UIManager.put("TextField.foreground", Color.BLACK);
        UIManager.put("TextArea.foreground", Color.BLACK);
        UIManager.put("Tree.textForeground", Color.BLACK);
        UIManager.put("Table.foreground", Color.BLACK);

        SwingUtilities.invokeLater(() -> new EcommerceApplication().setVisible(true));
    }
}
