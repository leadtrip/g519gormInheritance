package wood.mike.table.per.subclass

import grails.gorm.transactions.Transactional
import grails.test.hibernate.HibernateSpec
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CarSpec extends HibernateSpec implements DomainUnitTest<Car> {

    void "test something"() {
        given:
            Car car = addCar()
        when:
            updateCar(car)
        then:
            checkUpdate(car)
    }

    def checkUpdate(Car car) {
        Car.withTransaction {
            Car.get(car.id).numberOfSeats == 4
        }
    }

    def updateCar(Car car) {
        Car.withTransaction {
            Car.executeUpdate("update Car c set c.numberOfSeats = 4 where c.id in(:ids)", [ids: [car.id]])
        }
    }

    def addCar() {
        Car.withTransaction {
            new Car(primaryPowerSource: 'engine', numberOfSeats: 5).save()
        }
    }
}
