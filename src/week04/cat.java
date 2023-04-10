class cat {
    public String color;
    public int age;
    public double size;

    public cat() {
        color = "blue";
        age = 5;
        size = 2.0;
    }

    public cat(String c, int a, double s) {
        this.color = c;
        this.age = a;
        this.size = s;
    }

    public void eat(String feed) {
        if(feed.equals("사료")) {
            System.out.println("냥");
        }
        else {
            System.out.println("ㅡㅡ 사료!!");
        }
    }
    
    public void print() {
        System.out.println(color+", "+age+", "+size);
    }
    //public class studyClass {
    public static void main(String[] args) {
        cat nabi = new cat();
        cat coco = new cat("White", 2, 5.0);
        System.out.print("nabi의 특징 : ");
        nabi.print();
        System.out.print("nabi의 배고픔 상태 : ");
        nabi.eat("사료");
        
        System.out.println("==========================");
        System.out.print("coco의 특징 : ");
        coco.print();
        System.out.print("coco의 배고픔 상태 : ");
        coco.eat("노사료");
    }
}
