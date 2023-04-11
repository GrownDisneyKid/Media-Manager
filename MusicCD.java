public class MusicCD extends Media {

    private String mediaType = "Music CD";
    private String artist;
    private int yearProduced;
    
    MusicCD(int id, String name, boolean available, double rentalFee, String mediaType) {
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
