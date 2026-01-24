class Main{
    public static void main(String[] args){
        Data obj = new Data();
        obj.setRoll_no(18);
        obj.setName("Dhanush");
        System.out.println(obj.getRoll_no());
        System.out.println(obj.getName());

    }
}
class Data{

    private int Roll_no;
    private String name;


    int getRoll_no(){
        return Roll_no;
    }
    void setRoll_no(int Roll_no){
        this.Roll_no=Roll_no;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }


}