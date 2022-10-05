package g519gorminheritance

import grails.gorm.transactions.Transactional
import wood.mike.table.per.hierarchy.House
import wood.mike.table.per.hierarchy.PoliceStation
import wood.mike.table.per.hierarchy.SwimmingPool
import wood.mike.table.per.subclass.Bicycle
import wood.mike.table.per.subclass.Boat
import wood.mike.table.per.subclass.Car

class BootStrap {

    def init = { servletContext ->
        //addBuildings()
        addVehicles()
    }

    @Transactional
    def addBuildings() {
        new House(address: '123 quiet street', numberOfBedrooms: 3).save()
        new SwimmingPool(address: '93 busy road', numberOfLanes: 6).save()
        new PoliceStation(address: '12-15 dangerous avenue', numberOfCells: 8).save()
    }

    @Transactional
    def addVehicles() {
        new Car(primaryPowerSource: 'combustion engine', numberOfSeats: 5).save()
        new Bicycle(primaryPowerSource: 'human', numberOfGears: 24).save()
        new Boat(primaryPowerSource: 'wind', numberOfPassengers: 6).save()
    }

    def destroy = {
    }
}
