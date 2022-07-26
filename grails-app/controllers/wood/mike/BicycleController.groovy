package wood.mike

import wood.mike.table.per.subclass.Bicycle

class BicycleController {

    def index() {
        [bicycles: Bicycle.all]
    }
}
