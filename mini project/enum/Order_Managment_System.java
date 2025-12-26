enum level {
    Pending,
    Shipped,
    Delivered,
    Cancelled
}

class Order_Managment_System {
    public static void main(String[] args) {
        level obj = level.Cancelled;
        switch (obj) {
            case Pending:
                System.out.println("We've received your order and are getting it ready for processing.");

                break;
            case Shipped:
                System.out.println("Great news! Your package has left our warehouse and is on its way.");

                break;
            case Delivered:
                System.out.println("Ding dong! Your order has been successfully delivered to your door.");

                break;

            case Cancelled:
                System.out.println("This order has been cancelled. If this was a mistake, please contact support.");
                break;
        }
    }
}
