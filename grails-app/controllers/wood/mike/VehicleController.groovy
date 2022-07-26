package wood.mike

import wood.mike.table.per.subclass.Vehicle

class VehicleController {

    def index() {
        [vehicles: Vehicle.all]
    }
}
