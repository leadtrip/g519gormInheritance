package wood.mike

import grails.gorm.transactions.Transactional
import wood.mike.table.per.subclass.Car

class CarService{

    Random random = new Random()

    @Transactional
    def updateCarSeats() {
        Car car = Car.findByPrimaryPowerSource('combustion engine')
        def nos = random.nextInt(5)
        Car.executeUpdate("update Car c set c.numberOfSeats = :nos where c.id in(:ids)", [nos: nos, ids: [car.id]])
        assert car.refresh().numberOfSeats == nos
        car
    }

}