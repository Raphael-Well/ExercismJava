public class Twofer {
    public String twofer(String name) {
        if(name == null){
            name = "";
        }
        return name.isEmpty() ? "One for you, one for me." : String.format("One for %s, one for me.", name);
    }
}
