package BanpoXi.Dong.domain;

public class CardDto {
    private String title;
    private String contents;
    private String category;

    public CardDto(String title, String contents, String category) {
        this.title = title;
        this.contents = contents;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getCategory() {
        return category;
    }

    public Card toEntity(){
        return new Card(title,contents,category);
    }
}