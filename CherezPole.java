

interface Engine4{
    boolean isStart();
}


class CarEngine4 implements Engine4{


    @Override
    public boolean isStart(){
        return true;
    }
}

class Car4{

    private Engine4 engine = new CarEngine4();

    public void start(){

        if(engine.isStart()){

            System.out.println("Start!!!!!!!");
        }

    }
}



public class CherezPole {
    
    public static void main(String[] args) {
        

        Car4 n = new Car4();
        n.start();
    }
}
