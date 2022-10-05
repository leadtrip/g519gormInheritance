package wood.mike

class CarController {

    def carService

    def index() {
        render carService.updateCarSeats()
    }
}
