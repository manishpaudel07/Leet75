public class Test {
    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
        hello="trying git cherry-pick";
        System.out.println("hi there"+hello)
    }

    private  String hello;


    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        Test test= new Test();
        System.out.println(test.getHello());}

}