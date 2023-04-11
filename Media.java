class Media {

    private int id;
    private String title;
    private boolean available;
    private double rentalFee;

    Media(int id, String title, boolean available, double rentalFee) {
        this.id = id;
        this.title = title;
        this.available = available;
        this.rentalFee = rentalFee;
    }

    public int getID() {
        return this.id;
    }

    public String gettitle() {
        return this.title;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public double getRentalFee() {
        return this.rentalFee;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public String toString() {
        String isAvailable;

        if (this.available == true) {
            isAvailable = " is";
        } else {
            isAvailable = " is not";
        }
        String toStrng = (title + " with id " + id + " " + isAvailable);
        return toStrng;
    }
}