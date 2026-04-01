package cts.stefan.nicoleta.g1096.builder;

public class DroneConfiguration extends AbstractDroneBuilder implements AbstractDroneCreation  {


    @Override
    public AbstractDroneBuilder enableAutoPilot(boolean value) {
        this.pilotAutomat = value;
        return this;
    }

    @Override
    public AbstractDroneBuilder enableNightVision(boolean value) {
       this.nightVision = value;
       return this;
    }

    @Override
    public AbstractDroneBuilder setMaxAltitude(int maxAltitude) {
        this.altitudineMaxima = maxAltitude;
        return this;
    }

    @Override
    public AbstractDroneBuilder setMaxSpeed(float maxSpeed) {
        this.vitezaMaxima = maxSpeed;
        return this;
    }

    public DroneConfiguration build() {
        return null;
    }

}
