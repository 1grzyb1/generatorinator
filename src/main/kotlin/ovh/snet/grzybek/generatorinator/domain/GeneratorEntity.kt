package ovh.snet.grzybek.generatorinator.domain

import com.google.gson.Gson
import org.hibernate.annotations.Type
import ovh.snet.grzybek.generatorinator.model.Generator
import ovh.snet.grzybek.generatorinator.model.GeneratorColumn
import javax.persistence.*

@Entity(name = "generator")
class GeneratorEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column
  val id: Int,
  @Column
  val name: String,
  @Column(columnDefinition="TEXT")
  val columns: String
) {

  companion object {
    fun fromGenerator(generator: Generator) : GeneratorEntity {
      return GeneratorEntity(0, generator.name, Gson().toJson(generator.columns))
    }
  }

  fun toGenerator() : Generator {
    return Generator(name, Gson().fromJson(columns, Array<GeneratorColumn>::class.java).toList())
  }
}