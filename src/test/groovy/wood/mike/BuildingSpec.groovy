package wood.mike

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
import wood.mike.table.per.hierarchy.Building

class BuildingSpec extends Specification implements DomainUnitTest<Building> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
