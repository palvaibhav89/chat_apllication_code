package techknight.Vaibhav.model;

public class FileModel {

    private String type;
    private String url_file;
    private String url_hostinger;
    private String name_file;
    private String size_file;

    public FileModel() {
    }

    public FileModel(String type, String url_file, String url_hostinger, String name_file, String size_file) {
        this.type = type;
        this.url_file = url_file;
        this.url_hostinger = url_hostinger;
        this.name_file = name_file;
        this.size_file = size_file;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl_file() {
        return url_file;
    }

    public void setUrl_file(String url_file) {
        this.url_file = url_file;
    }

    public String getName_file() {
        return name_file;
    }

    public void setName_file(String name_file) {
        this.name_file = name_file;
    }

    public String getSize_file() {
        return size_file;
    }

    public void setSize_file(String size_file) {
        this.size_file = size_file;
    }

    public String getUrl_hostinger() {
        return url_hostinger;
    }

    public void setUrl_hostinger(String url_hostinger) {
        this.url_hostinger = url_hostinger;
    }
}
