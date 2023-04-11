public class EBook extends Media {

    private String mediaType = "EBoook";
    private String genre;
    private int yearPublished;
    private String author;
    
    EBook(int id, String name, boolean available, double rentalFee, String mediaType) {
        super(id, name, available, rentalFee);
        this.mediaType = mediaType;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setMediaType(String mediaTyope) {
        this.mediaType = mediaType;
    }
    
}
