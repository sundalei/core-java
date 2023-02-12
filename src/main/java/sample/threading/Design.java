package sample.threading;

import java.util.ArrayList;
import java.util.List;

public class Design {

    private int code;
    
    private String name;

    private List<Long> votes = new ArrayList<>();

    public Design(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Long> getVotes() {
        return votes;
    }

    public void setVotes(List<Long> votes) {
        this.votes = votes;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
