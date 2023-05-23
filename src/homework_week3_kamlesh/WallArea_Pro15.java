package homework_week3_kamlesh;

public class WallArea_Pro15 {
    double width;
    double height;

    WallArea_Pro15() {

    }

    WallArea_Pro15(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }


    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width){
        if(width < 0 ){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }else {
            this.height =height;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }

    public static void main(String[] args) {
        WallArea_Pro15 wall = new WallArea_Pro15 (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
