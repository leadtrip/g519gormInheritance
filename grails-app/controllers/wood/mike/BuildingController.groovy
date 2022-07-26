package wood.mike

import wood.mike.table.per.hierarchy.Building

class BuildingController {

    def index() {
        [buildings: Building.all]
    }
}
