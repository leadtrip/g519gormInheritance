package wood.mike.table.per.subclass

import groovy.transform.ToString

@ToString(includePackage = false)
class Car extends Vehicle{

    Integer numberOfSeats

    static constraints = {
    }
}
