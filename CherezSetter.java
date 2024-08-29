
interface Engine3{

    boolean isStart();
}

class CarEngine3 implements Engine3{

    @Override
    public boolean isStart(){
        return true;
    }
}

class Car3{

    private Engine3 engine;

    public Car3(){

    }

    public void setEngine3(Engine3 engine){
        this.engine = engine;
    }

    public void start(){
        if(engine.isStart()){

            System.out.println("Start!");
        }
    }
}



public class CherezSetter {


    public static void main(String[] args) {

          Car3 car = new Car3();
         // car.setEngine3(new CarEngine3());
          car.start();
        
    }
    
}
