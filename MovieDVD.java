public class MovieDVD extends Media {

    private String mediaType = "DVD Movie";
    private String director;
    private int yearReleased;
    
    MovieDVD(int id, String name, boolean available, double rentalFee, String mediaType) {
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
