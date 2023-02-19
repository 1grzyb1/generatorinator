package ovh.snet.grzybek.generatorinator.domain

import org.springframework.stereotype.Service
import ovh.snet.grzybek.generatorinator.domain.GeneratorEntity.Companion.fromGenerator
import ovh.snet.grzybek.generatorinator.model.Generator
import ovh.snet.grzybek.generatorinator.model.GeneratorId

@Service
internal class GeneratorService(private val generatorRepository: GeneratorRepository) {

  fun createGenerator(generator: Generator): GeneratorId {
    val generated = generatorRepository.save(fromGenerator(generator))
    return GeneratorId(generated.id)
  }

  fun getGenerator(generatorId: Int): Generator {
    val generator = generatorRepository.findFirstById(generatorId)
    return generator!!.toGenerator()
  }
}