package wood.mike.table.per.subclass

/**
 * Here we're using table-per-subclass.
 * We have a vehicle table containing the id and primary_power_source fields then a table for each subclass with an
 * id column and their specific fields e.g. for car number_of_seats
 */
abstract class Vehicle {

    String primaryPowerSource

    static constraints = {
    }

    static mapping = {
        tablePerHierarchy false
    }
}
