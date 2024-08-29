

 interface Engine{

    boolean isStart();
}

class CarEngine implements Engine{

    @Override
    public boolean isStart(){
        return true; 
    }
}

class Car{

    public void start(){
        Engine engine = new CarEngine();
        if(engine.isStart()){
             System.out.println("Start!");
        }

    }
}


class Main {
    



    public static void main(String[] args) {

        Car i = new Car();
          i.start();
        
    }
}