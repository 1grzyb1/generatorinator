package ovh.snet.grzybek.generatorinator.domain

import org.springframework.data.repository.CrudRepository

interface GeneratorRepository : CrudRepository<GeneratorEntity, Int> {

  fun findFirstById(id: Int): GeneratorEntity?
}