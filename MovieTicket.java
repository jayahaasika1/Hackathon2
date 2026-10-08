public class MovieTicket {
    String name;
    float price;
    int numberOfTickets;

    MovieTicket(String n, float p, int t) {
        name = n;
        price = p;
        numberOfTickets = t;
    }

    public float calculateTotal(){
        return (float) (price * numberOfTickets);
    }

    public void discount(){
        if(numberOfTickets > 5){
            float discount = price * 0.1f; 
            System.out.println("Discount Amount: " + discount);
        } 
        else {
            System.out.println("No discount applicable.");
        }
    }

    public void calculateFinalAmount(){
        float totalAmount = calculateTotal();
        float discountAmount = (numberOfTickets > 5) ? price * 0.1f * numberOfTickets : 0;
        float finalAmount = totalAmount - discountAmount;

        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Amount to be Paid: " + finalAmount);
    }

    public void displayBill(){
        System.out.println("Movie Name: " + name);
        System.out.println("Price per Ticket: " + price);
        System.out.println("Number of Tickets: " + numberOfTickets);
        calculateFinalAmount();        
    }
        public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("ABC", 650, 6);
        ticket.displayBill();
    }
}
