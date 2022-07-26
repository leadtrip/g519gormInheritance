package wood.mike.table.per.hierarchy

/**
 * By default GORM classes use table-per-hierarchy inheritance mapping as is the case here,
 * We have one table for the entire domain class hierarchy in this case there's a Building table
 * with a class column stating the subclass name.
 * All the fields from all the subclasses are in the same table
 */
abstract class Building {

    String address

    static constraints = {
    }
}
