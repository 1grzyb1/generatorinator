package ovh.snet.grzybek.generatorinator.rest

import org.springframework.web.bind.annotation.*
import ovh.snet.grzybek.generatorinator.domain.GeneratorService
import ovh.snet.grzybek.generatorinator.model.Generator
import ovh.snet.grzybek.generatorinator.model.GeneratorId

@RestController()
@RequestMapping("/generator")
@CrossOrigin
internal class GeneratorController(private val generatorService: GeneratorService) {

  @PostMapping
  fun createGenerator(@RequestBody generator: Generator): GeneratorId {
    return generatorService.createGenerator(generator)
  }

  @GetMapping("/{generatorId}")
  fun getGenerator(@PathVariable generatorId: Int): Generator {
    return generatorService.getGenerator(generatorId)
  }
}