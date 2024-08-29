



interface Engine2{

    boolean isStart();
}


class CarEngine2 implements Engine2{
    @Override
    public boolean isStart(){
        return true;
    }


}

class Car2{

    private Engine2 engine;
    public Car2(Engine2 engine){
        this.engine = engine;
    }

    public void start(){

        if(engine.isStart()){

            System.out.println("Start!");
        }
    }
}

public class InCostructor {
    

    public static void main(String[] args) {
        

        Car2 car = new Car2(new CarEngine2());
        car.start();
    }



}
