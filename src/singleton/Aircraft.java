package singleton;

public class Aircraft {
    private String name;
    private static Aircraft INSTANCE;
    private Aircraft(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static Aircraft getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Aircraft("AIR-1234");
        }
        return INSTANCE;
    }
}
