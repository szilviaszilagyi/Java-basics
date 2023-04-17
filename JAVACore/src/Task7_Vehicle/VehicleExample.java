package Task7_Vehicle;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Honda", "Civic", "Blue", 2, false);
        RacingCar racingCar = new RacingCar("Ferrari", "F1", "Red", 1, false, true,
                true);
        AmbulanceCar ambulanceCar = new AmbulanceCar("Mercedes", "Ambulance Type", "Yellow", 4, false,
                "Light and Sound");

        System.out.println("------Vehicle------");
        vehicle.accelerate();
        vehicle.honk();
        vehicle.stop();
        vehicle.usesTurnSignal();

        System.out.println("------Racing Car------");
        racingCar.accelerate();
        racingCar.honk();
        racingCar.stop();
        racingCar.usesTurnSignal();
        racingCar.races();

        System.out.println("------Ambulance------");
        ambulanceCar.accelerate();
        ambulanceCar.honk();
        ambulanceCar.stop();
        ambulanceCar.usesTurnSignal();
        ambulanceCar.sirens();
        ambulanceCar.entersHospital();
    }

}
