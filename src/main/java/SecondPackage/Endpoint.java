package SecondPackage;

import java.util.ArrayList;
import java.util.List;

public class Endpoint {

    private List<String> comments = new ArrayList<>();



    public void addToComments(String comment) {
        comments.add(comment);
    }

    public List<String> getComments() {
        return comments;
    }
    
}
