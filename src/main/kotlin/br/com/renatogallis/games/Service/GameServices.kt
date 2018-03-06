package br.com.renatogallis.games.Service

import br.com.renatogallis.games.Model.Game
import br.com.renatogallis.games.Repository.GameRepository
import com.sun.xml.internal.ws.api.ha.StickyFeature
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class  GameServices{

    @Autowired
   lateinit var gameRepository : GameRepository

    fun  buscarTodos(): List<Game>{
        return  gameRepository.findAll()
    }

    fun salvar (game: Game){
        gameRepository.save(game)

    }

    fun buscarPor(nome:String) : List<Game>{
        return gameRepository.findByNomeIgnoreCaseContaining(nome)
    }
    fun  apagarPor(id: String){
        gameRepository.deleteById(id)
    }
}