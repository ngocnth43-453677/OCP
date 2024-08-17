class Car {
    int distance;

    Car(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) {
        int timeTravel = time; //line n1
//line n3
    }
}
public class Vehicle {
    int value = 0;
    public void speed () {
        value = 100; //line n2
        System.out.println ("Velocity with new speed"+value+"kmph");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle ();
        v.speed();
        System.out.println(v.value);
    }
}
/*
    //speed(); //line n3
}
}



 */