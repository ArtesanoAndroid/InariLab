package domain.home

import data.services.SampleService

class SampleUseCase(
    private val sampleService: SampleService
) {

    fun execute() {
        sampleService.sample()
    }
}