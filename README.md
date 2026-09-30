# FacadeDesignPattern
Lab Seatwork 4 Facade Pattern

## Simplified Intelligent Home System

The HomeApp needs to manage various home services for an intelligent home system. These services include turning on and off the lights, TV, and air conditioning. However, the HomeApp aims to interact with these services through a simplified, single interface provided by the HomeInterface. The HomeInterface class should delegate the user’s requests to the appropriate service classes (Light, TV, AirConditioning) while abstracting the service details from the user. Additionally, the HomeInterface should provide methods to turn on all services (turnOnAll()) and turn off all services (turnOffAll()).
