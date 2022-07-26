package wood.mike

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
import wood.mike.table.per.hierarchy.House

class HouseSpec extends Specification implements DomainUnitTest<House> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
