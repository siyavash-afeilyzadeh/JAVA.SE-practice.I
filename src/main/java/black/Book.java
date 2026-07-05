package black;



public class Book {
    private int id;
    private String name;
    private String author;
    private int page;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public int getPage(){
        return page;
    }
    public void setPage(int page){
        this.page = page;
    }

    public String toString(){
        return "Book " +
                id + " -->" +
                " Name: " + name +
                "| Author: " + author +
                "| Pages: " + page;
    }




}
