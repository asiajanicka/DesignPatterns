package org.example.factory;

public class TransportFactory {

    public IDeliver getTransport(TransportType transportType){
        if(transportType.equals(TransportType.SHIP)){
            return new Ship();
        } else {
            return new Truck();
        }
    }
}
