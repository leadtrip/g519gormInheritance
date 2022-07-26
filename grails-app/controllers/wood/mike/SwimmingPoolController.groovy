package wood.mike

import wood.mike.table.per.hierarchy.SwimmingPool

class SwimmingPoolController {

    def index() {
        [swimmingPools: SwimmingPool.all]
    }
}
