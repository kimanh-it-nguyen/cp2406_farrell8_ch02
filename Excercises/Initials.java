public class Initials {
    private String fullName;

    Initials(String fullName){
        this.fullName = fullName;
    }

    public void setFullName(String newFullName){
        this.fullName = newFullName;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void displayInitials(){
        String[] a = this.fullName.split(" ");
        String result="";
        for (String word: a){
            result += word.charAt(0)+".";
        }
        System.out.println("Fullname: " + getFullName());
        System.out.println("Initials: " + result);
    }

    public static void main(String[] args){
        Initials ini = new Initials("Nguyen Kim Anh");
        ini.displayInitials();

        ini.setFullName("Nguyen Thanh Tam");
        ini.displayInitials();

        ini.setFullName("Charles Le");
        ini.displayInitials();
    }

}
