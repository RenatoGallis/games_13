package br.com.renatogallis.games.Repository

import br.com.renatogallis.games.Model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository: MongoRepository<Game,String>// mongo repository para fazer toda a parte de grud do banco
{
    fun  findByNomeIgnoreCaseContaining(nome: String): List<Game>
}