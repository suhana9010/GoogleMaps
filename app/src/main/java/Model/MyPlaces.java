package Model;

public class MyPlaces {
    private String next_page_token;
    private Results[] results;
    private String[] html_attributes;
    private String status;

    public String getNext_page_token(){
        return next_page_token;
    }
    public void setNext_page_token(String next_page_token){
        this.next_page_token = next_page_token;
    }
    public Results[] getResults(){
        return results;
    }
    public void setResults(Results[] results){
        this.results = results;
    }
    public String[] getHtml_attributes(){
        return html_attributes;
    }
    public void setHtml_attributes(String[] html_attributes){
        this.html_attributes = html_attributes;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    @Override
    public String toString(){
        return "ClassPojo [next page_token = "+next_page_token+", results = "+results+", html_attributes = "+html_attributes+", status="+status+"]";
    }



}
