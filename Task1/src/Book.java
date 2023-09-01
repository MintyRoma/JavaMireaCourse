import java.util.ArrayList;

public class Book {

    ArrayList<String> textPages = new ArrayList<String>();

    private String title;

    public Book()
    {
        title = "Lorem ipsum";
        textPages.add("Lorem ipsum sit dolor amet");
    }

    public Book(String _title)
    {
        title = _title;
        textPages.add("Lorem ipsum sit dolor amet");
    }

    public Book(String _title, ArrayList<String> _pages)
    {
        title = _title;
        textPages = _pages;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    public int countPages()
    {
        return textPages.size();
    }

    public void addPage(String page)
    {
        textPages.add(page);
    }

    public void removePageAt(int pageNumber)
    {
        if (pageNumber<=0 || pageNumber>textPages.size()) return;
        textPages.remove(pageNumber-1);
    }

    public String getPage(int pagenum)
    {
        if (pagenum<=0 || pagenum>textPages.size()) return "";
        return textPages.get(pagenum-1);
    }

    public String toString()
    {
        return "Book \'"+title+"\' contains "+textPages.size()+" pages";
    }
}
