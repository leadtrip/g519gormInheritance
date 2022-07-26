Project makes use of 2 inheritance strategies for modelling domain entities

* Table per hierarchy
* Table per class


The building hierarchy uses the default of table per hierarchy, we have one table with a discrimiator column named class
* Building
  * House
  * PoliceStation
  * SwimmingPool
    

The vehicle hierarchy uses table-per-class, the base vehicle table contins fields common to all subclasses and the subclass tables contain their specific fields and an ID that links to the base table
* Vehicle
  * Car
  * Boat
  * Bicyle